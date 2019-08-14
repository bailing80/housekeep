package com.ccunix.ihousekeeping.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Test_Service_Impl extends BaseService implements Test_Service_Iface {

	@Resource
	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
	
	@Resource
	public ParamManager_Service_Iface paramManager_Service_Iface;
	
	
	@Override
	public AppDataModel getAll_Serviceproject() throws Exception {
		AppDataModel appDataModel = getAppDataModel();
		List ls = t_u_service_project_Dao_Iface.queryAll_t_u_service_project(new T_u_service_project());
		
		
		for(int i=0;i<ls.size();i++){
			T_u_service_project service_project = (T_u_service_project) ls.get(i);
			service_project.setFront_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getFront_picture());
			service_project.setTop_picture(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)+service_project.getTop_picture());
		}
		
		
		appDataModel.data.put("all_project_ls", ls);
		appDataModel.status = 0;
		appDataModel.message ="查询成功";
		return appDataModel;
	}

}
