package com.ccunix.ihousekeeping.apartment_type.dao;

import java.util.List;

import com.ccunix.ihousekeeping.apartment_type.domain.Apartment_type_Manager;
import com.ccunix.ihousekeeping.base.util.DataSourceType;

/**
 * 
 * @ClassName: Apartment_type_Manager_Dao_Iface
 * @author 肖云鹏
 * @date 2019年7月17日 上午10:23:29
 *
 */
@DataSourceType(DataSourceType.main)
public interface Apartment_type_Manager_Dao_Iface {
	public List queryAll_apartment_type_manager(Apartment_type_Manager apartment_type_Manager) throws Exception;

}
