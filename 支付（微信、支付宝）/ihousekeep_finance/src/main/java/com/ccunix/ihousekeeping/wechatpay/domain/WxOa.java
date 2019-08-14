package com.ccunix.ihousekeeping.wechatpay.domain;

import java.io.Serializable;
import java.util.Date;

//微信预下单参数
public class WxOa implements Serializable {

	// 应用ID
	private String appid;
	// 商户号
	private String mch_id;
	// 设备号
	private String device_info;
	// 随机字符串 不长于32位
	private String nonce_str;
	// 商品描述
	private String body;
	// 附加数据
	private String attach;
	// 商户订单号
	private String out_trade_no;
	// 订单总金额，单位为分
	private int total_fee;
	// 终端IP
	private String spbill_create_ip;
	// 交易起始时间
	private Date time_start;
	// 交易结束时间
	private Date time_expire;
	// 通知地址
	private String notify_url;
	// 交易类型 APP
	private String trade_type;
	// openid
	private String openid;
	//code_url
	private String code_url;
	

	public String getCode_url() {
		return code_url;
	}

	public void setCode_url(String code_url) {
		this.code_url = code_url;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public int getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}

	public String getSpbill_create_ip() {
		return spbill_create_ip;
	}

	public void setSpbill_create_ip(String spbill_create_ip) {
		this.spbill_create_ip = spbill_create_ip;
	}

	public Date getTime_start() {
		return time_start;
	}

	public void setTime_start(Date time_start) {
		this.time_start = time_start;
	}

	public Date getTime_expire() {
		return time_expire;
	}

	public void setTime_expire(Date time_expire) {
		this.time_expire = time_expire;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

}
