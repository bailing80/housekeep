package com.ccunix.ihousekeeping.parammanager.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.basedb.dao.T_s_system_param_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_system_param;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;



@Service
@Transactional
public class ParamManager_Service_Impl implements ParamManager_Service_Iface {

	@Resource
	T_s_system_param_Dao_Iface t_s_system_param_Dao_Iface;
	
	
	public static Map SYSTEM_PARAM_MAP = new HashMap();
	// 查询所有系统变量
	@Override
	public List queryAllParam() throws Exception {
		List ParamList = new ArrayList();
		T_s_system_param param=new T_s_system_param();
		
		ParamList = t_s_system_param_Dao_Iface.queryAll_t_s_system_param(param);
		if(ParamList!=null){
			for(int i=0;i<ParamList.size();i++){
				param = (T_s_system_param) ParamList.get(i);
				param.setNum(i+1);
			}
		}
		return ParamList;
	}

	// 修改系统变量
	@Override
	public String updateParam(T_s_system_param t_s_system_param) throws Exception {
		t_s_system_param_Dao_Iface.update_t_s_system_param(t_s_system_param);
		SYSTEM_PARAM_MAP.put(t_s_system_param.getS_key(), t_s_system_param.getS_value());
		return "修改成功";
	}

	// 添加系统变量
	@Override
	public String insertParam(T_s_system_param t_s_system_param) throws Exception {
		t_s_system_param_Dao_Iface.insert_t_s_system_param(t_s_system_param);
		
		return "添加成功";
	}

	// 删除系统变量
	@Override
	public String deleteParam(T_s_system_param t_s_system_param) throws Exception {
		t_s_system_param_Dao_Iface.delete_t_s_system_param(t_s_system_param);
		return "删除成功";
	}

	// 查询单条记录
	@Override
	public T_s_system_param queryOneParam(T_s_system_param t_s_system_param) throws Exception {
		T_s_system_param t_s_system_param_receive = new T_s_system_param();
		t_s_system_param_receive = (T_s_system_param) t_s_system_param_Dao_Iface.queryAll_t_s_system_param(t_s_system_param).get(0);
		return t_s_system_param_receive;
	}
	//-----------------------从MAP中操作---------------------------------------------------
	
	


	@Override
	public String getSystemParam(SystemParam.SYSPARM name) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("*****"+name);
		return SYSTEM_PARAM_MAP.get(name.toString()).toString();
	}

	@Override
	public void setSystemParam(SystemParam.SYSPARM name, String value) throws Exception {
		SYSTEM_PARAM_MAP.put(name, value);
	}

	@Override
	public int initSystemParam() throws Exception {
		List<T_s_system_param> ls = queryAllParam();
		SYSTEM_PARAM_MAP.clear();
		for(int i=0;i<ls.size();i++){
			T_s_system_param t =ls.get(i);
			SYSTEM_PARAM_MAP.put(t.getS_key(), t.getS_value());
		}
		return ls.size();
	}

	

}
