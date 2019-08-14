package com.ccunix.ihousekeeping.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.PageModel;

@Service("activity_PageService")
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class) 
public class PageServiceImpl implements PageServiceIface {

	public static final String pagemode="pagemode";
	public static final String pagedata="pagedata";
	
	public PageModel setPageData(HttpServletRequest request, List ls) {
		HttpSession httpSession = request.getSession();
		PageModel model = new PageModel();
		model.setNowpage(1);
		model.setTotal_count(ls.size());
		//锟�?澶ч〉
		if(ls.size() % model.getPagesize() == 0){
			model.setMaxpage(ls.size()/model.getPagesize());
		}else{
			model.setMaxpage(ls.size()/model.getPagesize()+1);
		}
		httpSession.setAttribute(pagemode, model);
		httpSession.setAttribute(pagedata, ls);
		return model;
	}
	
	public List getNowPageData(HttpServletRequest request, PageModel model){
		HttpSession httpSession = request.getSession();
		List ls = (List) httpSession.getAttribute(pagedata);
		List result = new ArrayList();
		for(int i=(model.getNowpage()-1)*model.getPagesize();i<ls.size()&& i<model.getNowpage()*model.getPagesize();i++){
			result.add(ls.get(i));
		}
		return result;
	}

	public PageModel getPageModel(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		PageModel model =(PageModel) httpSession.getAttribute(pagemode);
		return model;
	}
	
	

	

}
