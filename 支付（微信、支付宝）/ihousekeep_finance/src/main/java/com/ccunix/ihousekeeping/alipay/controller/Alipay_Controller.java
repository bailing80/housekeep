package com.ccunix.ihousekeeping.alipay.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.acct_details.dao.ACC_Order_Dao_Iface;
import com.ccunix.ihousekeeping.acct_details.domain.ACC_Order;
import com.ccunix.ihousekeeping.acct_details.service.ACC_Order_Service_Iface;
import com.ccunix.ihousekeeping.alipay.service.Alipay_Service_Iface;
import com.ccunix.ihousekeeping.alipay.service.Alipay_Service_Impl;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_order_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_order;
import com.ccunix.ihousekeeping.receive_acct.service.Receive_acct_Service_Iface;

@Controller
@RequestMapping("Alipay_Controller")
public class Alipay_Controller extends BaseMultiController {

@Resource
public T_lz_order_Dao_Iface t_lz_order_dao_iface;

@Resource
public ACC_Order_Dao_Iface acc_order_Dao_Iface;


@Resource
ACC_Order_Service_Iface acc_order_Service_Iface;
@Resource
PageServiceIface pageServiceIface;


@RequestMapping("add_alipay_controller")
@ResponseBody
public void add_alipay_controller(T_lz_order t_lz_order) {
	try {
//		String number = null;
//		number = acc_order_Service_Iface.queryAll_acc_order(acc_order)
//		t_lz_order.setOrder_no(t_lz_order.getOrder_no()+number);
		
		t_lz_order.setId(UUID_Tools.getUUID());
		t_lz_order_dao_iface.insert_t_lz_order(t_lz_order);
		
		ACC_Order acc_order = new ACC_Order();
		acc_order_Service_Iface.queryAll_alipay(acc_order);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@RequestMapping("query_order_member_By_Id")
@ResponseBody
public List query_order_member_By_Id(T_lz_order t_lz_order){
	List ls = null;
	try {
		ls = t_lz_order_dao_iface.queryAll_t_lz_order(t_lz_order);
		System.err.println(t_lz_order);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ls;
}


}
