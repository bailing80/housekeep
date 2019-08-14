package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
@DataSourceType(DataSourceType.main)
public interface T_s_user_manager_role_Dao_Iface {
public void insert_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) throws Exception;
public void update_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) throws Exception;
public void delete_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) throws Exception;
public List queryAll_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) throws Exception;
public List queryBy_t_s_user_manager_role(T_s_user_manager_role t_s_user_manager_role) throws Exception;
}
