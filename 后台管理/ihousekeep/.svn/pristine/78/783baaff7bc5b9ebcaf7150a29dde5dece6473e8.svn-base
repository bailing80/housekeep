package com.ccunix.ihousekeeping.manager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.basedb.domain.T_u_manager;
import com.ccunix.ihousekeeping.basedb.service.T_s_user_manager_role_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_manager_Service_Iface;
import com.ccunix.ihousekeeping.manager.domain.Manager;
import com.ccunix.ihousekeeping.manager.service.Manager_Service_Iface;

/**
 * @ClassName: Manager_Controller_4W
 * @author 肖云鹏
 * @date 2019年7月19日 下午4:10:36
 * 
 */
@Controller
@RequestMapping("Manager_Controller_4W")
public class Manager_Controller_4W extends BaseMultiController {
	@Resource
	T_u_manager_Service_Iface t_u_manager_Service_Iface;

	@Resource
	Manager_Service_Iface manager_Service_Iface;

	@Resource
	T_s_user_manager_role_Service_Iface t_s_user_manager_role_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	/**
	 * 查询管理员表数据
	 * 
	 * @param query_all__manager
	 * @return
	 */
	@RequestMapping("query_all_manager")
	@ResponseBody
	public List query_all_manager(Manager manager) {
		List ls = null;
		try {
			ls = manager_Service_Iface.queryAll_manager(manager);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 * 添加数据到管理员表数据
	 * 
	 * @param add_manager
	 */
	@RequestMapping("add_manager")
	@ResponseBody
	public void add_manager(Manager manager) {

		try {
			manager_Service_Iface.add_manager(manager);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 删除管理员表数据
	 * 
	 * @param delete_manager
	 */
	@RequestMapping("delete_manager")
	@ResponseBody
	public void delete_manager(T_u_manager t_u_manager, T_s_user_manager_role t_s_user_manager_role) {
		try {
			t_u_manager_Service_Iface.delete_t_u_manager(t_u_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 批量删除管理员表数据
	 * 
	 * @param delete_all_manager
	 */
	@RequestMapping("delete_all_manager")
	@ResponseBody
	public void delete_all_manager(T_u_manager t_u_manager, T_s_user_manager_role t_s_user_manager_role) {
		try {

			manager_Service_Iface.delete_all_manager(t_u_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 通过ID查出指定行数据
	 * 
	 * @param query_manager_By_Id
	 * @return
	 */
	@RequestMapping("query_manager_By_Id")
	@ResponseBody
	public List query_manager_By_Id(Manager manager) {
		List ls = null;
		try {
			ls = manager_Service_Iface.queryAll_manager(manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 * 更新单条数据
	 * 
	 * @param update_manager_By_Id
	 */

	@RequestMapping("update_manager_By_Id")
	@ResponseBody
	public void update_manager_By_Id(T_u_manager t_u_manager, T_s_user_manager_role t_s_user_manager_role) {
		try {
			t_u_manager_Service_Iface.update_t_u_manager(t_u_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 通过id查询身份表中的名称
	@RequestMapping("query_user_manager_role_name")
	@ResponseBody
	public List query_user_manager_role_name(T_s_user_manager_role t_s_user_manager_role) {
		List ls = null;
		try {
			ls = t_s_user_manager_role_Service_Iface.queryAll_t_s_user_manager_role(t_s_user_manager_role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

}
