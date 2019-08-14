$(document).ready(function() {
	queryEditManager(update_id);
});
// 通过ID查询管理员数据
function queryEditManager(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath()
				+ "/Manager_Controller_4W/query_manager_By_Id.action",
		data : obj,
		success : show_edit_manager
	});
}
// 将信息回显到编辑框
var selected;
function show_edit_manager(data) {
	var d = $(data)[0];
	$("#name").val(d.name);
	$("#phone").val(d.phone);
	$("#is_login").val(d.is_login);
	if (d.is_login == 1) {
		$("#is_login_1").attr("checked", "checked");
	} else {
		$("#is_login_2").attr("checked", "checked");
	}
	selected = d.user_manager_role_name;
	$.ajax({
		url : getRootPath()
				+ "/Manager_Controller_4W/query_user_manager_role_name.action",
		data : null,
		success : show_selected
	});
}
function show_selected(data) {
	$("#manager_role_id").html("")
	for (var i = 0; i < $(data).length; i++) {
		if (selected == $(data)[i].name) {
			$("#manager_role_id").append(
					"<option selected='selected' value='" + $(data)[i].id
							+ "'>" + $(data)[i].name + "</option>");
		} else {
			$("#manager_role_id").append(
					"<option value='" + $(data)[i].id + "'>" + $(data)[i].name
							+ "</option>");
		}
	}
}
