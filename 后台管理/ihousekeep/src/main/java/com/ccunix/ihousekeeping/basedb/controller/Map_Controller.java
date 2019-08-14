package com.ccunix.ihousekeeping.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Map;
import com.ccunix.ihousekeeping.basedb.service.Map_Service_Iface;
@Controller
@RequestMapping("Map_Controller")
public class Map_Controller extends BaseMultiController {
@Resource
public Map_Service_Iface map_service_iface;







}