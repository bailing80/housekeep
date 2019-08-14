$(document).ready(function() {
	queryEditservice_project(update_id);
});
//编辑前根据ID查询数据
function queryEditservice_project(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()
						+ "/ServiceProject_Controller_4W/query_service_project_By_Id.action",
				data : obj,
				success : show_edit_service_project
			});
}
//显示数据
function show_edit_service_project(data) {
	var d = $(data)[0];
	$("#project_name").val(d.project_name);
	$("#project_order").val(d.project_order);
	if (d.is_show =='1') {
		$("#is_show_1").attr("checked", "checked");
	} else if (d.is_show =='2') {
		$("#is_show_2").attr("checked", "checked");
	}
	$("#on_price").val(d.on_price);
	$("#top_picture").attr("src", httpFileBasePath+d.top_picture);
	$("#front_picture").attr("src", httpFileBasePath+d.front_picture);
}