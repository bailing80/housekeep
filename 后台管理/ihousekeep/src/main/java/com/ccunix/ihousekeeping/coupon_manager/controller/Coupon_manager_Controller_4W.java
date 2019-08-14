package com.ccunix.ihousekeeping.coupon_manager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.basedb.service.T_u_coupon_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_coupon_manager_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_coupon_type_Service_Iface;
import com.ccunix.ihousekeeping.coupon_manager.domain.Coupon_manager;
import com.ccunix.ihousekeeping.coupon_manager.service.Coupon_manager_Service_Iface;

@Controller
@RequestMapping("Coupon_manager_Controller_4W")
public class Coupon_manager_Controller_4W extends BaseMultiController {
	@Resource
	Coupon_manager_Service_Iface coupon_manager_Service_Iface;
	@Resource
	T_u_coupon_manager_Service_Iface t_u_coupon_manager_Service_Iface;

	@Resource
	T_u_coupon_Service_Iface t_u_coupon_Service_Iface;

	@Resource
	T_u_coupon_type_Service_Iface t_u_coupon_type_Service_Iface;
	@Resource
	PageServiceIface pageServiceIface;

	/**
	 * 查询管理表数据
	 * 
	 * @param query_all_t_u_coupon_manager
	 * @return
	 */
	@RequestMapping("query_all_t_u_coupon_manager")
	@ResponseBody
	public List query_all_t_u_coupon_manager(Coupon_manager coupon_manager) {
		List ls = null;
		try {
			ls = coupon_manager_Service_Iface.queryAll_coupon_manager(coupon_manager);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	// 新增
	@RequestMapping("add_coupon_manager")
	@ResponseBody
	public void add_coupon_manager(Coupon_manager coupon_manager) {
		try {
			coupon_manager_Service_Iface.add_coupon_manager(coupon_manager);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 查询优惠券类型的类型名称
	@RequestMapping("query_coupon_type")
	@ResponseBody
	public List query_coupon_type(T_u_coupon_type t_u_coupon_type) {
		List ls = null;
		try {
			ls = t_u_coupon_type_Service_Iface.queryAll_t_u_coupon_type(t_u_coupon_type);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return ls;

	}

}
