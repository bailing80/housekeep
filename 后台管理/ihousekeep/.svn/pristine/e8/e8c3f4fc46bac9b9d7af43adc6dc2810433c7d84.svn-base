<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>推送玻璃水</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>

<script type="text/javascript" src="<%=baseurl%>/js/up_down_load.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/main/test/add_test.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>姓名</td>
			<td><input id="name" type="text" size="2" class="form-control"
				style="width: 30%"></td>
		</tr>
		<tr>
			<td>年龄</td>
			<td><input id="age" type="text" size="2" class="form-control"
				style="width: 30%"></td>
		</tr>
		<tr>
			<td>身高</td>
			<td><input id="height" type="text" size="2" class="form-control"
				style="width: 30%"></td>
		</tr>
		<tr>
			<td>照片</td>
			<td>
				<form id="photo_form" action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="height" type="file" size="2" class="form-control"
						style="width: 30%">
				</form>
				<button id="up_button">上传</button>
			</td>
		</tr>
	</table>

</body>
</html>