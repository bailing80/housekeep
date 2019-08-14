$(document).ready(function() {
	query_edit();
	$("#manager_role_id").change(select_change);
});

function select_change() {
	var obj = new Object();
	obj.id = $("#manager_role_id").val();
	$.ajax({
		url : getRootPath()
				+ "/Manager_Controller_4W/query_user_manager_role_name.action",
		data : obj,
		success : change_add
	});

}

function change_add(data) {
	var d = $(data)[0];
	$("#id").val(d.id);

}

function query_edit() {

	$.ajax({
		url : getRootPath()
				+ "/Manager_Controller_4W/query_user_manager_role_name.action",
		data : null,
		success : show_add_user_manager_role
	});
}

function show_add_user_manager_role(data) {

	for (var i = 0; i < $(data).length; i++) {
		$("#manager_role_id").append(
				"<option value='" + $(data)[i].id + "'>" + $(data)[i].name
						+ "</option>");
	}
}
