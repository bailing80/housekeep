package com.ccunix.ihousekeeping.unit.controller;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.unit.domain.T_s_unit_r;
import com.ccunix.ihousekeeping.unit.service.T_s_unit_Service_Iface_r;
@Controller
@RequestMapping("T_s_unit_Controller_4W")
public class T_s_unit_Controller_4W extends BaseMultiController {
@Resource
T_s_unit_Service_Iface_r t_s_unit_service_iface;
@Resource
PageServiceIface pageServiceIface;



@RequestMapping("query_all_unit")
@ResponseBody
public List query_all_unit(T_s_unit_r t_s_unit){
	List ls = null;
	try {
		ls = t_s_unit_service_iface.queryAll_t_s_unit(t_s_unit);
		PageModel model = pageServiceIface.setPageData(request, ls);
		return pageServiceIface.getNowPageData(request, model);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ls;
}

@RequestMapping("delete_t_s_unit")
@ResponseBody
public void delete_t_s_unit(T_s_unit_r t_s_unit){
	try {
		t_s_unit_service_iface.delete_t_s_unit(t_s_unit);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@RequestMapping("add_t_s_unit")
@ResponseBody
public void add_t_s_unit(T_s_unit_r t_s_unit){
	t_s_unit.setId(UUID_Tools.getUUID());
	try {
		t_s_unit_service_iface.insert_t_s_unit(t_s_unit);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@RequestMapping("update_unit")
@ResponseBody
public void update_unit(T_s_unit_r t_s_unit){
	try {
		t_s_unit_service_iface.update_t_s_unit(t_s_unit);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	@RequestMapping("delete_all_t_s_unit")
	@ResponseBody
	public void delete_all_t_s_unit(T_s_unit_r t_s_unit) {
		try {
		t_s_unit_service_iface.delete_all_t_s_unit(t_s_unit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("update_unit_By_Id")
	@ResponseBody
	public void update_unit_By_Id(T_s_unit_r t_s_unit){
		try {
		t_s_unit_service_iface.update_t_s_unit(t_s_unit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("query_unit_By_Id")
	@ResponseBody
	public List query_unit_By_Id(T_s_unit_r t_s_unit){
		List ls = null;
		try {
			ls = t_s_unit_service_iface.queryAll_t_s_unit(t_s_unit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
}