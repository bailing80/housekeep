$(document).ready(function() {
	$("#logbtn").click(login);
	
});
function login() {
 var loginName = $("#txtUser").val();
 var password = $("#Userpwd").val();
 if(loginName !=null && loginName !="" && password !=null && password !=""){
	 var login = new Object();
	 login.name = loginName;
	 login.pwd = password;
	 $.ajax({
		 url:getRootPath()+"/Login_Controller_4W/query_all_t_u_login.action",
		 data: login,
		 success: addInfo
		 
		
	 });
 }else{
	 alert("用户名或者密码不能为空");
 }
    
}

function addInfo(data){
	var d = $(data);
/*	alert(d.length)
	alert(d[0].name)
	alert(d[0].pwd)*/
	if(d.length==0){
	$(".tishi").html("<font style='color:red;font-size:10px;'>账号或者密码输入错误</font>");
	}else{
		//location.href=getRootPath()
		//+"/BaseMultiController/toPage.action?page=index.html&param="
		//location.href="backset/index.html";
		// getRootPath()+ "/BaseMultiController/toPage.action?page=main/advertisement/update_advertisement",
		location.href= getRootPath()+ "/BaseMultiController/toPage.action?page=backset/index";
	}
}

