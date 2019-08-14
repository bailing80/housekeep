package com.ccunix.ihousekeeping.minprog_main.service;

import java.util.List;

import javax.annotation.Resource;
import javax.enterprise.inject.New;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.T_u_apartment_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_member_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_member_address_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_rider_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_item_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_apartment_type;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member_address;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.minprog_main.dao.Minprog_main_Dao_Iface;
import com.ccunix.ihousekeeping.minprog_main.domain.Coupon;
import com.ccunix.ihousekeeping.minprog_main.domain.Member_Address;
import com.ccunix.ihousekeeping.minprog_main.domain.Order;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;

@Service
@Transactional
public class MinPro_MainPage_Service_Impl extends BaseService implements MinPro_MainPage_Service_Iface {

	@Resource
	T_u_service_item_Dao_Iface t_u_service_item_Dao_Iface;
	@Resource
	T_u_apartment_type_Dao_Iface t_u_apartment_type_Dao_Iface;
	@Resource
	T_u_member_address_Dao_Iface t_u_member_address_Dao_Iface;
	@Resource
	T_u_member_Dao_Iface t_u_member_Dao_Iface;
	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface;
	@Resource
	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
	@Resource
	T_u_rider_Dao_Iface t_u_rider_Dao_Iface;
	@Resource
	Minprog_main_Dao_Iface minprog_main_Dao_Iface;

	@Override
	public AppDataModel getMainPageInfo(T_u_member t_u_member) throws Exception {
		System.out.println("[getMainPageInfo][调用]");

		AppDataModel appDataModel = getAppDataModel();

		T_u_rider t_u_rider = new T_u_rider();
		t_u_rider.setIs_excellent("01");
		
		List rider = t_u_rider_Dao_Iface.queryAll_t_u_rider(t_u_rider);
		List advertisement = minprog_main_Dao_Iface.queryAll_Advertisement_item();
		List coupon = minprog_main_Dao_Iface.queryBy_Coupon(t_u_member);
		for (int i = 0; i < coupon.size(); i++) {
			Coupon t = (Coupon) coupon.get(i);
			// System.out.println("Picture_bef:"+t.getPicture_bef());
			t.setBack_pic(
					paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath) + t.getBack_pic());
			// System.out.println(t.getPicture_aft());
		}

		List house = minprog_main_Dao_Iface.queryBy_House(t_u_member);

		//appDataModel.data.put("service_project", service_project);
		appDataModel.data.put("rider", rider);
		appDataModel.data.put("advertisement", advertisement);
		appDataModel.data.put("coupon", coupon);
		appDataModel.data.put("house", house);

