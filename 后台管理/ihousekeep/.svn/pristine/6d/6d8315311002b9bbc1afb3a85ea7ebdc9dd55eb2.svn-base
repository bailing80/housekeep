package com.ccunix.ihousekeeping.coupon.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.T_u_coupon_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_coupon_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_coupon_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_order_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order;
import com.ccunix.ihousekeeping.coupon.dao.Coupon_H_Dao_Iface;
import com.ccunix.ihousekeeping.coupon.domain.Coupon_H;
import com.ccunix.ihousekeeping.coupon_manager.dao.Coupon_manager_Dao_Iface;
import com.ccunix.ihousekeeping.coupon_manager.domain.Coupon_manager;
import com.ccunix.ihousekeeping.order.dao.Order_Dao_Iface;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;

@Service
@Transactional
public class Coupon_H_Service_Impl extends BaseService implements Coupon_H_Service_Iface {

	@Resource
	public Coupon_H_Dao_Iface coupon_h_Dao_Iface;

	@Resource
	public T_u_coupon_Dao_Iface t_u_coupon_Dao_Iface;

	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface;

	@Override
	public List queryAll_H_coupon(Coupon_H coupon_h) throws Exception {
		List<Coupon_H> ls = coupon_h_Dao_Iface.queryAll_H_coupon(coupon_h);
		return ls;
	}

	// 优惠券信息
	@Override
	public AppDataModel getCouponInfo(Coupon_H coupon_H) throws Exception {
		AppDataModel appDataModel = getAppDataModel();

		List couponinfo = coupon_h_Dao_Iface.getCouponInfo(coupon_H);

		for (int i = 0; i < couponinfo.size(); i++) {
			coupon_H = (Coupon_H) couponinfo.get(i);
			coupon_H.setBack_pic(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
					+ coupon_H.getBack_pic());
		}
		appDataModel.data.put("couponinfo", couponinfo);

		return appDataModel;
	}

	@Override
	public AppDataModel getCoupon_level_two(Coupon_H coupon_h) throws Exception {
		AppDataModel appDataModel = getAppDataModel();
		List list = coupon_h_Dao_Iface.getCoupon_level_two(coupon_h);
		if (list.size() == 0) {
			coupon_h.setCoupon_state("兑换失败");
			appDataModel.data.put("coupon_h", coupon_h.getCoupon_state());
		}
		// 循环list，获取其中的数据
		for (int i = 0; i < list.size(); i++) {

			coupon_h = (Coupon_H) list.get(i);
			// 如果优惠券的状态为"01",那么表示还未兑换
			if (coupon_h.getState().equals("01")) {

				// 获取用户id放入到uer_memeber中
				coupon_h.setUsed_member(coupon_h.getMember_id());
				// 该表优惠券状态为"02"
				coupon_h.setState("02");
				// 将用户的id插入到优惠券表中的user_member,表示属于这个用户
				t_u_coupon_Dao_Iface.update_t_u_coupon(coupon_h);
				// 将"兑换成功"传给前台
				coupon_h.setCoupon_state("兑换成功");
				appDataModel.data.put("coupon_h", coupon_h.getCoupon_state());

			} else {

				coupon_h.setCoupon_state("兑换失败");
				appDataModel.data.put("coupon_h", coupon_h.getCoupon_state());
			}

		}

		return appDataModel;
	}

}
