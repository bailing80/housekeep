package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member;
import java.util.List;
public interface T_u_member_Service_Iface {
public void insert_t_u_member(T_u_member t_u_member) throws Exception;
public void update_t_u_member(T_u_member t_u_member) throws Exception;
public void delete_t_u_member(T_u_member t_u_member) throws Exception;
public List queryAll_t_u_member(T_u_member t_u_member) throws Exception;
public List queryBy_t_u_member(T_u_member t_u_member) throws Exception;
}
