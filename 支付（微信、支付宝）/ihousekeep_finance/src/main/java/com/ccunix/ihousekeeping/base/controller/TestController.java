package com.ccunix.ihousekeeping.base.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.service.TestService_Iface;

@Controller
@RequestMapping("testaattcontroller")
public class TestController {

	@Resource
	TestService_Iface testService_Iface;

	@RequestMapping("test")
	@ResponseBody
	public String test() {
		System.out.println("test aa tt controller ..........");
		try {
			testService_Iface.hello_test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "test ok";
	}

	@RequestMapping("query")
	@ResponseBody
	public List query() {
		try {
			return testService_Iface.query1and2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
