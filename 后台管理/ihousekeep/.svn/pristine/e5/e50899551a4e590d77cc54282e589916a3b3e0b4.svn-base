package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.T_s_unit;
import com.ccunix.ihousekeeping.basedb.dao.T_s_unit_Dao_Iface;

@Service("T_s_unit_Service_r")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_s_unit_Service_Impl extends BaseService implements T_s_unit_Service_Iface {
@Resource
public T_s_unit_Dao_Iface t_s_unit_dao_iface;
public void insert_t_s_unit(T_s_unit t_s_unit) throws Exception{
t_s_unit_dao_iface.insert_t_s_unit(t_s_unit);
}
public void update_t_s_unit(T_s_unit t_s_unit) throws Exception{
t_s_unit_dao_iface.update_t_s_unit(t_s_unit);
}
public void delete_t_s_unit(T_s_unit t_s_unit) throws Exception{
t_s_unit_dao_iface.delete_t_s_unit(t_s_unit);
}
public List queryAll_t_s_unit(T_s_unit t_s_unit) throws Exception{
return t_s_unit_dao_iface.queryAll_t_s_unit(t_s_unit);
}
public List queryBy_t_s_unit(T_s_unit t_s_unit) throws Exception{
return t_s_unit_dao_iface.queryBy_t_s_unit(t_s_unit);
}
}