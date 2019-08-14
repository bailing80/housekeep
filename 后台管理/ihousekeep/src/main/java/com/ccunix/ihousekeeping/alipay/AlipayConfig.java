package com.ccunix.ihousekeeping.alipay;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2019073166015465";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key ="MIIEuwIBADANBgkqhkiG9w0BAQEFAASCBKUwggShAgEAAoIBAQDW9ZaV8X2nrivE\r\n" + 
    		"lp+Gsud7O6jw81HAGFDO0bzWtzNjBJ+9Q+5aOW2HLI92EOQ1OGHCW/my2KuzhI8T\r\n" + 
    		"3ndNDu1bX7eXpKQei3J3742xPKYhw0VibdCYy8uWKyKWkfUneYK4WlzpUvlEGf4o\r\n" + 
    		"4l5SI16xXfi96VcZ0hMTGsUhMZPWAlk+j95LOo5vJRlHUD7C+H4vY8Fm5HnyNRDG\r\n" + 
    		"f8oXKcDJKyLivmkOLl5RDLndukA1ev+uxeslo7as75aPK3TKz+Jn4QarJgFusVWL\r\n" + 
    		"akuA9IqFFszgEZAsCSahk7GIWXTSmOVkiPgjm1jOKGS0yVYwfl8ktTYhmc9c7rrx\r\n" + 
    		"8EW6F4tzAgMBAAECggEAA9jvcg2ZdyfZ5rHfdxS6qez+cBmay/pjb+A3JgyvYcVS\r\n" + 
    		"apvNp1XBzRqSEsXon787mLP2uym/oP3tZaikr/9lZi5HZfJvcZCDYvwpqBNy0cXh\r\n" + 
    		"9woKIsH7CdwJyXIhViyJl20enpp6lap1bxvmHkg9yKTq79M+WNr2tm/TOW3evITT\r\n" + 
    		"1lEKLVtce3d+k+OvFRJARLrLdBpfGM/fWJWHGklgNcRx/4+kENrVo3t7HEGd6Cql\r\n" + 
    		"YOFiZVgbtNMcAg/18ltRJtBiS+mIQOB51aE3Z00pBUStwYjkkLwoXLzphogdaAZD\r\n" + 
    		"LeRvQ75I2iaFonYlLMF0HNC+nLGvnV9ivntbd+HvKQKBgQD1BCwpmlhWZCYQl0Gi\r\n" + 
    		"IuQi6mirwGwpYecp3Ag7SXL1QOHOGD106/OKqzwOhaCtu2oBQklN5FszlQU6e9Ur\r\n" + 
    		"f06JdqrhOQ6FZKNFPJDSvBMjvkiK0J3D08xnfYtBlirunk78+5P1UQOR/k4xp88p\r\n" + 
    		"Kqo4Cyhy1ixhMNWRrVbsc3RRHQKBgQDgmHq7XrTb+0mp4tnNkLrNaklk5STm5MV3\r\n" + 
    		"E05gy21bUuRV4X+B4k5catz6150jOEEbVddX6ahPYmB3UYsZbiYCtRPbnVdk0O8i\r\n" + 
    		"1e5qeF9CBKJiwBaWFUwAov2vk4ra2jnufK7rpmNEpMbSlyxziYLGy6sBZfz3pzAN\r\n" + 
    		"JLaasly5zwKBgBgk0x0+YloRAFc+MG+DtKtkIfBaw83IIflT/1OoRzW3sQiYBuZQ\r\n" + 
    		"oe0WNpLPxCeagjWhjIuqZvpMQvmiXj0tDFYrZWdQMggfBJ+7+iFp+xDYnVlgeUtk\r\n" + 
    		"wY2pJ2HNJGnjG7F+MPRJiWqHfrkR6i4KUD+5icDXLgRdxY3XYOtn7RxZAoGBAL1v\r\n" + 
    		"Ps29MtT83YQCR+z/7t+Fj4QfVgG94ePuj8RKsOE/SEI7oZ1+sNN4ewzEQdDMCPYy\r\n" + 
    		"cCDBfun+MxlQ2P9JDZxo+OfajTUGmT0Lrj11a/s2B3U9SY+rROCgmVK3In43ZHeI\r\n" + 
    		"CM3QGJh0VxKW2bJVwM1GSeUzDawhAwGC/tX6LQW3An9/hqDEKUx8Z4cCs6EWnRM1\r\n" + 
    		"Y1Sc2sHFgQ/ZPjudOu8xbz7D3e/z/I7IPwCOjLNtlvTEGBvrTt0aTEVLzK9ypREe\r\n" + 
    		"JhxaicwaKRvtsPL3j3AzhNPaPou6CU76OpSnc0dx1CAtOMdLepNRk0A8CVh9r4Dl\r\n" + 
    		"vGar8gsABZcwDhNwSP8w\r\n" + 
    		"";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqfwQ3clPGiEN+TeedPsDFqMLI4EqkzXtbDrYwgdzF77wonsjMGzpJu+B7EaF61ukBOBn/EW4qwc3Pu/WvWE2ULtqCt9jcehp8bVPqUTaJX6zrfbnzN0KqT/X40MIXR20z6kht/T5DZ0/QsJy8/lIKY4aNsPcl209n4jvq8hJYAazBDxgsekP14Skp8mLRfQ8ZVjBQKIUfiYDnKN5gnPxF1sUg57WrnfX9ukUY6HTlDMcPsZOjKNwIyHcTg3LjXu6p6equfpKb+QwpGWDEyLtXEQQFT3A22QOAu0FpCkgMm8VOpaT2iLRsnPz7Ix6SE63O8emuK7m56HIX6YqchmcBwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8081/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8081/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

