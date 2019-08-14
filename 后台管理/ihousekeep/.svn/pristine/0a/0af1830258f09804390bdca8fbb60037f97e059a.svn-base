package com.ccunix.ihousekeeping.serviceproject.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.advertisement.service.Advertisement_Manager_Service_Iface;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.basedb.service.T_s_advertisement_manager_Service_Iface;
import com.ccunix.ihousekeeping.minprog_main.service.MinPro_MainPage_Service_Iface;
import com.ccunix.ihousekeeping.serviceproject.service.Serviceproject_Manamger_Service_Iface;

@Controller
@RequestMapping("ServiceProject_Controller_4X")
public class ServiceProject_Controller_4X extends BaseMultiController  {

	@Resource
	Serviceproject_Manamger_Service_Iface serviceproject_Manamger_Service_Iface;

	@Resource
	Advertisement_Manager_Service_Iface advertisement_Manager_Service_Iface;
	
	
	@RequestMapping("getHeadSortFirst")
	@ResponseBody
	public AppDataModel_Sec getHeadSortFirst(Base_Model_Business base_Model_Business) {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();

		AppDataModel appDataModel = null;
		try {
			appDataModel = serviceproject_Manamger_Service_Iface.getHeadSortFirst(base_Model_Business);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}
	
	
}
