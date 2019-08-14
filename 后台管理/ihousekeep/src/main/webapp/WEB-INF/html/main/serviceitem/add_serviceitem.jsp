<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加项目</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>
<script type="text/javascript" src="<%=baseurl%>/js/test_util.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=baseurl%>/js/up_down_load.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/main/serviceitem/add_serviceitem.js"></script>
</head>
<body>
	<table border="1" class="table table-striped" style="width: 100%;">
		<tr >
			<td>项目名称</td>
			<td><select id="project_name" class="form-control" style="width: 30%">
			</select>
		</tr>
		<tr >
			<td>顺序</td>
			<td><input id="project_order" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr >
			<td>图片1</td>
			<td align="left">
			<img name="file" id="picture" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id=photo_form_1
					style="width: 30%; display: inline-block; margin-right: 30px; vertical-align: bottom;"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="picture" type="file" size="2"
						 accept="image/*" >
				</form>
				<button style="vertical-align: bottom;" id="up_button_1">上传图片</button>
			</td>
		</tr>

		<tr >
			<td>图片2</td>
			<td align="left" >
			<img name="file" id="picture_bef" 
						 style="width: 135px; height:80px;display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id=photo_form_2
					style="width: 30%; display: inline-block; margin-right: 30px; vertical-align: bottom;"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="picture_bef" type="file" size="2"
						 accept="image/*">
				</form>
				<button style="vertical-align: bottom;" id="up_button_2">上传图片</button>

		</tr>
		<tr >
			<td>图片3</td>
			<td align="left" >
			<img name="file" id="picture_aft" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id=photo_form_3
					style="width: 30%; display: inline-block; margin-right: 30px; vertical-align: bottom;"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="picture_aft" type="file" size="2"
						 accept="image/*">
				</form>
				<button style="vertical-align: bottom;" id="up_button_3">上传图片</button>
		</tr>
		<tr >
			<td>项目介绍</td>
			<td><input id="introduce" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr >
			<td>项目特色</td>
			<td><input id="characteristic" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr >
			<td>添加连接1</td>
			<td><input id="front_picture_link" type="text" size="2"
				class="form-control" style="width: 30%">
				</td>
		</tr>
		<tr >
			<td>添加连接2</td>
			<td><input id="picture_bef_link" type="text" size="2"
				class="form-control" style="width: 30%">
				</td>
		</tr>
		<tr >
			<td>添加连接3</td>
			<td><input id="picture_aft_link" type="text" size="2"
				class="form-control" style="width: 30%">
				</td>
		</tr>

	</table>


</body>
</html>