package com.ccunix.ihousekeeping.servicecontent.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.servicecontent.domain.third_head_been;
import com.ccunix.ihousekeeping.servicecontent.service.ServiceContent_Service_Iface;

@Controller
@RequestMapping("ServiceContent_Controller_4X")
public class ServiceContent_Controller_4X extends BaseMultiController  {

	
	@Resource
	ServiceContent_Service_Iface serviceContent_Service_Iface;

	@RequestMapping("third_head")
	@ResponseBody
	public AppDataModel_Sec third_head(third_head_been third_head_been) {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();
		AppDataModel appDataModel = null;
		try {
			appDataModel = serviceContent_Service_Iface.third_head(third_head_been);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}
	
}
