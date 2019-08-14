$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_apartment_type").click(show_add);
	$("#delete_apartment_type").click(show_delete);
	$("#query_apartment_type").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
// 批量删除
function show_delete(e) {
	var param = {
		url : getRootPath()
				+ "/Apartment_type_Manager_Controller_4W/delete_all_apartment_type_manager.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
// 通过id进行删除操作
function del(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/Apartment_type_Manager_Controller_4W/delete_apartment_type_manager.action",
				data : obj,
				success : flush
			});
}
// 查询操作
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val()
	var parm = {
		url : getRootPath()
				+ "/Apartment_type_Manager_Controller_4W/query_all_apartment_type_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "室", "厅", "卫", "厨" ],
		data_column : [ "num", "apartment_name_t", "apartment_name_c",
				"apartment_name_w", "apartment_name_s" ],
		contextType : [ "text", "text", "text", "text", "text" ],
		title_column_width : [ "5%", "15%", "15%", "15%", "15%", ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_color : [ "#62a8d1", "#66cc99" ],
		optr_callback : [ "edit", "del" ],
		optr_column_width : [ "20%" ]
	};
	showTable(parm);
}
// 通过id进行编辑
var update_id;
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑户型",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/apartment_type/update_apartment_type",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_apartment_type, exit ]
	};
	show_new_div(parm);
}
// 点击保存、调用这个方法
function update_apartment_type() {
	var obj = new Object();
	obj.id = update_id;
	var apartment_name_t = $("#apartment_name_t").val();
	var apartment_name_c = $("#apartment_name_c").val();
	var apartment_name_w = $("#apartment_name_w").val();
	var apartment_name_s = $("#apartment_name_s").val();
	obj.apartment_name_t = apartment_name_t;
	obj.apartment_name_c = apartment_name_c;
	obj.apartment_name_w = apartment_name_w;
	obj.apartment_name_s = apartment_name_s;
	$
			.ajax({
				url : getRootPath()
						+ "/Apartment_type_Manager_Controller_4W/update_apartment_type_manager_By_Id.action",
				data : obj,
				success : flush
			});
}
// 新增
function show_add() {
	var parm = {
		title : "添加户型",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/apartment_type/add_apartment_type",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_apartment_type, exit ]
	};
	show_new_div(parm);
}
// 添加操作
function add_apartment_type() {
	var apartment_name_t = $("#apartment_name_t").val();
	var apartment_name_c = $("#apartment_name_c").val();
	var apartment_name_w = $("#apartment_name_w").val();
	var apartment_name_s = $("#apartment_name_s").val();
	var obj = new Object();
	obj.apartment_name_t = apartment_name_t;
	obj.apartment_name_c = apartment_name_c;
	obj.apartment_name_w = apartment_name_w;
	obj.apartment_name_s = apartment_name_s;
	$
			.ajax({
				url : getRootPath()
						+ "/Apartment_type_Manager_Controller_4W/add_apartment_type_manager.action",
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
