package com.ccunix.ihousekeeping.receive_type.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.receive_type.domain.T_lz_receive_type_r;
@DataSourceType(DataSourceType.main)public interface T_lz_receive_type_Dao_Iface_r {
public void insert_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public void update_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public void delete_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public List queryAll_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public List queryBy_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
}
