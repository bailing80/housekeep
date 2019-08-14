package com.ccunix.ihousekeeping.base.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;



@Controller
@RequestMapping("/PageController")
public class PageController extends BaseMultiController {
	
	@Resource
	PageServiceIface pageServiceIface;
	
	@RequestMapping(value = { "/queryData"}, method = { RequestMethod.POST })
	public List queryData(HttpRequest request,HttpServletResponse response){
		return null; 
	}
	
	@RequestMapping(value = { "/getPageModel"}, method = { RequestMethod.POST })
	@ResponseBody
	public PageModel getPageModel(HttpServletRequest request,HttpServletResponse response){
		return pageServiceIface.getPageModel(request); 
	}
	
	
	
	@RequestMapping(value = { "/getNowPageData"}, method = { RequestMethod.POST })
	@ResponseBody
	public List getNowPageData(HttpServletRequest request,HttpServletResponse response,PageModel model){
		PageModel pagemodel = getPageModel(request, response);
		pagemodel.setNowpage(model.getNowpage());
		return pageServiceIface.getNowPageData(request, pagemodel);
	}
	
	//������Ļ�ֱ�������pagesize
	@RequestMapping(value = { "/initPageScreen"}, method = { RequestMethod.GET })
	@ResponseBody
	public void initPageScreen(PageModel model){
		request.getSession().setAttribute("global_pagesize", model.getPagesize());
	}
	
	

}
