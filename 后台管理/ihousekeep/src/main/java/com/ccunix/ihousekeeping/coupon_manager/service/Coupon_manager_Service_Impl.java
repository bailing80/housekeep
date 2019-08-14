package com.ccunix.ihousekeeping.coupon_manager.service;

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
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.T_u_coupon_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_coupon_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_coupon_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.coupon_manager.dao.Coupon_manager_Dao_Iface;
import com.ccunix.ihousekeeping.coupon_manager.domain.Coupon_manager;

/**
 * @ClassName: Coupon_manager_Service_Impl
 * @author 肖云鹏
 * @date 2019年7月26日 上午10:09:37
 * 
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Coupon_manager_Service_Impl extends BaseService implements Coupon_manager_Service_Iface {

	@Resource
	Coupon_manager_Dao_Iface coupon_manager_Dao_Iface;

	@Resource
	T_u_coupon_Dao_Iface t_u_coupon_Dao_Iface;

	@Resource
	T_u_coupon_manager_Dao_Iface t_u_coupon_manager_Dao_Iface;

	T_u_coupon_manager t_u_coupon_manager = new T_u_coupon_manager();
	T_u_coupon_type t_u_coupon_type = new T_u_coupon_type();
	T_u_coupon t_u_coupon = new T_u_coupon();

	@Override
	public List queryAll_coupon_manager(Coupon_manager coupon_manager) throws Exception {
		List<Coupon_manager> ls = coupon_manager_Dao_Iface.queryAll_coupon_manager(coupon_manager);
		return ls;
	}

	@Override
	public String getCouponbatchCode() throws Exception {
		String yymmdd = DateTimeUtil.getDateString(DateTimeUtil.dateFormat_yyMMDD, new Date());
		int batch_seq = coupon_manager_Dao_Iface.getCouponBatchcode_int();
		String str = yymmdd + batch_seq;
		int c = Integer.parseInt(str);
		String s = Integer.toHexString(c);
		return s;
	}

	@Override
	public String exchange_code(String batch_code) throws Exception {
		Random r = new Random();
		int ran = r.nextInt(1000);
		String result = batch_code + Integer.toHexString(coupon_manager_Dao_Iface.getCouponExchangeCode_int())
				+ Integer.toHexString(ran);
		return result;
	}

	// 实现类对添加的数据进行处理
	@Override
	public void add_coupon_manager(Coupon_manager coupon_manager) throws Exception {
		// 插入主表优惠券管理类型的id
		t_u_coupon_manager.setId(UUID_Tools.getUUID());
		// 插入主表优惠券管理表的coupon_type_id
		t_u_coupon_manager.setCoupon_type_id(coupon_manager.getCoupon_manager_type_id());
		// 插入主表优惠券管理表的批次号
		String code = getCouponbatchCode();
		t_u_coupon_manager.setBatch_code(code);
		// 插入主表优惠券管理表的批次名称
		t_u_coupon_manager.setCoupon_project_name(coupon_manager.getCoupon_project_name());
		// 写死主表优惠券管理表的生成人
		t_u_coupon_manager.setCreator_name("ABC");
		// 插入主表优惠卷表的总数
		t_u_coupon_manager.setBatch_total(coupon_manager.getBatch_total());
		// 插入
		t_u_coupon_manager_Dao_Iface.insert_t_u_coupon_manager(t_u_coupon_manager);

		for (int i = 0; i < coupon_manager.getBatch_total(); i++) {
			// 插入从表优惠券的id
			t_u_coupon.setId(UUID_Tools.getUUID());
			// 插入从表优惠券表的外键coupon_manager_id
			t_u_coupon.setCoupon_manager_id(t_u_coupon_manager.getId());
			// 插入从表优惠券表的外键coupon_type_id
			t_u_coupon.setCoupon_type_id(coupon_manager.getCoupon_manager_type_id());
			// 插入优惠券表的兑换码
			t_u_coupon.setExchange_code(exchange_code(code));
			// 插入优惠券表的状态
			t_u_coupon.setState("01");
			// 插入优惠券表的兑换时间
			t_u_coupon.setExchange_time(
					DateTimeUtil.getDateDate(DateTimeUtil.dateFormat_yyyyMMdd, coupon_manager.getExchange_time_str()));
			// 插入优惠券表的金额
			t_u_coupon.setMoney(coupon_manager.getMoney());
			// 插入优惠券表
			t_u_coupon_Dao_Iface.insert_t_u_coupon(t_u_coupon);

		}

	}

}
