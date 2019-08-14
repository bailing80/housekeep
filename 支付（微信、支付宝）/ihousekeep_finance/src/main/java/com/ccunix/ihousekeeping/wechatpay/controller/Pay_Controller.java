package com.ccunix.ihousekeeping.wechatpay.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.wechatpay.domain.WxOa;
import com.ccunix.ihousekeeping.wechatpay.domain.WxPayOa;
import com.ccunix.ihousekeeping.wechatpay.service.UUID_Tools;
import com.ccunix.ihousekeeping.wechatpay.service.WxSignUtil;

/**
 * 
 * @ClassName: Pay_Controller
 * @author 肖云鹏
 * @date 2019年8月12日 上午9:57:46
 *
 */

@Controller
@RequestMapping("Pay_Controller")
public class Pay_Controller extends BaseMultiController {

	WxSignUtil wxSignUtil = new WxSignUtil();

	// 微信预下单交易
	@ResponseBody
	@RequestMapping("/yuxiadan")
	public Map yuxiadan(WxPayOa wxPayOa) throws Exception {

		WxOa wxOa = new WxOa();
		// 应用ID
		wxOa.setAppid("wx79be80c19b14c37e");
		// 商户号
		wxOa.setMch_id("1512285851");
		// 随机字符串 不长于32位
		wxOa.setNonce_str(UUID_Tools.getUUID());
		// 商品描述
		wxOa.setBody(wxPayOa.getwIDbody());
		// 商户订单号
		wxOa.setOut_trade_no(wxPayOa.getwIDout_trade_no());
		// 订单总金额，单位为分
		wxOa.setTotal_fee(wxPayOa.getwIDtotal_amount() * 100);
		// 终端IP
		wxOa.setSpbill_create_ip("127.0.0.1");
		// 通知地址
		wxOa.setNotify_url(wxSignUtil.unifiedorderUrl);
		// 交易类型 APP
		wxOa.setTrade_type("NATIVE");
		// 将数据放入map中
		Map map = wxSignUtil.WxMd5Sign(wxOa, "9dffe0f7a65bb1976d4b33d7a8b1f7ac");

		return map;
	}

}
