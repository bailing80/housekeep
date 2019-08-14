package com.ccunix.ihousekeeping.manager.dao;

import java.util.List;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.basedb.domain.T_u_manager;
import com.ccunix.ihousekeeping.manager.domain.Manager;

/**
 * 
 * @ClassName: Manager_Dao_Iface
 * @author 肖云鹏
 * @date 2019年7月19日 下午4:10:44
 *
 */
public interface Manager_Dao_Iface {
	// 多表联查
	List queryAll_manager(Manager manager) throws Exception;

}
