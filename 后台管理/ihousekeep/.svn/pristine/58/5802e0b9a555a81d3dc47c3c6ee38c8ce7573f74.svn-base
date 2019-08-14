$(document).ready(function() {
	queryEditArea_type(update_id);
});

function queryEditArea_type(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/Area_type_Manager_Controller_4W/query_all_area_type_manager.action",
				data : obj,
				success : show_edit_area_type
			});

}
function update_area_type() {
	var obj = new Object();
	obj.id = update_id;
	var area_name_list = $("#area_name_list").val();
	var area_name_most = $("#area_name_most").val();
	obj.area_name_list = area_name_list;
	obj.area_name_most = area_name_most;
	$
			.ajax({
				url : getRootPath()
						+ "/Area_type_Manager_Controller_4W/update_area_type_manager.action",
				data : obj,
				success : flush
			});
}

function show_edit_area_type(data) {
	var d = $(data)[0];
	$("#area_name_list").val(d.area_name_list);
	$("#area_name_most").val(d.area_name_most);

}