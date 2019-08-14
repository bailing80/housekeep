package com.ccunix.ihousekeeping.manager.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.T_s_user_manager_role_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.basedb.domain.T_u_manager;
import com.ccunix.ihousekeeping.manager.dao.Manager_Dao_Iface;
import com.ccunix.ihousekeeping.manager.domain.Manager;

/**
 * 
 * @ClassName: Manager_Service_Impl
 * @author 肖云鹏
 * @date 2019年7月19日 下午4:11:05
 *
 */

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Manager_Service_Impl extends BaseService implements Manager_Service_Iface {
	@Resource
	public Manager_Dao_Iface manager_Dao_Iface;

	@Resource
	public T_u_manager_Dao_Iface t_u_manager_Dao_Iface;

	@Resource
	public T_s_user_manager_role_Dao_Iface t_s_user_manager_role_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * 
	 * @param queryAll_manager
	 * @return
	 */
	@Override
	public List queryAll_manager(Manager manager) {
		List<Manager> ls = null;
		try {
			ls = manager_Dao_Iface.queryAll_manager(manager);
			// 向前台送数据前将是否轮播的"0","1"改为字符串"允许","不允许"
			for (Manager m : ls) {
				if (m.getIs_login() == 1) {
					m.setIs_login_str("允许");
				} else {
					m.setIs_login_str("不允许");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;

	}

	/**
	 * 批量删除数据
	 * 
	 * @param delete_all_manager
	 * @return
	 */
	@Override
	public void delete_all_manager(T_u_manager t_u_manager) {
		// 打散
		String[] ids = t_u_manager.getId().split(",");
		try {
			// 对ids进行循环、对每一个id都进行单一的删除操作
			for (String string : ids) {
				t_u_manager.setId(string);

				t_u_manager_Dao_Iface.delete_t_u_manager(t_u_manager);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void add_manager(Manager manager) {

		try {
			// 插入管理员的id
			manager.setId(UUID_Tools.getUUID());
			// 插入管理员表与身份表的关联user_manager_role_id
			manager.setUser_manager_role_id(manager.getManager_role_id());
			t_u_manager_Dao_Iface.insert_t_u_manager(manager);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
