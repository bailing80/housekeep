package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_s_system_param;
import java.util.List;
public interface T_s_system_param_Service_Iface {
public void insert_t_s_system_param(T_s_system_param t_s_system_param) throws Exception;
public void update_t_s_system_param(T_s_system_param t_s_system_param) throws Exception;
public void delete_t_s_system_param(T_s_system_param t_s_system_param) throws Exception;
public List queryAll_t_s_system_param(T_s_system_param t_s_system_param) throws Exception;
public List queryBy_t_s_system_param(T_s_system_param t_s_system_param) throws Exception;
}
