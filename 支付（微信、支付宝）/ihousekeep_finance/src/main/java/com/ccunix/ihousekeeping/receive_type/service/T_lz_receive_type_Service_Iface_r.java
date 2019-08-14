package com.ccunix.ihousekeeping.receive_type.service;
import com.ccunix.ihousekeeping.receive_type.domain.T_lz_receive_type_r;
import java.util.List;
public interface T_lz_receive_type_Service_Iface_r {
public void insert_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public void update_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public void delete_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public List queryAll_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
public List queryBy_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception;
}
