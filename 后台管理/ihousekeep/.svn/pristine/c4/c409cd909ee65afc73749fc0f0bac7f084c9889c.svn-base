$(document).ready(function() {
	queryEditRole(update_id);
	queryparent_id();
});

function queryEditRole(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath()
				+ "/Role_Controller_4W/query_Role_manager_By_Id.action",
		data : obj,
		success : show_edit_role
	});

}

function show_edit_role(data) {
	var d = $(data)[0];
	$("#name").val(d.name);
	$("#description").val(d.description);
	$("#this_level").val(d.this_level);

}

function queryparent_id() {
	var obj = new Object();

	$.ajax({
		url : getRootPath()
				+ "/Role_Controller_4W/query_all_t_s_role_manager.action",
		data : obj,
		success : aaa
	});
}

function aaa(data) {
	$("#parent_id").append("<option value=无>" + "无" + "</option>");
	for (var i = 0; i < $(data).length; i++) {
		$("#parent_id").append(
				"<option value='" + $(data)[i].this_level + "'>"
						+ $(data)[i].this_level + "</option>");
	}
}
