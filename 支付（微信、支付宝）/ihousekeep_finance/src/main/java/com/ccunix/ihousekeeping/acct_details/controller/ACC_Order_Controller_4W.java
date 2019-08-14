package com.ccunix.ihousekeeping.acct_details.controller;
 
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.acct_details.domain.ACC_Order;
import com.ccunix.ihousekeeping.acct_details.service.ACC_Order_Service_Iface;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_order;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_saler;
import com.ccunix.ihousekeeping.basedb.service.T_lz_order_Service_Iface;


@Controller
@RequestMapping("ACC_Order_Controller_4W")
public class ACC_Order_Controller_4W extends BaseMultiController {
	@Resource
	T_lz_order_Service_Iface t_lz_order_Service_Iface;
	
	
	@Resource
	ACC_Order_Service_Iface acc_order_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	/**
	 *  查询订单管理表数据
	 * @author 黄爽
	 * @return
	 */
	@RequestMapping("query_all_t_lz_order")
	@ResponseBody
	public List query_all_t_lz_order(ACC_Order acc_order) {

		List ls = null;
		try {
			
			ls = acc_order_Service_Iface.queryAll_acc_order(acc_order);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	/**
	 *  查询订单管理表数据
	 * @author 黄爽
	 * @return
	 */
	@RequestMapping("query_all_t_zj_order")
	@ResponseBody
	public List query_all_t_zj_order(ACC_Order acc_order) {

		List ls = null;
		try {
			
			ls = acc_order_Service_Iface.queryAll_jz_acc_order(acc_order);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	@RequestMapping("query_all_alipay")
	@ResponseBody
	public List query_all_alipay(ACC_Order acc_order) {

		List ls = null;
		try {
			
			ls = acc_order_Service_Iface.queryAll_alipay(acc_order);
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
	public void is_status(T_lz_order t_lz_order) {
		System.out.println("hahahhhhhhhhhhh");
		System.out.println("hahahhhhhhhhhhh");
		System.out.println("hahahhhhhhhhhhh");
		try {
			
			t_lz_order_Service_Iface.update_t_lz_order(t_lz_order);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @param 点击按钮----转账
	 * @author huangshuang
	 */
	@RequestMapping("check_account")
	@ResponseBody
	public void check_account(ACC_Order acc_order) {
		try {
			acc_order_Service_Iface.show_acc_order(acc_order);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
