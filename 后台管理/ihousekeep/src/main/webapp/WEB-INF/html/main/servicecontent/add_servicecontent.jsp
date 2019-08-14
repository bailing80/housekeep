<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加项目内容</title>
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
	src="<%=baseurl%>/html/main/servicecontent/add_servicecontent.js"></script>
</head>
<body>
	
	<table border="1" class="table table-striped" style="width: 100%;">
		<tr>
			<td>所属子项ID</td>
			<td id="service_item_id"></td>
		</tr>
		<tr>
			<td>内容名称</td>
			<td><input id="content_name" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>

		<tr>
			<td>内容键名</td>
			<td><input id="content_key" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>内容键类型</td>
			<td><input id="content_type" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>内容键值</td>
			<td><input id="content_value" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
	</table>
</body>
</html>