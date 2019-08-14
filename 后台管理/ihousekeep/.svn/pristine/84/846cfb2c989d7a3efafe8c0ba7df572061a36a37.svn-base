//package com.ccunix.ihousekeeping.serviceproject.service;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.ccunix.ihousekeeping.base.service.BaseService;
//import com.ccunix.ihousekeeping.basedb.dao.T_s_system_param_Dao_Iface;
//import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
//import com.ccunix.ihousekeeping.basedb.domain.T_s_system_param;
//import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
//import com.ccunix.ihousekeeping.serviceproject.dao.Serviceproject_Manamger_Dao_Iface;
//import com.ccunix.ihousekeeping.serviceproject.domain.ServiceItem_bean;
//
//@Service
//@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
//public class Serviceproject_Manamger_Service_Impl extends BaseService implements Serviceproject_Manamger_Service_Iface {
//	// 批量删除
//	@Resource 
//	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
//	@Resource
//	Serviceproject_Manamger_Dao_Iface serviceproject_Manamger_Dao_Iface;
//
//	@Override
//	public void delete_batch_service_project(T_u_service_project t_u_service_project) {
//		String[] ids = t_u_service_project.getId().split(",");
//		try {
//			for (String string : ids) {
//				T_u_service_project service_project = new T_u_service_project();
//				service_project.setId(string);
//				service_project.setIs_show(2);
//				t_u_service_project_Dao_Iface.update_t_u_service_project(service_project);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	// 查询数据
//	@Override
//	public List queryAll_service_project(ServiceItem_bean serviceItem_bean) {
//		List<ServiceItem_bean> ls = null;
//		try {
//			ls = serviceproject_Manamger_Dao_Iface.queryAll_service_project(serviceItem_bean);
//			if (ls.size() > 0) {
//				for (ServiceItem_bean item_bean : ls) {
//					if (item_bean.getIs_show() == 1) {
//						item_bean.setIs_show_str("是");
//					} else {
//						item_bean.setIs_show_str("否");
//					}
//				}
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return ls;
//
//	}
//
//}




package com.ccunix.ihousekeeping.serviceproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.minprog_main.domain.Coupon;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;
import com.ccunix.ihousekeeping.serviceproject.dao.Serviceproject_Manamger_Dao_Iface;
import com.ccunix.ihousekeeping.serviceproject.domain.ServiceItem_bean;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Serviceproject_Manamger_Service_Impl extends BaseService implements Serviceproject_Manamger_Service_Iface {
//批量删除 
	@Resource
	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
	@Resource
	Serviceproject_Manamger_Dao_Iface serviceproject_Manamger_Dao_Iface;
	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface;
	
	@Override
	public void delete_batch_service_project(T_u_service_project t_u_service_project) {
		String[]  ids = t_u_service_project.getId().split(",");
		try{
			for (String string : ids) {
				T_u_service_project service_project =new T_u_service_project();
				service_project.setId(string);
				t_u_service_project_Dao_Iface.delete_t_u_service_project(service_project);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	@Override
	public List queryAll_service_project(ServiceItem_bean serviceItem_bean) {
		// TODO Auto-generated method stub
		return serviceproject_Manamger_Dao_Iface.queryAll_service_project(serviceItem_bean );
	}
	
	//is_show=1
	@Override
	public void query2(ServiceItem_bean serviceItem_bean) {
		serviceproject_Manamger_Dao_Iface.query2(serviceItem_bean);
	}
	
	
	
	
	@Override
	public AppDataModel getHeadSortFirst(Base_Model_Business base_Model_Business) throws Exception {
			System.out.println("serviceproject_4X!!!!!!!!!!!!!!!!!!!!!!!!");

			AppDataModel appDataModel = getAppDataModel();

			List advertisement = serviceproject_Manamger_Dao_Iface.queryAll_Advertisement_item();
			T_u_service_project t_u_service_project = new T_u_service_project();
			t_u_service_project.setIs_show(1);
			List service_project_name = t_u_service_project_Dao_Iface.queryAll_t_u_service_project(t_u_service_project);
			for (int i = 0; i < service_project_name.size(); i++) {
				T_u_service_project t = (T_u_service_project) service_project_name.get(i);
				System.out.println("Picture_bef:"+t.getFront_picture());
				t.setPicture_bef(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
								+ t.getFront_picture());
				System.out.println(t.getFront_picture());
			}
			appDataModel.data.put("service_project", service_project_name);
			appDataModel.data.put("advertisement", advertisement);

			return appDataModel;
		}
	
	
	
	
	
	@Override
	public void update_t_u_service_project_batch(T_u_service_project t_u_service_project) throws Exception {
		String[]  ids = t_u_service_project.getId().split(",");
		try{
			for (String string : ids) {
				T_u_service_project service_project =new T_u_service_project();
				service_project.setId(string);
				service_project.setIs_show(2);
				t_u_service_project_Dao_Iface.update_t_u_service_project(service_project);
			}
		}catch(Exception e){
			e.printStackTrace();
	}
	}
}

