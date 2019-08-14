package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import java.util.List;
public interface T_u_service_project_Service_Iface {
public void insert_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public void update_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public void delete_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public List queryAll_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public List queryBy_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
}
