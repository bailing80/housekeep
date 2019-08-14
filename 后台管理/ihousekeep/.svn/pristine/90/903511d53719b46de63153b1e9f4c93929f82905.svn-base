package com.ccunix.ihousekeeping.coupon_manager.service;

import java.util.List;

import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_manager;
import com.ccunix.ihousekeeping.coupon_manager.domain.Coupon_manager;

/**
 * 
 * @ClassName: Coupon_manager_Service_Iface
 * @author 肖云鹏
 * @date 2019年7月23日 下午6:21:26
 *
 */
public interface Coupon_manager_Service_Iface {
	// 查询全部
	public List queryAll_coupon_manager(Coupon_manager coupon_manager) throws Exception;

	// 生成批次号
	public String getCouponbatchCode() throws Exception;

	// 生成兑换码
	public String exchange_code(String batch_code) throws Exception;

	// 添加，并对表的数据进行业务处理
	public void add_coupon_manager(Coupon_manager coupon_manager) throws Exception;
}
