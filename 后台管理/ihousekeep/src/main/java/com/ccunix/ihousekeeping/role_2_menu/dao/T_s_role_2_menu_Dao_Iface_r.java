package com.ccunix.ihousekeeping.role_2_menu.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_s_role_2_menu;
@DataSourceType(DataSourceType.main)
public interface T_s_role_2_menu_Dao_Iface_r {
//public void insert_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
//public void update_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
//public void delete_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
public List queryAll_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
//public List queryBy_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
}
