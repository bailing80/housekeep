package com.ccunix.ihousekeeping.receive_acct.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.service.T_lz_receive_acct_Service_Iface;
import com.ccunix.ihousekeeping.receive_acct.domain.Receive_acct;
import com.ccunix.ihousekeeping.receive_acct.service.Receive_acct_Service_Iface;

@Controller
@RequestMapping("Receive_acct_Controller_4W")
public class Receive_acct_Controller_4W extends BaseMultiController {

	@Resource
	T_lz_receive_acct_Service_Iface t_lz_receive_acct_Service_Iface;
	
	@Resource
	Receive_acct_Service_Iface receive_acct_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;
	
	/**
	 *  查询数据
	 * @param receive_acct
	 * @return
	 */
	@RequestMapping("queryAll_receive_acct")
	@ResponseBody
	public List queryAll_receive_acct(Receive_acct receive_acct) {
		List ls = null;
		try {
			ls = receive_acct_Service_Iface.queryAll_receive_acct(receive_acct);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	/**
	 *  新增数据
	 * @param receive_acct
	 * @return
	 */
	@RequestMapping("add_receive_acct")
	@ResponseBody
	public void add_receive_acct(Receive_acct receive_acct) {
		try {
			receive_acct.setId(UUID_Tools.getUUID());
			t_lz_receive_acct_Service_Iface.insert_t_lz_receive_acct(receive_acct);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  删除数据
	 * @param receive_acct
	 * @return
	 */
	@RequestMapping("delete_receive_acct")
	@ResponseBody
	public void delete_receive_acct(Receive_acct receive_acct){
		try {
			t_lz_receive_acct_Service_Iface.delete_t_lz_receive_acct(receive_acct);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  批量删除数据
	 * @param receive_acct
	 * @return
	 */
	@RequestMapping("delete_batch_receive_acct")
	@ResponseBody
	public void delete_batch_receive_acct(Receive_acct receive_acct){
		try {
			receive_acct_Service_Iface.delete_batch_receive_acct(receive_acct);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 编辑数据
	 * @param receive_acct
	 */
	
	@RequestMapping("edit_receive_acct")
	@ResponseBody
	public void edit_receive_acct(Receive_acct receive_acct){
		try {
			receive_acct_Service_Iface.edit_receive_acct(receive_acct);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 显示数据
	 * @param receive_acct
	 */
	
	@RequestMapping("show_receive_acct")
	@ResponseBody
	public List show_receive_acct(Receive_acct receive_acct){
			try {
				return receive_acct_Service_Iface.show_receive_acct(receive_acct);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
}
