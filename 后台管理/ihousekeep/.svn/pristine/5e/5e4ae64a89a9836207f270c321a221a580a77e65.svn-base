package com.ccunix.ihousekeeping.servicecontent.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_content;
import com.ccunix.ihousekeeping.basedb.service.T_u_service_content_Service_Iface;
import com.ccunix.ihousekeeping.servicecontent.domain.ServiceContent_lowerlevelbeen;
import com.ccunix.ihousekeeping.servicecontent.service.ServiceContent_Service_Iface;

@Controller
@RequestMapping("ServiceContent_Controller_4W")
public class ServiceContent_Controller_4W extends BaseMultiController {
		@Resource
		T_u_service_content_Service_Iface t_u_service_content_Service_Iface;

		@Resource 
		PageServiceIface pageServiceIface;

		@Resource
		ServiceContent_Service_Iface serviceContent_Service_Iface;
		// 查询数据 
		@RequestMapping("query_all__Servicecontent_lowerlevel")
		@ResponseBody
		public List query_all__Servicecontent_lowerlevel(ServiceContent_lowerlevelbeen serviceContent_lowerlevelbeen) {
			System.out.println(((ServiceContent_lowerlevelbeen)serviceContent_lowerlevelbeen).getKeyword()+"kkkkk");
			System.err.println(serviceContent_lowerlevelbeen+"cidbcdsibcudbcs");
			System.out.println(serviceContent_lowerlevelbeen.getService_item_id()+"===adadada");
			List ls = null;
			try {
				ls = serviceContent_Service_Iface.query_all__Servicecontent_lowerlevel(serviceContent_lowerlevelbeen);
				for (int i = 0; i < ls.size(); i++) {
					T_u_service_content service_content = (T_u_service_content)ls.get(i);
				}
				PageModel model = pageServiceIface.setPageData(request, ls);
				System.out.println(ls.size()+"!!!!!!!!!!!!!!!");
				return pageServiceIface.getNowPageData(request, model);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ls;
		}
		// 添加数据
		@RequestMapping("add_Servicecontent_lowerlevel")
		@ResponseBody
		public void add_Servicecontent_lowerlevel(T_u_service_content t_u_service_content) {
			try {
				t_u_service_content.setId(UUID_Tools.getUUID());
				t_u_service_content_Service_Iface.insert_t_u_service_content(t_u_service_content);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 删除数据
		@RequestMapping("delete_Servicecontent_lowerlevel")
		@ResponseBody
		public void delete_Servicecontent_lowerlevel(T_u_service_content t_u_service_content) {
			try {
				serviceContent_Service_Iface.delete_Servicecontent_lowerlevel(t_u_service_content);	
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//批量删除
		
//		@RequestMapping("delete_batch_serviceiteam")
//		@ResponseBody
//		public void delete_batch_serviceiteam(T_u_service_item t_u_service_item) {
//			try {
//				serviceItem_Service_Iface.delete_Serviceiteam_lowerlevel(t_u_service_item);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		@RequestMapping("update_servicecontent_lowerlevel_By_Id")
		@ResponseBody
		public void update_servicecontent_lowerlevel_By_Id(T_u_service_content t_u_service_content){

			try {
				t_u_service_content_Service_Iface.update_t_u_service_content(t_u_service_content);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			//更新现查id
			@RequestMapping("query_service_content_By_Id")
			@ResponseBody
			public List query_service_content_By_Id(T_u_service_content t_u_service_content){
				List ls = null;
				try {
					ls = t_u_service_content_Service_Iface.queryAll_t_u_service_content(t_u_service_content);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return ls;
			}
	/*
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
	*/
		
}
