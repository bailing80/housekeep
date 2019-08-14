package com.ccunix.ihousekeeping.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ccunix.ihousekeeping.base.domain.PageModel;

public interface PageServiceIface {
	
	public PageModel setPageData(HttpServletRequest request,List ls);
	
	public List getNowPageData(HttpServletRequest request, PageModel model);
	
	public PageModel getPageModel(HttpServletRequest request);

}
