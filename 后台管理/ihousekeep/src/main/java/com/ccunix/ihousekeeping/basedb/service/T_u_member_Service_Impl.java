package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member;
import com.ccunix.ihousekeeping.basedb.dao.T_u_member_Dao_Iface;

@Service("T_u_member_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_u_member_Service_Impl extends BaseService implements T_u_member_Service_Iface {
@Resource
public T_u_member_Dao_Iface t_u_member_dao_iface;
public void insert_t_u_member(T_u_member t_u_member) throws Exception{
t_u_member_dao_iface.insert_t_u_member(t_u_member);
}
public void update_t_u_member(T_u_member t_u_member) throws Exception{
t_u_member_dao_iface.update_t_u_member(t_u_member);
}
public void delete_t_u_member(T_u_member t_u_member) throws Exception{
t_u_member_dao_iface.delete_t_u_member(t_u_member);
}
public List queryAll_t_u_member(T_u_member t_u_member) throws Exception{
return t_u_member_dao_iface.queryAll_t_u_member(t_u_member);
}
public List queryBy_t_u_member(T_u_member t_u_member) throws Exception{
return t_u_member_dao_iface.queryBy_t_u_member(t_u_member);
}
}