package com.ccunix.ihousekeeping.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.PageModel;
import com.ccunix.ihousekeeping.base.service.ExcelServiceIface;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.Test;
import com.ccunix.ihousekeeping.basedb.service.Test_Service_Iface;

@Controller
@RequestMapping("Test_Controller_4W")
public class Test_Controller_4W extends BaseMultiController {

	@Resource
	Test_Service_Iface test_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;
	
	
	@Resource
	ExcelServiceIface excelserviceiface;

	@RequestMapping("queryAllTest")
	@ResponseBody
	public List queryAllTest() {
		List ls = null;
		try {
			ls = test_Service_Iface.queryAll_test(new Test());
			
			
			excelserviceiface.setExcelSession(ls,
					new String[] { "姓名", "年龄", "身高"},
					new String[] { "name", "age", "height" },
					request);
			
			
			PageModel model = pageServiceIface.setPageData(request, ls);
			return pageServiceIface.getNowPageData(request, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	@RequestMapping("add_test")
	@ResponseBody
	public void add_test(Test test) {
		try {
			test.setId(UUID_Tools.getUUID());
			test_Service_Iface.insert_test(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("delete_test")
	@ResponseBody
	public void delete_test(Test test){
		try {
			test_Service_Iface.delete_test(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
