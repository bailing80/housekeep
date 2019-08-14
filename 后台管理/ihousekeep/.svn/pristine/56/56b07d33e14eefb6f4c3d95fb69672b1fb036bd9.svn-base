package com.ccunix.ihousekeeping.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ccunix.ihousekeeping.base.util.ExcelUtil;

@Controller
@RequestMapping("/ExcelController")
public class ExcelController extends BaseMultiController {

	public static String ExcelFileSession_data = "ExcelFileSession_data";
	public static String ExcelFileSession_title = "ExcelFileSession_title";

	public void setExcelSession(List<Object> ls, String[] title) {
		request.getSession(true).setAttribute(ExcelFileSession_data, ls);
		request.getSession(true).setAttribute(ExcelFileSession_title, title);
	}

	@RequestMapping("doExcel")
	public void doExcel(HttpServletResponse response) {
		
		List ls = (List) request.getSession().getAttribute(ExcelFileSession_data);
		String[] title = (String[]) request.getSession().getAttribute(ExcelFileSession_title);
		try {
			ExcelUtil.createExcel(response, "东学数据", "东学数据", title, ls);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
