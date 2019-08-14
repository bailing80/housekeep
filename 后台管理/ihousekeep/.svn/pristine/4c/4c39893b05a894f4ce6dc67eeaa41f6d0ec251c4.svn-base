<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加优惠券类型</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/main/coupon_type/add_coupon_type.js"></script>
</head>
<body>
	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>类型名称</td>
			<td><input id="type_name" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>类型背景图片</td>
			<td><img name="file" id="picture"
				style="width: 135px; height: 80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id="photo_form_1"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="picture" type="file" size="2"
						accept="image/*">
				</form>
				<button id="up_button_1">上传图片</button></td>

		</tr>

	</table>
</body>
</html>