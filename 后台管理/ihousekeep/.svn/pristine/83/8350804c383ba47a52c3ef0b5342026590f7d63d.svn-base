package com.ccunix.ihousekeeping.coupon.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.coupon.dao.Coupon_H_Dao_Iface;
import com.ccunix.ihousekeeping.coupon.domain.Coupon_H;
import com.ccunix.ihousekeeping.coupon.service.Coupon_H_Service_Iface;
import com.ccunix.ihousekeeping.order.service.Order_Service_Iface;

/**
 * 
 * @ClassName: Coupon_H_Controler_4X
 * @author 肖云鹏
 * @date 2019年7月30日 上午8:31:26
 *
 */
@Controller
@RequestMapping("Coupon_H_Controler_4X")
public class Coupon_H_Controler_4X extends BaseMultiController {

	@Resource
	Coupon_H_Service_Iface coupon_H_Service_Iface;

	@RequestMapping("getCouponInfo")
	@ResponseBody
	public AppDataModel_Sec getCouponInfo(Base_Model_Business base_Model_Business) {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();
		AppDataModel appDataModel = null;
		try {
			appDataModel = coupon_H_Service_Iface.getCouponInfo(base_Model_Business);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}

}
