$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_data").click(show_add);
	$("#delete_data").click(show_delete);
	$("#query_data").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
//批量删除 
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/Map_H_Controller_4W/delete_all_map.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
//查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = { 
		url : getRootPath()
				+ "/Map_H_Controller_4W/query_all_map.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "经度", "纬度", "点的颜色", "备注" ],
		data_column : [ "rownumber", "longitude","latitude","color","message"],
		contextType : [ "text", "text", "text", "text", "text", "text", "text" ],
		title_column_width : [ "8%", "12%", "12%", "12%", "12%", "12%", "12%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_color : [ "#62a8d1", "#66cc99" ],
		optr_callback : [ "edit", "del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
//定义全局update_id用于update_advertisement编辑页查询当前ID数据
var update_id;
//编辑广告
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑数据",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/data/update_data",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_data, exit ]
	};
	show_new_div(parm);
}
////删除指定单条数据
//function del(id) {
//	var obj = new Object();
//	obj.id = id;
//	$.ajax({
//				url : getRootPath()+ "/Map_H_Controller_4W/delete_map.action",
//				data : obj,
//				success : flush
//			});
//}
//添加广告
function show_add() {
	var parm = {
		title : "添加数据",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/data/add_data",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_data, exit ]
	};
	show_new_div(parm);
}
//修改广告
function update_data(){
	var obj = new Object();
	obj.id = update_id;
	var longitude = $("#longitude").val();
	var latitude = $("#latitude").val();
	var color = $("#color").val();
	var message = $("#message").val();
	obj.longitude = longitude;
	obj.latitude = latitude;
	obj.color = color;
	obj.message = message;
	$.ajax({
				url : getRootPath()+ "/Map_H_Controller_4W/update_map_By_Id.action",
				data : obj,
				success : flush
			});
}
//
function add_data(){
	var longitude = $("#longitude").val();
	var latitude = $("#latitude").val();
	var color = $("#color").val();
	var message = $("#message").val();
	var obj = new Object();
	obj.longitude = longitude;
	obj.latitude = latitude;
	obj.color = color;
	obj.message = message;
	$.ajax({
		url :getRootPath()+"/Map_H_Controller_4W/add_map.action",
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
