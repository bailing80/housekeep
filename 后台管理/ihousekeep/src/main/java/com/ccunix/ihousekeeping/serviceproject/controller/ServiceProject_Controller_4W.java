package com.ccunix.ihousekeeping.serviceproject.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.basedb.service.T_u_service_project_Service_Iface;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider;
import com.ccunix.ihousekeeping.serviceproject.domain.ServiceItem_bean;
import com.ccunix.ihousekeeping.serviceproject.service.Serviceproject_Manamger_Service_Iface;
import com.ccunix.ihousekeeping.serviceproject.service.Serviceproject_Manamger_Service_Impl;

@Controller
@RequestMapping("ServiceProject_Controller_4W")
public class ServiceProject_Controller_4W extends BaseMultiController {

	@Resource
	T_u_service_project_Service_Iface t_u_service_project_Service_Iface;
 
	@Resource 
	PageServiceIface pageServiceIface;
	@Resource
	Serviceproject_Manamger_Service_Iface serviceproject_Manamger_Service_Iface;
	// 查询is_show=2数据
	@RequestMapping("query_show_service_project_Service_manager")
	@ResponseBody
	public List query_show_service_project_Service_manager(ServiceItem_bean serviceItem_bean) {
		System.out.println(((ServiceItem_bean)serviceItem_bean).getKeyword()+"kkkkk");
		List ls = null;
		try {
			ls = serviceproject_Manamger_Service_Iface.queryAll_service_project(serviceItem_bean );
			
			for (int i = 0; i < ls.size(); i++) {
				T_u_service_project service_project = (T_u_service_project)ls.get(i);
				service_project.setFront_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getFront_picture());
				service_project.setPicture_bef(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getPicture_bef());
				service_project.setPicture_aft(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getPicture_aft());
				service_project.setTop_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getTop_picture());
			}
			return ls;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	// 查询数据
	@RequestMapping("query_all_service_project_Service_manager")
	@ResponseBody
	public List query_all_service_project_Service_manager(ServiceItem_bean serviceItem_bean) {
		System.out.println(((ServiceItem_bean)serviceItem_bean).getKeyword()+"kkkkk");
		List ls = null;
		try {
			ls = serviceproject_Manamger_Service_Iface.queryAll_service_project(serviceItem_bean );
			for (int i = 0; i < ls.size(); i++) {
				T_u_service_project service_project = (T_u_service_project)ls.get(i);
				service_project.setFront_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getFront_picture());
				service_project.setPicture_bef(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getPicture_bef());
				service_project.setPicture_aft(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getPicture_aft());
				service_project.setTop_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getTop_picture());
			}
			
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	// 修改数据
	@RequestMapping("update_service_project_Service_manager")
	@ResponseBody
	public void update_service_project_Service_manager(T_u_service_project t_u_service_project) {
		try {
			t_u_service_project_Service_Iface.update_t_u_service_project(t_u_service_project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	//    服务项目上下架功能
		@RequestMapping("is_service_project_enable")
		@ResponseBody
		public void is_service_project_enable(T_u_service_project t_u_service_project) {
			System.out.println(t_u_service_project.getId()+"dddddddddddddddd");
			System.out.println(t_u_service_project.getIs_show()+"isisisshow");
			System.out.println(t_u_service_project.getIntroduce()+"dddddddddddddddd");
			System.out.println(t_u_service_project.getPicture_aft()+"dddddddddddddddd");
			try {
				t_u_service_project_Service_Iface.update_t_u_service_project(t_u_service_project);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 
		//    批量服务项目上下架功能
		@RequestMapping("is_service_project_enable_batch")
		@ResponseBody
		public void is_service_project_enable_batch(T_u_service_project t_u_service_project) {
			System.out.println(t_u_service_project.getId()+"dddddddddddddddd");
			System.out.println(t_u_service_project.getIs_show()+"isisisshow");
			System.out.println(t_u_service_project.getIntroduce()+"dddddddddddddddd");
			System.out.println(t_u_service_project.getPicture_aft()+"dddddddddddddddd");
			try {
				serviceproject_Manamger_Service_Iface.update_t_u_service_project_batch(t_u_service_project);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	// 删除数据
	@RequestMapping("delete_service_project_Service_manager")
	@ResponseBody
	public void delete_service_project_Service_manager(T_u_service_project t_u_service_project) {
		try {
			t_u_service_project_Service_Iface.delete_t_u_service_project(t_u_service_project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}/**
	
	批量删除
	*/
	@RequestMapping("delete_batch_service_project")
	@ResponseBody
	public void delete_batch_service_project(T_u_service_project T_u_service_project) {
		try {
			serviceproject_Manamger_Service_Iface.delete_batch_service_project(T_u_service_project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("query2")
	@ResponseBody
	public void query2(ServiceItem_bean serviceItem_bean) {
		try {
			serviceproject_Manamger_Service_Iface.query2(serviceItem_bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 添加数据
	@RequestMapping("add_service_project_Service_manager")
	@ResponseBody
	public void add_service_project_Service_manager(T_u_service_project t_u_service_project) {
		try {
			t_u_service_project.setId(UUID_Tools.getUUID());
			t_u_service_project_Service_Iface.insert_t_u_service_project(t_u_service_project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//更新现查id
	@RequestMapping("query_service_project_By_Id")
	@ResponseBody
	public List query_service_project_By_Id(T_u_service_project t_u_service_project){
		List ls = null;
		try {
			ls = t_u_service_project_Service_Iface.queryAll_t_u_service_project(t_u_service_project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	@RequestMapping("update_service_project_By_Id")
	@ResponseBody
	public void update_service_project_By_Id(T_u_service_project t_u_service_project){
		System.out.println(t_u_service_project.getId());
		System.out.println(t_u_service_project.getFront_picture());
		System.out.println(t_u_service_project.getPicture_bef());
		System.out.println(t_u_service_project.getPicture_aft());
		System.out.println(t_u_service_project.getFront_picture_link());
		try {
			t_u_service_project_Service_Iface.update_t_u_service_project(t_u_service_project);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
