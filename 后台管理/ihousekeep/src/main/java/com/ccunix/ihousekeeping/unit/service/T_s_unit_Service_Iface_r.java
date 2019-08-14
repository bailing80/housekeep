package com.ccunix.ihousekeeping.unit.service;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.unit.domain.T_s_unit_r;
import java.util.List;
public interface T_s_unit_Service_Iface_r {
public void insert_t_s_unit(T_s_unit_r t_s_unit) throws Exception;
public void update_t_s_unit(T_s_unit_r t_s_unit) throws Exception;
public void delete_t_s_unit(T_s_unit_r t_s_unit) throws Exception;
public List queryAll_t_s_unit(T_s_unit_r t_s_unit) throws Exception;
public List queryBy_t_s_unit(T_s_unit_r t_s_unit) throws Exception;

void delete_all_t_s_unit(T_s_unit_r t_s_unit);
}
