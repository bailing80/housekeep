<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加项目</title>
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
<script type="text/javascript" src="<%=baseurl%>/html/main/serviceitem_lowerlevel/add_service_lowerlevel.js"></script>
<script type="text/javascript" src="<%=baseurl%>/html/main/serviceitem_lowerlevel/updata_service_lowerlevel.js"></script>
</head>
<body>
<table border="1" class="table table-striped" style="width: 100%;">
		<tr>
			<td>子项目名称</td>
			<td><input id="item_name" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>

		<tr>
			<td>子项目单价(元)</td>
			<td><input id="item_price" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>计量单位</td>
			<td><select id="unit_id"
				class="form-control" style="width: 30%">
			</select></td>
		</tr>
		<tr>
			<td>图片</td>
			<td align="left">
				<img name="file" id="item_picture" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id="photo_form"
					style="width: 30%; display: inline-block; margin-right: 30px; vertical-align: bottom;"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="picture_edit" type="file" size="2"
						  accept="image/*">
				</form>
				<button style="vertical-align: bottom;" id="edit_button">上传图片</button>
			</td>
		</tr>
		<tr>
			<td>子项目上限</td>
			<td><input id="item_upper_limit" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>子项目下限</td>
			<td><input id="item_lower_limit" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>超出上限单价</td>
			<td><input id="upper_per_price" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>超出上限价格</td>
			<td><input id="upper_total_price" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>低于下限单价</td>
			<td><input id="lower_per_price" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>低于下限价格</td>
			<td><input id="lower_total_price" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>

	</table>
</body>

</body>
</html>