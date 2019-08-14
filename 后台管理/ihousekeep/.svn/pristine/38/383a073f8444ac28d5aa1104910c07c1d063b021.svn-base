package com.ccunix.ihousekeeping.coupon.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.basedb.service.T_u_coupon_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_coupon_type_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_order_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_order_detail_Service_Iface;
import com.ccunix.ihousekeeping.coupon.domain.Coupon_H;
import com.ccunix.ihousekeeping.coupon.service.Coupon_H_Service_Iface;


@Controller
@RequestMapping("Coupon_H_Controller_4W")
public class Coupon_H_Controller_4W extends BaseMultiController {
	@Resource
	T_u_coupon_Service_Iface t_u_coupon_Service_Iface;
	
	@Resource
	Coupon_H_Service_Iface coupon_h_Service_Iface;
	@Resource
	PageServiceIface pageServiceIface;

	/**
	 * 查询管理表数据
	 * 
	 * @param query_all_t_u_coupon_manager
	 * @return
	 */
	@RequestMapping("query_all_t_u_coupon")
	@ResponseBody
	public List query_all_t_u_coupon(Coupon_H coupon_h) {
		List ls = null;
		try {
			ls = coupon_h_Service_Iface.queryAll_H_coupon(coupon_h);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	/**
	 * @param t_s_advertisement_manager
	 */
	@RequestMapping("is_status")
	@ResponseBody
	public void is_status(T_u_coupon t_u_coupon) {
		System.out.println("hahahhhhhhhhhhh");
		System.out.println("hahahhhhhhhhhhh");
		System.out.println("hahahhhhhhhhhhh");
		try {
			t_u_coupon_Service_Iface.update_t_u_coupon(t_u_coupon);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
