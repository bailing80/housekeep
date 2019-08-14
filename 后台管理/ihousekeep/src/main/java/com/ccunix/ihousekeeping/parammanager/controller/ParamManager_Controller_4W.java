package com.ccunix.ihousekeeping.parammanager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_s_system_param;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;

@Controller
@RequestMapping("/ParamManager_Controller_4W")
public class ParamManager_Controller_4W  extends BaseMultiController {
	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface ;
	@Resource
	PageServiceIface pageServiceIface;
	
	@RequestMapping("queryAllParam")
	@ResponseBody
	public List queryAllParam(){
		List paramList=null;
		try {
			paramList = paramManager_Service_Iface.queryAllParam();
			PageModel model = pageServiceIface.setPageData(request, paramList);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return paramList;
	}
	
	@RequestMapping("queryOneParam")
	@ResponseBody
	public T_s_system_param queryOneParam(T_s_system_param t_s_system_param){
		T_s_system_param t_s_system_param1 = new T_s_system_param();
		 try {
			 t_s_system_param1 = paramManager_Service_Iface.queryOneParam(t_s_system_param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t_s_system_param1;
		
	}
	
	@RequestMapping("updateParam")
	@ResponseBody
	public String updateParam(T_s_system_param t_s_system_param){
		String message="修改失败";
		 try {
			 message =	paramManager_Service_Iface.updateParam(t_s_system_param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
		
	}
	
	@RequestMapping("deleteparam")
	@ResponseBody
	public String deleteparam(T_s_system_param t_s_system_param){
		String message="删除失败";
		 try {
			 message =	paramManager_Service_Iface.deleteParam(t_s_system_param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
		
	}
	
	@RequestMapping("addparam")
	@ResponseBody
	public String addparam(T_s_system_param t_s_system_param){
		String message="添加失败";
		 try {
			 t_s_system_param.setId(UUID_Tools.getUUID());
			 message =	paramManager_Service_Iface.insertParam(t_s_system_param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
		
	}
	
	
	
}
