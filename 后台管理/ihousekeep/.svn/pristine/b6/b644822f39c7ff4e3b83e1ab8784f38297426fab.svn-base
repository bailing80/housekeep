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
//查询数据
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {	
		url : getRootPath() + "/T_s_unit_Controller_4W/query_all_unit.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "ID","单位名称", "单位符号" ],
		data_column : [ "id","unit_name", "unit_sign"],
		contextType : [ "text","text","text" ],
		title_column_width : [ "20%","25%", "35%" ],
		hide_button :[{datakey:"age",dataval :12,hideindex :0},{datakey:"name",dataval :"8585",hideindex :1}],
		optr : [ "操作" ],
		optr_project : [ "编辑","删除"],
		optr_color : [ "#62a8d1", "#66cc99"],
		optr_callback : [ "edit","del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
	
}
//删除
function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/T_s_unit_Controller_4W/delete_t_s_unit.action",
		data : obj,
		success : flush
	});
}
//添加
function show_add() {
	var parm = {
		title : "新增项目名",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/unit/add_unit",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_unit, exit]
	};
	show_new_div(parm);
}

function add_unit(){
	var unit_name = $("#unit_name").val();
	var unit_sign = $("#unit_sign").val();
	var obj = new Object();
	obj.unit_name = unit_name;
	obj.unit_sign = unit_sign;
	//console.log(obj.unit_name);
	$.ajax({
		url :getRootPath()+"/T_s_unit_Controller_4W/add_t_s_unit.action",
		data : obj,
		success : flush
	});
}

function flush(){
	query();
	exit();
}


//修改

var update_id; 
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑数据",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/unit/update_unit",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_unit, exit ]
	};
	show_new_div(parm);
}

function update_unit(){
	var obj = new Object();
	obj.id = update_id;
	var unit_name = $("#unit_name").val();
	var unit_sign = $("#unit_sign").val();
	obj.unit_name = unit_name;
	obj.unit_sign = unit_sign;
	$.ajax({
		url :getRootPath()+"/T_s_unit_Controller_4W/update_unit_By_Id.action",
		data : obj,
		success : flush
	});
}


function show_delete(e){
	var param = {
			url : getRootPath()
					+ "/T_s_unit_Controller_4W/delete_all_t_s_unit.action",
			error : flush,
			success : flush,
		}
		delete_obj(param);
}

function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
}
