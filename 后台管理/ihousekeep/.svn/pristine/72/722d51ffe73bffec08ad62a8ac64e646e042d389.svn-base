package com.ccunix.ihousekeeping.serviceitem.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_unit_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_item_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_unit;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_item;
import com.ccunix.ihousekeeping.serviceitem.dao.ServiceItem_Dao_Ifae;
import com.ccunix.ihousekeeping.serviceitem.domain.ServiceItem_lowerlevelbean;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ServiceItem_Service_Impl extends BaseService implements ServiceItem_Service_Iface {
	//批量删除 
		@Resource
		T_u_service_item_Dao_Iface t_u_service_item_Dao_Iface;
		@Resource
		ServiceItem_Dao_Ifae serviceItem_Dao_Ifae;
		@Resource
		T_s_unit_Dao_Iface t_s_unit_Dao_Iface;
		

		@Override
		public List query_all__Serviceiteam_lowerlevel(ServiceItem_lowerlevelbean serviceItem_lowerlevelbean) throws Exception {
			List ls =serviceItem_Dao_Ifae.queryAll_Serviceiteam_lowerlevel(serviceItem_lowerlevelbean );
			for (int i = 0; i < ls.size(); i++) {
				ServiceItem_lowerlevelbean serviceItem_bean = (ServiceItem_lowerlevelbean)ls.get(i);
				T_s_unit t_s_unit = new T_s_unit();
				t_s_unit.setId(serviceItem_bean.getUnit_id());
				serviceItem_bean.setUnit_name(((T_s_unit)t_s_unit_Dao_Iface.queryAll_t_s_unit(t_s_unit).get(0)).getUnit_name());
			}
			
			return ls;
		
		}
	@Override
	public void delete_Serviceiteam_lowerlevel(T_u_service_item t_u_service_item) {
		String[]  ids = t_u_service_item.getId().split(",");
		try{
			for (String string : ids) {
				T_u_service_item service_item =new T_u_service_item();
				service_item.setId(string);
				t_u_service_item_Dao_Iface.delete_t_u_service_item(service_item);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
