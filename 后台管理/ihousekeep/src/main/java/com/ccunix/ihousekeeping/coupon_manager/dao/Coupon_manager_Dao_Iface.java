package com.ccunix.ihousekeeping.coupon_manager.dao;

import java.util.List;
import com.ccunix.ihousekeeping.coupon_manager.domain.Coupon_manager;

/**
 * @ClassName: Coupon_manager_Dao_Iface
 * @author 肖云鹏
 * @date 2019年7月26日 上午10:09:12
 * 
 */
public interface Coupon_manager_Dao_Iface {

	public List queryAll_coupon_manager(Coupon_manager coupon_manager) throws Exception;

	public int getCouponBatchcode_int() throws Exception;

	public int getCouponExchangeCode_int() throws Exception;

}
