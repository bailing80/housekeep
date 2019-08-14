package com.ccunix.ihousekeeping.servicecontent.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_content_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_content;
import com.ccunix.ihousekeeping.servicecontent.dao.ServiceContent_Dao_Iface;
import com.ccunix.ihousekeeping.servicecontent.domain.ServiceContent_lowerlevelbeen;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ServiceContent_Service_Impl extends BaseService implements ServiceContent_Service_Iface {
		@Resource
		T_u_service_content_Dao_Iface t_u_service_content_Dao_Iface;
		@Resource
		ServiceContent_Dao_Iface serviceContent_Dao_Iface;
	@Override
	public List query_all__Servicecontent_lowerlevel(ServiceContent_lowerlevelbeen serviceContent_lowerlevelbeen) {
	System.out.println(serviceContent_Dao_Iface.queryAll_Servicecontent_lowerlevel(serviceContent_lowerlevelbeen ).size()+"@@@@@@");
		return serviceContent_Dao_Iface.queryAll_Servicecontent_lowerlevel(serviceContent_lowerlevelbeen );
	}
	@Override
	public void delete_Servicecontent_lowerlevel(T_u_service_content t_u_service_content) {
		String[]  ids = t_u_service_content.getId().split(",");
		try{
			for (String string : ids) {
				T_u_service_content service_content =new T_u_service_content();
				service_content.setId(string);
				t_u_service_content_Dao_Iface.delete_t_u_service_content(service_content);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}


}
