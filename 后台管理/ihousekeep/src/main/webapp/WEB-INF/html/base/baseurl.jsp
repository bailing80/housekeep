
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.ccunix.ihousekeeping.login.domain.Login"%>
<%@page import="com.ccunix.ihousekeeping.parammanager.domain.SystemParam.SYSPARM"%>
<%@page import="com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Impl"%>
<%@page import="com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface"%>
<%@page import="com.ccunix.ihousekeeping.base.controller.BaseMultiController"%>
	<%
out.print("<input type=\"hidden\" id=\"login_hidden\" value=\"");%><%=request.getSession().getAttribute("admin") %><% out.print("\"");
%>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

	<%
		String baseurl = request.getContextPath();

		Object jsp_param = request.getParameter("param");
		if (jsp_param != null && !jsp_param.equals("null") && jsp_param.equals("")) {
			out.println("<script>");
			out.println("var jsp_param='" + jsp_param + "'");
			out.println("</script>");
		}
		
		ParamManager_Service_Iface paramManager_Service_Iface = new ParamManager_Service_Impl();
		String value_httpFileBasePath = paramManager_Service_Iface.getSystemParam(SYSPARM.httpFileBasePath);
		out.println("<script>");
		out.println("var httpFileBasePath='" + value_httpFileBasePath + "';");
		out.println("</script>");
	%>
	

</body>
</html>
<script src="<%=baseurl%>/js/jquery.js" type="text/javascript"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script type="text/javascript">
//alert(5)
//alert(document.getElementById("login_hidden").value)
if(document.getElementById("login_hidden").value=="null"){
	location.href=getRootPath() + "/Login_Controller_4W/login.action";
}
</script>