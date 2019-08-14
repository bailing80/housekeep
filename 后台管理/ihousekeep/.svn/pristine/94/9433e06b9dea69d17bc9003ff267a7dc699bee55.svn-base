package com.ccunix.ihousekeeping.mapping_menu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_menu;
import com.ccunix.ihousekeeping.basedb.service.T_s_user_menu_Service_Iface;
import com.ccunix.ihousekeeping.mapping_menu.dao.Mapping_menu_Dao_Iface;
import com.ccunix.ihousekeeping.mapping_menu.domain.Mapping_menu;

@Service("Mapping_menu_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)

/**
 * @Title: 后台管理端-角色管理-接口 
 *
 * @author 白玲
 *
 * @date 2019年7月20日 上午10:01:47 
 *
 * @Description:映射角色菜单功能
 **/
public class Mapping_menu_Service_Impl extends BaseService implements Mapping_menu_Service_Iface {
	@Resource
	public Mapping_menu_Dao_Iface mapping_menu_dao_iface;
	@Resource
	public T_s_user_menu_Service_Iface t_s_user_menu_dao_iface;

	@Override
	public void insert_all_t_s_menu(Mapping_menu mapping_menu) {

		String[] ids = mapping_menu.getMenu_id().split(",");
		String role_id = mapping_menu.getRole_id();

		try {
			List<Mapping_menu> menuList = mapping_menu_dao_iface.queryAll_menu(mapping_menu);
			// initialize data
			for (int i = 0; i < menuList.size(); i++) {
				Mapping_menu m = menuList.get(i);
				// -Integer.parseInt(m.getMenu_id())+""
				//int is_exist = is_exist = Integer.parseInt(m.getMenu_id()) > 0 ? -Integer.parseInt(m.getMenu_id())
				//		: Integer.parseInt(m.getMenu_id());
				//m.setMenu_id(is_exist + "");
				mapping_menu_dao_iface.delete_t_s_role_2_menu(m);
			}

			for (String string : ids) {
		
				boolean is_exist = false;
				int index =0;
				for (int i = 0; i < menuList.size(); i++) {
					Mapping_menu m = menuList.get(i);
					if (false) {
						index = i;
						is_exist = true;
					}
				}
					if (is_exist) {
						menuList.get(index).setIs_delete(0);
						menuList.get(index).setDeletetime(null);
						mapping_menu_dao_iface.update_t_s_role_2_menu(menuList.get(index));
					} else {
						Mapping_menu t = new Mapping_menu();
						t.setMenu_id(Integer.parseInt(string) + "");
						t.setRole_id(role_id);
						t.setId(uuid_Tools.getUUID());
						mapping_menu_dao_iface.insert_all_t_s_menu(t);
					
					}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void insert_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception {

	}

	@Override
	public void update_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception {

	}

	@Override
	public void delete_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception {

	}

	@Override
	public List queryAll_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception {
		return null;
	}

	@Override
	public List queryBy_t_s_role_2_menu(Mapping_menu mapping_menu) throws Exception {
		return null;
	}

	@Override
	public List queryAll_menu(Mapping_menu mapping_menu) throws Exception {

		List<T_s_user_menu> ls = mapping_menu_dao_iface.queryAll_menu(mapping_menu);
		return ls;
	}

	@Override
	public List query_Role_Memu_By_Id(Mapping_menu mapping_menu) throws Exception {

		return mapping_menu_dao_iface.query_Role_Memu_By_Id(mapping_menu);

	}

}