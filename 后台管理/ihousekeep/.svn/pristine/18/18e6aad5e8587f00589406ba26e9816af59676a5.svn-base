package com.ccunix.ihousekeeping.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.test.service.Test_Service_Iface;

@Controller
@RequestMapping("Test_Controller_4X")
public class Test_Controller_4X extends BaseMultiController {
	
	@Resource
	Test_Service_Iface test_Service_Iface;
	
	@RequestMapping("getAll_ServiceProject")
	@ResponseBody
	public AppDataModel_Sec getAll_ServiceProject(){
		
		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();
		AppDataModel appDataModel = null;
		try {
			appDataModel = test_Service_Iface.getAll_Serviceproject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}

}
