<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript" src="../test/alipay.js"></script>
<script src="<%=request.getContextPath()%>/js/base.js" type="text/javascript"></script>

<title>电脑网站支付return_url</title>
</head>


<%@ page import="java.util.*"%>
<%@ page import="java.util.Map"%>
<%@ page import="com.ccunix.ihousekeeping.alipay.*"%>
<%@ page import="com.alipay.api.*"%>
<%@ page import="com.alipay.api.internal.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%
/* *
 * 功能：支付宝服务器同步通知页面
 * 日期：2017-03-30
 * 说明：
 * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。


 *************************页面功能说明*************************
 * 该页面仅做页面展示，业务逻辑处理请勿在该页面执行
 */
 
	//获取支付宝GET过来反馈信息
	Map<String,String> params = new HashMap<String,String>();
	Map<String,String[]> requestParams = request.getParameterMap();
	for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
		String name = (String) iter.next();
		String[] values = (String[]) requestParams.get(name);
		String valueStr = "";
		for (int i = 0; i < values.length; i++) {
			valueStr = (i == values.length - 1) ? valueStr + values[i]
					: valueStr + values[i] + ",";
		}
		//乱码解决，这段代码在出现乱码时使用
		valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
		params.put(name, valueStr);
	}
	
	boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

	//——请在这里编写您的程序（以下代码仅作参考）——
	if(signVerified) {
		//商户姓名
		String order_mem= new String("hhh");
		//支付方式---支付宝
		String pay_away = new String("A01");
		
		//商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
		//支付宝交易号
		String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
		//付款金额
		String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
		out.print("<input type=\"hidden\" id=\"out_trade_no\" value=\"");%><%=out_trade_no%><% out.print("\">");
		out.print("<input type=\"hidden\" id=\"total_amount\" value=\"");%><%=total_amount%><% out.print("\">");
		out.print("<input type=\"hidden\" id=\"order_mem\" value=\"");%><%=order_mem%><% out.print("\">");
		out.print("<input type=\"hidden\" id=\"pay_away\" value=\"");%><%=pay_away%><% out.print("\">");

		out.println("商户订单号:"+trade_no+"<br/>支付宝交易号:"+out_trade_no+"<br/>付款金额:"+total_amount+"<br/>支付方式:"+pay_away);
	}else {
		out.println("验签失败");
	}
	//——请在这里编写您的程序（以上代码仅作参考）——
%>
<br>
<%
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = df.format(date);
        out.print("订单提交时间："+s);
        %> <%
		out.print("<input type=\"hidden\" id=\"s\" value=\"");%><%=date%><% out.print("\">");
		%> <%
    %>
    
  
<body>

</body>

</html>