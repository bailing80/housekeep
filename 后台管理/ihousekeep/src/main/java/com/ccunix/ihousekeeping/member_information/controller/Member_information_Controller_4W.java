package com.ccunix.ihousekeeping.member_information.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.member_information.domain.Member_information;
import com.ccunix.ihousekeeping.member_information.service.Member_information_Service_Iface;

/**
 * @ClassName: Member_information_Controller_4W
 * @author 肖云鹏
 * @date 2019年7月18日 下午2:51:23
 * 
 */
@Controller
@RequestMapping("Member_information_Controller_4W")
public class Member_information_Controller_4W extends BaseMultiController {

	@Resource
	Member_information_Service_Iface member_information_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	/**
	 * 
	 * <p>
	 * Title: query_all_member_information
	 * </p>
	 * <p>
	 * Description:查询全部信息
	 * </p>
	 * 
	 * @param member_information
	 * @return
	 */
	@RequestMapping("query_all_member_information")
	@ResponseBody
	public List query_all_member_information(Member_information member_information) {
		List ls = null;
		try {
			ls = member_information_Service_Iface.query_all_member_information(member_information);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

}
