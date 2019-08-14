package com.ccunix.ihousekeeping.mapping_menu.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.mapping_menu.domain.Mapping_menu;

@DataSourceType(DataSourceType.main)
public interface Mapping_menu_Dao_Iface {
public void insert_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception;
public void update_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception;
public void delete_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception;
public List queryAll_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception;
public List queryBy_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception;
public void insert_all_t_s_menu(Mapping_menu mapping_menu) throws Exception;
public List queryAll_menu(Mapping_menu mapping_menu) throws Exception;
public List queryAll_mapping_menu(Mapping_menu mapping_menu) throws Exception;
public List query_Role_Memu_By_Id(Mapping_menu mapping_menu) throws Exception;

}
