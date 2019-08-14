package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order_detail;
@DataSourceType(DataSourceType.main)
public interface T_u_order_detail_Dao_Iface {
public void insert_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public void update_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public void delete_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public List queryAll_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
public List queryBy_t_u_order_detail(T_u_order_detail t_u_order_detail) throws Exception;
}
