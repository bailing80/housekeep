
/**
 * @Title: 后台管理端-角色管理-接口 
 *
 * @author 白玲
 *
 * @date 2019年7月20日 上午10:01:47 
 *
 * @Description:映射角色菜单功能
 **/
$(document).ready(function() {
	queryEditRole();
});

function queryEditMenu() {
	var obj = new Object();
	obj.role_id = map_id;

	$.ajax({
		url : getRootPath()
				+ "/Mapping_menu_Controller_4w/query_Role_Memu_By_Id.action",
		data : obj,
		success : show_edit_menu
	});

}
function show_edit_menu(data) {
	var d = $(data);
	for (var i = 0; i < d.length; i++) {
		$("#box" + (d[i].menu_id)).attr("checked", "checked")
	}
	$("#role_id").val(d.role_id);
	$("#menu_id").val(d.menu_id);
}

function queryEditRole(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath()
				+ "/T_s_user_menu_Controller_4W/queryAll_t_s_user_menu.action",
		data : obj,
		success : show_edit_role
	});
}

function show_edit_role(data) {
	var d = $(data);
	$("#id").val(d.id);
	for (var i = 0; i < d.length; i++) {
		var tr = $("<tr>");
		var td1 = $("<td>");
		var td2 = $("<td>");
		var td3 = $("<td>");
		//td3.attr("id", "id" + i)
		var input = $("<input>")
		input.attr("type", "checkbox")
		input.attr("value", i)
		input.attr("id", "box" + (i + 1))
		input.attr("name", "data_checkbox")
		td1.html(d[i].name)
		td2.html(input)
		//td3.html(d[i].id)
		tr.append(td1);
		tr.append(td2);
		//tr.append(td3);
		$("#mapping_role_table").append(tr);
	}
	queryEditMenu();
}
