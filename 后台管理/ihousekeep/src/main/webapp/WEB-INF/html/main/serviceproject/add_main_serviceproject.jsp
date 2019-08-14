<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加服务项目</title>
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
<script type="text/javascript" src="<%=baseurl%>/html/main/serviceproject/add_main_serviceproject.js"></script>
</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>项目名称</td>
			<td><input id="project_name" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>项目顺序</td>
			<td><input id="project_order" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>是否首页展示</td>
			<td style="text-align: left;"><input  type="radio" name="is_show" value="1" checked="checked" style="transform:scale(1.2);width:20px;">是<input type="radio" name="is_show" value="2" style="transform:scale(1.2);width:20px;">否
			
			</td>
		</tr>
		<tr>
			<td>起价</td>
			<td><input id="on_price" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>顶部项目展示图片</td>
			<td style="text-align: left;">
			<img name="file" id="top_picture" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id="photo_form_top_picture"
					style="width: 30%; display: inline-block; margin-right: 30px; vertical-align: bottom;"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="file_top_picture" type="file" size="2"
						 accept="image/*" >
				</form>
				<button style="vertical-align: bottom;" id="up_button_top_picture">上传图片</button>
		</td>
		</tr>
		<tr>
			<td>底部封面图片</td>
			<td style="text-align: left;">
			<img name="file" id="front_picture" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
				<form id="photo_form_front_picture"
					style="width: 30%; display: inline-block; margin-right: 30px; vertical-align: bottom;"
					action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="file_front_picture" type="file" size="2"
						 accept="image/*" >
				</form>
				<button style="vertical-align: bottom;" id="up_button_front_picture">上传图片</button>
			</td>
		</tr>
	</table>
</body>
</html>