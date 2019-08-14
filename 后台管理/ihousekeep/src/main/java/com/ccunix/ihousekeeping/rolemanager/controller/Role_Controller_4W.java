package com.ccunix.ihousekeeping.rolemanager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.advertisement.service.Advertisement_Manager_Service_Iface;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.basedb.service.T_s_advertisement_manager_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_s_user_manager_role_Service_Iface;
import com.ccunix.ihousekeeping.rolemanager.domain.Role_Manager;
import com.ccunix.ihousekeeping.rolemanager.service.Role_Manager_Service_Iface;


/**
 * @Title: 后台管理端-角色管理-接口 
 *
 * @author 白玲
 *
 * @date 2019年7月17日 上午10:01:47 
 *
 * @Description:对角色的增删改查和批量删除
 **/
@Controller
@RequestMapping("Role_Controller_4W")
public class Role_Controller_4W  extends BaseMultiController {
	
	@Resource
	T_s_user_manager_role_Service_Iface t_s_user_manager_role_Service_Iface;
	
	@Resource
	Role_Manager_Service_Iface role_Manager_Service_Iface;


	@Resource
	PageServiceIface pageServiceIface;
	
	// 查询角色管理表数据
	@RequestMapping("query_all_t_s_role_manager")
	@ResponseBody
	public List query_all_t_s_role_manager(Role_Manager role_Manager) {
		List ls = null;
		try {
			ls = role_Manager_Service_Iface.queryAll_role_manager(role_Manager);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	// 添加数据到角色管理表
		@RequestMapping("add_t_s_user_manager_role")
		@ResponseBody
		public void add_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) {
			try {
				t_s_user_manager_role.setId(UUID_Tools.getUUID());

				t_s_user_manager_role_Service_Iface.insert_t_s_user_manager_role(t_s_user_manager_role);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 删除角色管理中数据
		@RequestMapping("delete_t_s_user_manager_role")
		@ResponseBody
		public void delete_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) {

			try {
				t_s_user_manager_role_Service_Iface.delete_t_s_user_manager_role(t_s_user_manager_role);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		

		@RequestMapping("query_Role_manager_By_Id")
		@ResponseBody
		public List query_Role_manager_By_Id(T_s_user_manager_role t_s_user_manager_role){
			List ls = null;
			try {
				ls = t_s_user_manager_role_Service_Iface.queryAll_t_s_user_manager_role(t_s_user_manager_role);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ls;
		}
		
		
		@RequestMapping("update_Role_manager_By_Id")
		@ResponseBody
		public void update_Role_manager_By_Id(T_s_user_manager_role t_s_user_manager_role){
			
			try {
				t_s_user_manager_role_Service_Iface.update_t_s_user_manager_role(t_s_user_manager_role);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 批量删除广告数据
		@RequestMapping("delete_all_t_s_user_manager_role")
		@ResponseBody
		public void delete_all_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) {
			try {   
				role_Manager_Service_Iface.delete_all_t_s_user_manager_role(t_s_user_manager_role);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
	

