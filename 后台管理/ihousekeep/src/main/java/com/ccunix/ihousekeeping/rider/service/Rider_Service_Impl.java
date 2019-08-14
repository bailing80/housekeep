package com.ccunix.ihousekeeping.rider.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_rider_Dao_Iface;
import com.ccunix.ihousekeeping.rider.dao.Rider_Dao_Iface;
import com.ccunix.ihousekeeping.rider.domain.Rider;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Rider_Service_Impl extends BaseService implements Rider_Service_Iface {
	@Resource
	public Rider_Dao_Iface rider_Dao_Iface;
 
	@Resource
	public T_u_rider_Dao_Iface t_u_rider_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @author 黄爽
	 */
	@Override
	public List queryAll_rider(Rider rider) throws Exception {
		List<Rider> ls = rider_Dao_Iface.queryAll_rider(rider) ;

		return ls;
	}


}
