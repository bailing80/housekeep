package com.ccunix.ihousekeeping.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface ExcelServiceIface {
	
	public void setExcelSession(List<Object> ls,String[] title,String[] attrs,HttpServletRequest request);

}
