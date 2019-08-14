package com.ccunix.ihousekeeping.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Test;
import com.ccunix.ihousekeeping.basedb.service.Test_Service_Iface;
@Controller
@RequestMapping("Test_Controller")
public class Test_Controller extends BaseMultiController {
@Resource
public Test_Service_Iface test_service_iface;







}