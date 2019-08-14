/**
 * 
 */
$(document).ready(function() {
	queryEditcustomer(update_id);
});

function queryEditcustomer(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/T_s_user_menu_Controller_4W/queryAll_t_s_user_menu.action",
				data : obj,
				success : show_edit_customer
			});

}
function update_customer(data){
	var obj = new Object();
	obj.id = update_id;
	var d = $(data)[0];
	$("#name").val(d.name);
	$("#description").val(d.description);
	$("#code").val(d.code);
	$("#tag").val(d.tag);
	$("#parent").val(d.parent);
	obj.name =name;
	obj.description = description;
	obj.code = code;
	obj.tag = tag;
	obj.parent = parent;
	$
			.ajax({
				url : getRootPath()
						+ "/T_s_user_menu_Controller_4W/update_t_s_user_menu.action",
				data : obj,
				success : flush
			});
}


function show_edit_customer(data) {
	var d = $(data)[0];
	$("#name").val(d.name);
	$("#description").val(d.description);
	$("#code").val(d.code);
	$("#tag").val(d.tag);
	$("#parent").val(d.parent);
	
	
	
}