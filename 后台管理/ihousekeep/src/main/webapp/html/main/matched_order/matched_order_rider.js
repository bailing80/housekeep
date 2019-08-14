$(document).ready(function() {
	// 初始化就查询数据
	query_order();
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});


//查询所有数据及关键字查询
function query_order() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = { 
		url : getRootPath()
				+ "/Rider_Controller_4W/query_all_t_u_rider.action",
		data : obj,
		table_obj : $("#dat"),
		title : [ "序号", "姓名", "电话"],
		data_column : [ "rownumber", "name", "phone"],
		contextType : [ "text", "text", "text"],
		title_column_width : [ "6%", "10%", "10%"],
		optr : [ "操作" ],
		optr_project : [   "派单","派" ],
		optr_color : [  "#66cc99"],
		optr_callback : [  "send_rider","a"],
		optr_column_width : [ "24%" ]
	};
	showTable(parm);
}
var a_id;

//设置订单状态
function on_status(id,on_or_off) {
	a_id = id;
//	alert(a_id)
//	alert(send_id)
	var obj = new Object();
	obj.id = send_id;
	obj.order_status = on_or_off;
	obj.rider_id = a_id;
	
	$.ajax({
				url : getRootPath()+ "/Matched_Order_Controller_4W/is_order_status.action",
				data : obj,
				success : flush_order
				
			});
	alert(9999)
}

//订单分配
function send_rider(id) {
	on_status(id,'04');
}


function flush_order() {
	alert("flusha")
	query_order();
	flush()
}
