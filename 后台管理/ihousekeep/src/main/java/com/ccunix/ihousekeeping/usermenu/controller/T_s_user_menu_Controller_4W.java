package com.ccunix.ihousekeeping.usermenu.controller;
import java.util.List;

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
import com.ccunix.ihousekeeping.basedb.domain.Test;
import com.ccunix.ihousekeeping.unit.domain.T_s_unit_r;
import com.ccunix.ihousekeeping.usermenu.domain.T_s_user_menu_r;
import com.ccunix.ihousekeeping.usermenu.service.T_s_user_menu_Service_Iface_r;
@Controller
@RequestMapping("T_s_user_menu_Controller_4W")
public class T_s_user_menu_Controller_4W extends BaseMultiController {
@Resource
public T_s_user_menu_Service_Iface_r t_s_user_menu_service_iface;
@Resource
PageServiceIface pageServiceIface;

@RequestMapping("update_t_s_user_menu")
@ResponseBody
public void update_t_s_user_menu(T_s_user_menu_r t_s_user_menu) {
	try {
		//t_s_user_menu.setId(UUID_Tools.getUUID());
		t_s_user_menu_service_iface.update_t_s_user_menu(t_s_user_menu);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	@RequestMapping("queryAll_t_s_user_menu")
	@ResponseBody
	public List queryAll_t_s_user_menu(T_s_user_menu_r t_s_user_menu){
		System.out.println(((T_s_user_menu_r)t_s_user_menu).getKeyword()+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		List ls = null;
		try {
			ls = t_s_user_menu_service_iface.queryAll_t_s_user_menu(t_s_user_menu);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
		
		
	}
	@RequestMapping("add_t_s_user_menu")
	@ResponseBody
	public void add_t_s_user_menu(T_s_user_menu_r test) {
		try {
			test.setId(UUID_Tools.getUUID());
			t_s_user_menu_service_iface.insert_t_s_user_menu(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("delete_t_s_user_menu")
	@ResponseBody
	public void delete_t_s_user_menu(T_s_user_menu_r t_s_user_menu) {
		System.out.println(1213321);
		System.out.println(t_s_user_menu.getId()+"idididid");
		try {
			t_s_user_menu_service_iface.delete_t_s_user_menu(t_s_user_menu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		@RequestMapping("delete_all_t_s_user_menu")
		@ResponseBody
		public void delete_all_t_s_advertisement_manager(T_s_user_menu_r t_s_user_menu) {
			try {
				t_s_user_menu_service_iface.delete_all_t_s_user_menu(t_s_user_menu);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}