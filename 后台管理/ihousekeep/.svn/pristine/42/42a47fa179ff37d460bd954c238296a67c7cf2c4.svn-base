$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_serviceproject").click(show_add);
	$("#delete_serviceproject").click(show_delete);
	$("#query_serviceproject").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

//查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath()
				+ "/ServiceProject_Controller_4W/query_all_service_project_Service_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "项目名称", "项目顺序", "是否首页展示", "起价（元）", "顶部项目展示图片", "底部封面图片" ],
		data_column : [ "rownumber", "project_name", "project_order",
				"is_show_str", "on_price", "top_picture", "front_picture" ],
		contextType : [ "text", "text", "text", "text", "text", "img", "img" ],
		title_column_width : [ "8%", "12%", "12%", "12%", "12%", "12%", "12%" ],
		optr : [ "操作" ],
		optr_project : [  "编辑", "删除", "详情" ,"子项目设置"],
		optr_color : [ "#62a8d1", "#66cc99", "#62a8d1", "#66cc99"],
		optr_callback : [ "edit", "del" , "details","set_item"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
//编辑服务项目
var update_id;
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑服务项目",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/serviceproject/update_main_serviceproject",
		width : "50%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_serviceproject, exit ]
	};
	show_new_div(parm);
}
//服务项目详情
function details(id) {
	update_id = id;
	var parm = {
			title : "服务项目详情",
			html : getRootPath()
			+ "/BaseMultiController/toPage.action?page=main/serviceproject/details_main_serviceproject",
			width : "50%",
			height : "113%",
			div_obj : $("#new_div"),
			buttons : [ "退出" ],
			buttons_callback : [ exit ]
	};
	show_new_div(parm);
}
//删除数据
function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/ServiceProject_Controller_4W/delete_service_project_Service_manager.action",
		data : obj,
		success : flush
	});
}
//批量删除 
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/ServiceProject_Controller_4W/delete_batch_service_project.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
//添加服务项目
function show_add() {
	var parm = {
		title : "添加服务项目",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/serviceproject/add_main_serviceproject",
		width : "50%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_serviceproject, exit ]
	};
	show_new_div(parm);
}

//编辑
function update_serviceproject() {
	var project_name = $("#project_name").val();
	var project_order = $("#project_order").val();
	var is_show = $("input[name='is_show']:checked").val();
	var on_price = $("#on_price").val();
	var top_picture = $("#top_picture").val();
	var front_picture = $("front_picture").val();
	var obj = new Object();
	obj.id=update_id;
	obj.project_name = project_name;
	obj.project_order = project_order;
	obj.is_show = is_show;
	obj.on_price = on_price;
	obj.top_picture = $("#top_picture")[0].src.replace(httpFileBasePath,"");
	obj.front_picture = $("#front_picture")[0].src.replace(httpFileBasePath,"")
	$
			.ajax({
				url : getRootPath()
						+ "/ServiceProject_Controller_4W/update_service_project_By_Id.action",
				data : obj,
				success : flush
			});
}
//新增
function add_serviceproject() {
	var project_name = $("#project_name").val();
	var project_order = $("#project_order").val();
	var is_show = $("input[name='is_show']:checked").val();
	var on_price = $("#on_price").val();
	var obj = new Object();
	obj.project_name = project_name;
	obj.project_order = project_order;
	obj.is_show = is_show;
	obj.on_price = on_price;
	obj.top_picture = top_picture;
	obj.front_picture = front_picture;
	$
			.ajax({
				url : getRootPath()
						+ "/ServiceProject_Controller_4W/add_service_project_Service_manager.action",
				data : obj,
				success : flush
			});
}
//跳转项目介绍页面
function set_item(id){
	location.href=getRootPath() + "/BaseMultiController/toPage.action?page=main/serviceitem/serviceitem&param="+id;
}
function flush() {
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
