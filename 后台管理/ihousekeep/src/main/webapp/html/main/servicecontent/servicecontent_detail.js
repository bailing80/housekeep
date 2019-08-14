 $(document).ready(function() {
	// 初始化就查询数据
	query_content_details();
});
 function query_content_details() {
	 var obj = new Object();
		obj.id = update_id;
		$.ajax({
					url : getRootPath()
							+ "/ServiceContent_Controller_4W/query_service_content_By_Id.action",
					data : obj,
					success : query_content_details_success
				});
 }
//详情页面回显数据
function query_content_details_success(data) {
	var d = $(data)[0];
	$("#service_item_id").html(d.service_item_id);
	$("#content_name").html(d.content_name);
	$("#content_key").html(d.content_key);
	$("#content_type").html(d.content_type);
	$("#content_value").html(d.content_value);
}
