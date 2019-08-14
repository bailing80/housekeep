/**
 * 
 */
$(document).ready(function() {
	queryEditunit(update_id);
});
function queryEditunit(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/T_s_unit_Controller_4W/query_all_unit.action",
				data : obj,
				success : show_edit_unit
			});

}

//function update_unit(data){
//	var obj = new Object();
//	obj.id = update_id;
//	var d = $(data)[0];
//	$("#unit_name").val(d.unit_name);
//	$("#unit_sign").val(d.unit_sign);
//	obj.unit_name =unit_name;
//	obj.unit_sign = unit_sign;
//	$
//			.ajax({
//				url : getRootPath()
//						+ "/T_s_unit_Controller_4W/update_unit.action",
//				data : obj,
//				success : flush
//			});
//}
function show_edit_unit(data) {
	var d = $(data)[0];
	$("#unit_name").val(d.unit_name);
	$("#unit_sign").val(d.unit_sign);
		
}