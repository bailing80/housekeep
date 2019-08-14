$(document).ready(function() {
	// 初始化就查询数据
	query();
	
	$("#delete_riderelegant").click(show_delete);
	$("#add_riderelegant").click(show_add);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

function query() {
	var parm = {
			//queryAllExcellent_Rider
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAllExcellent_Rider.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "序号", "展示顺序", "员工图片", "员工姓名" , "连接地址"],
		data_column : [ "row_number", "show_order", "photo_url", "name" , "link_pic"  ],
		contextType : [ "text", "text", "img" , "text"  ],
		title_column_width : [ "10%", "10%", "20%", "10%", "20%" ],
		hide_button :[{datakey:"age",dataval :12,hideindex :0},{datakey:"name",dataval :"8585",hideindex :1}],
		optr : [ "操作" ],
		optr_project : [ "修改","删除"],
		optr_color : [ "#62a8d1", "#66cc99"],
		optr_callback : [ "edita","del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}



//批量删除
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/delete_all_t_u_rider.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}



/**
 * 编辑方法
 * @param id
 * @returns
 */
var update_id;
function edita(id){
//	alert("id:"+id);
	update_id = id;
	var parm = {
		title : "编辑员工",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/riderelegant/updata_riderelegant",
		width : "50%",
		height : "55%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [update_riderelegant,exit]
	};
	show_new_div(parm);
	
}

function update_riderelegant(){
	var obj = new Object();
	var name = $("#name").val();
	var show_order = $("#show_order").val();
	var link_pic = $("#link_pic").val();
	var is_show=$("#is_show").val();
	var is_show_link=$("#is_show_link").val();
	var is_excellent=$("#is_excellent").val();
	obj.name = name;
	obj.id = update_id;
	obj.show_order=show_order;
	obj.link_pic=link_pic;
	obj.is_show=is_show;
	obj.is_show_link=is_show_link;
	obj.is_excellent=is_excellent;
	obj.photo_url=photo;
//	alert("[update_riderelegant][photo]"+photo);
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/update_t_u_rider.action",
		data : obj,
		success : flush
	});
}


/**
 * 退出
 * @returns
 */
function exit(){
	
	$("#new_div").hide();
	$("#backdiv").hide();
}

function del(id){
//	alert("id:"+id);
	var obj = new Object();
	obj.id = id;
	obj.is_excellent='02';
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/update_t_u_rider.action",
		data : obj,
		success : flush
	});
}

function show_add() {
	var parm = {
		title : "添加员工",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/riderelegant/add_riderelegant",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "添加", "退出" ],
		buttons_callback : [add, exit]
	};
	show_new_div(parm);
	
}



/**
 * 保存对已存在的员工的修改
 * @returns
 */
function add(){
	//alert("add_id:"+add_id);
	var show_order = $("#show_order").val();
	var name = $("#name").val();
	var photo_url = photo;
	//alert("photo:"+photo);
//	alert($("#system_file_name").val());
	//alert(photo_url)
	var link_pic = $("#link_pic").val();
	var obj = new Object();
	obj.show_order = show_order;
	obj.name = name;
	obj.photo_url = photo_url;
	obj.link_pic = link_pic;
	obj.is_excellent ="01";
	obj.id=add_id;
	//alert(add_id);
	$.ajax({
		url :getRootPath()+"/Riderelegant_Manager_Controller_4W/update_t_u_rider.action",
		data : obj,
		success : flush
	});
}

function flush(){
	query();
	exit();
}



