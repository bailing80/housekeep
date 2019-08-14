package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_menu;
import java.util.List;
public interface T_s_user_menu_Service_Iface {
public void insert_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public void update_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public void delete_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public List queryAll_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
public List queryBy_t_s_user_menu(T_s_user_menu t_s_user_menu) throws Exception;
}