		return appDataModel;
	}

	@Override
	public AppDataModel queryAll_House(T_u_member t_u_member) throws Exception {
		// TODO Auto-generated method stub
		AppDataModel appDataModel = getAppDataModel();
		List house = minprog_main_Dao_Iface.queryAll_House(t_u_member);
		appDataModel.data.put("house", house);
		return appDataModel;
	}

	@Override
	public AppDataModel insertMember_Address(Member_Address member_Address) throws Exception {
		// TODO Auto-generated method stub
		AppDataModel appDataModel = getAppDataModel();
		appDataModel.data.put("status", 0);
		boolean flag = true;
		/*
		 * T_u_member t_u_member = new T_u_member();
		 * t_u_member.setUser_phone(member_Address.getUser_phone());
		 * t_u_member.setNick_name(member_Address.getNick_name()); T_u_member member =
		 * (T_u_member)t_u_member_Dao_Iface.queryAll_t_u_member(t_u_member).get(0);
		 */

		T_u_member_address t_u_member_address = new T_u_member_address();
		t_u_member_address.setMember_id(member_Address.getMember_id());
		t_u_member_address.setAddress(member_Address.getAddress());
		t_u_member_address.setDoor_number(member_Address.getDoor_number());
		t_u_member_address.setTrue_area(member_Address.getTrue_area());
		t_u_member_address.setConn_phone(member_Address.getConn_phone());
		t_u_member_address.setId(UUID_Tools.getUUID());
		System.out.println("t_u_member_address ID:" + t_u_member_address.getId());

		T_u_apartment_type t_u_apartment_type = new T_u_apartment_type();
		t_u_apartment_type.setApartment_name_c(member_Address.getApartment_name_c());
		t_u_apartment_type.setApartment_name_s(member_Address.getApartment_name_s());
		t_u_apartment_type.setApartment_name_t(member_Address.getApartment_name_t());
		t_u_apartment_type.setApartment_name_w(member_Address.getApartment_name_w());
		// t_u_apartment_type.setId(UUID_Tools.getUUID());
		T_u_apartment_type apartment =null;
		/*T_u_apartment_type apartment = (T_u_apartment_type) t_u_apartment_type_Dao_Iface
				.queryAll_t_u_apartment_type(t_u_apartment_type).get(0);*/
		List a = t_u_apartment_type_Dao_Iface.queryAll_t_u_apartment_type(t_u_apartment_type);
		if (a.size()>0) {
			apartment = (T_u_apartment_type)a.get(0);
			t_u_member_address.setApartment_id(apartment.getId());
		}
		else {
			appDataModel.data.put("status", 1);
			flag = false;
		}
		

		if (t_u_member_address.getApartment_id() == null || t_u_member_address.getApartment_id().equals(' ')) {
			appDataModel.data.put("status", 1);
			flag = false;
		} else {
			System.out.println(t_u_member_address.getId());
			System.out.println(t_u_member_address.getMember_id());
			System.out.println(t_u_member_address.getApartment_id());
			System.out.println(t_u_member_address);
			System.out.println(t_u_member_address);
		
			if (flag == false) {
				t_u_member_address_Dao_Iface.insert_t_u_member_address(t_u_member_address);
				System.out.println("Apartment_id:"+t_u_member_address.getApartment_id());
			}
			
		}
		// t_u_apartment_type_Dao_Iface.insert_t_u_apartment_type(t_u_apartment_type);

		return appDataModel;
	}

	@Override
	public AppDataModel place_Order(Order order) throws Exception {
		// TODO Auto-generated method stub
		AppDataModel appDataModel = getAppDataModel();
		T_u_member_address t_u_member_address = new T_u_member_address();
		T_u_service_item t_u_service_item = new T_u_service_item();
		T_u_member t_u_member = new T_u_member();
		//Object price = new Object();
		
		
		t_u_member_address.setMember_id(order.getMember_id());
		List address = t_u_member_address_Dao_Iface.queryAll_t_u_member_address(t_u_member_address);
		
		t_u_service_item.setId(order.getItem_id());
		List item = t_u_service_item_Dao_Iface.queryAll_t_u_service_item(t_u_service_item);
		T_u_service_item ite = (T_u_service_item)item.get(0);
		
		
		
		t_u_member.setId(order.getMember_id());
		t_u_member.setNick_name(order.getCoupon_id());
		List coupon = minprog_main_Dao_Iface.queryBy_Coupon(t_u_member);
		Coupon c = (Coupon)coupon.get(0);
		c.setTrue_money(ite.getItem_price() * order.getItem_count() - order.getCoupon_price());
		
		appDataModel.data.put("address", address);
		appDataModel.data.put("item", item);
		appDataModel.data.put("coupon", coupon);
		
		return appDataModel;
	}

	@Override
	public AppDataModel getAddress_Detail(T_u_member_address t_u_member_address) throws Exception {
		// TODO Auto-generated method stub
		AppDataModel appDataModel = getAppDataModel();
		List address = t_u_member_address_Dao_Iface.queryBy_t_u_member_address(t_u_member_address);
		appDataModel.data.put("address", address);
		
		return appDataModel;
	}

}
