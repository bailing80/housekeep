$(document).ready(function() {
	query_edit();
	$("#coupon_manager_type_id").change(select_change);
});

function select_change() {
	var obj = new Object();
	obj.id = $("#coupon_manager_type_id").val();
	$.ajax({
		url : getRootPath()
				+ "/Coupon_manager_Controller_4W/query_coupon_type.action",
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
				+ "/Coupon_manager_Controller_4W/query_coupon_type.action",
		data : null,
		success : show_add_coupon_type
	});
}

function show_add_coupon_type(data) {

	for (var i = 0; i < $(data).length; i++) {
		$("#coupon_manager_type_id").append(
				"<option value='" + $(data)[i].id + "'>" + $(data)[i].type_name
						+ "</option>");

	}

}
