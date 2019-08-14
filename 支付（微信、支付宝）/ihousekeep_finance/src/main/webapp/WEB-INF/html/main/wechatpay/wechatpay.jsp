
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script>
	$(document).ready(function() {
		getDateNow();
		$("#yuzhifu").click(function() {

			yuzhifu();

		});
	});

	function yuzhifu() {
		//通过Ajax调用
		var obj = new Object();
		var wIDout_trade_no = document.getElementById("wIDout_trade_no").value;
		var wIDsubject = document.getElementById("wIDsubject").value;
		var wIDtotal_amount = document.getElementById("wIDtotal_amount").value;
		var wIDbody = document.getElementById("wIDbody").value;
		obj.wIDout_trade_no = wIDout_trade_no;
		obj.wIDsubject = wIDsubject;
		obj.wIDtotal_amount = wIDtotal_amount;
		obj.wIDbody = wIDbody;
		
		$.ajax({
			url : getRootPath() + "/Pay_Controller/yuxiadan.action",
			data : obj,
			success : info
		});
		
	}

	function getDateNow() {
		var vNow = new Date();
		var sNow = "";
		sNow += String(vNow.getFullYear());
		sNow += String(vNow.getMonth() + 1);
		sNow += String(vNow.getDate());
		sNow += String(vNow.getHours());
		sNow += String(vNow.getMinutes());
		sNow += String(vNow.getSeconds());
		sNow += String(vNow.getMilliseconds());
		document.getElementById("wIDout_trade_no").value = sNow;
		document.getElementById("wIDsubject").value = "测试";
		//	document.getElementById("wIDtotal_amount").value = "0.01";
	}

	function info(data) {
		var d = $(data);
		//页面跳转，并将code_url传到另一个页面中
		alert(d[0].code_url)
		location.href = getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/wechatpay/qrcode&param="
				+ d[0].code_url;
	}
</script>
</head>

<body>

	<dt>商户订单号 ：</dt>
	<dd>
		<input id="wIDout_trade_no" name="wIDout_trade_no"
			style="width: 30%; height: 30px;" />

	</dd>
	<br>

	<dt>订单名称 ：</dt>
	<dd>
		<input id="wIDsubject" name="wIDsubject"
			style="width: 30%; height: 30px;" />
	</dd>
	<br>

	<dt>付款金额 ：</dt>
	<dd>
		<input id="wIDtotal_amount" name="wIDtotal_amount"
			style="width: 30%; height: 30px;" />
	</dd>
	<br>

	<dt>商品描述：</dt>
	<dd>
		<input id="wIDbody" name="wIDbody" style="width: 30%; height: 30px;" /><br>
	</dd>
	<br>
	<dd>
		<button id="yuzhifu"
			style="font-weight: bold; width: 30%; height: 30px;">付款</button>
	</dd>
	
	
</body>


</html>
