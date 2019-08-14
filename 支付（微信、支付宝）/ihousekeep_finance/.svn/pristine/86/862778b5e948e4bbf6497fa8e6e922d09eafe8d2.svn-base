$(document).ready(function() {
	query();
	$("#new_usernamager").click(show_new_usermanager);
	$("#delete_systemuser").click(del_systemuser);
	$("#querydata").focus(function() {
		$("#querydata").val("");
	});
	$("#querydata").blur(function() {
		if ($("#querydata").val() == "") {
			$("#querydata").val("请输入查询关键字......");
		}
	});
	$("#query_systemuser").click(query_systemuser);
	//加载分页
	$("#page").load("../../../html/admin/page/page.html");
});

function edit(id) {
	var parm = {
		title : "修改用户",
		html : "./update_usermanager.html",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_system_user, exit ]
	};
	show_new_div(parm);
	// 查询回显示
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : "../../../System_User/querySystem_User.action",
		data : obj,
		success : editShow
	});
}

function editShow(data) {
	var d = data[0];
	$("#login_name").val(d.login_name);
	$("#name").val(d.name);
	$("#id").val(d.id);
}

function update_system_user() {
	var id = $("#id").val();
	var login_name = $("#login_name").val();
	var name = $("#name").val();
	var obj = new Object();
	obj.id = id;
	obj.login_name = login_name;
	obj.name = name;
	$.ajax({
		url : "../../../System_User/updateSystem_User.action",
		data : obj,
		type :"post",
		success : update_system_user_success
	});

}

function info(id) {
	alert("iiiiii");
}

function query() {
	var parm = {
		url : "../../../usermanager/queryAllUserinfo.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "登录名", "姓名", "角色" ],
		data_column : [ "id", "name", "role" ],
		title_column_width : [ "30%", "30%", "20%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

function query_by() {
	var obj = new Object();
	var value = $("#querydata").val();
	obj.login_name = value;
	obj.name = value;
	var parm = {
		url : "../../../System_User/querySystem_User_by.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "登录名", "姓名", "角色", "创建时间" ],
		data_column : [ "login_name", "name", "role", "createtime_str" ],
		title_column_width : [ "25%", "15%", "25%", "15%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
	
}

function show_new_usermanager() {
	var parm = {
		title : "新增用户",
		html : "./add_usermanager.html",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_system_user, exit ]
	};
	show_new_div(parm);
}

function query_systemuser() {
	var querydata = $("#querydata").val();
	if (querydata == "请输入查询关键字......") {
		query();
	} else {
		query_by();
	}
}

function add_system_user() {
	var login_name = $("#login_name").val();
	var name = $("#name").val();
	var login_pass = $("#login_pass").val();
	var system_user = new Object();
	system_user.login_name = login_name;
	system_user.name = name;
	system_user.userpass = login_pass;
	$.ajax({
		url : "../../../usermanager/adduser.action",
		data : system_user,
		type : "post",
		success : add_system_user_success,
		error : function(err) {
			alert("err");
		}
	});
}
//
function del_systemuser() {
	var parm = {
		url : "../../../System_User/deleteSystem_User.action",
		success : del_systemuser_success
	};
	
	
	delete_obj(parm);
}
function del_systemuser_success() {
	query();
	exit();
}

function add_system_user_success() {
	query();
	exit();
}
function update_system_user_success() {
	query();
	exit();
}
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}