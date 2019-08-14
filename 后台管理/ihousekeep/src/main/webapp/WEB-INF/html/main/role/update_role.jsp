<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改角色</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=baseurl%>/html/main/role/update_role.js"></script>

</head>
<body>



	<table border="1" class="table table-striped" style="width: 100%">
			<tr>
			<td>名称</td>
			<td><input id="name" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>说明</td>
			<td><input id="description" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		
		<tr>
			<td>职称</td>
			<td><input id="this_level" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
	
		<tr>
			<td>上级</td>
			<td><select id="parent_id" style="width: 30%" class="form-control">
			</select>
		</tr>
	</table>

</body>
</html>