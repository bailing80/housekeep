package com.ccunix.ihousekeeping.saler.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_receive_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_lz_saler_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_receive_type;
import com.ccunix.ihousekeeping.saler.dao.Saler_Dao_Iface;
import com.ccunix.ihousekeeping.saler.domain.Saler;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Saler_Service_Impl extends BaseService implements Saler_Service_Iface {
	@Resource
	public Saler_Dao_Iface saler_Dao_Iface;

	@Resource
	public T_lz_receive_type_Dao_Iface t_lz_receive_type_Dao_Iface;
	
	@Resource
	public T_lz_saler_Dao_Iface t_lz_saler_Dao_Iface;


	/**
	 * 查询数据
	 * 
	 * @param saler
	 * @return
	 */
	@Override
	public List queryAll_saler(Saler saler) throws Exception {
		List<Saler> ls = saler_Dao_Iface.queryAll_saler(saler);
		for (Saler s : ls) {
			T_lz_receive_type t_lz_receive_type = new T_lz_receive_type();
			t_lz_receive_type.setType_code(s.getReceive_type());
			List<T_lz_receive_type> typeList = t_lz_receive_type_Dao_Iface.queryAll_t_lz_receive_type(t_lz_receive_type);
			if(typeList.size()>0){
				s.setReceive_type_name(typeList.get(0).getType_name());
			}else {
				s.setReceive_type_name(s.getReceive_type());
			}
			s.setDivide_str(s.getDivide()+"%");
			s.setService_time(s.getService_begin()+(s.getOver_day()==1?"-次日":"-")+s.getService_end());
		}
		return ls;
	}

	/**
	 * 批量删除数据
	 */
	@Override
	public void delete_batch_saler(Saler saler) throws Exception {
		String[] ids = saler.getId().split(",");
		try {
			// 通过多个ID拼成的字符串批量删除
			for (String string : ids) {
				Saler acct = new Saler();
				acct.setId(string);
				t_lz_saler_Dao_Iface.delete_t_lz_saler(acct);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 编辑数据
	 * 
	 * @param saler
	 */
	@Override
	public void edit_saler(Saler saler) throws Exception {
		t_lz_saler_Dao_Iface.update_t_lz_saler(saler);
	}
	
	/**
	 * 显示数据
	 * @param saler
	 */
	@Override
	public List show_saler(Saler saler) throws Exception{
		return t_lz_saler_Dao_Iface.queryAll_t_lz_saler(saler);
	}
}
