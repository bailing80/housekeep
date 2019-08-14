$(document).ready(function() {
	// 初始化就查询数据
	query_coupon();
	//$("#add_coupon").click(show_add);
	//$("#query_coupon").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

// 查询所有数据及关键字查询
function query_coupon() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath()
				+ "/Coupon_H_Controller_4W/query_all_t_u_coupon.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "所属类型", "兑换码", "兑换时间", "券状态", "兑换人" ,"领用人","领用时间","作废人","作废时间","所属批次项目","金额"],
		data_column : [ "rownumber", "coupon_type_id", "exchange_code",
				"exchange_time", "state", "used_member","get_member","get_time" ,"to_voider","to_void_time","coupon_manager_id","money"],
		contextType : [ "text", "text", "text", "text", "text", "text","text", "text", "text", ],
		title_column_width : [ "5%", "8%","8%","8%","8%","8%","8%","8%","8%","8%","8%","8%" ],
		hide_button : [ {
			datakey : "state",
			dataval : "01",
			hideindex : 1
		}, {
			datakey : "state",
			dataval : "04",
			hideindex : 0
		} ],
		optr : [ "操作" ],
		optr_project : [ "停用","启用" ],
		optr_color : [  "#66cc99","#62a8d1" ],
		optr_callback : [  "stop","start" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

var id; 
//设置订单状态
function off_status(id,a_state) {
	var obj = new Object();
	obj.id = id;
	obj.state = a_state;
	$.ajax({
				url : getRootPath()+ "/Coupon_H_Controller_4W/is_status.action",
				data : obj,
				success : flush_coupon
			});
}
//订单分配
function stop(id) {
	off_status(id,'04');
}
//订单分配
function start(id) {
	off_status(id,'01');
}

function flush_coupon() {
	query_coupon();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
