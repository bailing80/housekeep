<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加员工</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=baseurl%>/js/up_down_load.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/main/riderelegant/edit_ridermanager.js"></script>
</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>电话</td>
			<td><input id="phone" type="text" size="2"
				class="form-control" style="width: 30%"></td>
		</tr>
		<tr>
			<td>员工姓名</td>
			  <td><input id="name" type="text" size="2" class="form-control"
				style="width: 30%"></td> 
			<!-- <td><select id="select_rider"></select></td> -->
		</tr>
		<tr>
			<td>密码</td>
			  <td><input id="pwd" type="password" size="2" class="form-control"
				style="width: 30%"></td>  
			<!-- <td><select id="select_rider"></select></td> -->
		</tr>
		<tr>
			<td>确认密码</td>
			  <td><input id="cpwd" type="password" size="2" class="form-control"
				style="width: 30%"></td>  
			<!-- <td><select id="select_rider"></select></td> -->
		</tr>
		<%-- <tr>
			<td>员工图片</td>
			<td>
			<img id="photo" src="" width='100' heigh='100'>
				<form id="photo_form" action="<%=baseurl%>/FileUpLoadController/upload.action"
					enctype="multipart/form-data" method="post">
					<input name="file" id="height" type="file" size="2" class="form-control"
						style="width: 30%" accept="image/*">
				</form>
				<button id="up_button">上传</button>
			</td>
		</tr> --%>
		<tr>
			<td>身份</td>
			<!-- <td><input id="link_pic" type="text" size="2"
				class="form-control" style="width: 30%"></td> -->
			<td align="left"><select id="user_manager_role_id"></select></td>
		</tr>
		<tr>
			<td>上级员工</td>
			<!-- <td><input id="link_pic" type="text" size="2"
				class="form-control" style="width: 30%"></td> -->
			<td align="left"><select id="leader_role_id"></select></td>
		</tr>
		<tr>
			<td>是否允许登录</td>
			<!-- <td><input id="link_pic" type="text" size="2"
				class="form-control" style="width: 30%"></td> -->
			<td align="left">
				<select id="is_login" >
					<!-- <option value="01">允许登录</option>
					<option value="02">禁止登录</option> -->
				</select>
			</td>	
		</tr>
	</table>

</body>
</html>