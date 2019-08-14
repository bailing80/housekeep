package com.ccunix.ihousekeeping.area_type.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.area_type.dao.Area_type_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.area_type.domain.Area_type_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_apartment_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_area_type_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_area_type;

/**
 * 
 * @ClassName: Area_type_Manager_Service_Impl
 * @author 肖云鹏
 * @date 2019年7月17日 上午10:49:54
 *
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Area_type_Manager_Service_Impl extends BaseService implements Area_type_Manager_Service_Iface {
	@Resource
	Area_type_Manager_Dao_Iface area_type_Manager_Dao_Iface;
	@Resource
	T_u_area_type_Dao_Iface t_u_area_type_Dao_Iface;

	/**
	 * <p>
	 * Title: delete_all_area_type_manager
	 * </p>
	 * <p>
	 * Description:批量删除
	 * </p>
	 * 
	 * @param t_u_area_type
	 * @return
	 */
	@Override
	public void delete_all_area_type_manager(T_u_area_type t_u_area_type) {
		String[] ids = t_u_area_type.getId().split(",");
		try {
			for (String string : ids) {
				t_u_area_type.setId(string);
				t_u_area_type_Dao_Iface.delete_t_u_area_type(t_u_area_type);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * <p>
	 * Title: query_all_area_type_manager
	 * </p>
	 * <p>
	 * Description:查询全部
	 * </p>
	 * 
	 * @param area_type_Manager
	 * @return
	 */
	@Override
	public List query_all_area_type_manager(Area_type_Manager area_type_Manager) {
		List ls=null;
		try {
			ls = area_type_Manager_Dao_Iface.query_all_area_type_manager(area_type_Manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

}
