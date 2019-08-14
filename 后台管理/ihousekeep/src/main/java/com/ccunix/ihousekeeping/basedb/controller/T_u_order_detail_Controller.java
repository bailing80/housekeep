package com.ccunix.ihousekeeping.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order_detail;
import com.ccunix.ihousekeeping.basedb.service.T_u_order_detail_Service_Iface;
@Controller
@RequestMapping("T_u_order_detail_Controller")
public class T_u_order_detail_Controller extends BaseMultiController {
@Resource
public T_u_order_detail_Service_Iface t_u_order_detail_service_iface;







}