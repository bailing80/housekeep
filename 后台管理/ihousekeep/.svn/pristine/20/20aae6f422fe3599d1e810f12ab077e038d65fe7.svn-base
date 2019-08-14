package com.ccunix.ihousekeeping.login.controller;
 
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.basedb.service.T_u_manager_Service_Iface;
import com.ccunix.ihousekeeping.login.domain.Login;
import com.ccunix.ihousekeeping.login.service.Login_Service_Iface;

@Controller
@RequestMapping("Login_Controller_4W")
public class Login_Controller_4W extends BaseMultiController {

	@Resource
	T_u_manager_Service_Iface t_u_manager_Service_Iface;
	
	@Resource
	Login_Service_Iface login_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	/**
	 *  查询广告管理表数据
	 * @param advertisement_Manager
	 * @return
	 */
	@RequestMapping("query_all_t_u_login")
	@ResponseBody
	public List query_all_t_u_login(Login login) {
		List ls = null;
		try {
			ls = login_Service_Iface.queryAll_login(login);
			if (ls.size()>0) {
				request.getSession().setAttribute("admin", ls.get(0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	/**
	 *  跳转登陆页
	 * @param login
	 * @return
	 */
	@RequestMapping("login")
	public ModelAndView login() {
		return new ModelAndView("main/login/Login");
	}
	
	/**
	 *  跳转首页
	 * @param login
	 * @return
	 */
	@RequestMapping("index")
	public ModelAndView index() {
		System.out.println("indexindexindex");
		return new ModelAndView("main/index/dxjz_index");
		//return new ModelAndView("forward:/backset/dxjz_index.jsp");
	}
	
	
	
}
