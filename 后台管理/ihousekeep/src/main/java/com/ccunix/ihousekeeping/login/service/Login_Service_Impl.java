package com.ccunix.ihousekeeping.login.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.dao.Advertisement_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_advertisement_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.login.dao.Login_Dao_Iface;
import com.ccunix.ihousekeeping.login.domain.Login;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Login_Service_Impl extends BaseService implements Login_Service_Iface {
	@Resource
	public Login_Dao_Iface login_Dao_Iface;
 
	@Resource
	public T_u_manager_Dao_Iface t_u_manager_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @param advertisement_Manager
	 * @return
	 */
	@Override
	public List queryAll_login(Login login) {
		List<Login> ls = login_Dao_Iface.queryAll_login(login);
		for (int i= 0 ; i < ls.size();i++){
			if (ls.get(i).getName().equals(login.getName())&&ls.get(i).getPwd().equals(login.getPwd())) {
				List<Login> list=new ArrayList<Login>();
				list.add(ls.get(i));
			}
		}
		
		return ls;
	}


}
