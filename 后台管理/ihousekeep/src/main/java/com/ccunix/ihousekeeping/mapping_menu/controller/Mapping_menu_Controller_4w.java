package com.ccunix.ihousekeeping.mapping_menu.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.mapping_menu.domain.Mapping_menu;
import com.ccunix.ihousekeeping.mapping_menu.service.Mapping_menu_Service_Iface;

@Controller
@RequestMapping("Mapping_menu_Controller_4w")
public class Mapping_menu_Controller_4w extends BaseMultiController {
@Resource
public Mapping_menu_Service_Iface mapping_menu_service_iface;
@Resource
PageServiceIface pageServiceIface;


/**
 * @Title: 后台管理端-角色管理-接口 
 *
 * @author 白玲
 *
 * @date 2019年7月20日 上午10:01:47 
 *
 * @Description:映射角色菜单功能
 **/
@RequestMapping("queryAll_menu")
@ResponseBody
public List queryAll_menu(Mapping_menu mapping_menu){
	List ls = null;
	try {

		ls = mapping_menu_service_iface.queryAll_menu(mapping_menu);
		PageModel model = pageServiceIface.setPageData(request, ls);
		return pageServiceIface.getNowPageData(request, model);
	} catch (Exception e) {

		e.printStackTrace();
	}
	return ls;
}



@RequestMapping("query_all_role_2_menu")
@ResponseBody
public List query_all_role_2_menu(Mapping_menu mapping_menu){
	List ls = null;
	try {
		ls = mapping_menu_service_iface.queryAll_t_s_role_2_menu(mapping_menu);
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
public void delete_role_2_menu(Mapping_menu mapping_menu){
	try {
		mapping_menu_service_iface.delete_t_s_role_2_menu(mapping_menu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@RequestMapping("add_role_2_menu")
@ResponseBody
public void add_role_2_menu(Mapping_menu mapping_menu){
	
	try {
		mapping_menu_service_iface.insert_t_s_role_2_menu(mapping_menu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
/**
 *  批量插入映射角色
 * @param t_s_advertisement_manager
 */
@RequestMapping("insert_all_t_s_menu")
@ResponseBody
public void insert_all_t_s_menu(Mapping_menu mapping_menu) {
	
	try {
		mapping_menu_service_iface.insert_all_t_s_menu(mapping_menu);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@RequestMapping("query_Role_Memu_By_Id")
@ResponseBody
public List query_Role_Memu_By_Id(Mapping_menu mapping_menu){
	List ls = null;
	try {
		ls = mapping_menu_service_iface.query_Role_Memu_By_Id(mapping_menu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ls;
}
}