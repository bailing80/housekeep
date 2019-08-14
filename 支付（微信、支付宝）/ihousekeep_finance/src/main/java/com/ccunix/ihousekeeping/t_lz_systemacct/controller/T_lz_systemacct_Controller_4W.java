package com.ccunix.ihousekeeping.t_lz_systemacct.controller;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.t_lz_systemacct.domain.T_lz_systemacct_r;
import com.ccunix.ihousekeeping.t_lz_systemacct.service.T_lz_systemacct_Service_Iface_r;
@Controller
@RequestMapping("T_lz_systemacct_Controller_4W")
public class T_lz_systemacct_Controller_4W extends BaseMultiController {
@Resource
public T_lz_systemacct_Service_Iface_r t_lz_systemacct_service_iface;

@Resource
PageServiceIface pageServiceIface;

@RequestMapping("queryAllsystemacct")
@ResponseBody
public List queryAllsystemacct(T_lz_systemacct_r t_lz_systemacct) {
	List ls = null;
	try {
		ls = t_lz_systemacct_service_iface.queryAll_t_lz_systemacct(t_lz_systemacct);
		PageModel model = pageServiceIface.setPageData(request, ls);
		return pageServiceIface.getNowPageData(request, model);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return ls;
}

@RequestMapping("add_systemacct")
@ResponseBody
public void add_systemacct(T_lz_systemacct_r t_lz_systemacct) {
	try {
		t_lz_systemacct.setId(UUID_Tools.getUUID());
		t_lz_systemacct_service_iface.insert_t_lz_systemacct(t_lz_systemacct);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


@RequestMapping("delete_systemacct")
@ResponseBody
public void delete_systemacct(T_lz_systemacct_r t_lz_systemacct){
	try {
		t_lz_systemacct_service_iface.delete_t_lz_systemacct(t_lz_systemacct);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

/**
 * 更新单条数据
 */

@RequestMapping("update_systemacct_By_Id")
@ResponseBody
public void update_systemacct_By_Id(T_lz_systemacct_r t_lz_systemacct){
	try {
	t_lz_systemacct_service_iface.update_t_lz_systemacct(t_lz_systemacct);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
/**
 * 通过ID查出指定行数据
 * @return
 */
@RequestMapping("query_systemacct_By_Id")
@ResponseBody
public List query_systemacct_By_Id(T_lz_systemacct_r t_lz_systemacct){
	List ls = null;
	try {
		ls = t_lz_systemacct_service_iface.queryAll_t_lz_systemacct(t_lz_systemacct);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ls;
}
}