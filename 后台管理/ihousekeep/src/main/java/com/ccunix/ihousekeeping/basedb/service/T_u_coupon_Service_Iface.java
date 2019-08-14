package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon;
import java.util.List;
public interface T_u_coupon_Service_Iface {
public void insert_t_u_coupon(T_u_coupon t_u_coupon) throws Exception;
public void update_t_u_coupon(T_u_coupon t_u_coupon) throws Exception;
public void delete_t_u_coupon(T_u_coupon t_u_coupon) throws Exception;
public List queryAll_t_u_coupon(T_u_coupon t_u_coupon) throws Exception;
public List queryBy_t_u_coupon(T_u_coupon t_u_coupon) throws Exception;
}
