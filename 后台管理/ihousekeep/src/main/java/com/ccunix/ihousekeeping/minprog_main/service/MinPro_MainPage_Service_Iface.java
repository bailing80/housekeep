package com.ccunix.ihousekeeping.minprog_main.service;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;

import com.ccunix.ihousekeeping.basedb.domain.T_u_member;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member_address;
import com.ccunix.ihousekeeping.minprog_main.domain.Member_Address;
import com.ccunix.ihousekeeping.minprog_main.domain.Order;

public interface MinPro_MainPage_Service_Iface {
	
	/**
	 * 获取首页信息
	 * @return
	 * @throws Exception
	 */
	public AppDataModel getMainPageInfo(T_u_member t_u_member) throws Exception;
	public AppDataModel queryAll_House(T_u_member t_u_member) throws Exception;
	public AppDataModel insertMember_Address(Member_Address member_Address) throws Exception;
	public AppDataModel place_Order(Order order) throws Exception;
	public AppDataModel getAddress_Detail(T_u_member_address t_u_member_address) throws Exception;
}
