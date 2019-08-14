<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"rel="stylesheet">
<link href="<%=baseurl%>/css/base.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript" src="<%=baseurl%>/html/main/role_2_menu/role_2_menu.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>
</head>
<body>
	
	<div id="nav" class="btn-group">
		<span class="label label-default">人员菜单映射关系表</span>
	</div>
	<div id="fun" class="btn-group" data-toggle="buttons-checkbox">
		<button class="btn btn-primary" id="delete_test">删除</button>
	</div>
	<div id="content">
		<table id="datatable" border="1" class="table table-striped"
			style="width: 100%">
		</table>
	</div>
	<div id="page"></div>

	<div id="new_div"></div>
	<div id="backdiv"></div>
</body>
</html>