<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单详细显示</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<!-- <script type="text/javascript" src="<%=baseurl%>/html/main/order/order_information_detail.js"></script>  -->
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/main/order/order_information_detail.js"></script>
</head>
<body>
	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>订单编号</td>
			<td id="order_no"></td>
		</tr>
		<tr>
			<td>下单时间</td>
			<td id="order_time_str"></td>
		</tr>
		<tr>
			<td>预约时间</td>
			<td id="appointment_time_str"></td>
		</tr>
		<tr>
			<td>客户姓名</td>
			<td id="nick_name"></td>
		</tr>
		<tr>
			<td>客户电话</td>
			<td id="user_phone"></td>
		</tr>
		<tr>
			<td>客户地址</td>
			<td id="address"></td>
		</tr>
		<tr>
			<td>支付方式</td>
			<td id="pay_fun"></td>
		</tr>
		<tr>
			<td>支付时间</td>
			<td id="pay_time_str"></td>
		</tr>
		<tr>
			<td>订单金额</td>
			<td id="order_total_money"></td>
		</tr>
		<tr>
			<td>实际支付金额</td>
			<td id="order_pay_money"></td>
		</tr>
		<tr>
			<td>优惠券类型</td>
			<td id="coupon_type_id"></td>
		</tr>
			<tr>
			<td>金额</td>
			<td id="money"></td>
		</tr>
		</tr>
			<tr>
			<td>子项目名称</td>
			<td id="item_name"></td>
		</tr>
		</tr>
			<td>服务项目</td>
			<td id="project_id"></td>
		</tr>
	
	</table>
</body>
</html>