$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_advertisement").click(show_add);
	$("#delete_advertisement").click(show_delete);
	$("#query_advertisement").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
//批量删除 
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/Advertisement_Controller_4W/delete_all_t_s_advertisement_manager.action",
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
				+ "/Advertisement_Controller_4W/query_all_t_s_advertisement_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "广告编号", "广告名称", "广告位置", "广告类型", "是否轮播", "轮播时长" ],
		data_column : [ "rownumber", "id", "advertisment_name", "position",
				"type_name", "is_wheel_str", "wheel_time" ],
		contextType : [ "text", "text", "text", "text", "text", "text", "text" ],
		title_column_width : [ "8%", "12%", "12%", "12%", "12%", "12%", "12%" ],
		hide_button : [ {
			datakey : "is_enable",
			dataval : "01",
			hideindex : 0
		}, {
			datakey : "is_enable",
			dataval : "02",
			hideindex : 1
		} ],
		optr : [ "操作" ],
		optr_project : [ "上架", "下架", "编辑", "删除","广告项目" ],
		optr_color : [ "#62a8d1", "#66cc99", "#62a8d1", "#66cc99" , "#62a8d1"],
		optr_callback : [ "on_sale", "off_sale", "edit", "del" , "set_item"],
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
		title : "编辑广告",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/advertisement/update_advertisement",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_advertisement, exit ]
	};
	show_new_div(parm);
}
//设置是否上架
function on_off_sale(id, on_or_off) {
	var obj = new Object();
	obj.id = id;
	obj.is_enable = on_or_off;
	$.ajax({
				url : getRootPath()+ "/Advertisement_Controller_4W/is_advertisement_enable.action",
				data : obj,
				success : flush
			});
}
//广告上架
function on_sale(id) {
	on_off_sale(id, '01');
}
//广告下架
function off_sale(id) {
	on_off_sale(id, '02');
}
//删除指定单条数据
function del(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Advertisement_Controller_4W/delete_t_s_advertisement_manager.action",
				data : obj,
				success : flush
			});
}
//添加广告
function show_add() {
	var parm = {
		title : "添加广告",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/advertisement/add_advertisement",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_advertisement, exit ]
	};
	show_new_div(parm);
}
//修改广告
function update_advertisement(){
	var obj = new Object();
	obj.id = update_id;
	//广告名称
	var advertisment_name = $("#advertisment_name").val();
	//广告位置
	var position = $("#position").val();
	//是否轮播
	var is_wheel = $("#is_wheel").val();
	//轮播时常
	var wheel_time = $("#wheel_time").val();
	//类型ID
	var type_id = $("#type_id").val();
	//是否上架
	var is_enable = $("input[name='is_enable']:checked").val();
	obj.advertisment_name = advertisment_name;
	obj.position = position;
	obj.is_wheel = is_wheel;
	obj.wheel_time = wheel_time;
	obj.type_id = type_id;
	obj.is_enable = is_enable;
	$.ajax({
				url : getRootPath()+ "/Advertisement_Controller_4W/update_Advertisement_manager_By_Id.action",
				data : obj,
				success : flush
			});
}
//添加广告
function add_advertisement(){
	var advertisment_name = $("#advertisment_name").val();
	var position = $("#position").val();
	var is_wheel = $("#is_wheel").val();
	var wheel_time = $("#wheel_time").val();
	var type_id = $("#type_id").val();
	var is_enable = $("input[name='is_enable']:checked").val();
	var obj = new Object();
	obj.advertisment_name = advertisment_name;
	obj.position = position;
	obj.is_wheel = is_wheel;
	obj.wheel_time = wheel_time;
	obj.type_id = type_id;
	obj.is_enable = is_enable;
	$.ajax({
		url :getRootPath()+"/Advertisement_Controller_4W/add_t_s_advertisement_manager.action",
		data : obj,
		success : flush
	});
}
//跳转到广告项目
function set_item(id){
	location.href=getRootPath() + "/BaseMultiController/toPage.action?page=main/advertisement_item/advertisement_item&param="+id;
}


function flush() {
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
