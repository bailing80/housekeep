/**
 * 
 */
$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#delete_test").click(show_delete);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

function query() {
	var parm = {	
		url : getRootPath() + "/T_s_role_2_menu_Controller_4W/query_all_role_2_menu.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "role_id","menu_id" ],
		data_column : [ "role_id","menu_id"],
		contextType : [ "text","text"],
		title_column_width : [ "35%", "45%" ],
		hide_button :[{datakey:"age",dataval :12,hideindex :0},{datakey:"name",dataval :"8585",hideindex :1}],
		optr : [ "操作" ],
		optr_project : ["删除"],
		optr_color : [  "#66cc99"],
		optr_callback : [ "del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);	
}
function del(id){
	var obj = new Object();
	obj.id = id;
	alert(obj.id)
	$.ajax({
		url : getRootPath() + "/T_s_role_2_menu_Controller_4W/delete_role_2_menu.action",
		data : obj,
		success : flush
	});
}



function flush(){
	query();
	exit();
}

function show_delete(e){
	alert(e);
	var param = {
			url : getRootPath()
					+ "/T_s_role_2_menu_Controller_4W/delete_all_t_s_role_2_menu.action",
			error : flush,
			success : flush,
		}
		delete_obj(param);
}

function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
}
