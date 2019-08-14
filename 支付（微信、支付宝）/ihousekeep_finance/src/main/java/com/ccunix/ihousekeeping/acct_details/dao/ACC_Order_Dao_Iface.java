package com.ccunix.ihousekeeping.acct_details.dao;

import java.util.List;

import com.ccunix.ihousekeeping.acct_details.domain.ACC_Order;

/**
 * 
 * @author 黄爽
 *
 */
public interface ACC_Order_Dao_Iface {
	public List queryAll_acc_order(ACC_Order acc_order) throws Exception;
	
	public List queryAll_jz_acc_order(ACC_Order acc_order) throws Exception;
	public List queryAll_alipay(ACC_Order acc_order) throws Exception;
	
	public List show_acc_order(ACC_Order acc_order) throws Exception;
	public int getOrderNo_seq() throws Exception;
}
