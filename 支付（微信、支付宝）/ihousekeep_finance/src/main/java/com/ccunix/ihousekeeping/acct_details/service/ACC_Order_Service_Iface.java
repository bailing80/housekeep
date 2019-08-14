package com.ccunix.ihousekeeping.acct_details.service;

import java.util.List;

import com.ccunix.ihousekeeping.acct_details.domain.ACC_Order;
import com.ccunix.ihousekeeping.receive_acct.domain.Receive_acct;

/**
 * 后台管理端-接口
 * @author 黄爽
 *
 */
public interface ACC_Order_Service_Iface {
 
	List queryAll_acc_order(ACC_Order acc_order) throws Exception ;
	
	List queryAll_jz_acc_order(ACC_Order acc_order) throws Exception;
	
	List show_acc_order(ACC_Order acc_order) throws Exception;
	List queryAll_alipay(ACC_Order acc_order) throws Exception;
	public String makeOrderNo() throws Exception;
	

}
