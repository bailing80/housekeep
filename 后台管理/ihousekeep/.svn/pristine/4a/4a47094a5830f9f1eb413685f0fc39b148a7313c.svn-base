package com.ccunix.ihousekeeping.servicecontent.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_content_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_content;
import com.ccunix.ihousekeeping.servicecontent.dao.ServiceContent_Dao_Iface;
import com.ccunix.ihousekeeping.servicecontent.domain.ServiceContent_lowerlevelbeen;
import com.ccunix.ihousekeeping.servicecontent.domain.third_head_been;

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
	@Override
	public AppDataModel third_head(third_head_been third_head_been) throws Exception {
		AppDataModel appDataModel = getAppDataModel();

		ServiceContent_lowerlevelbeen been = new ServiceContent_lowerlevelbeen();
		List serviceContent_lowerlevelbeen = serviceContent_Dao_Iface.third_head(third_head_been);
		System.err.println(serviceContent_lowerlevelbeen.size()+"%%%%%%%&&&&&&&&&&&&");
		//for (int i = 0; i < serviceItem_lowerlevelbean.size(); i++) {
			//ServiceItem_lowerlevelbean h = (ServiceItem_lowerlevelbean) serviceItem_lowerlevelbean.get(i);
			//System.out.println("背景图片" + h.getBack_pic() + "类型名称" + h.getType_name() + "金额" + h.getMoney());
		//}
		appDataModel.data.put("project_content", serviceContent_lowerlevelbeen);

		return appDataModel;
	}


}
