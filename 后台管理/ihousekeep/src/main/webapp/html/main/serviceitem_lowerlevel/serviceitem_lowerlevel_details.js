 $(document).ready(function() {
	// 初始化就查询数据
	query_item_details();
});
 function query_item_details() {
	 var obj = new Object();
		obj.id = update_id;
		$.ajax({
					url : getRootPath()
							+ "/ServiceItem_Controller_4W/query_service_item_By_Id.action",
					data : obj,
					success : query_item_details_success
				});
 }
//详情页面回显数据
function query_item_details_success(data) {
	var d = $(data)[0];
	$("#project_id").html(d.project_id);
	$("#item_name").html(d.item_name);
	$("#item_price").html(d.item_price);
	//$("#unit_id").html(d.unit_id);
	var picture = $('<img>');
	picture.attr("src",httpFileBasePath+d.item_picture);
	picture.attr("width","115px");
	picture.attr("height","75px");
	$("#item_picture").html(picture)
	$("#item_upper_limit").html(d.item_upper_limit);
	$("#item_lower_limit").html(d.item_lower_limit);
	$("#upper_per_price").html(d.upper_per_price);
	$("#upper_total_price").html(d.upper_total_price);
	$("#lower_per_price").html(d.lower_per_price);
	$("#lower_total_price").html(d.lower_total_price);
		var obj = new Object();
		obj.id = d.unit_id;
		$.ajax({
			url : getRootPath()
					+ "/ServiceItem_Controller_4W/query_all__unit_lowerlevel.action",
			data : obj,
			success : query_unit_name_success
		});
}

function query_unit_name_success(data) {
	var d = $(data)[0];
	
$("#unit_id").html(d.unit_name);
}