package com.ccunix.ihousekeeping.wechatpay.service;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSONObject;
import com.ccunix.ihousekeeping.wechatpay.domain.WxOa;
import com.ccunix.ihousekeeping.wechatpay.domain.WxPayOa;

//微信签名
public class WxSignUtil {

	// 微信预下单 请求地址
	public static final String unifiedorderUrl = "https://api.mch.weixin.qq.com/pay/unifiedorder";

	// 微信申请退款请求地址
	public static final String callbackamounturl = "https://api.mch.weixin.qq.com/secapi/pay/refund";

	// 微信小程序统一下单地址
	public static final String smallprogramorderurl = "https://api.mch.weixin.qq.com/pay/unifiedorder";

	// 微信App支付预下单接口
	public static Map WxMd5Sign(WxOa wxOa, String key) throws Exception {
		String stringA = "appid=" + wxOa.getAppid() + "&attach=" + wxOa.getAttach() + "&body=" + wxOa.getBody()
				+ "&mch_id=" + wxOa.getMch_id() + "&nonce_str=" + wxOa.getNonce_str() + "&notify_url="
				+ wxOa.getNotify_url() + "&out_trade_no=" + wxOa.getOut_trade_no() + "&spbill_create_ip="
				+ wxOa.getSpbill_create_ip() + "&total_fee=" + wxOa.getTotal_fee() + "&trade_type="
				+ wxOa.getTrade_type();
		String stringSignTemp = stringA + "&key=" + key;
		String stringSignTemp1 = new String(stringSignTemp.getBytes("iso8859-1"));
		// String stringSignTemp1=new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();
		String par = "<xml>" + "<appid>" + wxOa.getAppid() + "</appid>" + "<attach>" + wxOa.getAttach() + "</attach>"
				+ "<body><![CDATA[" + wxOa.getBody() + "]]></body>" + "<mch_id>" + wxOa.getMch_id() + "</mch_id>"
				+ "<nonce_str>" + wxOa.getNonce_str() + "</nonce_str>" + "<notify_url>" + wxOa.getNotify_url()
				+ "</notify_url>" + "<out_trade_no>" + wxOa.getOut_trade_no() + "</out_trade_no>" + "<spbill_create_ip>"
				+ wxOa.getSpbill_create_ip() + "</spbill_create_ip>" + "<total_fee>" + wxOa.getTotal_fee()
				+ "</total_fee>" + "<trade_type>" + wxOa.getTrade_type() + "</trade_type>" + "<sign>" + sign + "</sign>"
				+ "</xml> ";

		String ret = WxSignUtil.post(unifiedorderUrl, par);
		System.out.println(ret);
		Map<String, String> map = readStringXmlOut(ret);
		return map;
	}

	// 调起支付加签
	public static String WxPrePaySign(WxPayOa wxPayOa, String key) throws Exception {
		// //应用ID
		// String appid="";
		// //随机字符串
		// String noncestr="";
		// //扩展字段
		// String packageace="";
		// //商户号
		// String partnerid="";
		// //预支付交易会话ID
		// String prepayid="";
		// //时间戳
		// String timestamp="";
		String stringA = "appid=" + wxPayOa.getAppid() + "&noncestr=" + wxPayOa.getNoncestr() + "&package="
				+ wxPayOa.getPackageace() + "&partnerid=" + wxPayOa.getPartnerid() + "&prepayid="
				+ wxPayOa.getPrepayid() + "&timestamp=" + wxPayOa.getTimestamp();
		String stringSignTemp = stringA + "&key=" + key;
		String stringSignTemp1 = new String(stringSignTemp.getBytes("iso8859-1"));
		// String stringSignTemp1=new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();
		return sign;
	}

	/**
	 * 发送xml数据请求到server端
	 * 
	 * @param url
	 *            xml请求数据地址
	 * @param xmlString
	 *            发送的xml数据流
	 * @return null发送失败，否则返回响应内容
	 */
	public static String post(String url, String xmlFileName) {
		// 关闭
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
		System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
		System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "stdout");

