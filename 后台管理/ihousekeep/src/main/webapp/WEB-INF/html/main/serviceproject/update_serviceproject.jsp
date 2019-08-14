<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改首页分类</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=baseurl%>/html/main/serviceproject/add_serviceproject.js"></script>
<script src="<%=baseurl%>/html/main/serviceproject/update_serviceproject.js"></script>

</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>分类顺序</td>
			<td><input id="project_order" type="text" size="10"
				class="form-control" style="width: 80%"></td>
		</tr>
		<tr>
			<td>分类标题</td>
			<td><select id="project_name" class="form-control" style="width: 80%">
			</select>
			
			
			<!-- <input id="on_price" type="text" size="10"
				class="form-control" style="width: 80%"> --></td>
		</tr>
		<tr>
			<td>起始价格</td>
			<td><input id="on_price" type="text" size="10"
				class="form-control" style="width: 80%"></td>
		</tr>
		<tr>
			<td>分类图片</td>
			<td>
			<img  name="file" id="picture" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id="photo_form_1"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="picture_edit" type="file" size="2"
						  accept="image/*">
				</form>
				<button id="edit_button_1">上传图片</button>
			</td>
				
				<%-- <form id="top_picture" action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="height" type="file" size="2" class="form-control"
						style="width: 80%">
				</form>
				<button id="up_button">上传</button> --%>		
		</tr>

		<!-- <tr>
			<td>分类标题</td>
			<td><input id="project_name" type="text" size="10"
				class="form-control" style="width: 80%"></td>
		</tr> -->
	</table>

</body>
</html>