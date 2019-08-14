package com.ccunix.ihousekeeping.advertisement.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.dao.Advertisement_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_advertisement_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Advertisement_Manager_Service_Impl extends BaseService implements Advertisement_Manager_Service_Iface {
	@Resource
	public Advertisement_Manager_Dao_Iface advertisement_Manager_Dao_Iface;
 
	@Resource
	public T_s_advertisement_manager_Dao_Iface t_s_advertisement_manager_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @param advertisement_Manager
	 * @return
	 */
	@Override
	public List queryAll_advertisement_manager(Advertisement_Manager advertisement_Manager) {
		List<Advertisement_Manager> ls = advertisement_Manager_Dao_Iface.queryAll_advertisement_manager(advertisement_Manager);
		//向前台送数据前将是否轮播的"0","1"改为字符串"是","否"
		for (Advertisement_Manager s : ls) {
			if (s.getIs_wheel() == 1) {
				s.setIs_wheel_str("是");
			} else {
				s.setIs_wheel_str("否");
			}
		}
		return ls;
	}

	/**
	 * 批量删除数据
	*/
	@Override
	public void delete_all_t_s_advertisement_manager(T_s_advertisement_manager advertisement_Manager) {
		String[] ids = advertisement_Manager.getId().split(",");
		try {
			//通过多个ID拼成的字符串批量删除
			for (String string : ids) {
				T_s_advertisement_manager t = new T_s_advertisement_manager();
				t.setId(string);
				t_s_advertisement_manager_Dao_Iface.delete_t_s_advertisement_manager(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
