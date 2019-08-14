package com.ccunix.ihousekeeping.serviceitem.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.serviceitem.domain.second_head_been;
import com.ccunix.ihousekeeping.serviceitem.service.ServiceItem_Service_Iface;

@Controller
@RequestMapping("ServiceItem_Controller_4X")
public class ServiceItem_Controller_4X extends BaseMultiController {

	
	@Resource
	ServiceItem_Service_Iface serviceItem_Service_Iface;

	@RequestMapping("second_head")
	@ResponseBody
	public AppDataModel_Sec second_head(second_head_been been) {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();
		AppDataModel appDataModel = null;
		try {
			appDataModel = serviceItem_Service_Iface.second_head(been);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}
}
