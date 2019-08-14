$(document).ready(function() {
	queryEditCoupon_type(update_id);
});
// 通过ID查询广告数据
function queryEditCoupon_type(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath()
				+ "/Coupon_type_Controller_4W/query_coupon_type_By_Id.action",
		data : obj,
		success : show_edit_coupon_type
	});
}
// 将广告信息回显到编辑框
function show_edit_coupon_type(data) {
	var d = $(data)[0];
	$("#type_name").val(d.type_name);
	$("#picture").attr("src", httpFileBasePath+d.back_pic);
}