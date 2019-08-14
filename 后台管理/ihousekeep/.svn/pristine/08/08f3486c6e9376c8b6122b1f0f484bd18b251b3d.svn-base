$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#query_member_information").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

// 查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath()
				+ "/Member_information_Controller_4W/query_all_member_information.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "用户昵称", "电话号", "地址", "户型", "面积", "门牌号", "用户状态" ],
		data_column : [ "num", "nick_name", "user_phone", "address",
				"apartment_name", "area_name", "door_number",
				"member_state_str" ],
		contextType : [ "text", "text", "text", "text", "text", "text", "text",
				"text" ],
		title_column_width : [ "5%", "5%", "10%", "20%", "10%", "10%", "10%" ],
		optr : [ "操作" ],
		optr_project : [ "详情" ],
		optr_color : [ "#62a8d1" ],
		optr_callback : [ "show_detail" ],
		optr_column_width : [ "15%" ]
	};

	showTable(parm);
}

// 定义全局update_id用于查询当前ID数据
var member_id;
function show_detail(id) {
	member_id = id;
	var parm = {
		title : "查看用户",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/member_information/member_information_detail",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "退出" ],
		buttons_callback : [ exit ]
	};
	show_new_div(parm);

}
function update_member() {

}
function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
