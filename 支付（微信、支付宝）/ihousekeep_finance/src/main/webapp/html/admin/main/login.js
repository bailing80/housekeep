$(document).ready(function(){
	$("#temp_login_button").click(login);
});

var login_name ="13756035707";
function login(){
	var obj = new Object();
	obj.login_name=login_name;
	obj.login_pass="123456";
	$.ajax({
		url :"../../../LoginController/login.action",
		data :obj,
		type :"post",
		success: loginsuccess
	});
}
function loginsuccess(data){
	if(data == true){
		$("#temp_login_button").text("登录成功:"+login_name);
	}
}