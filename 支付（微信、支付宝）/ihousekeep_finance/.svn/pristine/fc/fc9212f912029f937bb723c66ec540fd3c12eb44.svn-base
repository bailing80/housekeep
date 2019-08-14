package com.ccunix.ihousekeeping.alipay.service;

import java.util.List;

import javax.annotation.Resource;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.ccunix.ihousekeeping.alipay.AlipayConfig;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.service.T_lz_order_Service_Iface;

public class Alipay_Service_Impl extends BaseService implements Alipay_Service_Iface {
		
//		// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
//		public static String app_id = "2019073166015465";
//	
//		// 商户私钥，您的PKCS8格式RSA2私钥
//		public static String merchant_private_key =
//    		"MIIEuwIBADANBgkqhkiG9w0BAQEFAASCBKUwggShAgEAAoIBAQDW9ZaV8X2nrivE\r\n" + 
//    		"lp+Gsud7O6jw81HAGFDO0bzWtzNjBJ+9Q+5aOW2HLI92EOQ1OGHCW/my2KuzhI8T\r\n" + 
//    		"3ndNDu1bX7eXpKQei3J3742xPKYhw0VibdCYy8uWKyKWkfUneYK4WlzpUvlEGf4o\r\n" + 
//    		"4l5SI16xXfi96VcZ0hMTGsUhMZPWAlk+j95LOo5vJRlHUD7C+H4vY8Fm5HnyNRDG\r\n" + 
//    		"f8oXKcDJKyLivmkOLl5RDLndukA1ev+uxeslo7as75aPK3TKz+Jn4QarJgFusVWL\r\n" + 
//    		"akuA9IqFFszgEZAsCSahk7GIWXTSmOVkiPgjm1jOKGS0yVYwfl8ktTYhmc9c7rrx\r\n" + 
//    		"8EW6F4tzAgMBAAECggEAA9jvcg2ZdyfZ5rHfdxS6qez+cBmay/pjb+A3JgyvYcVS\r\n" + 
//    		"apvNp1XBzRqSEsXon787mLP2uym/oP3tZaikr/9lZi5HZfJvcZCDYvwpqBNy0cXh\r\n" + 
//    		"9woKIsH7CdwJyXIhViyJl20enpp6lap1bxvmHkg9yKTq79M+WNr2tm/TOW3evITT\r\n" + 
//    		"1lEKLVtce3d+k+OvFRJARLrLdBpfGM/fWJWHGklgNcRx/4+kENrVo3t7HEGd6Cql\r\n" + 
//    		"YOFiZVgbtNMcAg/18ltRJtBiS+mIQOB51aE3Z00pBUStwYjkkLwoXLzphogdaAZD\r\n" + 
//    		"LeRvQ75I2iaFonYlLMF0HNC+nLGvnV9ivntbd+HvKQKBgQD1BCwpmlhWZCYQl0Gi\r\n" + 
//    		"IuQi6mirwGwpYecp3Ag7SXL1QOHOGD106/OKqzwOhaCtu2oBQklN5FszlQU6e9Ur\r\n" + 
//    		"f06JdqrhOQ6FZKNFPJDSvBMjvkiK0J3D08xnfYtBlirunk78+5P1UQOR/k4xp88p\r\n" + 
//    		"Kqo4Cyhy1ixhMNWRrVbsc3RRHQKBgQDgmHq7XrTb+0mp4tnNkLrNaklk5STm5MV3\r\n" + 
//    		"E05gy21bUuRV4X+B4k5catz6150jOEEbVddX6ahPYmB3UYsZbiYCtRPbnVdk0O8i\r\n" + 
//    		"1e5qeF9CBKJiwBaWFUwAov2vk4ra2jnufK7rpmNEpMbSlyxziYLGy6sBZfz3pzAN\r\n" + 
//    		"JLaasly5zwKBgBgk0x0+YloRAFc+MG+DtKtkIfBaw83IIflT/1OoRzW3sQiYBuZQ\r\n" + 
//    		"oe0WNpLPxCeagjWhjIuqZvpMQvmiXj0tDFYrZWdQMggfBJ+7+iFp+xDYnVlgeUtk\r\n" + 
//    		"wY2pJ2HNJGnjG7F+MPRJiWqHfrkR6i4KUD+5icDXLgRdxY3XYOtn7RxZAoGBAL1v\r\n" + 
//    		"Ps29MtT83YQCR+z/7t+Fj4QfVgG94ePuj8RKsOE/SEI7oZ1+sNN4ewzEQdDMCPYy\r\n" + 
//    		"cCDBfun+MxlQ2P9JDZxo+OfajTUGmT0Lrj11a/s2B3U9SY+rROCgmVK3In43ZHeI\r\n" + 
//    		"CM3QGJh0VxKW2bJVwM1GSeUzDawhAwGC/tX6LQW3An9/hqDEKUx8Z4cCs6EWnRM1\r\n" + 
//    		"Y1Sc2sHFgQ/ZPjudOu8xbz7D3e/z/I7IPwCOjLNtlvTEGBvrTt0aTEVLzK9ypREe\r\n" + 
//    		"JhxaicwaKRvtsPL3j3AzhNPaPou6CU76OpSnc0dx1CAtOMdLepNRk0A8CVh9r4Dl\r\n" + 
//    		"vGar8gsABZcwDhNwSP8w\r\n" + 
//    		"";
//	
//		// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
//		public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqfwQ3clPGiEN+TeedPsDFqMLI4EqkzXtbDrYwgdzF77wonsjMGzpJu+B7EaF61ukBOBn/EW4qwc3Pu/WvWE2ULtqCt9jcehp8bVPqUTaJX6zrfbnzN0KqT/X40MIXR20z6kht/T5DZ0/QsJy8/lIKY4aNsPcl209n4jvq8hJYAazBDxgsekP14Skp8mLRfQ8ZVjBQKIUfiYDnKN5gnPxF1sUg57WrnfX9ukUY6HTlDMcPsZOjKNwIyHcTg3LjXu6p6equfpKb+QwpGWDEyLtXEQQFT3A22QOAu0FpCkgMm8VOpaT2iLRsnPz7Ix6SE63O8emuK7m56HIX6YqchmcBwIDAQAB";
//
//		// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//		public static String notify_url = "http://localhost:8081/housekeep_finance/html/main/alipay/notify_url.jsp";
//
//		// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//		public static String return_url = "http://localhost:8081/housekeep_finance/html/main/alipay/return_url.jsp";
//		// 签名方式
//		public static String sign_type = "RSA2";
//	
//		// 字符编码格式
//		public static String charset = "utf-8";
//	
//		// 支付宝网关
//		public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
//		//public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
//		
//		//支付宝数据格式
//		public static String zfbchar = "json";
//		
//		@Resource
//		public Alipay_Dao_Iface alipay_dao_iface;
//		@Override
//		public List queryAll_alipay_m(Alipay alipay) throws Exception  {
//			List<Alipay> ls = alipay_dao_iface.queryAll_alipay_m(alipay);
//			return ls;
//		}
	    // 支付宝转账
		@Override
		public String apliayToUserAlipay(String userAlipayCode, String payerShowName, String remark, double amount) {
			
			//AlipayClient alipayClient = new DefaultAlipayClient(zfbhttp, zfbappid, prokey, zfbchar, zfbutf, zfbkey, zfbmd);
			AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, AlipayConfig.zfbchar, AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
			
			AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
			// AlipayTradeAppPayRequest app=new
			// AlipayTradeAppPayRequest();//APP支付的实现类
			request.setBizContent("{" + "    \"out_biz_no\":\"" + UUID_Tools.getUUID() + "\","
					+ "    \"payee_type\":\"ALIPAY_LOGONID\"," +
					// " \"payee_type\":\"ALIPAY_USERID\"," +
					"    \"payee_account\":\"" + userAlipayCode + "\"," + "    \"amount\":\"" + amount + "\","
					+ "    \"payer_show_name\":\"" + payerShowName + "\"," + "    \"remark\":\"" + remark + "\"," + "  }");
			AlipayFundTransToaccountTransferResponse response = null;
			try {
				response = alipayClient.execute(request);
			} catch (Exception e) {
				// System.out.println("异常信息");
				return "faile";
			}
			if (response != null && response.isSuccess()) {
				// System.out.println("信息======="+response.getBody());
				return "succese";
			} else {// 有返回信息 但是
				// System.out.println("错误信息"+response.getBody());
				return "faile";
			}

		}
		
//		@Resource
//		public Alipay_H_Dao_Iface alipay_h_dao_iface;
//		public List queryAll_alipay_h(Alipay_H alipay_h) throws Exception{
//			List<Alipay_H> ls = alipay_h_dao_iface.queryAll_alipay_h(alipay_h);
//			return ls;
//		}
		public static void main(String[] args) {
			Alipay_Service_Impl a = new Alipay_Service_Impl();
			a.apliayToUserAlipay("13944525950", "东学", "东学", 0.1);
			System.out.println(a);
		}
		
}
