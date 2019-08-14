package com.ccunix.ihousekeeping.riderelegant.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_user_manager_role;
import com.ccunix.ihousekeeping.basedb.domain.T_u_ride_service_item;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider_Manager;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Service_Item;
import com.ccunix.ihousekeeping.riderelegant.service.Riderelegant_Manager_Service_Iface;

@Controller
@RequestMapping("Riderelegant_Manager_Controller_4W")
public class Riderelegant_Manager_Controller_4W extends BaseMultiController {

	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface;

	@Resource
	Riderelegant_Manager_Service_Iface riderelegant_Manager_Service_Iface;
	@Resource
	PageServiceIface pageServiceIface;
	
	
	
	@RequestMapping("delete_t_u_ride_service_item")
	@ResponseBody
	public void delete_t_u_ride_service_item(T_u_ride_service_item t_u_ride_service_item) {
		try {
			riderelegant_Manager_Service_Iface.delete_t_u_ride_service_item(t_u_ride_service_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("queryByManager_Rider")
	@ResponseBody
	public List queryByManager_Rider(T_U_Rider_Manager t_U_Rider_Manager) {
		System.out.println("[queryByManager_Rider][调用]");
		List ls = null;
		try {
			ls = riderelegant_Manager_Service_Iface.queryByManager_Rider(t_U_Rider_Manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[queryByManager_Rider][调用]数据:"+ls.size());
		return ls;
	}
	
	
	
	@RequestMapping("insert_t_u_ride_service_item")
	@ResponseBody
	public void insert_t_u_ride_service_item(T_u_ride_service_item t_u_ride_service_item) {
		System.out.println("[insert_t_u_ride_service_item][调用]");
		try {
			t_u_ride_service_item.setId(UUID_Tools.getUUID());
			riderelegant_Manager_Service_Iface.insert_t_u_ride_service_item(t_u_ride_service_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	@RequestMapping("queryAll_t_u_service_item")
	@ResponseBody
	public List queryAll_t_u_service_item(T_u_service_item t_u_service_item) {
		List ls = null;
		System.out.println("[queryAll_t_u_service_item][调用]");
		try {
			ls = riderelegant_Manager_Service_Iface.queryAll_t_u_service_item(t_u_service_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[queryAll_t_u_service_item][调用]数据:"+ls.size());
		return ls;
	}
	
	
	
	
	@RequestMapping("queryAll_t_u_rider")
	@ResponseBody
	public List queryAll_t_u_rider(T_u_rider t_u_rider) {
		List ls = null;

		try {
			ls = riderelegant_Manager_Service_Iface.queryAll_t_u_rider(t_u_rider);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ls;
	}
	
	
	
	@RequestMapping("delete_t_u_rider")
	@ResponseBody
	public void delete_t_u_rider(T_u_rider t_u_rider) {
		try {
			riderelegant_Manager_Service_Iface.delete_t_u_rider(t_u_rider);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	@RequestMapping("insert_t_u_rider")
	@ResponseBody
	public void insert_t_u_rider(T_u_rider t_u_rider) {
		System.out.println("[insert_t_u_rider][调用]");
		try {
			t_u_rider.setId(UUID_Tools.getUUID());
			System.out.println("[insert_t_u_rider][调用]ID:"+t_u_rider.getId());
			riderelegant_Manager_Service_Iface.insert_t_u_rider(t_u_rider);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("queryBy_t_u_rider")
	@ResponseBody
	public List queryBy_t_u_rider(T_u_rider t_u_rider) {
		List ls = null;
		System.out.println("[queryBy_t_u_rider][调用]");
		System.out.println(t_u_rider);
		try {
			ls = riderelegant_Manager_Service_Iface.queryAll_t_u_rider(t_u_rider);
			
			System.out.println(ls);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
	}
	
	
	
	@RequestMapping("update_t_u_rider")
	@ResponseBody
	public void update_t_u_rider(T_u_rider t_u_rider) {
		System.out.println("[update_t_u_rider][调用]");
		
		try {
			riderelegant_Manager_Service_Iface.update_t_u_rider(t_u_rider);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@RequestMapping("delete_By_Rider")
	@ResponseBody
	public void delete_By_Rider(T_u_service_item t_u_service_item) {
		System.out.println("[delete_By_Rider][调用]");
		try {
			riderelegant_Manager_Service_Iface.delete_By_Rider(t_u_service_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("queryAllItem_Name")
	@ResponseBody
	public List queryAllItem_Name(T_U_Service_Item t_U_Service_Item){
		System.out.println("[queryAllItem_Name][调用]");
		List ls = null;
		try {
			ls=riderelegant_Manager_Service_Iface.queryAllItem_Name(t_U_Service_Item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[queryAllItem_Name][调用]数据:"+ls.size());
		return ls;
	}
	
	
	@RequestMapping("delete_all_manager_rider")
	@ResponseBody
	public void delete_all_manager_rider(T_u_rider t_u_rider) {
		System.out.println("[delete_all_manager_rider][调用]");
		try {
			riderelegant_Manager_Service_Iface.delete_all_manager_rider(t_u_rider);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	
	
	
	@RequestMapping("queryAll_USer_Manager_Role")
	@ResponseBody
	public List queryAll_USer_Manager_Role(T_s_user_manager_role t_s_user_manager_role) {
		List ls = null;
		try {
			ls = riderelegant_Manager_Service_Iface.queryAll_USer_Manager_Role(t_s_user_manager_role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
	}
	
	@RequestMapping("queryAllManager_Rider")
	@ResponseBody
	public List queryAllManager_Rider() {
		System.out.println("[queryAllManager_Rider][调用]");
		List ls = null;
		
		try {
			ls = riderelegant_Manager_Service_Iface.queryAllManager_Rider();
			for (int i = 0; i < ls.size(); i++) {
				T_U_Rider_Manager t_U_Rider = (T_U_Rider_Manager) ls.get(i);
				t_U_Rider.setPhoto_url(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
						+ t_U_Rider.getPhoto_url());
				
				if (t_U_Rider.getIs_excellent()==null || t_U_Rider.getIs_excellent().equals("02")) {
					t_U_Rider.setIs_excellent("否");
				}else {
					t_U_Rider.setIs_excellent("是");
				}
				
				
				if (t_U_Rider.getIs_show()==null||t_U_Rider.getIs_show().equals("02")) {
					t_U_Rider.setIs_show("否");
				}else{
					System.out.println("++++++++++++++++++");
					t_U_Rider.setIs_show("是");
				}
				if (t_U_Rider.getLeader_name()==null||t_U_Rider.getLeader_name()==null) {
					System.out.println("Leader_name():"+t_U_Rider.getLeader_name());
					t_U_Rider.setLeader_name("无");
				}
			}
			PageModel model = pageServiceIface.setPageData(request, ls);
			System.out.println("[queryAllManager_Rider][调用]数据:"+ls.size());
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[queryAllManager_Rider][调用]数量:"+ls.size());
		return ls;
	}
	
	
	
	@RequestMapping("delete_all_t_u_rider")
	@ResponseBody
	public void delete_all_t_u_rider(T_u_rider t_u_rider) {
		try {
			riderelegant_Manager_Service_Iface.delete_all_t_u_rider(t_u_rider);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("queryAllUnexcellent_Rider")
	@ResponseBody
	public List queryAllUnexcellent_Rider() {
		System.out.println("[queryAllUnexcellent_Rider][调用]");
		List ls = null;
		try {
			ls = riderelegant_Manager_Service_Iface.queryAllUnexcellent_Rider();
			for (int i = 0; i < ls.size(); i++) {
				T_U_Rider t_U_Rider = (T_U_Rider) ls.get(i);
				t_U_Rider.setPhoto_url(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
						+ t_U_Rider.getPhoto_url());
			}
			
			System.out.println("[queryAllUnexcellent_Rider][调用]已查数据:"+ls.size());
			/*PageModel model = pageServiceIface.setPageData(request, ls);
			System.out.println(ls + "+++++++++++++++++++++++++++++++++++");
			return pageServiceIface.getNowPageData(request, model);*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	
	
	@RequestMapping("queryAllExcellent_Rider")
	@ResponseBody
	public List queryAllExcellent_Rider() {
		List ls = null;
		try {
			ls = riderelegant_Manager_Service_Iface.queryAllExcellent_Rider();
			for (int i = 0; i < ls.size(); i++) {
				T_U_Rider t_U_Rider = (T_U_Rider) ls.get(i);
				t_U_Rider.setPhoto_url(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
						+ t_U_Rider.getPhoto_url());
			}
			PageModel model = pageServiceIface.setPageData(request, ls);
			System.out.println(ls + "+++++++++++++++++++++++++++++++++++");
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	@RequestMapping("queryAll_Rider")
	@ResponseBody
	public List queryAll_Rider() {
		List ls = null;
		try {
			ls = riderelegant_Manager_Service_Iface.queryAll_Rider();
			for (int i = 0; i < ls.size(); i++) {
				T_U_Rider t_U_Rider = (T_U_Rider) ls.get(i);
				t_U_Rider.setPhoto_url(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
						+ t_U_Rider.getPhoto_url());
			}
			PageModel model = pageServiceIface.setPageData(request, ls);
			System.out.println(ls + "+++++++++++++++++++++++++++++++++++");
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

}
