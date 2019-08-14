package com.ccunix.ihousekeeping.serviceitem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_unit;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.basedb.service.T_s_unit_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_u_service_item_Service_Iface;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.serviceitem.domain.ServiceItem_lowerlevelbean;
import com.ccunix.ihousekeeping.serviceitem.service.ServiceItem_Service_Iface;

@Controller
@RequestMapping("ServiceItem_Controller_4W")
public class ServiceItem_Controller_4W extends BaseMultiController  {
    //生成的
	@Resource
	T_u_service_item_Service_Iface t_u_service_item_Service_Iface;

	@Resource 
	PageServiceIface pageServiceIface;
	
	@Resource 
	T_s_unit_Service_Iface t_s_unit_Service_Iface;

	//自己的
	@Resource
	ServiceItem_Service_Iface serviceItem_Service_Iface;
	// 查询计量单位	通过单位id获取计量单位名称
	@RequestMapping("query_all__unit_lowerlevel")
	@ResponseBody
	public List query_all__unit_lowerlevel(T_s_unit t_s_unit) {
		List ls = null;
		try {
			ls = t_s_unit_Service_Iface.queryAll_t_s_unit(t_s_unit);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	// 查询数据 关键字  上传照片
	@RequestMapping("query_all__Serviceiteam_lowerlevel")
	@ResponseBody
	public List query_all__Serviceiteam_lowerlevel(ServiceItem_lowerlevelbean serviceItem_lowerlevelbean) {
		List ls = null;
		try {
			ls = serviceItem_Service_Iface.query_all__Serviceiteam_lowerlevel(serviceItem_lowerlevelbean );
		for (int i = 0; i < ls.size(); i++) {
				T_u_service_item t_u_service_item = (T_u_service_item)ls.get(i);
			t_u_service_item.setItem_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+t_u_service_item.getItem_picture());
			}
			//加载分页
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	// 添加数据
	@RequestMapping("add_Serviceiteam_lowerlevel")
	@ResponseBody
	public void add_Serviceiteam_lowerlevel(T_u_service_item t_u_service_item) {
		try {
			t_u_service_item.setId(UUID_Tools.getUUID());
			t_u_service_item_Service_Iface.insert_t_u_service_item(t_u_service_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 删除数据
	@RequestMapping("delete_Serviceiteam_lowerlevel")
	@ResponseBody
	public void delete_Serviceiteam_lowerlevel(T_u_service_item t_u_service_item) {
		try {
			serviceItem_Service_Iface.delete_Serviceiteam_lowerlevel(t_u_service_item);	
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//批量删除
	
	@RequestMapping("update_serviceiteam_lowerlevel_By_Id")
	@ResponseBody
	public void update_serviceiteam_lowerlevel_By_Id(T_u_service_item t_u_service_item){

		try {
			t_u_service_item_Service_Iface.update_t_u_service_item(t_u_service_item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		//更新现查id
		@RequestMapping("query_service_item_By_Id")
		@ResponseBody
		public List query_service_item_By_Id(T_u_service_item t_u_service_item){
			List ls = null;
			try {
				ls = t_u_service_item_Service_Iface.queryAll_t_u_service_item(t_u_service_item);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ls;
		}

}