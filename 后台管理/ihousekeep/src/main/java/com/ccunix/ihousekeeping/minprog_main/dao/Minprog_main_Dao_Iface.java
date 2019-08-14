package com.ccunix.ihousekeeping.minprog_main.dao;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.T_u_member;

public interface Minprog_main_Dao_Iface {
	public List queryAll_Advertisement_item() throws Exception;
	public List queryBy_Coupon(T_u_member t_u_member) throws Exception;
	public List queryBy_House(T_u_member t_u_member) throws Exception;
	public List queryAll_House(T_u_member t_u_member) throws Exception;
}
