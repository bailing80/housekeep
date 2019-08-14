package com.ccunix.ihousekeeping.coupon_type.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import com.ccunix.ihousekeeping.basedb.service.T_u_coupon_type_Service_Iface;
import com.ccunix.ihousekeeping.coupon_type.domain.Coupon_type;
import com.ccunix.ihousekeeping.coupon_type.service.Coupon_type_Service_Iface;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;

/**
 * 
 * @ClassName: Coupon_type_Controller_4W
 * @author 肖云鹏
 * @date 2019年7月23日 上午8:17:54
 *
 */
@Controller
@RequestMapping("Coupon_type_Controller_4W")
public class Coupon_type_Controller_4W extends BaseMultiController {
	@Resource
	Coupon_type_Service_Iface coupon_type_Service_Iface;

	@Resource
	T_u_coupon_type_Service_Iface t_u_coupon_type_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	// 查询数据
	@RequestMapping("queryAll_coupon_type")
	@ResponseBody
	public List queryAll_coupon_type(Coupon_type coupon_type) {
		List ls = null;
		try {
			ls = coupon_type_Service_Iface.queryAll_coupon_type(coupon_type);
			for (int i = 0; i < ls.size(); i++) {
				T_u_coupon_type t_u_coupon_type = (T_u_coupon_type) ls.get(i);
				t_u_coupon_type
						.setBack_pic(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
								+ t_u_coupon_type.getBack_pic());
			}
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	// 删除数据
	@RequestMapping("delete_coupon_type_manager")
	@ResponseBody
	public void delete_coupon_type_manager(T_u_coupon_type t_u_coupon_type) {
		try {
			t_u_coupon_type_Service_Iface.delete_t_u_coupon_type(t_u_coupon_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 批量删除
	@RequestMapping("delete_all_coupon_type")
	@ResponseBody
	public void delete_all_coupon_type(T_u_coupon_type t_u_coupon_type) {
		try {
			coupon_type_Service_Iface.delete_all_coupon_type(t_u_coupon_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 添加数据
	@RequestMapping("add_coupon_type_manager")
	@ResponseBody
	public void add_coupon_type_manager(T_u_coupon_type t_u_coupon_type) {
		try {

			t_u_coupon_type.setId(UUID_Tools.getUUID());
			t_u_coupon_type_Service_Iface.insert_t_u_coupon_type(t_u_coupon_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 通过Id查询
	@RequestMapping("query_coupon_type_By_Id")
	@ResponseBody
	public List query_coupon_type_By_Id(T_u_coupon_type t_u_coupon_type) {
		List ls = null;
		try {
			ls = t_u_coupon_type_Service_Iface.queryAll_t_u_coupon_type(t_u_coupon_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

	// 通过ID修改
	@RequestMapping("update_coupon_type_By_Id")
	@ResponseBody
	public void update_coupon_type_By_Id(T_u_coupon_type t_u_coupon_type) {
		try {
			t_u_coupon_type_Service_Iface.update_t_u_coupon_type(t_u_coupon_type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
