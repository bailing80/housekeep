package com.ccunix.ihousekeeping.role_2_menu.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.dao.T_s_user_manager_role_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_s_user_menu_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_role_2_menu;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_menu;
import com.ccunix.ihousekeeping.basedb.service.T_s_user_menu_Service_Impl;
import com.ccunix.ihousekeeping.basedb.dao.T_s_role_2_menu_Dao_Iface;
import com.ccunix.ihousekeeping.rolemanager.domain.Role_Manager;
import com.ccunix.ihousekeeping.role_2_menu.service.T_s_role_2_menu_Service_Iface;
//import com.ccunix.ihousekeeping.role_2_menu.dao.T_s_role_2_menu_Dao_Iface_r;
@Service("T_s_role_2_menu_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class T_s_role_2_menu_Service_Impl extends BaseService implements T_s_role_2_menu_Service_Iface {
@Resource
public T_s_role_2_menu_Dao_Iface t_s_role_2_menu_dao_iface;
@Resource
T_s_user_manager_role_Dao_Iface t_s_user_manager_role_Dao_Iface;
@Resource
public T_s_user_menu_Dao_Iface t_s_user_menu_Dao_Iface;
@Resource
public T_s_user_menu_Service_Impl t_s_user_menu_Service_Impl;
public void insert_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
	String[] role_id = t_s_role_2_menu.getRole_id().split(",");
	String menu_id = t_s_role_2_menu.getMenu_id();
	//公共数据
	T_s_role_2_menu rm = null;
	List<T_s_role_2_menu> con = new ArrayList<T_s_role_2_menu>();
	con=t_s_role_2_menu_dao_iface.queryAll_t_s_role_2_menu2(t_s_role_2_menu);
		t_s_role_2_menu_dao_iface.delete_t_s_role_2_menu(t_s_role_2_menu);
		for(int j= 0;j<role_id.length;j++){
			//System.err.println(role_id+"=role_id");
					for(int i=0;i<con.size();i++){
						rm = con.get(i);
						rm.getRole_id();
						rm.getMenu_id();
							//System.err.println(rm.getRole_id()+"  "+rm.getMenu_id());
					if((rm.getRole_id()).equals(role_id[j])&&(rm.getMenu_id()).equals(menu_id)){
						//System.out.println(rm.getRole_id()+" \n"+role_id[j]+"\n"+rm.getMenu_id()+"\n+"+menu_id);
						t_s_role_2_menu_dao_iface.delete_t_s_role_2_menu(t_s_role_2_menu);
					}
				
					
			}
		}
	//}
	
for(String string : role_id){
		if(string == ""){
			
		}else{
			T_s_role_2_menu t = new T_s_role_2_menu();
			t.setRole_id(string);
			t.setMenu_id(menu_id);
			t.setId(UUID_Tools.getUUID());
			t_s_role_2_menu_dao_iface.insert_t_s_role_2_menu(t);
		}
	}


}
public void update_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
t_s_role_2_menu_dao_iface.update_t_s_role_2_menu(t_s_role_2_menu);
}
public void delete_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
t_s_role_2_menu_dao_iface.delete_t_s_role_2_menu(t_s_role_2_menu);
}
public List queryAll_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
return t_s_role_2_menu_dao_iface.queryAll_t_s_role_2_menu(t_s_role_2_menu);
}
public List queryBy_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) throws Exception{
return t_s_role_2_menu_dao_iface.queryBy_t_s_role_2_menu(t_s_role_2_menu);
}
@Override
public Map queryAll_t_s_role_1_menu(T_s_role_2_menu t_s_role_2_menu, Role_Manager role_Manager,
		T_s_user_menu t_s_user_menu) throws Exception {
	Map<String, List> m = new HashMap<>();
	//联系
	List con = null;
	//角色
	List ls_role = null;
	//菜单
	List ls_menu = null;
	try {
		con=t_s_role_2_menu_dao_iface.queryAll_t_s_role_2_menu(t_s_role_2_menu);
		ls_role = t_s_user_manager_role_Dao_Iface.queryAll_t_s_user_manager_role(role_Manager);
		ls_menu = t_s_user_menu_Dao_Iface.queryAll_t_s_user_menu(t_s_user_menu);
		m.put("con", con);
		m.put("role_id", ls_role);
		m.put("menu_id", ls_menu);
		//System.out.println(con);
		//System.out.println(ls_role);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return m;
}
public void delete_all_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) {
	// TODO Auto-generated method stub
	String[]  ids = t_s_role_2_menu.getId().split(",");
	try{
		for (String string : ids) {
			T_s_role_2_menu t =new T_s_role_2_menu();
			t.setId(string);
			t_s_role_2_menu_dao_iface.delete_t_s_role_2_menu(t);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}
@Override
public void delete_t_s_role_2_menu2(T_s_role_2_menu t_s_role_2_menu) throws Exception {
	// TODO Auto-generated method stub
	t_s_role_2_menu_dao_iface.delete_t_s_role_2_menu(t_s_role_2_menu);
}

}