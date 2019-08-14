<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改广告轮播</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=baseurl%>/html/main/advertisement/update_advertisement.js"></script>
</head>
<body>
	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>广告名称</td>
			<td><input id="advertisment_name" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>广告位置</td>
			<td><input id="position" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>广告类型</td>
			<td><select id="type_id" name="type_id"style="width: 30%" class="form-control"></select>
		</tr>
		<tr>
			<td>是否轮播</td>
			<td><select id="is_wheel" name="is_wheel"style="width: 30%" class="form-control">
			<option value="1" id="wheel_1">轮播</option>
			<option value="2" id="wheel_2">不轮播</option>
			</select>
		</tr>
		<tr>
			<td>是否上架</td>
			<td style="text-align: left;"><input type="radio" name="is_enable"  value="01" id="is_enable_1" style="transform:scale(1.2);width:20px;" \">上架<input type="radio" name="is_enable" value="02" id="is_enable_2" style="transform:scale(1.2);width:20px;">下架
			</td>
		</tr>
		<tr>
			<td>轮播时长</td>
			<td><select id="wheel_time" name="wheel_time" style="width: 30%" class="form-control">
			<option id="wheel_time_1" value="1000">1s</option>
			<option id="wheel_time_2" value="1500">1.5s</option>
			<option id="wheel_time_3" value="2000">2s</option>
			<option id="wheel_time_4" value="2500">2.5s</option>
			<option id="wheel_time_5" value="3000">3s</option>
			<option id="wheel_time_6" value="3500">3.5s</option>
			<option id="wheel_time_7" value="4000">4s</option>
			<option id="wheel_time_8" value="4500">4.5s</option>
			</select>
			</td>
		</tr>
	</table>
</body>
</html>