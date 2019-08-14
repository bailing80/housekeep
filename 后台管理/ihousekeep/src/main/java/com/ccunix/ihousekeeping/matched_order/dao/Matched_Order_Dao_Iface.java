package com.ccunix.ihousekeeping.matched_order.dao;

import java.util.List;

import com.ccunix.ihousekeeping.matched_order.domain.Matched_Order;
/**
 * 
 * @author 黄爽
 *
 */
public interface Matched_Order_Dao_Iface {
	public List queryAll_matched_order(Matched_Order matched_order) throws Exception;
	
	public int getOrderNo_seq() throws Exception;
}
