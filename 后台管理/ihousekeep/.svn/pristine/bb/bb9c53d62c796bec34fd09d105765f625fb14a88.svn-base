package com.ccunix.ihousekeeping.riderelegant.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_user_manager_role_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_ride_service_item_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_rider_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_item_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.basedb.domain.T_u_ride_service_item;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.riderelegant.dao.Riderelegant_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider_Manager;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Service_Item;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Riderelegant_Manager_Service_Impl extends BaseService implements Riderelegant_Manager_Service_Iface {

	
	@Resource
	T_u_ride_service_item_Dao_Iface t_u_ride_service_item_Dao_Iface;
	@Resource
	T_u_service_item_Dao_Iface t_u_service_item_Dao_Iface;
	@Resource
	T_u_rider_Dao_Iface t_u_rider_Dao_Iface;
	@Resource
	T_s_user_manager_role_Dao_Iface t_s_user_manager_role_Dao_Iface;
	
	@Resource
	Riderelegant_Manager_Dao_Iface riderelegant_Manager_Dao_Iface;

	@Override
	public List queryAllExcellent_Rider() throws Exception {
		// TODO Auto-generated method stub
		List ls = riderelegant_Manager_Dao_Iface.queryAllExcellent_Rider();

		return ls;
	}

	@Override
	public List queryAllUnexcellent_Rider() throws Exception {
		// TODO Auto-generated method stub
		List ls = riderelegant_Manager_Dao_Iface.queryAllUnexcellent_Rider();

		return ls;
	}

	@Override
	public List queryAll_Rider() throws Exception {
		// TODO Auto-generated method stub
		List ls = riderelegant_Manager_Dao_Iface.queryAll_Rider();

		return ls;
	}

	@Override
	public void delete_all_t_u_rider(T_u_rider t_u_rider) throws Exception {
		// TODO Auto-generated method stub
		String[] ids = t_u_rider.getId().split(",");
			//通过多个ID拼成的字符串批量删除
			for (String string : ids) {
				T_u_rider t = new T_u_rider();
				t.setId(string);
				t.setIs_excellent("02");	
				t_u_rider_Dao_Iface.update_t_u_rider(t);
			}
	}

	@Override
	public List queryAllManager_Rider() throws Exception {
		// TODO Auto-generated method stub
		List ls = null;
		
		ls = riderelegant_Manager_Dao_Iface.queryAllManager_Rider();
		return ls;
	}

	@Override
	public List queryAll_USer_Manager_Role(T_s_user_manager_role t_s_user_manager_role) throws Exception {
		// TODO Auto-generated method stub
		List ls = null;
		ls = t_s_user_manager_role_Dao_Iface.queryAll_t_s_user_manager_role(t_s_user_manager_role);
		return ls;
	}

	@Override
	public void delete_all_manager_rider(T_u_rider t_u_rider) throws Exception {
		// TODO Auto-generated method stub
		String[] ids = t_u_rider.getId().split(",");
		//System.out.println("ID串:"+ids);
		//通过多个ID拼成的字符串批量删除
		for (String string : ids) {
			//System.out.println("ID:"+string);
			T_u_rider t = new T_u_rider();
			t.setId(string);	
			t_u_rider_Dao_Iface.delete_t_u_rider(t);
		}
	}

	@Override
	public List queryAllItem_Name(T_U_Service_Item t_U_Service_Item) throws Exception {
		// TODO Auto-generated method stub
		List ls = null;
		ls = riderelegant_Manager_Dao_Iface.queryAllItem_Name(t_U_Service_Item);
		return ls;
	}

	@Override
	public void delete_By_Rider(T_u_service_item t_u_service_item) throws Exception {
		// TODO Auto-generated method stub
		riderelegant_Manager_Dao_Iface.delete_By_Rider(t_u_service_item);
	}

	@Override
	public void update_t_u_rider(T_u_rider t_u_rider)throws Exception {
		// TODO Auto-generated method stub
		t_u_rider_Dao_Iface.update_t_u_rider(t_u_rider);
	}

	@Override
	public List queryBy_t_u_rider(T_u_rider t_u_rider) throws Exception {
		// TODO Auto-generated method stub
		List ls = t_u_rider_Dao_Iface.queryBy_t_u_rider(t_u_rider);
		return ls;
	}

	@Override
	public void insert_t_u_rider(T_u_rider t_u_rider) throws Exception {
		// TODO Auto-generated method stub
		t_u_rider_Dao_Iface.insert_t_u_rider(t_u_rider);
		
	}

	@Override
	public void delete_t_u_rider(T_u_rider t_u_rider) throws Exception {
		// TODO Auto-generated method stub
		t_u_rider_Dao_Iface.delete_t_u_rider(t_u_rider);
	}

	@Override
	public List queryAll_t_u_rider(T_u_rider t_u_rider) throws Exception {
		// TODO Auto-generated method stub
		List ls = t_u_rider_Dao_Iface.queryAll_t_u_rider(t_u_rider);
		return ls;
	}

	@Override
	public List queryAll_t_u_service_item(T_u_service_item t_u_service_item) throws Exception {
		// TODO Auto-generated method stub
		List ls = t_u_service_item_Dao_Iface.queryAll_t_u_service_item(t_u_service_item);
		return ls;
	}

	@Override
	public void insert_t_u_ride_service_item(T_u_ride_service_item t_u_ride_service_item) throws Exception {
		// TODO Auto-generated method stub
		t_u_ride_service_item_Dao_Iface.insert_t_u_ride_service_item(t_u_ride_service_item);
	}

	@Override
	public List queryByManager_Rider(T_U_Rider_Manager t_U_Rider_Manager) throws Exception {
		// TODO Auto-generated method stub
		List ls = riderelegant_Manager_Dao_Iface.queryByManager_Rider(t_U_Rider_Manager);
		
		return ls;
	}

	@Override
	public void delete_t_u_ride_service_item(T_u_ride_service_item t_u_ride_service_item) throws Exception {
		// TODO Auto-generated method stub
		t_u_ride_service_item_Dao_Iface.delete_t_u_ride_service_item(t_u_ride_service_item);
	}



}
