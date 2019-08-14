package com.ccunix.ihousekeeping.parammanager.service;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.T_s_system_param;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;



public interface ParamManager_Service_Iface {
public List queryAllParam() throws Exception ;
	
	public String updateParam(T_s_system_param t_s_system_param) throws Exception ;
	
	public String insertParam(T_s_system_param t_s_system_param) throws Exception ;
	
	public String deleteParam(T_s_system_param t_s_system_param) throws Exception ;
	
	public T_s_system_param queryOneParam(T_s_system_param t_s_system_param) throws Exception ;
	
	//-------------从MAP中操作
	
	public String getSystemParam(SystemParam.SYSPARM name) throws Exception;
	
	public void setSystemParam(SystemParam.SYSPARM name,String value) throws Exception;
	
	public int initSystemParam() throws Exception;
	
	
	
	
 
}
