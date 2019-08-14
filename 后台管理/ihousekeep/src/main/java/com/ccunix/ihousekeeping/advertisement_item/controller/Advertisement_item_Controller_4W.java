package com.ccunix.ihousekeeping.advertisement_item.controller;
 
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.advertisement.service.Advertisement_Manager_Service_Iface;
import com.ccunix.ihousekeeping.advertisement_item.domain.Advertisement_item;
import com.ccunix.ihousekeeping.advertisement_item.service.Advertisement_item_Service_Iface;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_item;
import com.ccunix.ihousekeeping.basedb.service.T_s_advertisement_item_Service_Iface;

@Controller
@RequestMapping("Advertisement_item_Controller_4W")
public class Advertisement_item_Controller_4W extends BaseMultiController {

	@Resource
	T_s_advertisement_item_Service_Iface t_s_advertisement_item_Service_Iface;
	
	@Resource
	Advertisement_item_Service_Iface advertisement_item_Service_Iface;
	
	@Resource
	Advertisement_Manager_Service_Iface advertisement_Manager_Service_Iface;

	@Resource()
	PageServiceIface pageServiceIface;

	/**
	 *  查询广告项目表数据
	 * @param advertisement_item
	 * @return
	 */
	@RequestMapping("query_all_t_s_advertisement_item")
	@ResponseBody
	public List query_all_t_s_advertisement_item(Advertisement_item advertisement_item) {
		List ls = null;
		try {
			ls = advertisement_item_Service_Iface.queryAll_advertisement_item(advertisement_item);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 *  添加数据到广告项目表
	 * @param t_s_advertisement_item
	 */
	@RequestMapping("add_t_s_advertisement_item")
	@ResponseBody
	public void add_t_s_advertisement_item(T_s_advertisement_item t_s_advertisement_item) {
		try {
			t_s_advertisement_item.setId(UUID_Tools.getUUID());
			t_s_advertisement_item_Service_Iface.insert_t_s_advertisement_item(t_s_advertisement_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  广告上下架功能
	 * @param t_s_advertisement_item
	 */
	@RequestMapping("is_advertisement_enable")
	@ResponseBody
	public void is_advertisement_enable(T_s_advertisement_item t_s_advertisement_item) {
		try {
			t_s_advertisement_item_Service_Iface.update_t_s_advertisement_item(t_s_advertisement_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  删除广告项目表中数据
	 * @param t_s_advertisement_item
	 */
	@RequestMapping("delete_t_s_advertisement_item")
	@ResponseBody
	public void delete_t_s_advertisement_item(T_s_advertisement_item t_s_advertisement_item) {
		try {
			t_s_advertisement_item_Service_Iface.delete_t_s_advertisement_item(t_s_advertisement_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  批量删除广告项目数据
	 * @param t_s_advertisement_item
	 */
	@RequestMapping("delete_all_t_s_advertisement_item")
	@ResponseBody
	public void delete_all_t_s_advertisement_item(Advertisement_item advertisement_item) {
		try {
			advertisement_item_Service_Iface.delete_all_t_s_advertisement_item(advertisement_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通过ID查出指定行数据
	 * @param t_s_advertisement_item
	 * @return
	 */
	@RequestMapping("query_Advertisement_item_By_Id")
	@ResponseBody
	public List query_Advertisement_item_By_Id(T_s_advertisement_item t_s_advertisement_item){
		List ls = null;
		try {
			ls = t_s_advertisement_item_Service_Iface.queryAll_t_s_advertisement_item(t_s_advertisement_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	/**
	 * 更新单条数据
	 * @param t_s_advertisement_item
	 */
	
	@RequestMapping("update_Advertisement_item_By_Id")
	@ResponseBody
	public void update_Advertisement_item_By_Id(T_s_advertisement_item t_s_advertisement_item){
		try {
		t_s_advertisement_item_Service_Iface.update_t_s_advertisement_item(t_s_advertisement_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  查询广告管理表数据
	 * @param advertisement_Manager
	 * @return
	 */
	@RequestMapping("query_advertisement_manager")
	@ResponseBody
	public List query_all_t_s_advertisement_manager(Advertisement_Manager advertisement_Manager) {
		List ls = null;
		try {
			ls = advertisement_Manager_Service_Iface.queryAll_advertisement_manager(advertisement_Manager);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
}
