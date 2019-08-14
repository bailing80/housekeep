package com.ccunix.ihousekeeping.receive_type.controller;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.receive_type.domain.T_lz_receive_type_r;
import com.ccunix.ihousekeeping.receive_type.service.T_lz_receive_type_Service_Iface_r;
@Controller
@RequestMapping("T_lz_receive_type_Controller_4W")
public class T_lz_receive_type_Controller_4W extends BaseMultiController {
@Resource
public T_lz_receive_type_Service_Iface_r t_lz_receive_type_service_iface;
@Resource
PageServiceIface pageServiceIface;

@RequestMapping("queryAllreceive_type")
@ResponseBody
public List queryAllreceive_type(T_lz_receive_type_r t_lz_receive_type) {
	List ls = null;
	try {
		ls = t_lz_receive_type_service_iface.queryAll_t_lz_receive_type(t_lz_receive_type);
		PageModel model = pageServiceIface.setPageData(request, ls);
		return pageServiceIface.getNowPageData(request, model);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return ls;
}






}