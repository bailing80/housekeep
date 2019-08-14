package com.ccunix.ihousekeeping.coupon.dao;

import java.util.List;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member;
import com.ccunix.ihousekeeping.coupon.domain.Coupon_H;
import com.ccunix.ihousekeeping.coupon_manager.domain.Coupon_manager;

public interface Coupon_H_Dao_Iface {

	public List queryAll_H_coupon(Coupon_H coupon_h) throws Exception;
	// 获取优惠劵信息
	public List getCouponInfo(Coupon_H coupon_H) throws Exception;

	// 获取优惠券二级信息
	public List getCoupon_level_two(Coupon_H coupon_H) throws Exception;

}
