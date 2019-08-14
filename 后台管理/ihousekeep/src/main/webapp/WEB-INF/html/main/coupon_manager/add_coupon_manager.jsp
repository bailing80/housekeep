<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加优惠券管理</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/main/coupon_manager/add_coupon_manager.js"></script>
	
	<script src="<%=baseurl%>/js/dateutil/canlen.js"></script>
	
	
</head>
<body>
	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>优惠券批次名</td>
			<td><input id="coupon_project_name" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>

		<tr>
			<td>所属类型</td>
			<td><select id="coupon_manager_type_id" size="1" class="form-control"
				style="width: 30%"></select></td>
		</tr>

		<tr>
			<td>总数</td>
			<td><input id="batch_total" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>

		<tr>
			<td>兑换时间</td>
			
			 
			
			<td><input id="exchange_time_str" type="text" size="2" placeholder="请输入日期" onclick="createOutDiv(this)"
				class="form-control" style="width: 30%">
				
				
				</td>
		</tr>

		<tr>
			<td>金额</td>
			<td><input id="money" type="text" size="2" class="form-control"
				style="width: 30%"></td>
		</tr>


	</table>
</body>
</html>

