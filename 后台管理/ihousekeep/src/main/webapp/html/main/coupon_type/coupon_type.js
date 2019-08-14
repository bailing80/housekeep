$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_coupon_type").click(show_add);
	$("#delete_coupon_type").click(show_delete);
	$("#query_coupon_type").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
// 批量删除
function show_delete(e) {
	var param = {
		url : getRootPath()
				+ "/Coupon_type_Controller_4W/delete_all_coupon_type.action",
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
						+ "/Coupon_type_Controller_4W/delete_coupon_type_manager.action",
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
				+ "/Coupon_type_Controller_4W/queryAll_coupon_type.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "典型名称", "典型背景图片" ],
		data_column : [ "num", "type_name", "back_pic" ],
		contextType : [ "text", "text", "img" ],
		title_column_width : [ "15%", "15%", "15%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_color : [ "#62a8d1", "#66cc99" ],
		optr_callback : [ "edit", "del" ],
		optr_column_width : [ "15%", "15%" ]
	};
	showTable(parm);
}
// 通过id进行编辑
var update_id;
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑优惠券类型",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/coupon_type/update_coupon_type",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_coupon_type, exit ]
	};
	show_new_div(parm);
}
// 点击保存、调用这个方法
function update_coupon_type() {
	var obj = new Object();
	obj.id = update_id;
	var type_name = $("#type_name").val();
	var back_pic = $("#picture")[0].src.replace(httpFileBasePath, "");
	obj.type_name = type_name;
	obj.back_pic = back_pic;
	$.ajax({
		url : getRootPath()
				+ "/Coupon_type_Controller_4W/update_coupon_type_By_Id.action",
		data : obj,
		success : flush
	});
}
// 新增
function show_add() {
	var parm = {
		title : "添加优惠券类型",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/coupon_type/add_coupon_type",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_coupon_type, exit ]
	};
	show_new_div(parm);
}
// 添加操作
function add_coupon_type() {
	var type_name = $("#type_name").val();
	var picture = photo_1;
	var obj = new Object();
	obj.type_name = type_name;
	obj.back_pic = picture;
	$.ajax({
		url : getRootPath()
				+ "/Coupon_type_Controller_4W/add_coupon_type_manager.action",
		data : obj,
		success : flush
	});
	photo_1="";
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
