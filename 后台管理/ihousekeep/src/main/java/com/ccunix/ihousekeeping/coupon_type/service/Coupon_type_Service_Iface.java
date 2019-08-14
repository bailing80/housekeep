package com.ccunix.ihousekeeping.coupon_type.service;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.coupon_type.domain.Coupon_type;

/**
 * 
 * @ClassName: Coupon_type_Service_Iface
 * @author 肖云鹏
 * @date 2019年7月23日 上午8:18:26
 *
 */
public interface Coupon_type_Service_Iface {
	// 查询全部
	public List queryAll_coupon_type(Coupon_type coupon_type) throws Exception;

	// 批量删除
	void delete_all_coupon_type(T_u_coupon_type t_u_coupon_type) throws Exception;

}
