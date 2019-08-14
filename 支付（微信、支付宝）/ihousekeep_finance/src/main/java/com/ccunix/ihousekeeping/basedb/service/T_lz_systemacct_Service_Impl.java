package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_systemacct;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_systemacct_Dao_Iface;

@Service("T_lz_systemacct_Service_r")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_lz_systemacct_Service_Impl extends BaseService implements T_lz_systemacct_Service_Iface {
@Resource
public T_lz_systemacct_Dao_Iface t_lz_systemacct_dao_iface;
public void insert_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception{
t_lz_systemacct_dao_iface.insert_t_lz_systemacct(t_lz_systemacct);
}
public void update_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception{
t_lz_systemacct_dao_iface.update_t_lz_systemacct(t_lz_systemacct);
}
public void delete_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception{
	String[] ids = t_lz_systemacct.getId().split(",");
	try {
		//通过多个ID拼成的字符串批量删除
		for (String string : ids) {
			T_lz_systemacct t = new T_lz_systemacct();
			t.setId(string);
			t_lz_systemacct_dao_iface.delete_t_lz_systemacct(t);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public List queryAll_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception{
return t_lz_systemacct_dao_iface.queryAll_t_lz_systemacct(t_lz_systemacct);
}
public List queryBy_t_lz_systemacct(T_lz_systemacct t_lz_systemacct) throws Exception{
return t_lz_systemacct_dao_iface.queryBy_t_lz_systemacct(t_lz_systemacct);
}
}