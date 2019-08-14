package com.ccunix.ihousekeeping.saler.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_lz_receive_type;
import com.ccunix.ihousekeeping.basedb.service.T_lz_receive_type_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.T_lz_saler_Service_Iface;
import com.ccunix.ihousekeeping.saler.domain.Saler;
import com.ccunix.ihousekeeping.saler.service.Saler_Service_Iface;

@Controller
@RequestMapping("Saler_Controller_4W")
public class Saler_Controller_4W extends BaseMultiController {
	
	@Resource
	T_lz_receive_type_Service_Iface t_lz_receive_type_Service_Iface;

	@Resource
	T_lz_saler_Service_Iface t_lz_saler_Service_Iface;
	
	@Resource
	Saler_Service_Iface saler_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;
	
	/**
	 *  查询数据
	 * @param saler
	 * @return
	 */
	@RequestMapping("queryAll_saler")
	@ResponseBody
	public List queryAll_saler(Saler saler) {
		List ls = null;
		try {
			ls = saler_Service_Iface.queryAll_saler(saler);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	/**
	 *  新增数据
	 * @param saler
	 * @return
	 */
	@RequestMapping("add_saler")
	@ResponseBody
	public void add_saler(Saler saler) {
		try {
			saler.setId(UUID_Tools.getUUID());
			t_lz_saler_Service_Iface.insert_t_lz_saler(saler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  删除数据
	 * @param saler
	 * @return
	 */
	@RequestMapping("delete_saler")
	@ResponseBody
	public void delete_saler(Saler saler){
		try {
			t_lz_saler_Service_Iface.delete_t_lz_saler(saler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  批量删除数据
	 * @param saler
	 * @return
	 */
	@RequestMapping("delete_batch_saler")
	@ResponseBody
	public void delete_batch_saler(Saler saler){
		try {
			saler_Service_Iface.delete_batch_saler(saler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 编辑数据
	 * @param saler
	 */
	
	@RequestMapping("edit_saler")
	@ResponseBody
	public void edit_saler(Saler saler){
		try {
			saler_Service_Iface.edit_saler(saler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 显示数据
	 * @param saler
	 */
	
	@RequestMapping("show_saler")
	@ResponseBody
	public List show_saler(Saler saler){
			try {
				return saler_Service_Iface.show_saler(saler);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	/**
	 * 查询收款方式
	 * @param t_lz_receive_type
	 */
	
	@RequestMapping("queryAll_receive_type")
	@ResponseBody
	public List queryAll_receive_type(T_lz_receive_type t_lz_receive_type){
		try {
			return t_lz_receive_type_Service_Iface.queryAll_t_lz_receive_type(t_lz_receive_type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
