package com.ccunix.ihousekeeping.role_2_menu.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_role_2_menu;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_menu;
import com.ccunix.ihousekeeping.role_2_menu.service.T_s_role_2_menu_Service_Iface;
import com.ccunix.ihousekeeping.role_2_menu.service.T_s_role_2_menu_Service_Impl;
import com.ccunix.ihousekeeping.rolemanager.domain.Role_Manager;
import com.ccunix.ihousekeeping.unit.domain.T_s_unit_r;
@Controller
@RequestMapping("T_s_role_2_menu_Controller_4W")
public class T_s_role_2_menu_Controller_4W extends BaseMultiController {
@Resource
public T_s_role_2_menu_Service_Iface t_s_role_2_menu_service_iface;
@Resource
PageServiceIface pageServiceIface;

@RequestMapping("query_all_role_2_menu")
@ResponseBody
public List query_all_role_2_menu(T_s_role_2_menu t_s_role_2_menu){
	List ls = null;
	try {
		ls = t_s_role_2_menu_service_iface.queryAll_t_s_role_2_menu(t_s_role_2_menu);
		PageModel model = pageServiceIface.setPageData(request, ls);
		return pageServiceIface.getNowPageData(request, model);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ls;
}
@RequestMapping("delete_role_2_menu")
@ResponseBody
public void delete_role_2_menu(T_s_role_2_menu t_s_role_2_menu){
	try {
		t_s_role_2_menu_service_iface.delete_t_s_role_2_menu2(t_s_role_2_menu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@RequestMapping("add_role_2_menu")
@ResponseBody
public void add_role_2_menu(T_s_role_2_menu t_s_role_2_menu){
	//System.out.println(t_s_role_2_menu.getId());
	try {
			
		//t_s_role_2_menu_service_iface.delete_all_t_s_unit(t_s_role_2_menu);
		t_s_role_2_menu_service_iface.insert_t_s_role_2_menu(t_s_role_2_menu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


@RequestMapping("query_all_role_1_menu")
@ResponseBody
public Map query_all_role_1_menu(T_s_role_2_menu t_s_role_2_menu, Role_Manager role_Manager,T_s_user_menu t_s_user_menu){
	Map m = null;
	try {
		m = t_s_role_2_menu_service_iface.queryAll_t_s_role_1_menu(t_s_role_2_menu, role_Manager, t_s_user_menu);
//		PageModel model = pageServiceIface.setPageData(request, ls);
//		return pageServiceIface.getNowPageData(request, model);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return m;
}

@RequestMapping("delete_all_t_s_role_2_menu")
@ResponseBody
public void delete_all_t_s_role_2_menu(T_s_role_2_menu t_s_role_2_menu) {
	try {
	t_s_role_2_menu_service_iface.delete_all_t_s_role_2_menu(t_s_role_2_menu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}