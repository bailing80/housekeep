package com.ccunix.ihousekeeping.minprog_main.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.minprog_main.service.MinPro_MainPage_Service_Iface;

@Controller
@RequestMapping("MainPage_Controller_4X")
public class MainPage_Controller_4X extends BaseMultiController {

	@Resource
	MinPro_MainPage_Service_Iface mainPage_Service_Iface;

	
	@RequestMapping("getAllHouse")
	@ResponseBody
	public AppDataModel_Sec queryAll_House(Base_Model_Business base_Model_Business) {
		AppDataModel appDataModel = null;
		try {
			appDataModel = mainPage_Service_Iface.queryAll_House(base_Model_Business);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}
	
	
	@RequestMapping("getMainInfo")
	@ResponseBody
	public AppDataModel_Sec getMainInfo(Base_Model_Business base_Model_Business) {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();

		AppDataModel appDataModel = null;
		try {
			appDataModel = mainPage_Service_Iface.getMainPageInfo(base_Model_Business);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}
}
