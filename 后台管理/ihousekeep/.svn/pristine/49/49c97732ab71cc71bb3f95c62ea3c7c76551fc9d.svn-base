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
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath() + "/T_s_user_menu_Controller_4W/queryAll_t_s_user_menu.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "名称", "说明", "编号","标签","上一级" ],
		data_column : [ "name", "description", "code" ,"tag","parent"],
		contextType : [ "text", "text", "text","text","text" ],
		title_column_width : [ "15%", "25%", "20%","10%","10%" ],
		hide_button :[{datakey:"age",dataval :12,hideindex :0},{datakey:"name",dataval :"8585",hideindex :1}],
		optr : [ "操作" ],
		optr_project : [ "编辑","删除","映射角色"],
		optr_color : [ "#62a8d1", "#66cc99","#62a8d1"],
		optr_callback : [ "edit","del" ,"map_roles"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
	
}
//映射角色
var map_id;
function map_roles(id){
	map_id = id;
	//alert(map_id);
	var parm = {
		title : "编辑数据",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/customer/contact_roles",
		//url : getRootPath() + "/T_s_role_2_menu_Controller_4w/add_role_2_menu.action",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ insert_map, exit ]
	};
	show_new_div(parm);
}

function insert_map(id){
	var ch = $("input[name='data_checkbox']:checked");
	var ids = "";
	for (var i = 0; i < ch.length; i++) {
		ids += $(ch[i]).val() + ",";
	}
		ids = ids.substr(0,ids.length-1)
		var obj = new Object();
		var role_id = ids;
		var menu_id = map_id;
		obj.role_id = ids;
		obj.menu_id = menu_id;
		//alert(role_id);
		$.ajax({
			url : getRootPath() + "/T_s_role_2_menu_Controller_4W/add_role_2_menu.action",
			data : obj,
			success : flush
		});
}








//增删改查
function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/T_s_user_menu_Controller_4W/delete_t_s_user_menu.action",
		data : obj,
		success : flush
	});
}

function show_add() {
	var parm = {
		title : "新增项目名",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/customer/add_customer",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_customer, exit]
	};
	show_new_div(parm);
}

function add_customer(){
	var name = $("#name").val();
	var description = $("#description").val();
	var code = $("#code").val();
	var tag = $("#tag").val();
	var parent = $("#parent").val();
	var obj = new Object();
	obj.name = name;
	obj.description = description;
	obj.code = code;
	obj.tag = tag;
	obj.parent = parent;
	$.ajax({
		url :getRootPath()+"/T_s_user_menu_Controller_4W/add_t_s_user_menu.action",
		data : obj,
		success : flush
	});
}

function flush(){
	query();
	exit();
}




var update_id; 
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑数据",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/customer/update_customer",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_customer, exit ]
	};
	show_new_div(parm);
}

function update_customer(){
	var obj = new Object();
	obj.id = update_id;
	var name = $("#name").val();
	var description = $("#description").val();
	var code = $("#code").val();
	var tag = $("#tag").val();
	var parent = $("#parent").val();
	
	obj.name = name;
	obj.description = description;
	obj.code = code;
	obj.tag = tag;
	obj.parent = parent;
	$.ajax({
		url :getRootPath()+"/T_s_user_menu_Controller_4W/update_t_s_user_menu.action",
		data : obj,
		success : flush
	});
}

function show_delete(e){
	var param = {
			url : getRootPath()
					+ "/T_s_user_menu_Controller_4W/delete_all_t_s_user_menu.action",
			error : flush,
			success : flush,
		}
		delete_obj(param);
}

function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
	location.reload();
}
