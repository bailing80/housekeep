$(document).ready(function() {
	queryEditApartment_type(update_id);
});

function queryEditApartment_type(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/Apartment_type_Manager_Controller_4W/query_apartment_type_manager_By_Id.action",
				data : obj,
				success : show_edit_apartment_type
			});

}
function update_apartment_type() {
	var obj = new Object();
	obj.id = update_id;
	var apartment_name_t = $("#apartment_name_t").val();
	var apartment_name_c = $("#apartment_name_c").val();
	var apartment_name_w = $("#apartment_name_w").val();
	var apartment_name_s = $("#apartment_name_s").val();
	obj.apartment_name_t = apartment_name_t;
	obj.apartment_name_c = apartment_name_c;
	obj.apartment_name_w = apartment_name_w;
	obj.apartment_name_s = apartment_name_s;
	$
			.ajax({
				url : getRootPath()
						+ "/Apartment_type_Manager_Controller_4W/update_apartment_type_manager_By_Id.action",
				data : obj,
				success : flush
			});
}

function show_edit_apartment_type(data) {
	var d = $(data)[0];
	$("#apartment_name_t").val(d.apartment_name_t);
	$("#apartment_name_c").val(d.apartment_name_c);
	$("#apartment_name_w").val(d.apartment_name_w);
	$("#apartment_name_s").val(d.apartment_name_s);

	

}