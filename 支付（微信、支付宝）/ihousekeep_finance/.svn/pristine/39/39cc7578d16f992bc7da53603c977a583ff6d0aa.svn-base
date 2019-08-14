package com.ccunix.ihousekeeping.base.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baidu.aip.ocr.AipOcr;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.util.HttpUtil;

/**
 * 车牌识别
 * @author Administrator
 *
 */

@Controller
@RequestMapping("CarIDScanController")
public class CarIDScanController extends BaseMultiController{
	
	//你的 App ID
	public static final String APP_ID = "15381124";
	//你的 Api Key
	public static final String API_KEY = "QIjrjxvstwAu7GGarY9EpVMd";
	//你的 Secret Key
	public static final String SECRET_KEY = "OHa8ZDei9njuKGu7cusT8xVO2ENB06yI";
	
	    
	    
	    
	private AipOcr getAipOcr() {
		// 初始化一个AipOcr
	    AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
	    // 可选：设置网络连接参数
	    client.setConnectionTimeoutInMillis(2000);
	    client.setSocketTimeoutInMillis(60000);
		return client;
	}
	
	
	//根据上传的图片 扫描车牌号
	@RequestMapping(value = "/carIduploadGetNumber", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec upload(HttpServletRequest request, @RequestParam("file") MultipartFile file)
			throws Exception {
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {
			Map data = new HashMap();
			//如果图片不为空
			if (!file.isEmpty()) {
				AipOcr client=getAipOcr();
				 // 传入可选参数调用接口
			    HashMap<String, String> options = new HashMap<String, String>();
			    options.put("multi_detect", "true");
//			    {"log_id":3478784452839305451,"error_msg":"recognize plate number error","error_code":282103}
			    //{"log_id":5447996057478465835,"words_result":[{"number":"浙B999AA","vertexes_location":[{"x":184,"y":171},{"x":352,"y":170},{"x":353,"y":219},{"x":185,"y":220}],"color":"blue","probability":[1,0.9999943971633911,0.9999891519546509,0.9999793767929077,0.9999712705612183,0.9998180866241455,0.9998091459274292]}]}
			    byte[] fileByte = file.getBytes();
			    org.json.JSONObject res = client.plateLicense(fileByte, options);
			    
			    String errorcode="";
			    if(res.has("error_code")){
			    	errorcode=res.getString("error_code");
			    }
			    if(errorcode!=null&&!errorcode.equals("")){
					data.put("statue", 0);
					data.put("message", "车牌错误");
					k.setData(data);
					k.setMessage("执行成功");
					k.setStatus(1);
			    }else{
			    	String carNumber="";
			    	JSONArray carNumbers=res.getJSONArray("words_result");
			    	for (int i = 0; i < carNumbers.length(); i++) {
			    		JSONObject number=carNumbers.getJSONObject(i);
			    		if(carNumber.equals("")){
			    			carNumber=number.getString("number");
			    		}else{
			    			carNumber=","+number.getString("number");
			    		}
					}
					data.put("carNumber", carNumber);
					data.put("statue", 1);
					data.put("message", "识别成功");
					k.setData(data);
					k.setMessage("执行成功");
					k.setStatus(1);
			    }

			} else {
				k.setStatus(1);
				data.put("statue", 0);
				data.put("message", "图片为空！");
				k.setData(data);
				k.setMessage("执行成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}
	
	
	public static void main(String[] args) {
		HttpUtil httpUtil = new HttpUtil();
		
	} 

}
