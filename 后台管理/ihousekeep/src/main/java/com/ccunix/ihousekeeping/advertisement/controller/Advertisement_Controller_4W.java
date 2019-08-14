package com.ccunix.ihousekeeping.advertisement.controller;
 
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.advertisement.service.Advertisement_Manager_Service_Iface;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_type;
import com.ccunix.ihousekeeping.basedb.service.T_s_advertisement_manager_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_s_advertisement_type_Service_Iface;

@Controller
@RequestMapping("Advertisement_Controller_4W")
public class Advertisement_Controller_4W extends BaseMultiController {

	@Resource
	T_s_advertisement_manager_Service_Iface t_s_advertisement_manager_Service_Iface;
	
	@Resource
	Advertisement_Manager_Service_Iface advertisement_Manager_Service_Iface;

	@Resource
	T_s_advertisement_type_Service_Iface t_s_advertisement_type_Service_Iface;
	@Resource
	PageServiceIface pageServiceIface;

	/**
	 *  查询广告管理表数据
	 * @param advertisement_Manager
	 * @return
	 */
	@RequestMapping("query_all_t_s_advertisement_manager")
	@ResponseBody
	public List query_all_t_s_advertisement_manager(Advertisement_Manager advertisement_Manager) {
		List ls = null;
		try {
			ls = advertisement_Manager_Service_Iface.queryAll_advertisement_manager(advertisement_Manager);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 *  添加数据到广告管理表
	 * @param t_s_advertisement_manager
	 */
	@RequestMapping("add_t_s_advertisement_manager")
	@ResponseBody
	public void add_t_s_advertisement_manager(T_s_advertisement_manager t_s_advertisement_manager) {
		try {
			t_s_advertisement_manager.setId(UUID_Tools.getUUID());
			t_s_advertisement_manager_Service_Iface.insert_t_s_advertisement_manager(t_s_advertisement_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  广告上下架功能
	 * @param t_s_advertisement_manager
	 */
	@RequestMapping("is_advertisement_enable")
	@ResponseBody
	public void is_advertisement_enable(T_s_advertisement_manager t_s_advertisement_manager) {
		try {
			t_s_advertisement_manager_Service_Iface.update_t_s_advertisement_manager(t_s_advertisement_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  删除广告管理表中数据
	 * @param t_s_advertisement_manager
	 */
	@RequestMapping("delete_t_s_advertisement_manager")
	@ResponseBody
	public void delete_t_s_advertisement_manager(T_s_advertisement_manager t_s_advertisement_manager) {
		try {
			t_s_advertisement_manager_Service_Iface.delete_t_s_advertisement_manager(t_s_advertisement_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  批量删除广告数据
	 * @param t_s_advertisement_manager
	 */
	@RequestMapping("delete_all_t_s_advertisement_manager")
	@ResponseBody
	public void delete_all_t_s_advertisement_manager(T_s_advertisement_manager t_s_advertisement_manager) {
		try {
			advertisement_Manager_Service_Iface.delete_all_t_s_advertisement_manager(t_s_advertisement_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过ID查出指定行数据
	 * @param t_s_advertisement_manager
	 * @return
	 */
	@RequestMapping("query_Advertisement_manager_By_Id")
	@ResponseBody
	public List query_Advertisement_manager_By_Id(T_s_advertisement_manager t_s_advertisement_manager){
		List ls = null;
		try {
			ls = t_s_advertisement_manager_Service_Iface.queryAll_t_s_advertisement_manager(t_s_advertisement_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	/**
	 * 更新单条数据
	 * @param t_s_advertisement_manager
	 */
	
	@RequestMapping("update_Advertisement_manager_By_Id")
	@ResponseBody
	public void update_Advertisement_manager_By_Id(T_s_advertisement_manager t_s_advertisement_manager){
		try {
		t_s_advertisement_manager_Service_Iface.update_t_s_advertisement_manager(t_s_advertisement_manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 查询广告类型
	 * @param t_s_advertisement_type
	 */
	
	@RequestMapping("queryAll_t_s_advertisement_type")
	@ResponseBody
	public List queryAll_t_s_advertisement_type(T_s_advertisement_type t_s_advertisement_type){
		List ls = null;
		try {
			ls = t_s_advertisement_type_Service_Iface.queryAll_t_s_advertisement_type(t_s_advertisement_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	
	
}
