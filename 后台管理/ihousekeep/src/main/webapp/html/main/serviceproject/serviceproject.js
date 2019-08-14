$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_serviceproject").click(show_add);
	$("#delete_serviceproject").click(show_delete);
	$("#query_serviceproject").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
	
});


function show_delete(e) {
	var param = {
		url : getRootPath()
				+ "/ServiceProject_Controller_4W/is_service_project_enable_batch.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}


function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	obj.is_show=1;
	var parm = {
		url : getRootPath() + "/ServiceProject_Controller_4W/query_all_service_project_Service_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "分类顺序", "分类标题","起始价格(元)","分类图片" ],
		data_column : [ "rownumber", "project_order", "project_name","on_price","top_picture"],
		contextType : [ "text", "text", "text","text","img"],
		title_column_width : [ "15%", "15%", "15%","15%","15%"],
		//hide_button :[{datakey:"age",dataval :12,hideindex :0},{datakey:"name",dataval :"8585",hideindex :1}],
		optr : [ "操作" ],
		optr_project : [ "修改","删除"],
		optr_color : [ "#62a8d1", "#66cc99", "#62a8d1", "#66cc99"],
		optr_callback : [ "edit","hide_btn" ],
		optr_column_width : [ "30%" ]
	};
	showTable(parm);
}
//自己的按钮显示隐藏
function show_or_hide_btn(id, show_or_hide) {
	var obj = new Object();
	obj.id = id;
	obj.is_show = show_or_hide;
	$.ajax({
				url : getRootPath()
						+ "/ServiceProject_Controller_4W/is_service_project_enable.action",
				data : obj,
				success : flush
			});
}


function hide_btn(id) {
	show_or_hide_btn(id, '2');
}

function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/ServiceProject_Controller_4W/delete_service_project_Service_manager.action",
		data : obj,
		success : flush
	});
}

function show_add() {
	var parm = {
		title : "增加分类",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/serviceproject/add_serviceproject",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_serviceproject, exit]
	};
	show_new_div(parm);
}

function add_serviceproject(){
	var id = $("#project_name").val();
	alert(id+"---id")
	var project_order = $("#project_order").val();
	var on_price = $("#on_price").val();
	var top_picture = photo_1;
	photo_1="";
	//alert("[update_riderelegant][photo]"+photo+"!!!!!!!!!!!!");
	var project_name=$("#project_name").val();
	var obj = new Object();
	obj.id = id;
	obj.project_order = project_order;
	obj.on_price = on_price;
	obj.top_picture = top_picture;
	obj.project_name=project_name;
	$.ajax({
		url :getRootPath()+"/ServiceProject_Controller_4W/query2.action",
		data : obj,
		success : flush
	});
}

function flush(){
	query();
	exit();
}

function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
}




var update_id;
function edit(id) {
	update_id = id;
	var parm = {
		title : "修改分类",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/serviceproject/update_serviceproject",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_serviceproject, exit ]
	};
	show_new_div(parm);
}

function update_serviceproject() {
	var project_name = $("#project_name").val();
	var picture = $("#picture")[0].src.replace(httpFileBasePath,"");
	var project_order = $("#project_order").val();
	var on_price = $("#on_price").val();
	var obj = new Object();
	obj.id = update_id;
//	alert("update_id"+update_id)
	//alert($("#picture_top")[0].src.replace(httpFileBasePath,"")+"====");
	//var top_picture = $("#picture_top")[0].src.replace(httpFileBasePath,"");
	//alert("[update_riderelegant][photo]"+photo+"!!!!!!!!!!!!");

	obj.project_order = project_order;
	obj.on_price = on_price;
	obj.top_picture = picture;
	obj.project_name=project_name;
	$.ajax({
				url : getRootPath()
						+ "/ServiceProject_Controller_4W/update_service_project_By_Id.action",
				data : obj,
				success : flush
			});
}

