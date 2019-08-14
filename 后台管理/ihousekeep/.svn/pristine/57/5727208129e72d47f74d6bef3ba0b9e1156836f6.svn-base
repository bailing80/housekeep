 $(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_servicecontent").click(show_add);
	$("#delete_servicecontent").click(show_delete);
	$("#query_servicecontent").click(query);

	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
 

 function show_delete(e) {
		var param = {
			url : getRootPath()
					+ "/ServiceContent_Controller_4W/delete_Servicecontent_lowerlevel.action",
			error : flush,
			success : flush,
		}
		delete_obj(param);
	}
 //获取上一级ID
 var service_item_id;
function query() {
	service_item_id = $("#hidden").val();
	var obj = new Object();
	obj.service_item_id = service_item_id;
//	alert(service_item_id)
	var parm = {
		url : getRootPath() + "/ServiceContent_Controller_4W/query_all__Servicecontent_lowerlevel.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号",  "所属子项ID", "内容名称","内容键名","内容键类型","内容键值"],
		data_column : ["rownumber","service_item_id","content_name","content_key", "content_type","content_value"],
		contextType : [  "text", "text", "text", "text","text","text"],
		title_column_width : [ "14%", "14%","14%", "14%", "14%","14%" ],
		optr : [ "操作" ],
		optr_project : ["删除","查看详情"],
		optr_color : ["#66cc99","#62a8d1"],
		optr_callback : ["del","lookdetails"],
		optr_column_width : [ "15%" ]

	};
	showTable(parm);
}


var update_id;
function lookdetails(id){
update_id = id;
var parm = {
	title : "查看详情",
	html : getRootPath()
			+ "/BaseMultiController/toPage.action?page=main/servicecontent/servicecontent_details",
	width : "50%",
	height : "50%",
	div_obj : $("#new_div"),
	buttons : [ "退出" ],
	buttons_callback : [ exit]
};
show_new_div(parm);
}
function lowerlevel_details(id){}


function del(id){
	var obj = new Object();
	
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/ServiceContent_Controller_4W/delete_Servicecontent_lowerlevel.action",
		data : obj,
		success : flush
	});
}


function show_add() {
	var parm = {
		title : "新增测试数据",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/servicecontent/add_servicecontent",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_servicecontent, exit]
	};
	show_new_div(parm);
	
}

function add_servicecontent(){
	var service_item_id = $("#service_item_id").val();
	var content_name = $("#content_name").val();
	var content_key = $("#content_key").val();
	var content_type = $("#content_type").val();
	var content_value = $("#content_value").val();
	var obj = new Object();
	obj.service_item_id = service_item_id; 
	obj.content_name = content_name;
	obj.content_key = content_key;
	obj.content_type = content_type;
	obj.content_value = content_value;
	$.ajax({
		url :getRootPath()+"/ServiceContent_Controller_4W/add_Servicecontent_lowerlevel.action",
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


