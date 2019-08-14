<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>服务子项内容</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=baseurl%>/css/base.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript" src="<%=baseurl%>/html/main/servicecontent/servicecontent.js"></script> 
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	 src="<%=baseurl%>/html/admin/page/page.js"></script>
</head>
<body>
<%
//out.print(request.getAttribute("param"));
out.print("<input type=\"hidden\" id=\"hidden\" value=\"");%><%=request.getAttribute("param") %><% out.print("\"");
%> 
	<div id="nav" class="btn-group">
		<span class="label label-default">服务子项内容</span>
		<br/>
	</div>
	<div id="fun" class="btn-group" data-toggle="buttons-checkbox">
		<button class="btn btn-primary" id="add_servicecontent" style="float: left">新增</button>

		<button class="btn btn-primary" id="delete_servicecontent">删除</button>
		<button class="btn btn-primary" id="query_servicecontent" style="float: left">查询</button>
		<input id="querydata" type="text" size="2" class="form-control"
			style="width: 30%" placeholder="请输入内容名称.关键字查询....." value="">
	<br/>
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