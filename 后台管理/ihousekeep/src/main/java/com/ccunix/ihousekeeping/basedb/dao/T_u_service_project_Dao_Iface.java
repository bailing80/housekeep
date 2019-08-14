package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
@DataSourceType(DataSourceType.main)public interface T_u_service_project_Dao_Iface {
public void insert_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public void update_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public void delete_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public List queryAll_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
public List queryBy_t_u_service_project(T_u_service_project t_u_service_project) throws Exception;
}
