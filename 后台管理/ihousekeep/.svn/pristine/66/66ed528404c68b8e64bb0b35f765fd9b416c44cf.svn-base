$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_role").click(show_add);
	$("#delete_role").click(show_delete);
	$("#query_role").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

// new T_s_advertisement_manager(advertisment_name, position, is_wheel,
// wheel_time, type_id, is_enable)

function show_delete(e) {
	var param = {
		url : getRootPath()
				+ "/Role_Controller_4W/delete_all_t_s_user_manager_role.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath()
				+ "/Role_Controller_4W/query_all_t_s_role_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号","编号","名称", "说明", "职称", "上级"],
		data_column : [ "num","id","name", "description", "this_level", "parent_id"],
		contextType : [ "text","text", "text", "text", "text", "text"],
		title_column_width : [ "10%", "15%", "12%","12%","12%","12%"],
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
		optr_project : [ "删除", "编辑" ,"映射角色菜单"],
		optr_color : [ "#62a8d1", "#66cc99","#62a8d1" ],
		optr_callback : [ "del", "edit", "map_roles"],
		optr_column_width : [ "29%" ]
	};
	showTable(parm);
}

var update_id;
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑角色",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/role/update_role",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_role, exit ]
	};
	show_new_div(parm);
}


function update_role() {
	var obj = new Object();
	obj.id = update_id;
	var name = $("#name").val();
	var description = $("#description").val();
	var this_level = $("#this_level").val();
	var parent_id = $("#parent_id").val();
	obj.name = name;
	obj.description = description;
	obj.this_level = this_level;
	obj.parent_id = parent_id;
	$
			.ajax({
				url : getRootPath()
						+ "/Role_Controller_4W/update_Role_manager_By_Id.action",
				data : obj,
				success : flush
			});
}


function del(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/Role_Controller_4W/delete_t_s_user_manager_role.action",
				data : obj,
				success : flush
			});
}




function show_add() {
	var parm = {
		title : "添加角色",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/role/add_role",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_role, exit ]
	};
	show_new_div(parm);
}

function add_role() {
	
	var name = $("#name").val();
	var description = $("#description").val();
	var this_level = $("#this_level").val();
	var parent_id = $("#parent_id").val();
	var obj = new Object();
	obj.name = name;
	obj.description = description;
	obj.this_level = this_level;
	obj.parent_id = parent_id;
	$
			.ajax({
				url : getRootPath()
						+ "/Role_Controller_4W/add_t_s_user_manager_role.action",
				data : obj,
				success : flush
			});
	
	
	
	
}

//映射角色菜单
var map_id;
function map_roles(id) {
	map_id = id;
	var parm = {
		title : "编辑数据",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/role/mapping_menu",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ insert_map, exit ]
	};
	show_new_div(parm);
}

function insert_map(id) {
	var ids = "";
	var ch = $("input[name='data_checkbox']:checked");
	for (var i = 0; i < ch.length; i++) {
		ids += (parseInt($(ch[i]).val()) + 1) + ",";
	}
	ids = ids.substr(0, ids.length - 1)
	var obj = new Object();
	var role_id = map_id;
	var menu_id = ids;
	obj.role_id = role_id;
	obj.menu_id = menu_id;
	$.ajax({
		url : getRootPath()
				+ "/Mapping_menu_Controller_4w/insert_all_t_s_menu.action",
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
