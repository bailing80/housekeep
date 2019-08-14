package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_weixin_info;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_weixin_info_Dao_Iface;

@Service("T_lz_weixin_info_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_lz_weixin_info_Service_Impl extends BaseService implements T_lz_weixin_info_Service_Iface {
@Resource
public T_lz_weixin_info_Dao_Iface t_lz_weixin_info_dao_iface;
public void insert_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception{
t_lz_weixin_info_dao_iface.insert_t_lz_weixin_info(t_lz_weixin_info);
}
public void update_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception{
t_lz_weixin_info_dao_iface.update_t_lz_weixin_info(t_lz_weixin_info);
}
public void delete_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception{
t_lz_weixin_info_dao_iface.delete_t_lz_weixin_info(t_lz_weixin_info);
}
public List queryAll_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception{
return t_lz_weixin_info_dao_iface.queryAll_t_lz_weixin_info(t_lz_weixin_info);
}
public List queryBy_t_lz_weixin_info(T_lz_weixin_info t_lz_weixin_info) throws Exception{
return t_lz_weixin_info_dao_iface.queryBy_t_lz_weixin_info(t_lz_weixin_info);
}
}