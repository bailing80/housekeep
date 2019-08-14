$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_coupon_manager").click(show_add);
	$("#query_coupon_manager").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

// 查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath()
				+ "/Coupon_manager_Controller_4W/query_all_t_u_coupon_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "生成人", "批次号", "优惠券批次名", "所属类型", "总数" ],
		data_column : [ "num", "creator_name", "batch_code",
				"coupon_project_name", "type_name", "batch_total" ],
		contextType : [ "text", "text", "text", "text", "text", "text" ],
		title_column_width : [ "8%", "12%", "12%", "12%", "12%", "12%" ],
		optr : [ "操作" ],
		optr_project : [ "详情", ],
		optr_color : [ "#62a8d1", ],
		optr_callback : [ "coupon_detail" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
function coupon_detail(e) {

	location.href = getRootPath()
			+ "/BaseMultiController/toPage.action?page=main/coupon/coupon&param="
			+ e
}
// 新增
function add_coupon_manager() {
	var coupon_project_name = $("#coupon_project_name").val();
	var batch_code = $("#batch_code").val();
	var batch_total = $("#batch_total").val();
	var coupon_manager_type_id = $("#coupon_manager_type_id").val();
	var exchange_time_str = $("#exchange_time_str").val();
	var money = $("#money").val();
	var exchange_code = $("#exchange_code").val();
	var obj = new Object();
	obj.coupon_project_name = coupon_project_name;
	obj.batch_code = batch_code;
	obj.batch_total = batch_total;
	obj.coupon_manager_type_id = coupon_manager_type_id;
	obj.exchange_time_str = exchange_time_str;
	obj.money = money;
	obj.exchange_code = exchange_code;
	$.ajax({
		url : getRootPath()
				+ "/Coupon_manager_Controller_4W/add_coupon_manager.action",
		data : obj,
		success : flush
	});
}
function edit() {

}

// 删除指定单条数据
function del() {

}
// 添加广告
function show_add() {
	var parm = {
		title : "添加优惠券",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/coupon_manager/add_coupon_manager",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_coupon_manager, exit ]
	};
	show_new_div(parm);
}

function flush() {
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
