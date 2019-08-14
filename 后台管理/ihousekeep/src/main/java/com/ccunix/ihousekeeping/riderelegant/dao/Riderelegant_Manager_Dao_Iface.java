package com.ccunix.ihousekeeping.riderelegant.dao;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider_Manager;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Service_Item;

public interface Riderelegant_Manager_Dao_Iface {
	public List queryAllExcellent_Rider() throws Exception;
	public List queryAllUnexcellent_Rider() throws Exception;
	public List queryAll_Rider() throws Exception;
	public List queryAllManager_Rider() throws Exception;
	public List queryAllItem_Name(T_U_Service_Item t_U_Service_Item) throws Exception;
	public void delete_By_Rider(T_u_service_item t_u_service_item) throws Exception;
	public List queryByManager_Rider(T_U_Rider_Manager t_U_Rider_Manager) throws Exception;
}
