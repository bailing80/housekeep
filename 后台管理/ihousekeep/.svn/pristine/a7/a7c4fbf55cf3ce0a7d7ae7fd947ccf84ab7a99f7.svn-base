package com.ccunix.ihousekeeping.order.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.coupon.service.Coupon_H_Service_Iface;
import com.ccunix.ihousekeeping.minprog_main.service.MinPro_MainPage_Service_Iface;
import com.ccunix.ihousekeeping.order.service.Order_Service_Iface;

@Controller
@RequestMapping("Order_Controller_4X")
public class Order_Controller_4X extends BaseMultiController {

	@Resource
	Order_Service_Iface order_Service_Iface;

	@RequestMapping("getOrderInfo")
	@ResponseBody
	public AppDataModel_Sec getOrderInfo(Base_Model_Business base_Model_Business) {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();
		AppDataModel appDataModel = null;
		try {
			appDataModel = order_Service_Iface.getOrderInfo(base_Model_Business);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}

}
