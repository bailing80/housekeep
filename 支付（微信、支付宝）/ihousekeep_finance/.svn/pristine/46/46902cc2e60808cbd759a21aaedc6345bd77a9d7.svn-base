$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#query_test").click(query_query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
////模糊查询所有数据及关键字查询
//function query1() {
//	var obj = new Object();
//	var parm = { 
//		url : getRootPath()
//				+ "/AlipayConfig_Controller_4W/query_all_alipayconfig.action",
//		data : obj,
//		table_obj : $("#datatable"),
//		title : [ "序号", "订单时间", "直销商", "分销商", "订单编号", "订单状态", "订单比例", "账单总额", "直销商收款", "直销商收款方式", "平台收款" ],
//		data_column : [ "rownumber", "acct_name", "acct" ],
//		contextType : [ "text", "text", "text", "text", "text", "text", "text","text", "text", "text" ],
//		title_column_width : [ "5%", "9%", "9%", "9%", "9%", "8%", "8%","8%","8%","8%","8%" ],
//		hide_button : [ {
//			datakey : "orde_state",
//			dataval : "02",
//			hideindex : 0
//		}],
//		optr : [ "操作" ],
//		optr_project : [ "分账" ],
//		optr_color : [ "#66cc99" ],
//		optr_callback : [  "stop" ],
//		optr_column_width : [ "9%" ]
//	};
//	showTable(parm);
//}
//模糊查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword_order_time_begin = $("#order_time_begin").val();
	obj.keyword_order_time_end = $("#order_time_end").val();
	obj.keyword_saler_name = $("#saler_name").val();
	obj.keyword_acct_name = $("#acct_name").val();
	var parm = { 
		url : getRootPath()
				+ "/ACC_Order_Controller_4W/query_all_t_lz_order.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "订单时间", "直销商", "分销商", "订单编号", "订单状态", "订单比例", "账单总额", "直销商收款", "直销商收款方式", "平台收款" ],
		data_column : [ "rownumber", "order_time_str", "saler_name", "acct_name", "order_no", "order_state", "divide","pay_money","saler_money","receive_type_name","receive_money" ],
		contextType : [ "text", "text", "text", "text", "text", "text", "text","text", "text", "text" ],
		title_column_width : [ "5%", "9%", "9%", "9%", "9%", "8%", "8%","8%","8%","8%","8%" ],
		hide_button : [ {
			datakey : "orde_state",
			dataval : "02",
			hideindex : 0
		}],
		optr : [ "操作" ],
		optr_project : [ "分账" ],
		optr_color : [ "#66cc99" ],
		optr_callback : [  "stop" ],
		optr_column_width : [ "9%" ]
	};
	showTable(parm);
}
//精准查询
function query_zj() {
	var obj = new Object();
	obj.keyword_order_time_begin = $("#order_time_begin").val();
	obj.keyword_order_time_end = $("#order_time_end").val();
	obj.keyword_saler_name = $("#saler_name").val();
	obj.keyword_acct_name = $("#acct_name").val();
	var parm = { 
		url : getRootPath()
				+ "/ACC_Order_Controller_4W/query_all_t_zj_order.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "订单时间", "直销商", "分销商", "订单编号", "订单状态", "订单比例", "账单总额", "直销商收款", "直销商收款方式", "平台收款" ],
		data_column : [ "rownumber", "order_time_str", "saler_name", "acct_name",
				"order_no", "order_state", "divide","pay_money","saler_money","type_name","receive_money" ],
		contextType : [ "text", "text", "text", "text", "text", "text", "text","text", "text", "text" ],
		title_column_width : [ "5%", "9%", "9%", "9%", "9%", "8%", "8%","8%","8%","8%","8%" ],
		hide_button : [ {
			datakey : "orde_state",
			dataval : "02",
			hideindex : 0
		} ],
		optr : [ "操作" ],
		optr_project : [ "分账" ],
		optr_color : [  "#66cc99" ],
		optr_callback : [ "stop" ],
		optr_column_width : [ "9%" ]
	};
	showTable(parm);
}
//回显到编辑框
function query_query(data) {
	var d = $(data)[0];
	alert("value="+$("input[name='radioquery']:checked").val());
	
	if($("input[name='radioquery']:checked").val() == "模糊查询"){
		query();
	}
	if($("input[name='radioquery']:checked").val() == "精准查询"){
		query_zj();
	}
	
	
}


var id; 
//分账
function stop(id) {
	alert(id);
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath()+ "/ACC_Order_Controller_4W/check_account.action",
		data : obj,
		success : flush
	});
}
function flush() {
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
