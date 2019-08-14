<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加管理员</title>
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
<script type="text/javascript"
	src="<%=baseurl%>/html/main/manager/add_manager.js"></script>
</head>
<body>
	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>姓名</td>
			<td><input id="name" type="text" size="2" class="form-control"
				style="width: 30%"></td>
		</tr>

		<tr>
			<td>电话</td>
			<td><input id="phone" type="text" size="2" class="form-control"
				style="width: 30%"></td>
		</tr>

		<tr>
			<td>身份名称</td>
			<td><select id="manager_role_id" style="width: 30%"
				class="form-control">
			</select>
		</tr>

		<tr>
			<td>是否允许登陆</td>
			<td style="text-align: left;"><input type="radio"
				name="is_login" value="1" id="is_login_1" checked="checked"
				style="transform: scale(1.2); width: 20px;"\">允许<input
				type="radio" name="is_login" value="2" id="is_login_2"
				style="transform: scale(1.2); width: 20px;">不允许</td>
		</tr>

	</table>
</body>
</html>