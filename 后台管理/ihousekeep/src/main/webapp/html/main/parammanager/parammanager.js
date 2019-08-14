$(document).ready(function() {
	query();
	// 加载分页
	var pageurl = getRootPath() + "/html/admin/page/page.html";
	$("#page").load(pageurl);
	$("#addparam").click(addparam);
});

function query() {
	var parm = {
		url : getRootPath()
				+ "/ParamManager_Controller_4W/queryAllParam.action",
		date : null,
		firstcheck : false,
		table_obj : $("#datatable"),
		title : [ "序号", "名称", "内容", "描述" ],
		contextType : [ "text", "text", "text", "text" ],
		data_column : [ "num", "s_key", "s_value", "s_discription" ],
		data_hidden : [ "s_key" ],
		title_column_width : [ "5%", "10%", "42%", "22%" ],
		optr : [ "操作" ],
		optr_project : [ "修改", "删除" ],
		optr_color : [ "#f05825", "#66cc99" ],
		optr_callback : [ "update", "del" ],
		optr_column_width : [ "21%" ]
	};
	showTable(parm);
}
var update_id;
function update(id, d) {
	update_id = id;
	var parm = {
		title : "修改系统变量",
		html : getRootPath() + "/BaseMultiController/toPage.action?page=main/parammanager/addparam",
		width : "50%",
		height : "65%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_param, exit ]
	};
	show_new_div(parm);

	var str = d.split(',');
	var obj = new Object();
	obj.s_key = str[0];
	$.ajax({
		url : getRootPath()
				+ "/ParamManager_Controller_4W/queryOneParam.action",
		data : obj,
		type : "post",
		success : queryByKey
	});
}
function queryByKey(t_s_system_param1) {
	$("#s_key").val(t_s_system_param1.s_key);
	$("#s_value").val(t_s_system_param1.s_value);
	$("#s_discription").val(t_s_system_param1.s_discription);
}
function update_param() {
	var obj = new Object();
	obj.id = update_id;
	obj.s_key = $("#s_key").val();
	obj.s_value = $("#s_value").val();
	obj.s_discription = $("#s_discription").val();
	$.ajax({
		url : getRootPath() + "/ParamManager_Controller_4W/updateParam.action",
		data : obj,
		type : "post",
		success : update_system_user_success
	});
}
function addparam() {
	var parm = {
		title : "添加系统变量",
		html : getRootPath() + "/BaseMultiController/toPage.action?page=main/parammanager/addparam",
		width : "50%",
		height : "65%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add, exit ]
	};
	show_new_div(parm);

}
function add() {
	var obj = new Object();
	var s_key = $("#s_key").val();
	var s_value = $("#s_value").val();
	var s_discription = $("#s_discription").val();
	if (isnull(s_key)) {
		obj.s_key = s_key;
		if (isnull(s_value)) {
			obj.s_value = s_value;
			if (isnull(s_discription)) {
				obj.s_discription = s_discription;
				$.ajax({
					url : getRootPath()+ "/ParamManager_Controller_4W/addparam.action",
					data : obj,
					type : "post",
					success : update_system_user_success
				});

			} else {
				alert("描述不能为空");
			}
		} else {
			alert("内容不能为空");
		}
	} else {
		alert("名称不能为空");
	}

}
function isnull(val) {

	var str = val.replace(/(^\s*)|(\s*$)/g, '');// 去除空格;

	if (str == '' || str == undefined || str == null) {
		// return true;
		console.log('空')
		return false;
	} else {
		// return false;
		console.log('非空');
		return true;
	}
}
function del(id, d) {
	var str = d.split(',');
	var obj = new Object();
	obj.s_key = str[0];
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/ParamManager_Controller_4W/deleteparam.action",
		data : obj,
		type : "post",
		success : delete_system_user_success
	});
}
function update_system_user_success(message) {
	alert(message);
	query();
	exit();
}
function delete_system_user_success(message) {
	alert(message);
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
