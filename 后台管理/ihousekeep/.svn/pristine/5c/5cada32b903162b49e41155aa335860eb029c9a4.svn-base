$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_manager").click(show_add);
	$("#delete_manager").click(show_delete);
	$("#query_manager").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
// 批量删除
function show_delete(e) {
	var param = {
		url : getRootPath()
				+ "/Manager_Controller_4W/delete_all_manager.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
// 查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath() + "/Manager_Controller_4W/query_all_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "姓名", "电话", "身份名称", "是否允许登陆" ],
		data_column : [ "num", "name", "phone", "user_manager_role_name",
				"is_login_str" ],
		contextType : [ "text", "text", "text", "text", "text", "text" ],
		title_column_width : [ "8%", "12%", "12%", "12%", "12%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_color : [ "#62a8d1", "#66cc99" ],
		optr_callback : [ "edit", "del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
// 定义全局update_id用于查询当前ID数据
var update_id;
// 编辑管理员
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑管理员",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/manager/update_manager",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_manager, exit ]
	};
	show_new_div(parm);
}

// 修改管理员
function update_manager() {
	var obj = new Object();
	obj.id = update_id;
	var name = $("#name").val();
	var phone = $("#phone").val();
	var user_manager_role_name = $("#user_manager_role_name").val();
	var is_login = $("input[name='is_login']:checked").val();
	obj.name = name;
	obj.phone = phone;
	obj.user_manager_role_name = user_manager_role_name;
	obj.is_login = is_login;
	$.ajax({
		url : getRootPath()
				+ "/Manager_Controller_4W/update_manager_By_Id.action",
		data : obj,
		success : flush
	});
}

// 删除指定单条数据
function del(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/Manager_Controller_4W/delete_manager.action",
		data : obj,
		success : flush
	});
}
// 添加管理员
function show_add() {
	var parm = {
		title : "添加管理员",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/manager/add_manager",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_manager, exit ]
	};
	show_new_div(parm);
}
// 添加操作
function add_manager() {
	var name = $("#name").val();
	var phone = $("#phone").val();
	var manager_role_id = $("#manager_role_id").val();
	var is_login = $("input[name='is_login']:checked").val();
	var obj = new Object();
	obj.name = name;
	obj.phone = phone;
	obj.manager_role_id = manager_role_id;
	obj.is_login = is_login;
	$.ajax({
		url : getRootPath() + "/Manager_Controller_4W/add_manager.action",
		data : obj,
		success : flush
	});
}

function flush() {
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
