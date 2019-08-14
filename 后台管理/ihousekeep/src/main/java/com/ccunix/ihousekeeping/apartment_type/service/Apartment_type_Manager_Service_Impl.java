package com.ccunix.ihousekeeping.apartment_type.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.apartment_type.dao.Apartment_type_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.apartment_type.domain.Apartment_type_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_apartment_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_apartment_type;

/**
 * 
 * @ClassName: Apartment_type_Manager_Service_Impl
 * @author 肖云鹏
 * @date 2019年7月17日 上午10:24:11
 *
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Apartment_type_Manager_Service_Impl extends BaseService implements Apartment_type_Manager_Service_Iface {
	@Resource
	public Apartment_type_Manager_Dao_Iface apartment_type_Manager_Dao_Iface;

	@Resource
	public T_u_apartment_type_Dao_Iface t_u_apartment_type_Dao_Iface;

	
	/**
	 * <p>Title: queryAll_apartment_type_manager</p>
	 * <p>Description:查询全部方法</p>
	 * @param apartment_type_Manager
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List queryAll_apartment_type_manager(Apartment_type_Manager apartment_type_Manager) throws Exception {
		List ls = apartment_type_Manager_Dao_Iface.queryAll_apartment_type_manager(apartment_type_Manager);
		return ls;
	}
	/**
	 * <p>Title: delete_all_apartment_type_manager</p>  
	 * <p>Description:批量删除操作 </p>  
	 * @param t_u_apartment_type
	 */
	@Override
	public void delete_all_apartment_type_manager(T_u_apartment_type t_u_apartment_type) {
		//打散
		String[] ids = t_u_apartment_type.getId().split(",");
		try {
			//对ids进行循环、对每一个id都进行单一的删除操作
			for (String string : ids) {
				t_u_apartment_type.setId(string);
				t_u_apartment_type_Dao_Iface.delete_t_u_apartment_type(t_u_apartment_type);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
