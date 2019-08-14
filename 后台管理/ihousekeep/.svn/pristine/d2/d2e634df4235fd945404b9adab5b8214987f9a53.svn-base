package com.ccunix.ihousekeeping.map.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.map.service.Excel_Import_Service_Iface;

@Controller
@RequestMapping("Excel_Import_Controller_4W")
public class Excel_Import_Controller_4W {
	
	
	@Resource
	Excel_Import_Service_Iface excel_Import_Service_Iface;
	
	@RequestMapping("importExcel")
	@ResponseBody
	public String importExcel(String excel_name){
		try {
			excel_Import_Service_Iface.import_excel(excel_name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ok";
	}

}
