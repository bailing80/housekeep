package com.ccunix.ihousekeeping.usermenu.service;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.usermenu.domain.T_s_user_menu_r;
import java.util.List;
public interface T_s_user_menu_Service_Iface_r {
public void insert_t_s_user_menu(T_s_user_menu_r t_s_user_menu) throws Exception;
public void update_t_s_user_menu(T_s_user_menu_r t_s_user_menu) throws Exception;
public void delete_t_s_user_menu(T_s_user_menu_r t_s_user_menu) throws Exception;
public List queryAll_t_s_user_menu(T_s_user_menu_r t_s_user_menu) throws Exception;
public List queryBy_t_s_user_menu(T_s_user_menu_r t_s_user_menu) throws Exception;

void delete_all_t_s_user_menu(T_s_user_menu_r t_s_user_menu);
}
