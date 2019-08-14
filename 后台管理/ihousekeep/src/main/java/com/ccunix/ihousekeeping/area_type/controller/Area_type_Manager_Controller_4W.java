package com.ccunix.ihousekeeping.area_type.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.area_type.domain.Area_type_Manager;
import com.ccunix.ihousekeeping.area_type.service.Area_type_Manager_Service_Iface;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_area_type;
import com.ccunix.ihousekeeping.basedb.service.T_u_area_type_Service_Iface;

/**
 * 
 * @ClassName: Area_type_Manager_Controller_4W
 * @author 肖云鹏
 * @date 2019年7月17日 上午10:47:15
 *
 */
@Controller
@RequestMapping("Area_type_Manager_Controller_4W")
public class Area_type_Manager_Controller_4W extends BaseMultiController {
	@Resource
	public Area_type_Manager_Service_Iface area_type_Manager_Service_Iface;

	@Resource
	public T_u_area_type_Service_Iface t_u_area_type_Service_Iface;

	@Resource
	public PageServiceIface pageServiceIface;

	
	/**
	 * 
	 * <p>Title: delete_all_area_type_manager</p>  
	 * <p>Description:批量删除 </p>  
	 * @param t_u_area_type
	 */
	@RequestMapping("delete_all_area_type_manager")
	@ResponseBody
	public void delete_all_area_type_manager(T_u_area_type t_u_area_type) {
		area_type_Manager_Service_Iface.delete_all_area_type_manager(t_u_area_type);
	}

	
	/**
	 * <p>Title: query_all_area_type_manager</p>  
	 * <p>Description: 查询 </p>  
	 * @param area_type_Manager
	 * @return
	 */
	@RequestMapping("query_all_area_type_manager")
	@ResponseBody
	public List query_all_area_type_manager(Area_type_Manager area_type_Manager) {
		List ls = null;
		try {
			ls = area_type_Manager_Service_Iface.query_all_area_type_manager(area_type_Manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PageModel model = pageServiceIface.setPageData(request, ls);
		return pageServiceIface.getNowPageData(request, model);

	}

	
	/**
	 * <p>Title: delete_area_type_manager</p>  
	 * <p>Description:  删除</p>  
	 * @param t_u_area_type
	 */
	@RequestMapping("delete_area_type_manager")
	@ResponseBody
	public void delete_area_type_manager(T_u_area_type t_u_area_type) {
		try {
			t_u_area_type_Service_Iface.delete_t_u_area_type(t_u_area_type);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	
	/**
	 * <p>Title: add_area_type_manager</p>  
	 * <p>Description: 添加 </p>  
	 * @param t_u_area_type
	 */
	@RequestMapping("add_area_type_manager")
	@ResponseBody
	public void add_area_type_manager(T_u_area_type t_u_area_type) {
		try {
			t_u_area_type.setId(UUID_Tools.getUUID());
			t_u_area_type_Service_Iface.insert_t_u_area_type(t_u_area_type);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	
	/**
	 * <p>Title: update_area_type_manager</p>  
	 * <p>Description:更新 </p>  
	 * @param t_u_area_type
	 */
	@RequestMapping("update_area_type_manager")
	@ResponseBody
	public void update_area_type_manager(T_u_area_type t_u_area_type) {
		try {
			t_u_area_type_Service_Iface.update_t_u_area_type(t_u_area_type);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * 
	 * <p>Title: query_area_type_manager_By_Id</p>  
	 * <p>Description:查询（id） </p>  
	 * @param t_u_area_type
	 * @return
	 */
	@RequestMapping("query_area_type_manager_By_Id")
	@ResponseBody
	public List query_area_type_manager_By_Id(T_u_area_type t_u_area_type) {
		List ls = null;
		try {
			ls = t_u_area_type_Service_Iface.queryBy_t_u_area_type(t_u_area_type);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return ls;
	}
}
