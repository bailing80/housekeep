package com.ccunix.ihousekeeping.matched_order.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.ccunix.ihousekeeping.basedb.dao.T_u_order_Dao_Iface;
import com.ccunix.ihousekeeping.matched_order.dao.Matched_Order_Dao_Iface;
import com.ccunix.ihousekeeping.matched_order.domain.Matched_Order;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Matched_Order_Service_Impl extends BaseService implements Matched_Order_Service_Iface {
	@Resource
	public Matched_Order_Dao_Iface matched_order_Dao_Iface;
 
	@Resource
	public T_u_order_Dao_Iface t_u_order_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @author 黄爽
	 * @return
	 */
	@Override
	public List queryAll_matched_order(Matched_Order matched_order) throws Exception{
		List<Matched_Order> ls = matched_order_Dao_Iface.queryAll_matched_order(matched_order);
		return ls;
	}

	@Override
	public String makeOrderNo() throws Exception {
		String yymmdd = DateTimeUtil.getDateString(DateTimeUtil.dateFormat_yyMMDD, new Date());
		int seq = matched_order_Dao_Iface.getOrderNo_seq();
		String str = yymmdd + seq;
		return str;
	}

}
