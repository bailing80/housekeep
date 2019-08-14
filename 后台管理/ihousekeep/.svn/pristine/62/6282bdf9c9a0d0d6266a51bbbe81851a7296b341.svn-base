package com.ccunix.ihousekeeping.rolemanager.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_user_manager_role_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.rolemanager.dao.Role_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.rolemanager.domain.Role_Manager;



/**
 * @Title: 后台管理端-角色管理-接口 
 *
 * @author 白玲
 *
 * @date 2019年7月17日 上午10:01:47 
 *
 * @Description:对角色的增删改查和批量删除
 **/
@Service
public class Role_Manager_Service_Impl extends BaseService implements Role_Manager_Service_Iface {
	
	@Resource
	public Role_Manager_Dao_Iface role_Manager_Dao_Iface;

	
	@Resource
	public T_s_user_manager_role_Dao_Iface t_s_user_manager_role_Dao_Iface;

	// 查询角色管理表数据
	@Override
	public List queryAll_role_manager(Role_Manager role_Manager) throws Exception {
     List ls =role_Manager_Dao_Iface.queryAll_role_manager(role_Manager);

     return ls;
	
	}
   //批量删除角色
	@Override
	public void delete_all_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) {
		String[]  ids = t_s_user_manager_role.getId().split(",");
		try{
			for (String string : ids) {
				T_s_user_manager_role t =new T_s_user_manager_role();
				t.setId(string);
				t_s_user_manager_role_Dao_Iface.delete_t_s_user_manager_role(t);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	}

