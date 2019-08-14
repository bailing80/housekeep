package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order_detail;
import java.util.List;
public interface T_u_order_detail_Service_Iface {
public void insert_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public void update_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public void delete_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public List queryAll_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public List queryBy_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
}
