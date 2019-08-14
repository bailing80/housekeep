package com.ccunix.ihousekeeping.map.controller;
 
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
import com.ccunix.ihousekeeping.basedb.domain.Map;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.basedb.service.Map_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_s_advertisement_manager_Service_Iface;
import com.ccunix.ihousekeeping.map.service.Map_H_Service_Iface;

@Controller
@RequestMapping("Map_H_Controller_4W")
public class Map_H_Controller_4W extends BaseMultiController {

	@Resource
	Map_Service_Iface map_Service_Iface;
	
	@Resource
	Map_H_Service_Iface map_H_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	/**
	 *  查询经度纬度表数据
	 * @author 黄爽
	 */
	@RequestMapping("query_all_map")
	@ResponseBody
	public List query_all_map(Map map) {
		List ls = null;
		try {
			ls = map_H_Service_Iface.queryAll_map_h(map);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 *  添加经度纬度表数据
	 * @author 黄爽
	 */
	@RequestMapping("add_map")
	@ResponseBody
	public void add_map(Map map) {
		try {
			map.setId(UUID_Tools.getUUID());
			map_Service_Iface.insert_map(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  删除经度纬度表数据
	 * @author 黄爽
	 */
	@RequestMapping("delete_map")
	@ResponseBody
	public void delete_map(Map map) {
		try {
			map_Service_Iface.delete_map(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  批量删除经度纬度表数据
	 * @author 黄爽
	 */
	@RequestMapping("delete_all_map")
	@ResponseBody
	public void delete_all_map(Map map) {
		try {
			map_Service_Iface.delete_map(map);
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
	@RequestMapping("query_map_By_Id")
	@ResponseBody
	public List query_map_By_Id(Map map){
		List ls = null;
		try {
			ls = map_Service_Iface.queryAll_map(map);
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
	
	@RequestMapping("update_map_By_Id")
	@ResponseBody
	public void update_map_By_Id(Map map){
		try {
			map_Service_Iface.update_map(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
