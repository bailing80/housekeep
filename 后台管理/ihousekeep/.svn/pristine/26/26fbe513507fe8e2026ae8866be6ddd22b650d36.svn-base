package com.ccunix.ihousekeeping.minprog_main.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member_address;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.minprog_main.domain.Member_Address;
import com.ccunix.ihousekeeping.minprog_main.domain.Order;
import com.ccunix.ihousekeeping.minprog_main.service.MinPro_MainPage_Service_Iface;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;

@Controller
@RequestMapping("MainPage_Controller_4X")
public class MainPage_Controller_4X extends BaseMultiController {

	@Resource
	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
	@Resource
	MinPro_MainPage_Service_Iface mainPage_Service_Iface;

	
	@RequestMapping("getAddress_Detail")
	@ResponseBody
	public AppDataModel_Sec getAddress_Detail(T_u_member_address t_u_member_address) {
		AppDataModel appDataModel = null;
		
		try {
			appDataModel = mainPage_Service_Iface.getAddress_Detail(t_u_member_address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	} 
	
	@RequestMapping("place_Order")
	@ResponseBody
	public AppDataModel_Sec place_Order(Order order) {
		AppDataModel appDataModel = null;

		try {
			appDataModel = mainPage_Service_Iface.place_Order(order);
			List ls = (List) appDataModel.data.get("item");
			T_u_service_item item = (T_u_service_item) ls.get(0);
			item.setItem_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
					+ item.getItem_picture());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}

	@RequestMapping("insertMember_Address")
	@ResponseBody
	public AppDataModel_Sec insertMember_Address(Member_Address member_Address) {
		AppDataModel appDataModel = null;

		try {
			appDataModel = mainPage_Service_Iface.insertMember_Address(member_Address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			appDataModel.data.put("status", 1);
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}

	@RequestMapping("getAllHouse")
	@ResponseBody
	public AppDataModel_Sec queryAll_House(T_u_member t_u_member) {
		AppDataModel appDataModel = null;
		try {
			appDataModel = mainPage_Service_Iface.queryAll_House(t_u_member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}

	@RequestMapping("getMainInfo")
	@ResponseBody
	public AppDataModel_Sec getMainInfo(T_u_member t_u_member) {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();

		AppDataModel appDataModel = null;
		try {
			appDataModel = mainPage_Service_Iface.getMainPageInfo(t_u_member);
			T_u_service_project t_u_service_project = new T_u_service_project();
			t_u_service_project.setIs_show(1);
			List service_project = t_u_service_project_Dao_Iface.queryAll_t_u_service_project(t_u_service_project);
			for (int i = 0; i < service_project.size(); i++) {
				T_u_service_project t = (T_u_service_project) service_project.get(i);
				// System.out.println("Picture_bef:" + t.getPicture_bef());
				t.setPicture_bef(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
						+ t.getPicture_bef());
				// System.out.println("Picture_bef:" + t.getPicture_bef());
				// System.out.println("Picture_aft:" + t.getPicture_aft());
				t.setPicture_aft(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
						+ t.getPicture_aft());
			}
			appDataModel.data.put("service_project", service_project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}
}
