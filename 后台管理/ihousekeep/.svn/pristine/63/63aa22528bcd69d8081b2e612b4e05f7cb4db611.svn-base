$(document).ready(function() {
	queryorder_information(detail_id);

});

function queryorder_information(id) {
	alert(id)
	var obj = new Object();
	obj.id = detail_id;
	$.ajax({
			url : getRootPath()
					+ "/Matched_Order_Controller_4W/query_all_t_u_matched_order.action",
			data : obj,
			success : show_order_information_detail
			});

}

function show_order_information_detail(data) {
	var d = $(data)[0];
	$("#order_no").html(d.order_no);
	$("#nick_name").html(d.nick_name);
	$("#user_phone").html(d.user_phone);
	$("#address").html(d.address);
	$("#order_time_str").html(d.order_time_str);
	$("#appointment_time_str").html(d.appointment_time_str);
	$("#pay_fun").html(d.pay_fun);
	$("#pay_time_str").html(d.pay_time_str);
	$("#order_total_money").html(d.order_total_money);
	$("#order_pay_money").html(d.order_pay_money);
	$("#coupon_type_id").html(d.coupon_type_id);
	$("#money").html(d.money);
	$("#item_name").html(d.item_name);
	$("#project_id").html(d.project_id);
	$("#rider_id").html(d.rider_id);
}