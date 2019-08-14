package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_manager;
import java.util.List;
public interface T_u_manager_Service_Iface {
public void insert_t_u_manager(T_u_manager t_u_manager) throws Exception;
public void update_t_u_manager(T_u_manager t_u_manager) throws Exception;
public void delete_t_u_manager(T_u_manager t_u_manager) throws Exception;
public List queryAll_t_u_manager(T_u_manager t_u_manager) throws Exception;
public List queryBy_t_u_manager(T_u_manager t_u_manager) throws Exception;
}
