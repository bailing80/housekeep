package com.ccunix.ihousekeeping.map.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.dao.Advertisement_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.Map_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_s_advertisement_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.Map;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.login.domain.Login;
import com.ccunix.ihousekeeping.map.dao.Map_H_Dao_Iface;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Map_H_Service_Impl extends BaseService implements Map_H_Service_Iface {
	@Resource
	public Map_H_Dao_Iface map_H_Dao_Iface;
 
	@Resource
	public Map_Dao_Iface map_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @param advertisement_Manager
	 * @return
	 */
	public List queryAll_map_h(Map map) {
		List<Map> ls = map_H_Dao_Iface.queryAll_map_h(map);
		for (int i= 0 ; i < ls.size();i++){
				List<Map> list=new ArrayList<Map>();
				list.add(ls.get(i));
		}
		
		return ls;
	}
	
	/**
	 * 批量删除数据
	*/
	@Override
	public void delete_all_map(Map map) {
		String[] ids = map.getId().split(",");
		try {
			//通过多个ID拼成的字符串批量删除
			for (String string : ids) {
				Map m = new Map();
				m.setId(string);
				map_Dao_Iface.delete_map(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
