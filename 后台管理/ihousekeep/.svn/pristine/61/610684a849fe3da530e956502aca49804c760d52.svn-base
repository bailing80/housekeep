package com.ccunix.ihousekeeping.rider.controller;
 
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.service.T_u_rider_Service_Iface;
import com.ccunix.ihousekeeping.rider.domain.Rider;
import com.ccunix.ihousekeeping.rider.service.Rider_Service_Iface;

@Controller
@RequestMapping("Rider_Controller_4W")
public class Rider_Controller_4W extends BaseMultiController {

	@Resource
	T_u_rider_Service_Iface t_u_rider_Service_Iface;
	
	@Resource
	Rider_Service_Iface rider_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	/**
	 *  查询骑手表数据
	 * @param advertisement_Manager
	 * @return
	 */
	@RequestMapping("query_all_t_u_rider")
	@ResponseBody
	public List query_all_t_u_rider(Rider rider) {
		List ls = null;
		try {
			ls = rider_Service_Iface.queryAll_rider(rider);
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	
	
}
