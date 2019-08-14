 $(document).ready(function() {
	// 初始化就查询数据
	
	query();
	$("#add_serviceiteam").click(show_add);
	$("#delete_serviceiteam").click(show_delete);
	$("#query_serviceiteam").click(query);

	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
 function edit_service(id) {
		update_id = id;
		var parm = {
			title : "编辑项目",
			html : getRootPath()
					+ "/BaseMultiController/toPage.action?page=main/serviceitem/updat_Saserviceitem",
			width : "50%",
			height : "680px",
			div_obj : $("#new_div"),
			buttons : [ "保存", "退出" ],
			buttons_callback : [ update_serviceiterm, exit ]
		};
		show_new_div(parm);
	}
 function update_serviceiterm(id) {
		var project_name = $("#project_name").val();
		var picture = $("#picture")[0].src.replace(httpFileBasePath,"");
		var picture_bef = $("#picture_bef")[0].src.replace(httpFileBasePath,"");
		var picture_aft =$("#picture_bef")[0].src.replace(httpFileBasePath,"");
		var introduce = $("#introduce").val();
		var characteristic = $("#characteristic").val();
		var front_picture_link = $("#front_picture_link").val();
		var picture_bef_link = $("#picture_bef_link").val();
		var picture_aft_link = $("#picture_aft_link").val();
		var project_order = $("#project_order").val();
		var obj = new Object();
		obj.id = update_id;
		obj.project_name = project_name;
		obj.front_picture = picture;
		obj.picture_bef = picture_bef;
		obj.picture_aft = picture_aft;
		obj.introduce = introduce;
		obj.characteristic = characteristic;
		obj.front_picture_link = front_picture_link;
		obj.picture_bef_link = picture_bef_link;
		obj.picture_aft_link = picture_aft_link;
		obj.project_order = project_order;
		$.ajax({
					url : getRootPath()
							+ "/ServiceProject_Controller_4W/update_service_project_By_Id.action",
					data : obj,
					success : flush
				});
	}
//跳转页面
 function lower_set(e) {

	  location.href=getRootPath()
		+"/BaseMultiController/toPage.action?page=main/serviceitem_lowerlevel/serviceitem_lowerlevel&param="+e
	  }
 //  /BaseMultiController/toPage.action?page=main/test/test
//批量删除
 function show_delete(e) {
		var param = {
			url : getRootPath()
					+ "/ServiceProject_Controller_4W/delete_batch_service_project.action",
			error : flush,
			success : flush,
		}
		delete_obj(param);
	}
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	obj.is_show=1;
	//obj.id=$("#hidden").val();
	var parm = {
		url : getRootPath() + "/ServiceProject_Controller_4W/query_all_service_project_Service_manager.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号",  "顺序", "项目名称","图片1","图片2","图片3","项目介绍","项目特色","连接1","连接2","连接3"],
		data_column : ["rownumber","project_order","project_name", "front_picture", "picture_bef", "picture_aft", "introduce","characteristic","front_picture_link","picture_bef_link","picture_aft_link"],
		contextType : [  "text", "text", "text", "img", "img", "img", "text", "text", "text","text","text",  ],
		title_column_width : [ "7%", "7%","8%", "7%", "7%", "7%", "7%", "7%","9%" , "9%", "9%"],
		hide_button : [ {
			datakey : "is_show",
			dataval : "01",
			hideindex : 0
		}, {
			datakey : "is_show",
			dataval : "02",
			hideindex : 1
		} ],
		optr : [ "操作" ],
		optr_project : [ "上架","下架","编辑","删除","子项目设置"],
		optr_color : [ "#62a8d1", "#66cc99","#62a8d1", "#66cc99","#62a8d1"],
		optr_callback : [ "on_sale","off_sale","edit_service","del","lower_set" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
function on_off_sale(id,on_or_off){
	var obj = new Object();
	obj.id = id;
	obj.is_show = on_or_off;
	$.ajax({
		url : getRootPath() + "/ServiceProject_Controller_4W/is_service_project_enable.action",
		data : obj,
		success : flush
	});	
}	
function on_sale(id){
	
	on_off_sale(id,'01');
}
function off_sale(id){
	
	on_off_sale(id,'02');
}
var update_id;

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
		title : "新增测试数据",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/serviceitem/add_serviceitem",
		width : "50%",
		height : "675px",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_serviceitem, exit]
	};
	show_new_div(parm);
}

function add_serviceitem(){
	var id = $("#project_name").val();
	var front_picture = photo_1;
	var picture_bef = photo_2;
	var picture_aft = photo_3;
	var introduce = $("#introduce").val();
	var characteristic = $("#characteristic").val();
	var front_picture_link = $("#front_picture_link").val();
	var picture_bef_link = $("#picture_bef_link").val();
	var picture_aft_link = $("#picture_aft_link").val();
	var project_order = $("#project_order").val();
	var obj = new Object();
	obj.id = id;
	obj.is_show = 1;
	obj.front_picture = front_picture;
	obj.picture_bef = picture_bef;
	obj.picture_aft = picture_aft;
	obj.introduce = introduce;
	obj.characteristic = characteristic;
	obj.front_picture_link = front_picture_link;
	obj.picture_bef_link = picture_bef_link;
	obj.picture_aft_link = picture_aft_link;
	obj.project_order = project_order;
	$.ajax({
		url :getRootPath()+"/ServiceProject_Controller_4W/update_service_project_Service_manager.action",
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




function edit() {

}