package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import java.util.List;
public interface T_u_rider_Service_Iface {
public void insert_t_u_rider(T_u_rider t_u_rider) throws Exception;
public void update_t_u_rider(T_u_rider t_u_rider) throws Exception;
public void delete_t_u_rider(T_u_rider t_u_rider) throws Exception;
public List queryAll_t_u_rider(T_u_rider t_u_rider) throws Exception;
public List queryBy_t_u_rider(T_u_rider t_u_rider) throws Exception;
}
