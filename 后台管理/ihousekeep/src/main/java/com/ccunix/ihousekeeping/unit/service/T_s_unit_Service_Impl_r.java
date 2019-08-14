package com.ccunix.ihousekeeping.unit.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.unit.domain.T_s_unit_r;
import com.ccunix.ihousekeeping.unit.dao.T_s_unit_Dao_Iface_r;

@Service("T_s_unit_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_s_unit_Service_Impl_r extends BaseService implements T_s_unit_Service_Iface_r {
@Resource
public T_s_unit_Dao_Iface_r t_s_unit_dao_iface;
public void insert_t_s_unit(T_s_unit_r t_s_unit) throws Exception{
t_s_unit_dao_iface.insert_t_s_unit(t_s_unit);
}
public void update_t_s_unit(T_s_unit_r t_s_unit) throws Exception{
t_s_unit_dao_iface.update_t_s_unit(t_s_unit);
}
public void delete_t_s_unit(T_s_unit_r t_s_unit) throws Exception{
t_s_unit_dao_iface.delete_t_s_unit(t_s_unit);
}
public List queryAll_t_s_unit(T_s_unit_r t_s_unit) throws Exception{
	List<T_s_unit_r> ls = t_s_unit_dao_iface.queryAll_t_s_unit(t_s_unit);
return ls;
}
public List queryBy_t_s_unit(T_s_unit_r t_s_unit) throws Exception{
return t_s_unit_dao_iface.queryBy_t_s_unit(t_s_unit);
}

@Override
public void delete_all_t_s_unit(T_s_unit_r t_s_unit) {
	// TODO Auto-generated method stub
	String[]  ids = t_s_unit.getId().split(",");
	try{
		for (String string : ids) {
			T_s_unit_r t =new T_s_unit_r();
			t.setId(string);
			t_s_unit_dao_iface.delete_t_s_unit(t);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}
}