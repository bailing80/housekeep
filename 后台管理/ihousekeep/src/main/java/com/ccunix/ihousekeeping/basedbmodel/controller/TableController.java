package com.ccunix.ihousekeeping.basedbmodel.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.basedbmodel.domain.Table;
import com.ccunix.ihousekeeping.basedbmodel.service.Table_Service_Iface;


@Controller
@RequestMapping("TableController")
public class TableController {
	
	@Resource
	Table_Service_Iface tableservice_iface;
	
	
	@RequestMapping("queryAllTable")
	@ResponseBody
	public List<Table> queryAllTable(){
		try {
			List<Table> tables =tableservice_iface.queryAllTable();
			System.out.println("table number:"+tables.size());
			return tables;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("makeCode")
	@ResponseBody
	public String makeCode(String tablenames){
		String m="成功!";
		try {
			tableservice_iface.makecode(tablenames);
		} catch (Exception e) {
			m ="失败";
			e.printStackTrace();
		}
		return m;
	}

}
