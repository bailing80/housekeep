<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改面积大小</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=baseurl%>/html/main/area_type/update_area_type.js"></script>

</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>面积名称</td>
			<td><p style="float: left">
					<input id="area_name_list" type="text" size="2"
						class="form-control" style="float: left">
				<p style="float: left">至</p>
				<p style="float: left">
					<input id="area_name_most" type="text" size="2"
						class="form-control">
				<p style="float: left">㎡</p>
</td>
		</tr>

	</table>

</body>
</html>