package com.ccunix.ihousekeeping.t_lz_systemacct.dao;
import java.util.List;
import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.t_lz_systemacct.domain.T_lz_systemacct_r;
@DataSourceType(DataSourceType.main)public interface T_lz_systemacct_Dao_Iface_r {
public void insert_t_lz_systemacct(T_lz_systemacct_r t_lz_systemacct) throws Exception;
public void update_t_lz_systemacct(T_lz_systemacct_r t_lz_systemacct) throws Exception;
public void delete_t_lz_systemacct(T_lz_systemacct_r t_lz_systemacct) throws Exception;
public List queryAll_t_lz_systemacct(T_lz_systemacct_r t_lz_systemacct) throws Exception;
public List queryBy_t_lz_systemacct(T_lz_systemacct_r t_lz_systemacct) throws Exception;
}
