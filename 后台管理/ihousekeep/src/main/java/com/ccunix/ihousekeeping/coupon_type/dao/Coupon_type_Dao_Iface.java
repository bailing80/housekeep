package com.ccunix.ihousekeeping.coupon_type.dao;

import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.coupon_type.domain.Coupon_type;

/**
 * @ClassName: Coupon_type_Dao_Iface
 * @author 肖云鹏
 * @date 2019年7月23日 上午8:18:02
 *
 */
@DataSourceType(DataSourceType.main)
public interface Coupon_type_Dao_Iface {

	public List queryAll_coupon_type(Coupon_type coupon_type) throws Exception;

}
