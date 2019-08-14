<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改服务项目</title>
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
<script type="text/javascript" src="<%=baseurl%>/html/main/serviceproject/details_main_serviceproject.js"></script>
</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>项目名称</td>
			<td id="project_name"></td>
		</tr>
		<tr>
			<td>项目顺序</td>
			<td id="project_order"></td>
		</tr>
		<tr>
			<td>是否首页展示</td>
			<td id="is_show"></td>
		</tr>
		<tr>
			<td>起价</td>
			<td id="on_price"></td>
		</tr>
		<tr>
			<td>顶部项目展示图片</td>
			<td style="text-align: left;">
			<img name="file" id="top_picture" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
		</td>
		</tr>
		<tr>
			<td>底部封面图片</td>
			<td style="text-align: left;">
			<img name="file" id="front_picture" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
			</td>
		</tr>
		<tr>
			<td>保洁前照片</td>
			<td style="text-align: left;">
			<img name="file" id="picture_bef" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
			</td>
		</tr>
		<tr>
			<td>保洁后照片</td>
			<td style="text-align: left;">
			<img name="file" id="picture_aft" 
						 style="width: 135px;height:80px; display: inline-block; margin-right: 30px; vertical-align: bottom;">
			</td>
		</tr>
		<tr>
			<td>项目介绍</td>
			<td id="introduce"></td>
		</tr>
		<tr>
			<td>项目特色</td>
			<td id="characteristic"></td>
		</tr>
		<tr>
			<td>底部封面链接</td>
			<td id="front_picture_link"></td>
		</tr>
		<tr>
			<td>保洁前链接</td>
			<td id="picture_bef_link"></td>
		</tr>
		<tr>
			<td>保洁后链接</td>
			<td id="picture_aft_link"></td>
		</tr>
	</table>
</body>
</html>