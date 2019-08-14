<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=baseurl%>/css/base.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=baseurl%>/html/main/acct_details/acct_details.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>

<script src="<%=baseurl%>/js/dateutil/canlen.js"></script>

</head>
<body>

	<div id="nav" class="btn-group">
		<span class="label label-default">测试</span>
	</div>
	<div id="fun" class="btn-group" data-toggle="buttons-checkbox">
		<!-- <button class="btn btn-primary" id="add_test" style="float: left">新增</button>
		<button class="btn btn-primary" id="delete_test">删除</button>
		<button class="btn btn-primary" id="query_test" style="float: left">查询</button>
		<input id="querydata" type="text" size="2" class="form-control"
			style="width: 30%" placeholder="请输入查询关键字......" value="">  -->
			
			
			
		从：<input id="order_time_begin" type="text" size="2"  onclick="createOutDiv(this)"
			style="width: 10%" placeholder="开始时间yyyy-mm-dd">
			
	        到：<input id="order_time_end" type="text" size="2"   onclick="createOutDiv(this)"
			style="width: 10%" placeholder="结束时间yyyy-mm-dd">
			
		直销商名称：<input id="saler_name" type="text" size="2" value=""
			style="width: 10%" placeholder="查询直销商名称" >
	        分销商名称：<input id="acct_name" type="text" size="2" value=""
			style="width: 10%" placeholder="查询分销商名称">
		<input type="radio" id="radiomohu" name = "radioquery" checked="checked" value = "模糊查询">模糊查询
		<input type="radio" name = "radioquery" value = "精准查询">精准查询
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" id="query_test" >查询</button>
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