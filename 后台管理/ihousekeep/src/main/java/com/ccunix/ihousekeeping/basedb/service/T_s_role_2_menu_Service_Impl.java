package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_role_2_menu_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_role_2_menu;

@Service("T_s_role_2_menu_Service_r")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_s_role_2_menu_Service_Impl extends BaseService implements T_s_role_2_menu_Service_Iface {
@Resource
public T_s_role_2_menu_Dao_Iface t_s_role_2_menu_dao_iface;
public void insert_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
t_s_role_2_menu_dao_iface.insert_t_s_role_2_menu(t_s_role_2_menu);
}
public void update_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
t_s_role_2_menu_dao_iface.update_t_s_role_2_menu(t_s_role_2_menu);
}
public void delete_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
t_s_role_2_menu_dao_iface.delete_t_s_role_2_menu(t_s_role_2_menu);
}
public List queryAll_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
return t_s_role_2_menu_dao_iface.queryAll_t_s_role_2_menu(t_s_role_2_menu);
}
public List queryBy_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
return t_s_role_2_menu_dao_iface.queryBy_t_s_role_2_menu(t_s_role_2_menu);
}
}