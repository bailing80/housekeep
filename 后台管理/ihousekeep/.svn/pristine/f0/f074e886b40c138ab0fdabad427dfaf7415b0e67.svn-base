<%@page import="java.io.IOException"%>
<%@page import="com.ccunix.icar.basedb.domain.T_s_role_2_menu"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link href="../../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../../../js/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="../../../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<%!public boolean check(String menuId, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		if (request != null) {
			if (session.getAttribute("menuList") != null) {
				List<T_s_role_2_menu> list = (List<T_s_role_2_menu>) session.getAttribute("menuList");
				for (int i = 0; i < list.size(); i++) {
					if (menuId.equals(list.get(i).getMenu_id())) {
						return true;
					}
				}
			} else {
				/* try {
					response.sendRedirect("/html/login.jsp");
				} catch (IOException exception) {
					exception.printStackTrace();
				} */
			}
		}

		return false;
	}%>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2">
				<ul id="main-nav" class="nav nav-tabs nav-stacked">
					<li class="active"><a href="#"> <i
							class="glyphicon glyphicon-th-large"></i> 首页
					</a></li>
					<li><a href="#systemSetting" class="nav-header collapsed"
						data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>
							系统管理 <span class="pull-right glyphicon glyphicon-chevron-down"></span>
					</a>
						<ul id="systemSetting" class="nav nav-list collapse secondmenu"
							style="height: 0px;">
							<li><a href="../../../test.html" target="center"><i
									class="glyphicon glyphicon-user">app接口测试</i></a></li>
							<li><a href="../../../html/admin/codemake/codemake.html"
								target="center"><i class="glyphicon glyphicon-user">代码生成</i></a></li>

							<li><a href="../../../test_util.html" target="center"><i
									class="glyphicon glyphicon-th-list"></i>开发工具</a></li>
									
							<li><a href="https://cli.im/" target="center"><i
									class="glyphicon glyphicon-th-list"></i>二维码生成</a></li>	
									
						</ul></li>


					<li><a href="#systemSetting5" class="nav-header collapsed"
						data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>
							客服 <span class="pull-right glyphicon glyphicon-chevron-down"></span>
					</a>
						<ul id="systemSetting5" class="nav nav-list collapse secondmenu"
							style="height: 0px;">
							<%
								if (check("1", request, response)) {
							%><li><a
								href="../../../BaseMultiController/toPage.action?page=ccmap/ccmap"
								target="center"><i class="glyphicon glyphicon-th-list"></i>派单</a></li></li>
					<%
						}
					%>
				</ul>

				<!-- 后台管理	-->
				<li><a href="#systemSetting4" class="nav-header collapsed"
					data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>
						账号管理<span class="pull-right glyphicon glyphicon-chevron-down"></span>
				</a>
					<ul id="systemSetting4" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<%
							if (check("2", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=account_management/StaffManage"
							href="../../../BaseMultiController/toPage.action?page=account_management/usermanager"
							target="center"><i class="glyphicon glyphicon-th-list"></i>用户管理</a></li>
						<%
							}
						%>

						<%
							if (check("3", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=washeruser/washerManager"
							target="center"><i class="glyphicon glyphicon-th-list"></i>洗手管理</a></li>
						<%
							}
						%>
						<%
							if (check("4", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=account_management/RoleManage"
							target="center"><i class="glyphicon glyphicon-th-list"></i>角色管理</a></li>
						<%
							}
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=updatepwd/updatepwd"
							target="center"><i class="glyphicon glyphicon-th-list"></i>修改密码</a></li>
						<!-- 	<li><a
								href="../../../BaseMultiController/toPage.action?page=account_management/agent_management"
								target="center"><i class="glyphicon glyphicon-th-list"></i>代理商管理</a></li> -->
						<!-- <li><a
								href="../../../BaseMultiController/toPage.action?page=menu/menu"
								target="center"><i class="glyphicon glyphicon-th-list"></i>菜单管理</a></li> -->
					</ul></li>
				<li><a href="#systemSetting6" class="nav-header collapsed"
					data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>
						代理商管理<span class="pull-right glyphicon glyphicon-chevron-down"></span>
				</a>
					<ul id="systemSetting6" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<%
							if (check("5", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=agent_management/cityA_captainManager"
							target="center"><i class="glyphicon glyphicon-th-list"></i>市代-队长管理</a></li>
						<%
							}
						%>
						<%
							if (check("6", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=account_management/ordermanager"
							target="center"><i class="glyphicon glyphicon-th-list"></i>市代-订单管理</a></li>
						<%
							}
						%>
						<%
							if (check("7", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=cityproxywithdrawal/cityproxywithdrawal"
							target="center"><i class="glyphicon glyphicon-th-list"></i>市代-提现</a></li>
						<%
							}
						%>
						<%
							if (check("8", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=captainwasher_management/captainwasher_Management"
							target="center"><i class="glyphicon glyphicon-th-list"></i>队长-洗手管理</a></li>
						<%
							}
						%>
						<%
							if (check("9", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=caporder/capOrder"
							target="center"><i class="glyphicon glyphicon-th-list"></i>队长-订单管理</a></li>
						<%
							}
						%>
						<%
							if (check("10", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=agent_management/captainWithdrawMoney"
							target="center"><i class="glyphicon glyphicon-th-list"></i>队长提现</a></li>
						<%
							}
						%>


					</ul></li>
				<!-- 业务管理	-->
				<li><a href="#systemSetting3" class="nav-header collapsed"
					data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>
						业务管理 <span class="pull-right glyphicon glyphicon-chevron-down"></span>
				</a>
					<ul id="systemSetting3" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<%
							if (check("12", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=business_management/order_management"
							target="center"><i class="glyphicon glyphicon-th-list"></i>订单管理</a></li>
						<%
							}
						%>
						<%
							if (check("11", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=withdrawal_management/withdrawal_management"
							target="center"><i class="glyphicon glyphicon-th-list"></i>提现管理</a></li>
						<%
							}
						%>
						<%
							if (check("13", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=business_management/service_setting"
							target="center"><i class="glyphicon glyphicon-th-list"></i>服务设置</a></li>
						<%
							}
						%>
						<%
							if (check("14", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=fundallocation/fundallocation"
							target="center"><i class="glyphicon glyphicon-th-list"></i>资金分配</a></li>
						<%
							}
						%>
						<!-- <li><a
								href="../../../BaseMultiController/toPage.action?page=business_management/system_setting"
								target="center"><i class="glyphicon glyphicon-th-list"></i>系统设置</a></li> -->
						<!-- <li><a
								href="../../../BaseMultiController/toPage.action?page=business_management/invitationCode_management"
								target="center"><i class="glyphicon glyphicon-th-list"></i>邀请码管理</a></li> -->
						<%
							if (check("15", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=business_management/coupon_management"
							target="center"><i class="glyphicon glyphicon-th-list"></i>优惠券管理</a></li>
						<%
							}
						%>
						<%
							if (check("15", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=carmodelmanager/carmodelmanager"
							target="center"><i class="glyphicon glyphicon-th-list"></i>车型/价格管理</a></li>
						<%
							}
						%>
						<%
							if (check("16", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=business_management/problem_feedback"
							target="center"><i class="glyphicon glyphicon-th-list"></i>问题反馈</a></li>
						<%
							}
						%>
						<%
							if (check("17", request, response)) {
						%>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=setbusinesstime/setbusinesstime"
							target="center"><i class="glyphicon glyphicon-th-list"></i>修改营业时间</a></li>
						<%
							}
						%>
						
						<li><a
							href="../../../BaseMultiController/toPage.action?page=ccmap/putwasher"
							target="center"><i class="glyphicon glyphicon-th-list"></i>洗手派单</a></li>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=ccmap/doorder"
							target="center"><i class="glyphicon glyphicon-th-list"></i>已匹配订单</a></li>
						<li><a
							href="../../../BaseMultiController/toPage.action?page=ccmap/washer"
							target="center"><i class="glyphicon glyphicon-th-list"></i>洗手</a></li>
						
						<li><a
							href="../../../BaseMultiController/toPage.action?page=app_proxy/proxy_city"
							target="center"><i class="glyphicon glyphicon-th-list"></i>我要合作</a></li>

						<li><a
							href="../../../BaseMultiController/toPage.action?page=app_proxy/proxy_fran"
							target="center"><i class="glyphicon glyphicon-th-list"></i>合作须知</a></li>
					</ul></li>

	




				</ul>
			</div>
			<div class="col-md-10" id="main"></div>
		</div>
	</div>
</body>
</html>