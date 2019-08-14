package com.ccunix.ihousekeeping.role_2_menu.service;
import java.util.List;
import java.util.Map;

import com.ccunix.ihousekeeping.basedb.domain.T_s_role_2_menu;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_menu;
import com.ccunix.ihousekeeping.rolemanager.domain.Role_Manager;
public interface T_s_role_2_menu_Service_Iface {
public void insert_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
public void update_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
public void delete_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
public List queryAll_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
public List queryBy_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
public Map queryAll_t_s_role_1_menu(T_s_role_2_menu t_s_role_2_menu,Role_Manager role_Manager,T_s_user_menu t_s_user_menu) throws Exception;
public void delete_all_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception;
public void delete_t_s_role_2_menu2(T_s_role_2_menu t_s_role_2_menu)throws Exception;;
}
