/**
 * 
 */
$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_test").click(show_add);
	$("#delete_test").click(show_delete);
	$("#query_test").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

function query() {
	var parm = {
		url : getRootPath() + "/T_lz_systemacct_Controller_4W/queryAllsystemacct.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "系统收款账户类型", "系统收款账户" ],
		data_column : [ "type_name", "system_acct" ],
		contextType : [ "text", "text" ],
		title_column_width : [ "40%", "40%"],
		optr : [ "操作" ],
		optr_project : [ "编辑"],
		optr_color : [ "#62a8d1"],
		optr_callback : [ "edit" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/Test_Controller_4W/delete_test.action",
		data : obj,
		success : flush
	});
}

function show_add() {
	var parm = {
		title : "新增账户数据",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/business_group/add_business_group",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_test, exit]
	};
	show_new_div(parm);
}

function add_test(){
	var system_acct = $("#system_acct").val();
	var receive_type = $("input[name='is_enable']:checked").val();
	alert(receive_type);
	var obj = new Object();
	obj.system_acct = system_acct;
	obj.receive_type = receive_type;
	$.ajax({
		url :getRootPath()+"/T_lz_systemacct_Controller_4W/add_systemacct.action",
		data : obj,
		success : flush
	});
}
function show_delete(e){
	var param = {
			url : getRootPath()
					+ "/T_lz_systemacct_Controller_4W/delete_systemacct.action",
			error : flush,
			success : flush,
		}
		delete_obj(param);
}
var update_id; 
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑数据",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/business_group/update_business",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_business, exit ]
	};
	show_new_div(parm);
}
function update_business(){
	var system_acct = $("#system_acct").val();
	var receive_type = $("input[name='is_enable']:checked").val();
	alert(receive_type);
	alert(system_acct);
	var obj = new Object();
	obj.id = update_id;
	obj.system_acct = system_acct;
	obj.receive_type = receive_type;
	$.ajax({
		url :getRootPath()+"/T_lz_systemacct_Controller_4W/update_systemacct_By_Id.action",
		data : obj,
		success : flush
	});
}
function flush(){
	query();
	exit();
}

function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
}
