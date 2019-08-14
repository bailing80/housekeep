package com.ccunix.ihousekeeping.coupon_type.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_coupon_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.coupon_type.dao.Coupon_type_Dao_Iface;
import com.ccunix.ihousekeeping.coupon_type.domain.Coupon_type;

/**
 * 
 * @ClassName: Coupon_type_Service_Impl
 * @author 肖云鹏
 * @date 2019年7月23日 上午8:18:15
 *
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Coupon_type_Service_Impl extends BaseService implements Coupon_type_Service_Iface {
	@Resource
	public Coupon_type_Dao_Iface coupon_Dao_Iface;

	@Resource
	public T_u_coupon_type_Dao_Iface t_u_coupon_type_Dao_Iface;

	@Override
	public List queryAll_coupon_type(Coupon_type coupon_type) throws Exception {
		List ls = coupon_Dao_Iface.queryAll_coupon_type(coupon_type);
		return ls;
	}

	@Override
	public void delete_all_coupon_type(T_u_coupon_type t_u_coupon_type) throws Exception {
		// 打散
		String[] ids = t_u_coupon_type.getId().split(",");
		try {
			// 对ids进行循环、对每一个id都进行单一的删除操作
			for (String string : ids) {
				T_u_coupon_type t = new T_u_coupon_type();
				t.setId(string);
				t_u_coupon_type_Dao_Iface.delete_t_u_coupon_type(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
