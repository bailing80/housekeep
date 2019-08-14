package com.ccunix.ihousekeeping.riderelegant.service;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.basedb.domain.T_u_ride_service_item;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider_Manager;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Service_Item;


public interface Riderelegant_Manager_Service_Iface {
	public void delete_t_u_ride_service_item(T_u_ride_service_item t_u_ride_service_item) throws Exception;
	public List queryByManager_Rider(T_U_Rider_Manager t_U_Rider_Manager) throws Exception;
	public void insert_t_u_ride_service_item(T_u_ride_service_item t_u_ride_service_item) throws Exception;
	public List queryAll_t_u_service_item(T_u_service_item t_u_service_item) throws Exception;
	public List queryAll_t_u_rider(T_u_rider t_u_rider)throws Exception;
	public void delete_t_u_rider(T_u_rider t_u_rider)throws Exception;
	public void insert_t_u_rider(T_u_rider t_u_rider) throws Exception;
	public List queryBy_t_u_rider(T_u_rider t_u_rider)throws Exception;
	public void update_t_u_rider(T_u_rider t_u_rider)throws Exception;
	public List queryAllExcellent_Rider() throws Exception;
	public List queryAllUnexcellent_Rider() throws Exception;
	public List queryAll_Rider() throws Exception;
	public void delete_all_t_u_rider(T_u_rider t_u_rider)throws Exception;
	public List queryAllManager_Rider() throws Exception;
	public List queryAll_USer_Manager_Role(T_s_user_manager_role t_s_user_manager_role) throws Exception;
	public void delete_all_manager_rider(T_u_rider t_u_rider) throws Exception;
	public List queryAllItem_Name(T_U_Service_Item t_U_Service_Item) throws Exception;
	public void delete_By_Rider(T_u_service_item t_u_service_item) throws Exception;
}
