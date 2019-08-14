<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=baseurl%>/css/base.css" rel="stylesheet">
<link rel="stylesheet" href="<%=baseurl%>/css/style.css" />
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<!-- Bootstrap -->
<script type="text/javascript">
	$(document).ready(function() {
		//$("#temp_loginout_button").click(loginout);
	});
	function loginout() {
		alert("here");
		window.location.href = getRootPath()
				+ "/AdminLogin_Controller_4W/exit.action";
		/* 	 $.ajax({
		 url:getRootPath()+"/AdminLogin_Controller_4W/exit.action",
		 data:null,
		 type:"get"
		
		
		 }); */
	}

	/* $("#temp_loginout_button").click(
	 function(){
	 alert("here");
	
	 }
	 ) */
</script>


</head>
<body style="background: #59b1f3;">
	<%
		String role_id="0";
		Object getSession = session.getAttribute("role_id");
		if(getSession!=null && !getSession.equals("")){
		role_id= (String) session.getAttribute("role_id");
			
		}
		String role_name = null;
		if (role_id.equals("01")) {
			role_name = "洗手";
		} else if (role_id.equals("02")) {
			role_name = "队长";
		} else if (role_id.equals("03")) {
			role_name = "城市代理";
		} else if (role_id.equals("04")) {
			role_name = "财务";
		} else if (role_id.equals("05")) {
			role_name = "客服";
		} else if (role_id.equals("06")) {
			role_name = "管理员";
		}else{
			role_name="游客";
		}
	%>
	<header class="navbar-wrapper">

		<a style="line-height: 80px;" href="<%=baseurl%>/html/login.jsp"
			target="_top">
			<button class="btn btn-primary" id="temp_loginout_button"
				style="float: right;">退出</button>
		</a>
		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="#" class="navbar-brand"> <small> <img
						src="images/logo.png" width="470px">
				</small>
				</a>
				<!-- /.brand -->
			</div>
			<!-- /.navbar-header -->

			<div class="navbar-header pull-right" role="navigation">
				<ul class="nav ace-nav">
					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <span class="time"><em
								id="time"></em></span><span class="user-info"><small>欢迎光临,</small><%=role_name%>
						</span> <i class="icon-caret-down"></i>
					</a>
						<ul
							class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close"
							style="">
							<li><a href="javascript:void(0" name="Systems.html"
								title="系统设置" class="iframeurl"><i class="icon-cog"></i>修改密码</a></li>

							<!-- <li><a href="" id="Exit_system"><i class="icon-off"></i>退出</a></li>
                 <li></li> -->
						</ul></li>



				</ul>

			</div>
		</div>


	</header>

</body>
</html>