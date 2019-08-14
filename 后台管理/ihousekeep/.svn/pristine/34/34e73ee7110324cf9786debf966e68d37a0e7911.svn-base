package com.ccunix.ihousekeeping.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.util.TokenUtil;

@Controller
@RequestMapping("/UtilController")
public class UtilController extends BaseMultiController {
	
	//@Resource
	TokenUtil tokenUtil = new TokenUtil();
	
	
	
//	@Resource
//	ParamManager_Service_Iface  paramManager_Service_Iface;
//	//token鑾峰彇
//	@RequestMapping("/getToken")
//	@ResponseBody
//	public String getToken(HttpServletRequest request, HttpServletResponse response){
//		return tokenUtil.getTokenString(request.getSession());
//	}
	
	@RequestMapping("/getSession")
	@ResponseBody
	public String getSession(HttpServletRequest request, HttpServletResponse response){
		return request.getSession().getId();
	}
	
//	/**
//	 * http鏍硅矾寰�(璧勬簮鍥剧墖)
//	 */
//	@RequestMapping("/getHttpBaseUrl")
//	@ResponseBody
//	public AppDataModel_Sec getHttpBaseUrl(){
//		AppDataModel appDataModel = new AppDataModel();
//		appDataModel.setMessage("鎴愬姛");
//		appDataModel.setStatus(1);
//		Map data = new HashMap();
//		try {
//			data.put("httpbaseurl",paramManager_Service_Iface.getSystemParam(SYSPARM.httpFileBasePath));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		appDataModel.setData(data);
//		return getAppDataMode_sec().setData(encodeURI(appDataModel));
//	}
	
	
	
	

}
