package com.ccunix.ihousekeeping.rider.dao;

import java.util.List;

import com.ccunix.ihousekeeping.rider.domain.Rider;

/**
 * 
 * @author 黄爽
 *
 */
public interface Rider_Dao_Iface {
	public List queryAll_rider(Rider rider) throws Exception;
}
