package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_zfb_info;
@DataSourceType(DataSourceType.main)public interface T_lz_zfb_info_Dao_Iface {
public void insert_t_lz_zfb_info(T_lz_zfb_info t_lz_zfb_info) throws Exception;
public void update_t_lz_zfb_info(T_lz_zfb_info t_lz_zfb_info) throws Exception;
public void delete_t_lz_zfb_info(T_lz_zfb_info t_lz_zfb_info) throws Exception;
public List queryAll_t_lz_zfb_info(T_lz_zfb_info t_lz_zfb_info) throws Exception;
public List queryBy_t_lz_zfb_info(T_lz_zfb_info t_lz_zfb_info) throws Exception;
}