		// 创建httpclient工具对象
		HttpClient client = new HttpClient();
		// 创建post请求方法
		PostMethod myPost = new PostMethod(url);
		// 设置请求超时时间
		client.setConnectionTimeout(300 * 1000);
		String responseString = null;
		try {
			// 设置请求头部类型
			myPost.setRequestHeader("Content-Type", "text/xml");
			myPost.setRequestHeader("charset", "iso8859-1");
			// myPost.setRequestHeader("charset","utf-8");

			// 设置请求体，即xml文本内容，注：这里写了两种方式，一种是直接获取xml内容字符串，一种是读取xml文件以流的形式
			myPost.setRequestBody(xmlFileName);

			// InputStream body=this.getClass().getResourceAsStream("/"+xmlFileName);
			// myPost.setRequestBody(body);
			// myPost.setRequestEntity(new
			// StringRequestEntity(xmlString,"text/xml","utf-8"));
			int statusCode = client.executeMethod(myPost);
			if (statusCode == HttpStatus.SC_OK) {
				BufferedInputStream bis = new BufferedInputStream(myPost.getResponseBodyAsStream());
				byte[] bytes = new byte[1024];
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				int count = 0;
				while ((count = bis.read(bytes)) != -1) {
					bos.write(bytes, 0, count);
				}
				byte[] strByte = bos.toByteArray();
				responseString = new String(strByte, 0, strByte.length, "utf-8");
				// System.out.println(responseString);
				bos.close();
				bis.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		myPost.releaseConnection();
		return responseString;
	}

	/**
	 * @description 将xml字符串转换成map
	 * @param xml
	 * @return Map
	 */
	public static Map<String, String> readStringXmlOut(String xml) {
		Map<String, String> map = new HashMap<String, String>();
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(xml); // 将字符串转为XML
			Element rootElt = doc.getRootElement(); // 获取根节点
			@SuppressWarnings("unchecked")
			List<Element> list = rootElt.elements();// 获取根节点下所有节点
			for (Element element : list) { // 遍历节点
				map.put(element.getName(), element.getText()); // 节点的name为map的key，text为map的value
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	// 支付回调验证签名
	public static boolean wxPayChack(Map map, String key) throws Exception {
		String stringA = "appid=" + map.get("appid") + "&attach=" + map.get("attach") + "&bank_type="
				+ map.get("bank_type") + "&cash_fee=" + map.get("cash_fee") + "" + "&fee_type=" + map.get("fee_type")
				+ "&is_subscribe=" + map.get("is_subscribe") + "&mch_id=" + map.get("mch_id") + "&nonce_str="
				+ map.get("nonce_str") + "&openid=" + map.get("openid") + "&out_trade_no=" + map.get("out_trade_no")
				+ "&result_code=" + map.get("result_code") + "&return_code=" + map.get("return_code") + "&time_end="
				+ map.get("time_end") + "&total_fee=" + map.get("total_fee") + "&trade_type=" + map.get("trade_type")
				+ "&transaction_id=" + map.get("transaction_id");
		String stringSignTemp = stringA + "&key=" + key;
		String stringSignTemp1 = new String(stringSignTemp.getBytes("iso8859-1"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();
		String retSign = (String) map.get("sign");
		if (retSign.equals(sign)) {
			return true;
		}
		return false;
	}

	// 接收微信回调request 获取xml参数信息
	public static Map<String, String> inputStream2String(HttpServletRequest request) throws Exception {
		InputStream is = request.getInputStream();
		String xml = WxSignUtil.inputStream2String(is, "utf-8");
		return WxSignUtil.readStringXmlOut(xml);
	}

	/**
	 * InputStream流转换成String字符串
	 * 
	 * @param inStream
	 *        InputStream流
	 * @param encoding
	 *        编码格式
	 * @return String字符串
	 */
	public static String inputStream2String(InputStream inStream, String encoding) {
		String result = null;
		try {
			if (inStream != null) {
				ByteArrayOutputStream outStream = new ByteArrayOutputStream();
				byte[] tempBytes = new byte[1000];
				int count = -1;
				while ((count = inStream.read(tempBytes, 0, 1000)) != -1) {
					outStream.write(tempBytes, 0, count);
				}
				tempBytes = null;
				outStream.flush();
				result = new String(outStream.toByteArray(), encoding);
			}
		} catch (Exception e) {
			result = null;
		}
		return result;
	}

	// 获取用户的openid
	public static String getUserOpenId(Map<String, String> map) {
		String param = "appid=" + map.get("openappid") + "&secret=" + map.get("opensecret") + "&code=" + map.get("code")
				+ "&grant_type=authorization_code";
		String ret = HttpUtil.doGet(map.get("openidurl"), param);
		JSONObject jon = JSONObject.parseObject(ret);
		String openId = jon.getString("openid");
		return openId;
	}

	// 微信公众号预下单
	public static Map WxH5Md5Sign(Map map, String key) throws Exception {
		// //公众账号ID
		// String appid="";
		// //商品描述
		// String body="";
		// //商户号
		// String mch_id="";
		// //随机字符串
		// String nonce_str="";
		// //通知地址
		// String notify_url="";
		// //用户标识
		// String openid="";
		// //商户订单号
		// String out_trade_no="";
		// //终端IP
		// String spbill_create_ip="";
		// //订单总金额
		// int total_fee=0;
		// //交易类型
		// String trade_type="";

		String stringA = "appid=" + map.get("openappid") + "&body=" + map.get("body") + "&mch_id="
				+ map.get("openmchid") + "&nonce_str=" + map.get("nonce_str") + "&notify_url="
				+ map.get("opencallbackurl") + "&openid=" + map.get("openid") + "&out_trade_no="
				+ map.get("out_trade_no") + "&spbill_create_ip=127.0.0.1&total_fee=" + map.get("total_fee")
				+ "&trade_type=JSAPI";
		String stringSignTemp = stringA + "&key=" + key;
		// String stringSignTemp1=new String(stringSignTemp.getBytes("iso8859-1"));
		String stringSignTemp1 = new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();

		String par = "<xml>" + "<appid><![CDATA[" + map.get("openappid") + "]]></appid>" + "<mch_id><![CDATA["
				+ map.get("openmchid") + "]]></mch_id>" + "<openid><![CDATA[" + map.get("openid") + "]]></openid>"
				+ "<body><![CDATA[" + map.get("body") + "]]></body>" + "<nonce_str><![CDATA[" + map.get("nonce_str")
				+ "]]></nonce_str>" + "<notify_url><![CDATA[" + map.get("opencallbackurl") + "]]></notify_url>"
				+ "<out_trade_no><![CDATA[" + map.get("out_trade_no") + "]]></out_trade_no>"
				+ "<spbill_create_ip><![CDATA[127.0.0.1]]></spbill_create_ip>" + "<total_fee><![CDATA["
				+ map.get("total_fee") + "]]></total_fee>" + "<trade_type><![CDATA[JSAPI]]></trade_type>" + "<sign>"
				+ sign + "</sign>" + "</xml>";

		// B8971A5E8220F8B9A1C314FDDA7440C4
		String ret = WxSignUtil.post("https://api.mch.weixin.qq.com/pay/unifiedorder", par);
		Map<String, String> mapret = readStringXmlOut(ret);
		return mapret;
	}

	// 公众号预下单回调验证签名
	public static boolean orderPayCallbackChack(Map map, String key) throws Exception {
		String stringA = "appid=" + map.get("appid") + "&bank_type=" + map.get("bank_type") + "&cash_fee="
				+ map.get("cash_fee") + "&fee_type=" + map.get("fee_type") + "&is_subscribe=" + map.get("is_subscribe")
				+ "&mch_id=" + map.get("mch_id") + "&nonce_str=" + map.get("nonce_str") + "&openid=" + map.get("openid")
				+ "&out_trade_no=" + map.get("out_trade_no") + "&result_code=" + map.get("result_code")
				+ "&return_code=" + map.get("return_code") + "&time_end=" + map.get("time_end") + "&total_fee="
				+ map.get("total_fee") + "&trade_type=" + map.get("trade_type") + "&transaction_id="
				+ map.get("transaction_id");
		String stringSignTemp = stringA + "&key=" + key;
		String stringSignTemp1 = new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();
		String retsign = map.get("sign") + "";
		if (sign.equals(retsign)) {
			return true;
		}
		return false;
	}

	// 公众号调起支付签名
	public static String openSignPayMd5(Map map, String key) throws Exception {
		// 公众号id
		String appId = "";
		// 时间戳
		String timeStamp = "";
		// 随机字符串
		String nonceStr = "";
		// 订单详情扩展字符串
		String packageout = "";
		// 签名方式
		String signType = "";

		// String
		// stringA="appid=wx8731a2e298f48739&nonceStr=123456&package=123456&signType=MD5&timeStamp=123456";
		String stringA = "appId=" + map.get("appId") + "&nonceStr=" + map.get("nonceStr") + "&package="
				+ map.get("package") + "&signType=" + map.get("signType") + "&timeStamp=" + map.get("timeStamp");
		String stringSignTemp = stringA + "&key=" + key;
		// String stringSignTemp1=new String(stringSignTemp.getBytes("iso8859-1"));
		String stringSignTemp1 = new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();
		return sign;
	}

	// 微信支付商户退款
	public static Map wxPayMachBackToUser(Map map, String key) throws Exception {

		// //公众账号ID
		// String appid="";
		// //商户号
		// String mch_id="";
		// //随机字符串
		// String nonce_str="";
		// //微信订单号 流水号
		// String transaction_id="";
		//// //商户订单号
		//// String out_trade_no="";
		// //商户退款单号
		// String out_refund_no="";
		// //订单金额 订单总金额，单位为分，只能为整数
		// String total_fee="";
		// //退款金额
		// String refund_fee="";
		// 退款结果通知url
		// String notify_url="";

		String stringA = "appid=" + map.get("appid") + "&mch_id=" + map.get("mch_id") + "&nonce_str="
				+ map.get("nonce_str") + "&notify_url=" + map.get("notify_url") + "&out_refund_no="
				+ map.get("out_refund_no") + "&refund_fee=" + map.get("refund_fee") + "&total_fee="
				+ map.get("total_fee") + "&transaction_id=" + map.get("transaction_id");

		String stringSignTemp = stringA + "&key=" + key;
		// String stringSignTemp1=new String(stringSignTemp.getBytes("iso8859-1"));
		String stringSignTemp1 = new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();

		String par = "<xml>" + "	<appid><![CDATA[" + map.get("appid") + "]]></appid>" + "	<mch_id><![CDATA["
				+ map.get("mch_id") + "]]></mch_id>" + "	<nonce_str><![CDATA[" + map.get("nonce_str")
				+ "]]></nonce_str>" + "	<notify_url><![CDATA[" + map.get("notify_url") + "]]></notify_url>"
				+ "	<out_refund_no><![CDATA[" + map.get("out_refund_no") + "]]></out_refund_no>"
				+ "	<refund_fee><![CDATA[" + map.get("refund_fee") + "]]></refund_fee>" + "	<total_fee><![CDATA["
				+ map.get("total_fee") + "]]></total_fee>" + "	<transaction_id><![CDATA[" + map.get("transaction_id")
				+ "]]></transaction_id>" + "	<sign>" + sign + "</sign>" + "</xml>";

		// String ret=WxSignUtil.post("https://api.mch.weixin.qq.com/secapi/pay/refund",
		// par);
		String ret = WxSignUtil.postData("https://api.mch.weixin.qq.com/secapi/pay/refund", par, map.get("mch_id") + "",
				map.get("keyPath") + "");
		Map<String, String> mapret = readStringXmlOut(ret);
		return mapret;
	}

	// 解密微信退款加密字段
	public static Map desDecodeWxPayCallBack(Map<String, String> map, String key) throws Exception {
		// 对商户key做md5，得到32位小写key*
		// String mdkey=LogisticsInfoMD5.encode(key).toLowerCase();
		SecretKeySpec mdkey = new SecretKeySpec(LogisticsInfoMD5.encode(key).toLowerCase().getBytes(), "AES");

		// 微信订单号
		String transaction_id = map.get("transaction_id");
		if (transaction_id != null) {
			// 对加密串A做base64解码，得到加密串B
			transaction_id = new String(Base64Util.decode(transaction_id));
			transaction_id = AESUtil.decryptData(transaction_id, mdkey);
			map.put(transaction_id, transaction_id);
		}
		return map;
	}

	private static int socketTimeout = 10000;// 连接超时时间，默认10秒
	private static int connectTimeout = 30000;// 传输超时时间，默认30秒
	private static RequestConfig requestConfig;// 请求器的配置
	private static CloseableHttpClient httpClient;// HTTP请求器

	/**
	 * 通过Https往API post xml数据
	 * 
	 * @param url
	 *            API地址
	 * @param xmlObj
	 *            要提交的XML数据对象
	 * @param mchId
	 *            商户ID
	 * @param certPath
	 *            证书位置
	 * @return
	 */
	public static String postData(String url, String xmlObj, String mchId, String certPath) {
		// 加载证书
		try {
			initCert(mchId, certPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String result = null;
		HttpPost httpPost = new HttpPost(url);
		// 得指明使用UTF-8编码，否则到API服务器XML的中文不能被成功识别
		StringEntity postEntity = new StringEntity(xmlObj, "UTF-8");
		httpPost.addHeader("Content-Type", "text/xml");
		httpPost.setEntity(postEntity);
		// 根据默认超时限制初始化requestConfig
		requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout)
				.build();
		// 设置请求器的配置
		httpPost.setConfig(requestConfig);
		try {
			HttpResponse response = null;
			try {
				response = httpClient.execute(httpPost);
			} catch (IOException e) {
				e.printStackTrace();
			}
			HttpEntity entity = response.getEntity();
			try {
				result = EntityUtils.toString(entity, "UTF-8");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			httpPost.abort();
		}
		return result;
	}

	/**
	 * 加载证书
	 *
	 * @param mchId
	 *            商户ID
	 * @param certPath
	 *            证书位置
	 * @throws Exception
	 */
	private static void initCert(String mchId, String certPath) throws Exception {
		// 证书密码，默认为商户ID
		String key = mchId;
		// 证书的路径
		String path = certPath;
		// 指定读取证书格式为PKCS12
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		// 读取本机存放的PKCS12证书文件
		FileInputStream instream = new FileInputStream(new File(path));
		try {
			// 指定PKCS12的密码(商户ID)
			keyStore.load(instream, key.toCharArray());
		} finally {
			instream.close();
		}
		SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, key.toCharArray()).build();
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null,
				SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
		httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
	}

	// 微信小程序統一下單
	public static Map WxSmallProgramMd5Sign(Map map, String key) throws Exception {
		String stringA = "appid=" + map.get("appid") + "&attach=" + map.get("attach") + "&body=" + map.get("body")
				+ "&mch_id=" + map.get("mch_id") + "&nonce_str=" + map.get("nonce_str") + "&notify_url="
				+ map.get("notify_url") + "&openid=" + map.get("openid") + "&out_trade_no=" + map.get("out_trade_no")
				+ "&spbill_create_ip=" + map.get("spbill_create_ip") + "&total_fee=" + map.get("total_fee")
				+ "&trade_type=" + map.get("trade_type");

		String stringSignTemp = stringA + "&key=" + key;
		String stringSignTemp1 = new String(stringSignTemp.getBytes("iso8859-1"));
		// String stringSignTemp1=new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();

		String par = "<xml>" + "<appid>" + map.get("appid") + "</appid>" + "<attach>" + map.get("attach") + "</attach>"
				+ "<body>" + map.get("body") + "</body>" + "<mch_id>" + map.get("mch_id") + "</mch_id>" + "<nonce_str>"
				+ map.get("nonce_str") + "</nonce_str>" + "<notify_url>" + map.get("notify_url") + "</notify_url>"
				+ "<openid>" + map.get("openid") + "</openid>" + "<out_trade_no>" + map.get("out_trade_no")
				+ "</out_trade_no>" + "<spbill_create_ip>" + map.get("spbill_create_ip") + "</spbill_create_ip>"
				+ "<total_fee>" + map.get("total_fee") + "</total_fee>" + "<trade_type>" + "JSAPI" + "</trade_type>"
				+ "<sign>" + sign + "</sign>" + "</xml>";
		String ret = WxSignUtil.post(smallprogramorderurl, par);
		Map<String, String> retmap = readStringXmlOut(ret);
		return retmap;
	}

	// 微信小程序调起支付签名
	public static Map wxSmallProgramPaySign(Map map, String key) throws Exception {
		String stringA = "appId=" + map.get("appid") + "&nonceStr=" + map.get("nonceStr") + "&package=prepay_id="
				+ map.get("prepay_id") + "&signType=MD5&timeStamp=" + map.get("timeStamp");

		String stringSignTemp = stringA + "&key=" + key;
		String stringSignTemp1 = new String(stringSignTemp.getBytes("iso8859-1"));
		// String stringSignTemp1=new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();

		Map retmap = new HashMap();
		retmap.put("time", map.get("timeStamp"));
		retmap.put("package", "prepay_id=" + map.get("prepay_id"));
		retmap.put("paySign", sign);
		retmap.put("signType", "MD5");
		retmap.put("nonceStr", map.get("nonceStr"));
		return retmap;
	}

	// 微信小程序获得openid
	public static String wxSmallProgramGetOpenId(Map map, String secret) throws Exception {
		String getUrl = "https://api.weixin.qq.com/sns/jscode2session";
		String param = "appid=" + map.get("appid") + "&secret=" + secret + "&js_code=" + map.get("code")
				+ "&grant_type=authorization_code";
		String ret = HttpUtil.doGet(getUrl, param);
		// {"session_key":"vz5yE67kF3p8CKpTtLgobw==","openid":"oMEFK5M53RmMPTow1_GoBRKkrOI4"}
		JSONObject json = JSONObject.parseObject(ret);
		String openid = json.getString("openid");
		String session_key = json.getString("session_key");
		return openid + "," + session_key;
	}

	// 查询微信订单
	public static void queryOrderPayInfo() throws Exception {
		String stringA = "appid=wx608bbf2ae0956623&mch_id=1512285851&nonce_str=456168546545&out_trade_no=0a3f639a3f174529a7ca236632f36d4d&key=9dffe0f7a65bb1976d4b33d7a8b1f7ac";
		String stringSignTemp = stringA;
		String stringSignTemp1 = new String(stringSignTemp.getBytes("utf-8"));
		String sign = LogisticsInfoMD5.encode(stringSignTemp1).toUpperCase();

		String par = "<xml>" + "<appid><![CDATA[wx608bbf2ae0956623]]></appid>"
				+ "<mch_id><![CDATA[1512285851]]></mch_id>" + "<nonce_str><![CDATA[456168546545]]></nonce_str>"
				+ "<out_trade_no><![CDATA[0a3f639a3f174529a7ca236632f36d4d]]></out_trade_no>" + "<sign>" + sign
				+ "</sign>" + "</xml>";
		String ret = WxSignUtil.post("https://api.mch.weixin.qq.com/pay/orderquery", par);
		Map<String, String> mapret = readStringXmlOut(ret);
		System.out.println(mapret);
	}

}
