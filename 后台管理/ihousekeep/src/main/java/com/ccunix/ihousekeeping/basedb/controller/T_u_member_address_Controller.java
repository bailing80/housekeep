package com.ccunix.ihousekeeping.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.T_u_member_address;
import com.ccunix.ihousekeeping.basedb.service.T_u_member_address_Service_Iface;
@Controller
@RequestMapping("T_u_member_address_Controller")
public class T_u_member_address_Controller extends BaseMultiController {
@Resource
public T_u_member_address_Service_Iface t_u_member_address_service_iface;







}