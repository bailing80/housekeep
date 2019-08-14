 $(document).ready(function() {
	// 初始化就查询数据
	 
	query();
	
	$("#add_serviceiteam").click(show_add);
	$("#delete_serviceiteam").click(show_delete);
	$("#query_serviceiteam").click(query);

	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
 

 function show_delete(e) {
		var param = {
			url : getRootPath()
					+ "/ServiceItem_Controller_4W/delete_Serviceiteam_lowerlevel.action",
			error : flush,
			success : flush,
		}
		delete_obj(param);
	}
 //获取上一级ID
 var project_id;
function query() {
	project_id = $("#hidden").val();
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	obj.project_id = project_id
	var parm = {
		url : getRootPath() + "/ServiceItem_Controller_4W/query_all__Serviceiteam_lowerlevel.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号",  "字项目名称", "子项目单价(元)","计量单位","子项目图片"],
		data_column : ["rownumber","item_name","item_price","unit_name", "item_picture"],
		contextType : [  "text", "text", "text", "text","img" ],
		title_column_width : [ "15%", "17%","17%", "15%", "15%", ],
		optr : [ "操作" ],
		optr_project : ["编辑","删除","查看详情","服务内容"],
		optr_color : [ "#62a8d1", "#66cc99","#62a8d1","#66cc99"],
		optr_callback : [ "edit_service","del","lookdetails","service_content"],
		optr_column_width : [ "15%" ]

	};
	showTable(parm);
}
function service_content(e){
	      //跳转页面
		  location.href=getRootPath()
			+"/BaseMultiController/toPage.action?page=main/servicecontent/servicecontent&param="+e
}
var update_id;
function edit_service(id) {
	update_id = id;
	var parm = {
		title : "编辑项目",
		html : getRootPath()
				+ "/BaseMultiController/toPage.action?page=main/serviceitem_lowerlevel/updat_serviceitem_lowerlevel",
		width : "50%",
		height : "75%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ update_serviceiteam, exit ]
	};
	show_new_div(parm);
}
function update_serviceiteam() {
	var item_name = $("#item_name").val();
	var item_price = $("#item_price").val();
	var unit_id = $("#unit_id").val();
	//photo和谁相对应
	var item_picture = photo;
	var project_id = $("#project_id").val();
	var item_upper_limit = $("#item_upper_limit").val();
	var item_lower_limit = $("#item_lower_limit").val();
	var upper_per_price = $("#upper_per_price").val();
	var upper_total_price = $("#upper_total_price").val();
	var lower_per_price = $("#lower_per_price").val();
	var lower_total_price = $("#lower_total_price").val();
	//var is_enable = $("input[name='is_enable']:checked").val();
	var obj = new Object();
	obj.id = update_id;
	obj.item_name = item_name;
	//item_price和谁相对应
	obj.item_price = item_price;
	obj.unit_id = unit_id;
	obj.item_picture = item_picture;
	obj.project_id = project_id;
	obj.item_upper_limit = item_upper_limit;
	obj.item_lower_limit = item_lower_limit;
	obj.upper_per_price = upper_per_price;
	obj.upper_total_price = upper_total_price;
	obj.lower_per_price = lower_per_price;
	obj.lower_total_price = lower_total_price;
	//obj.is_enable = is_enable;
	$.ajax({
				url : getRootPath()
						+ "/ServiceItem_Controller_4W/update_serviceiteam_lowerlevel_By_Id.action",
				data : obj,
				success : flush
			});
}

var update_id;
function lookdetails(id){
update_id = id;
var parm = {
	title : "查看详情",
	html : getRootPath()
			+ "/BaseMultiController/toPage.action?page=main/serviceitem_lowerlevel/serviceitem_lowerlevel_details",
	width : "50%",
	height : "78%",
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
		url : getRootPath() + "/ServiceItem_Controller_4W/delete_Serviceiteam_lowerlevel.action",
		data : obj,
		success : flush
	});
}


function show_add() {
	var parm = {
		title : "新增测试数据",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/serviceitem_lowerlevel/add_serviceitem_lowerlevel",
		width : "50%",
		height : "75%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_serviceitem, exit]
	};
	show_new_div(parm);
	
}

function add_serviceitem(){
	var item_name = $("#item_name").val();
	var item_price = $("#item_price").val();
	var unit_id = $("#unit_id").val();
	
//
	var item_picture = photo_1;
	var item_upper_limit = $("#item_upper_limit").val();
	var item_lower_limit = $("#item_lower_limit").val();
	var upper_per_price = $("#upper_per_price").val();
	var upper_total_price = $("#upper_total_price").val();
	var lower_per_price = $("#lower_per_price").val();
	var lower_total_price = $("#lower_total_price").val();
	//var is_enable = $("input[name='is_enable']:checked").val();
	var obj = new Object();
	obj.project_id = project_id; 
	obj.item_name = item_name;
	obj.item_price = item_price;
	obj.unit_id = unit_id;
	obj.item_picture = item_picture;
	obj.project_id = project_id;
	obj.item_upper_limit = item_upper_limit;
	obj.item_lower_limit = item_lower_limit;
	obj.upper_per_price = upper_per_price;
	obj.upper_total_price = upper_total_price;
	obj.lower_per_price = lower_per_price;
	obj.lower_total_price = lower_total_price;
	$.ajax({
		url :getRootPath()+"/ServiceItem_Controller_4W/add_Serviceiteam_lowerlevel.action",
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


