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
import com.ccunix.ihousekeeping.basedb.domain.T_u_order;
import com.ccunix.ihousekeeping.coupon.dao.Coupon_H_Dao_Iface;
import com.ccunix.ihousekeeping.coupon.domain.Coupon_H;
import com.ccunix.ihousekeeping.coupon_manager.dao.Coupon_manager_Dao_Iface;
import com.ccunix.ihousekeeping.coupon_manager.domain.Coupon_manager;
import com.ccunix.ihousekeeping.order.dao.Order_Dao_Iface;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Coupon_H_Service_Impl extends BaseService implements Coupon_H_Service_Iface {

	@Resource
	public Coupon_H_Dao_Iface coupon_h_Dao_Iface;

	@Resource
	public T_u_coupon_Dao_Iface t_u_coupon_Dao_Iface;

	@Override
	public List queryAll_H_coupon(Coupon_H coupon_h) throws Exception {
		List<Coupon_H> ls = coupon_h_Dao_Iface.queryAll_H_coupon(coupon_h);
		return ls;
	}

	// 优惠券信息
	@Override
	public AppDataModel getCouponInfo(Base_Model_Business base_Model_Business) throws Exception {

		AppDataModel appDataModel = getAppDataModel();

		Coupon_H coupon_H = new Coupon_H();
		List couponinfo = coupon_h_Dao_Iface.getCouponInfo(coupon_H);
		for (int i = 0; i < couponinfo.size(); i++) {
			Coupon_H h = (Coupon_H) couponinfo.get(i);
			System.out.println("背景图片" + h.getBack_pic() + "类型名称" + h.getType_name() + "金额" + h.getMoney());
		}
		appDataModel.data.put("couponinfo", couponinfo);

		return appDataModel;
	}

}
