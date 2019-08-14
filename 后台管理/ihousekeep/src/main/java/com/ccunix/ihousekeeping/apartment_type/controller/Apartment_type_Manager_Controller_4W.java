package com.ccunix.ihousekeeping.apartment_type.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.apartment_type.domain.Apartment_type_Manager;
import com.ccunix.ihousekeeping.apartment_type.service.Apartment_type_Manager_Service_Iface;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_apartment_type;
import com.ccunix.ihousekeeping.basedb.service.T_u_apartment_type_Service_Iface;

/**
 * @ClassName: Apartment_type_Manager_Controller_4W
 * @author 肖云鹏
 * @date 2019年7月17日 上午10:04:44
 * 
 */


@Controller
@RequestMapping("Apartment_type_Manager_Controller_4W")
public class Apartment_type_Manager_Controller_4W extends BaseMultiController {

	@Resource
	Apartment_type_Manager_Service_Iface apartment_type_Manager_Service_Iface;
	@Resource
	T_u_apartment_type_Service_Iface t_u_apartment_type_Service_Iface;
	@Resource
	PageServiceIface pageServiceIface;

	/**
	 * <p>Title: query_all_apartment_type_manager </p>
	 * <p>Description: 查询全部户型数据</p>s
	 * @param apartment_type_Manager
	 * @return
	 */
	@RequestMapping("query_all_apartment_type_manager")
	@ResponseBody
	public List query_all_apartment_type_manager(Apartment_type_Manager apartment_type_Manager) {
		List ls = null;
		try {
			ls = apartment_type_Manager_Service_Iface.queryAll_apartment_type_manager(apartment_type_Manager);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	/**
	 * <p>Title: add_apartment_type_manager</p>
	 * <p>Description:添加数据到户型管理表 </p>
	 * @param t_u_apartment_type
	 */
	@RequestMapping("add_apartment_type_manager")
	@ResponseBody
	public void add_apartment_type_manager(T_u_apartment_type t_u_apartment_type) {
		try {
			t_u_apartment_type.setId(UUID_Tools.getUUID());
			t_u_apartment_type_Service_Iface.insert_t_u_apartment_type(t_u_apartment_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * <p>Title: delete_apartment_type_manager</p>
	 * <p>Description: 删除户型管理表中数据</p>
     * @param t_u_apartment_type
	 */
	@RequestMapping("delete_apartment_type_manager")
	@ResponseBody
	public void delete_apartment_type_manager(T_u_apartment_type t_u_apartment_type) {
		try {
			t_u_apartment_type_Service_Iface.delete_t_u_apartment_type(t_u_apartment_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * <p>Title: delete_all_apartment_type_manager</p>
	 * <p>Description:批量删除户型数据</p>
	 * @param t_u_apartment_type
	 */
	@RequestMapping("delete_all_apartment_type_manager")
	@ResponseBody
	public void delete_all_apartment_type_manager(T_u_apartment_type t_u_apartment_type) {
		try {
			apartment_type_Manager_Service_Iface.delete_all_apartment_type_manager(t_u_apartment_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/**
	 * 
	 * <p>Title: query_apartment_type_manager_By_Id</p>  
	 * <p>Description:通过关键字查询数据 </p>  
	 * @param t_u_apartment_type
	 * @return
	 */
	@RequestMapping("query_apartment_type_manager_By_Id")
	@ResponseBody
	public List query_apartment_type_manager_By_Id(T_u_apartment_type t_u_apartment_type) {
		List ls = null;
		try {
			ls = t_u_apartment_type_Service_Iface.queryAll_t_u_apartment_type(t_u_apartment_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
    /**
     * 
     * <p>Title: update_apartment_type_manager_By_Id</p>  
     * <p>Description:对户型进行修改操作 </p>  
     * @param t_u_apartment_type
     */
	@RequestMapping("update_apartment_type_manager_By_Id")
	@ResponseBody
	public void update_apartment_type_manager_By_Id(T_u_apartment_type t_u_apartment_type) {
		try {
			t_u_apartment_type_Service_Iface.update_t_u_apartment_type(t_u_apartment_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
