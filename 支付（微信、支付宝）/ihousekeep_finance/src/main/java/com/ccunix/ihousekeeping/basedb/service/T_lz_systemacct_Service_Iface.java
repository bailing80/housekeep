package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_systemacct;
import java.util.List;
public interface T_lz_systemacct_Service_Iface {
public void insert_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception;
public void update_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception;
public void delete_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception;
public List queryAll_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception;
public List queryBy_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception;
}
