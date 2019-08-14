package com.ccunix.ihousekeeping.receive_type.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.receive_type.domain.T_lz_receive_type_r;
import com.ccunix.ihousekeeping.receive_type.dao.T_lz_receive_type_Dao_Iface_r;

@Service("T_lz_receive_type_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_lz_receive_type_Service_Impl_r extends BaseService implements T_lz_receive_type_Service_Iface_r {
@Resource
public T_lz_receive_type_Dao_Iface_r t_lz_receive_type_dao_iface;
public void insert_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception{
t_lz_receive_type_dao_iface.insert_t_lz_receive_type(t_lz_receive_type);
}
public void update_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception{
t_lz_receive_type_dao_iface.update_t_lz_receive_type(t_lz_receive_type);
}
public void delete_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception{
t_lz_receive_type_dao_iface.delete_t_lz_receive_type(t_lz_receive_type);
}
public List queryAll_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception{
return t_lz_receive_type_dao_iface.queryAll_t_lz_receive_type(t_lz_receive_type);
}
public List queryBy_t_lz_receive_type(T_lz_receive_type_r t_lz_receive_type) throws Exception{
return t_lz_receive_type_dao_iface.queryBy_t_lz_receive_type(t_lz_receive_type);
}
}