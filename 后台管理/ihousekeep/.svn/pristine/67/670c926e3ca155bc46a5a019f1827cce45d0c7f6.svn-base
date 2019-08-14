package com.ccunix.ihousekeeping.minprog_main.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_rider_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.minprog_main.dao.Minprog_main_Dao_Iface;
import com.ccunix.ihousekeeping.minprog_main.domain.Coupon;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MinPro_MainPage_Service_Impl extends BaseService implements MinPro_MainPage_Service_Iface {

	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface;
	@Resource
	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
	@Resource
	T_u_rider_Dao_Iface t_u_rider_Dao_Iface;
	@Resource
	Minprog_main_Dao_Iface  minprog_main_Dao_Iface;

	@Override
	public AppDataModel getMainPageInfo(Base_Model_Business base_Model_Business) throws Exception {
		System.out.println("[getMainPageInfo][调用]");

		AppDataModel appDataModel = getAppDataModel();

		T_u_service_project t_u_service_project = new T_u_service_project();
		T_u_rider t_u_rider = new T_u_rider();
		t_u_service_project.setIs_show(1);
		t_u_rider.setIs_excellent("01");
		List service_project_name = t_u_service_project_Dao_Iface.queryAll_t_u_service_project(t_u_service_project);
		for (int i = 0; i < service_project_name.size(); i++) {
			T_u_service_project t = (T_u_service_project) service_project_name.get(i);
			//System.out.println("Picture_bef:"+t.getPicture_bef());
			t.setPicture_bef(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
							+ t.getPicture_bef());
			//System.out.println(t.getPicture_bef());
			t.setPicture_aft(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
					+ t.getPicture_aft());
			//System.out.println(t.getPicture_aft());
		}

		List rider = t_u_rider_Dao_Iface.queryAll_t_u_rider(t_u_rider);
		List advertisement = minprog_main_Dao_Iface.queryAll_Advertisement_item();
		List coupon = minprog_main_Dao_Iface.queryBy_Coupon(base_Model_Business);
		for (int i = 0; i < coupon.size(); i++) {
			Coupon t = (Coupon) coupon.get(i);
			//System.out.println("Picture_bef:"+t.getPicture_bef());
			t.setBack_pic(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
							+ t.getBack_pic());		
			//System.out.println(t.getPicture_aft());
		}
		
		List house = minprog_main_Dao_Iface.queryBy_House(base_Model_Business);
		
		appDataModel.data.put("service_project", service_project_name);
		appDataModel.data.put("rider", rider);
		appDataModel.data.put("advertisement", advertisement);
		appDataModel.data.put("coupon", coupon);
		appDataModel.data.put("house", house);

		return appDataModel;
	}

	@Override
	public AppDataModel queryAll_House(Base_Model_Business base_Model_Business) throws Exception {
		// TODO Auto-generated method stub
		AppDataModel appDataModel = getAppDataModel();
		List house = minprog_main_Dao_Iface.queryAll_House(base_Model_Business);
		appDataModel.data.put("house", house);
		return appDataModel;
	}

}
