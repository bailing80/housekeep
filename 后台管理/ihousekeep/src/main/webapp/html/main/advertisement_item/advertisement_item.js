$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_advertisement_item").click(show_add);
	$("#delete_advertisement_item").click(show_delete);
	$("#query_advertisement_item").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

//查询所有数据及关键字查询
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	obj.manger_id = $("#hidden").val();
	var parm = { 
		url : getRootPath()
				+ "/Advertisement_item_Controller_4W/query_all_t_s_advertisement_item.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "项目路径", "题目", "是否有二级链接", "链接标题", "二级链接地址", "广告管理id", "播放顺序" ],
		data_column : [ "rownumber", "item_url", "title", "is_sec_link_str",
				"link_title", "sec_url", "manger_id", "board_order" ],
		contextType : [ "text", "text", "text", "text", "text", "text", "text" ],
		title_column_width : [ "8%", "12%", "10%", "10%", "10%", "10%", "10%","10%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑", "删除" ],
		optr_color : [ "#62a8d1", "#66cc99" ],
		optr_callback : [ "edit", "del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
//修改广告
function update_advertisement_item(){
	var obj = new Object();
	obj.id = update_id;
	//项目路径
	var item_url = $("#item_url").val();
	//题目
	var title = $("#title").val();
	//是否有二级链接
	var is_sec_link = $("input[name='is_sec_link']:checked").val();
	//链接标题
	var link_title = $("#link_title").val();
	//二级链接地址
	var sec_url = $("#sec_url").val();
	//广告管理id
	var manger_id = $("#manger_id").val();
	//播放顺序
	var board_order = $("#board_order").val();
	obj.item_url = item_url;
	obj.title = title;
	obj.is_sec_link = is_sec_link;
	obj.link_title = link_title;
	obj.sec_url = sec_url;
	obj.manger_id = manger_id;
	obj.board_order = board_order;
	$.ajax({
				url : getRootPath()+ "/Advertisement_item_Controller_4W/update_Advertisement_item_By_Id.action",
				data : obj,
				success : flush
			});
}
//添加广告
function show_add() {
	var parm = {
		title : "添加广告",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/advertisement_item/add_advertisement_item",
		width : "50%",
		height : "55%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ add_advertisement_item, exit ]
	};
	show_new_div(parm);
}
//添加广告项目
function add_advertisement_item(){
	var item_url = $("#item_url").val();
	var title = $("#title").val();
	var is_sec_link = $("input[name='is_sec_link']:checked").val();
	var link_title = $("#link_title").val();
	var sec_url = $("#sec_url").val();
	var manger_id = $("#manger_id").val();
	var board_order = $("#board_order").val();
	var obj = new Object();
	obj.item_url = item_url;
	obj.title = title;
	obj.is_sec_link = is_sec_link;
	obj.link_title = link_title;
	obj.sec_url = sec_url;
	obj.manger_id = manger_id;
	obj.board_order = board_order;
	$.ajax({
		url :getRootPath()+"/Advertisement_item_Controller_4W/add_t_s_advertisement_item.action",
		data : obj,
		success : flush
	});
}

//定义全局update_id用于update_advertisement_item编辑页查询当前ID数据
var update_id;
//编辑广告
function edit(id) {
	update_id = id;
	var parm = {
		title : "编辑广告",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/advertisement_item/update_advertisement_item",
		width : "50%",
		height : "55%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_advertisement_item, exit ]
	};
	show_new_div(parm);
}
//删除指定单条数据
function del(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Advertisement_item_Controller_4W/delete_t_s_advertisement_item.action",
				data : obj,
				success : flush
			});
}
//批量删除 
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/Advertisement_item_Controller_4W/delete_all_t_s_advertisement_item.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}

function flush() {
	query();
	exit();
}

function exit() {
	$("#new_div").hide();
	$("#backdiv").hide();
}
