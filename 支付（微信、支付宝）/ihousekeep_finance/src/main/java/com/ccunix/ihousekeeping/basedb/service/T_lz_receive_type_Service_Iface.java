package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_receive_type;
import java.util.List;
public interface T_lz_receive_type_Service_Iface {
public void insert_t_lz_receive_type(T_lz_receive_type t_lz_receive_type) throws Exception;
public void update_t_lz_receive_type(T_lz_receive_type t_lz_receive_type) throws Exception;
public void delete_t_lz_receive_type(T_lz_receive_type t_lz_receive_type) throws Exception;
public List queryAll_t_lz_receive_type(T_lz_receive_type t_lz_receive_type) throws Exception;
public List queryBy_t_lz_receive_type(T_lz_receive_type t_lz_receive_type) throws Exception;
}
