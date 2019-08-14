package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_weixin_info;
import java.util.List;
public interface T_lz_weixin_info_Service_Iface {
public void insert_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception;
public void update_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception;
public void delete_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception;
public List queryAll_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception;
public List queryBy_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception;
}
