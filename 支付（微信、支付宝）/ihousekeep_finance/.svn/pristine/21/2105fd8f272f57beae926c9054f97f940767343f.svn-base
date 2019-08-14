<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title> 东学上门洗车后台登录 </title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="<%=baseurl %>/js/jquery.js"></script>
<script src="<%=baseurl %>/js/base.js" type="text/javascript"></script>
<link type="text/css" href="<%=baseurl %>/css/login.css" rel="stylesheet" />
<link href="<%=baseurl %>/css/style.css" rel="stylesheet" />
<script type="text/javascript" src="<%=baseurl %>/js/html/login/login.js"></script> 
   
</head>
<%
session.invalidate();
%>

<body style="background: #f6f6f6">

<div class="wrapper" id="login_head" style="display:">
	<div class="log_head">
		<h1 class="log_logo left"><a href="#"><span>后台管理系统</span></a></h1>
	</div>
</div>
<div class="login_wrap" style="width:; background:#fff url(<%=baseurl %>/images/20161209115754_5628.jpg) no-repeat center top; padding:40px 0;">
	<div class="wrapper" id="login_body" style="width:;">
		<div class="log_ad" style="display:"><a href="javascript:;"></a></div>
		<div class="login_border" style="padding:8px;">
			<div class="login" style="display: block;">
				<ul class="login-tab">
					<li class="login-on"><em>欢迎登录</em></li>
				</ul>
				<div class="login-body">
				<!-- 用于实现页面跳转 -->
						<form  id="jumpform" action="AdminLogin_Controller_4W/jump.action" method="post">
						</form>
					<div class="login-style" style="display: block;">
						<dl><dd><input name="txtUser" type="text" id="txtUser" value ="${cookie.txtUser.value }" placeholder="用户名/邮箱/手机号" /></dd></dl>
						<dl>
							<dd><input type="password" id="Userpwd" value="${cookie.password.value }"  placeholder="请输入您的密码" /></dd>
						</dl>
						<div class="remember">
							<input type="checkbox" id="issave" checked /><label for="issave">下次自动登录</label>
						</div>
						<div class="tishi"></div>
						<button  id="logbtn" style="outline:none">登 录</button>
						
					</div>
					<div class="login-style">
						<dl><dd><input name="phone" type="text" id="phone" placeholder="您的手机号码" /></dd></dl>
						<!-- <dl id="yz-code" style="display: none;">
						<dd><input type="text" id="txtCode2" name="txtCode2" style="width: 133px; margin-right: 10px;" placeholder="验证码" /><img id="Img1" src="" width="90" height="34" title="点击换一个" style="vertical-align: middle; margin-top: -4px;" onclick="this.src='/ImgCode.aspx?t='+Math.random()*100" /></dd>
						</dl> -->
						<dl>
							<dd><input type="text" id="dynamicPWD" onKeyDown="enterHandler(event)" style="width: 133px;" placeholder="短信验证码" /><input type="button" id="btn" class="btn_mfyzm" value="获取动态密码" onClick="Sendpwd(this)" /></dd>
						</dl>
						<div class="remember">
							<input type="checkbox" id="issave1" checked /><label for="issave1">下次自动登录</label>
						</div>
						<div class="tishi"></div>
						<button type="button" id="dynamicLogon" style="outline:none">登 录</button>
					</div>
				</div>
				
				
				
			</div>
			
		</div>
		<div class="clear"></div>
	</div>
</div>


<div class="bottom">
	<div class="wrapper">
		<div class="copy">
			<p> 全国服务热线：0431-848633 &nbsp;&nbsp;&nbsp;&nbsp; 工作时间：周一至周日 09:00-20:30</p>
			<p>网站ICP备案号：<a rel="nofollow" href="javascript:;" target="_blank">吉ICP备xxxxx号</a> &nbsp;&nbsp;&nbsp;&nbsp; 电信业务经营许可证：吉A-xxxx号 &nbsp;&nbsp;&nbsp;&nbsp; </p>
			<p>Copyright ©2018 All Rights Reserved</p>
		</div>
	</div>
</div>
<script type="text/javascript" src="<%=baseurl %>/js/style.js"></script>

</body>

</html>
