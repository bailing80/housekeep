$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#query_order").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

//查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = { 
		url : getRootPath()
				+ "/Order_Controller_4W/query_all_t_u_order.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "订单编号", "下单时间", "预约时间", "下单客户", "支付方式", "订单金额","实际支付金额"],
		data_column : [ "rownumber", "order_no", "order_time_str", "appointment_time_str",
				"member_id", "pay_fun", "order_total_money","order_pay_money" ],
		contextType : [ "text", "text", "text", "text", "text", "text", "text" ],
		title_column_width : [ "6%", "10%", "10%", "10%", "10%", "10%", "10%","10%" ],
		optr : [ "操作" ],
		optr_project : [  "详细情况", "派单","取消订单" ],
		optr_color : [  "#62a8d1", "#66cc99", "#62a8d1"],
		optr_callback : [ "detail_information", "send_order","cancellation_order"],
		optr_column_width : [ "24%" ]
	};
	showTable(parm);
}

var detail_id;
function detail_information(id) {
	 detail_id = id;
	 alert(detail_id)
	var parm = {
		title : "查看订单详细信息",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/order/order_information_detail",
		width : "70%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "退出" ],
		buttons_callback : [ exit ]
	};

	show_new_div(parm);

}
var send_id
function send_order(id){
	alert(id+":id")
	send_id = id;
	var parm = {
		title : "显示数据",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/order/order_rider",
		width : "50%",
		height : "70%",
		div_obj : $("#new_div"),
		buttons : [ "退出" ],
		buttons_callback : [ exit ]
	};
	
	show_new_div(parm);
}

var id; 
//设置订单状态
function off_status(id,status,can_role) {
	alert(id+":id888")
	var obj = new Object();
	obj.id = id;
	obj.order_status = status;
	obj.cancel_role = can_role;
	$.ajax({
				url : getRootPath()+ "/Order_Controller_4W/is_order_status.action",
				data : obj,
				success : flush
			});
}
//订单分配
function cancellation_order(id) {
	alert(id+":id")
	off_status(id,'022','null');
}

function flush() {
	alert("flush")
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
