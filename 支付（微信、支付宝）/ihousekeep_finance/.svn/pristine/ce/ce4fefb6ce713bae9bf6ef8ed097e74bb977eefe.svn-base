$(document).ready(function() {
	// 初始化查询数据
	query();
	//新增事件
	$("#add_saler").click(show_add);
	//删除事件
	$("#delete_saler").click(show_delete);
	//查询事件
	$("#query_saler").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
//查询功能
function query() {
	var parm = {
		url : getRootPath() + "/Saler_Controller_4W/queryAll_saler.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "直销商名称", "直销商收款方式", "账号", "比例", "营业时间" ],
		data_column : [ "saler_name", "receive_type_name", "receive_acct", "divide_str", "service_time"],
		contextType : [ "text", "text", "text", "text", "text" ],
		title_column_width : [ "20%","10%","20%","10%", "20%" ],
		optr : [ "操作" ],
		optr_project : [ "修改","删除"],
		optr_color : [ "#62a8d1","#66cc99"],
		optr_callback : [ "edit","del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
//删除功能
function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/Saler_Controller_4W/delete_saler.action",
		data : obj,
		success : flush
	});
}
//批量删除 
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/Saler_Controller_4W/delete_batch_saler.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
//弹出添加页面
function show_add() {
	var parm = {
		title : "添加销售商",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/saler/add_saler",
		width : "50%",
		height : "55%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_saler, exit]
	};
	show_new_div(parm);
}
//添加功能
function add_saler(){
	//直销商名称
	var saler_name = $("#saler_name").val();
	//直销商收款方式
	var receive_type = $("#receive_type").val();
	//收款账号
	var receive_acct = $("#receive_acct").val();
	//分成比例
	var divide = $("#divide").val();
	//营业时间开始
	var service_begin = $("#service_begin").val();
	//营业结束时间
	var service_end = $("#service_end").val();
	//是否跨天
	var over_day =$("input[name='over_day']:checked").val();
	var obj = new Object();
	obj.saler_name = saler_name;
	obj.receive_type = receive_type;
	obj.receive_acct = receive_acct;
	obj.divide = divide;
	obj.service_begin = service_begin;
	obj.service_end = service_end;
	obj.over_day = over_day;
	$.ajax({
		url :getRootPath()+"/Saler_Controller_4W/add_saler.action",
		data : obj,
		success : flush
	});
}
//定义全局edit_id用于设置页查询当前ID数据
var edit_id;
//弹出设置页面
function edit(id) {
	edit_id = id;
	var parm = {
		title : "编辑销售商",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/saler/edit_saler",
		width : "50%",
		height : "55%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ execute_edit, exit ]
	};
	show_new_div(parm);
}
//设置功能
function execute_edit() {
	//直销商名称
	var saler_name = $("#saler_name").val();
	//直销商收款方式
	var receive_type = $("#receive_type").val();
	//收款账号
	var receive_acct = $("#receive_acct").val();
	//分成比例
	var divide = $("#divide").val();
	//营业时间开始
	var service_begin = $("#service_begin").val();
	//营业结束时间
	var service_end = $("#service_end").val();
	//是否跨天
	var over_day =$("input[name='over_day']:checked").val();
	var obj = new Object();
	obj.id = edit_id;
	obj.saler_name = saler_name;
	obj.receive_type = receive_type;
	obj.receive_acct = receive_acct;
	obj.divide = divide;
	obj.service_begin = service_begin;
	obj.service_end = service_end;
	obj.over_day = over_day;
	$.ajax({
				url : getRootPath()+ "/Saler_Controller_4W/edit_saler.action",
				data : obj,
				success : flush
			});
}
//刷新功能
function flush(){
	query();
	exit();
}
//退出功能
function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
}
