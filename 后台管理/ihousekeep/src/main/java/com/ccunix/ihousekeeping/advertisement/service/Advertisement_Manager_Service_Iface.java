package com.ccunix.ihousekeeping.advertisement.service;

import java.util.List;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;

/**
 * 后台管理端-广告管理-接口
 * @author 王哲
 *
 */
public interface Advertisement_Manager_Service_Iface {
 
	List queryAll_advertisement_manager(Advertisement_Manager advertisement_Manager);
	void delete_all_t_s_advertisement_manager(T_s_advertisement_manager advertisement_Manager);

}
