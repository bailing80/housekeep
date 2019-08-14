$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_area_type").click(show_add);
	$("#delete_area_type").click(show_delete);
	$("#query_area_type").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
// 批量删除
function show_delete(e) {
	var param = {
		url : getRootPath()
				+ "/Area_type_Manager_Controller_4W/delete_all_area_type_manager.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
// 查询方法
function query() {
	var obj = new Object();
	var parm = {
		url : getRootPath()
				+ "/Area_type_Manager_Controller_4W/query_all_area_type_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "面积名称-小", "面积名称-大" ],
		data_column : [ "num", "area_name_list", "area_name_most" ],
		contextType : [ "text", "text", "text" ],
		title_column_width : [ "5%", "20%", "20%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_color : [ "#62a8d1", "#66cc99" ],
		optr_callback : [ "edit", "del" ],
		optr_column_width : [ "20%" ]
	};
	showTable(parm);
}
// 通过id进行修改
var update_id;
function edit(id) {
	update_id = id;
	var parm = {
		title : "添加面积",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/area_type/update_area_type",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_area_type, exit ]
	};
	show_new_div(parm);
}
// 通过id进行删除
function del(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/Area_type_Manager_Controller_4W/delete_area_type_manager.action",
				data : obj,
				success : flush
			});
}
// 点击新增、调用这个方法
function show_add() {
	var parm = {
		title : "添加面积名称",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/area_type/add_area_type",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_area_type, exit ]
	};
	show_new_div(parm);
}
// 点击编辑、调用这个方法（编辑操作）
function update_area_type() {
	var obj = new Object();
	obj.id = update_id;
	var area_name_list = $("#area_name_list").val();
	var area_name_most = $("#area_name_most").val();
	obj.area_name_list = area_name_list;
	obj.area_name_most = area_name_most;
	$
			.ajax({
				url : getRootPath()
						+ "/Area_type_Manager_Controller_4W/update_area_type_manager.action",
				data : obj,
				success : flush
			});
}
// 点击保存、调用这个方法
function add_area_type() {
	var area_name_list = $("#area_name_list").val();
	var area_name_most = $("#area_name_most").val();
	var obj = new Object();
	obj.area_name_list = area_name_list;
	obj.area_name_most = area_name_most;
	$
			.ajax({
				url : getRootPath()
						+ "/Area_type_Manager_Controller_4W/add_area_type_manager.action",
				data : obj,
				success : flush
			});
}
// 刷新
function flush() {
	query();
	exit();
}
// 关闭
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
