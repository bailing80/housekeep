package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_order;
@DataSourceType(DataSourceType.main)
public interface T_lz_order_Dao_Iface {
public void insert_t_lz_order(T_lz_order t_lz_order) throws Exception;
public void update_t_lz_order(T_lz_order t_lz_order) throws Exception;
public void delete_t_lz_order(T_lz_order t_lz_order) throws Exception;
public List queryAll_t_lz_order(T_lz_order t_lz_order) throws Exception;
public List queryBy_t_lz_order(T_lz_order t_lz_order) throws Exception;
}
