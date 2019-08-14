package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_content;
import java.util.List;
public interface T_u_service_content_Service_Iface {
public void insert_t_u_service_content(T_u_service_content t_u_service_content) throws Exception;
public void update_t_u_service_content(T_u_service_content t_u_service_content) throws Exception;
public void delete_t_u_service_content(T_u_service_content t_u_service_content) throws Exception;
public List queryAll_t_u_service_content(T_u_service_content t_u_service_content) throws Exception;
public List queryBy_t_u_service_content(T_u_service_content t_u_service_content) throws Exception;
}
