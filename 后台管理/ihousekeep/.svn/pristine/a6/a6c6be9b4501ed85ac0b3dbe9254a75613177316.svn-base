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
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAllManager_Rider.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "序号", "姓名", "员工图片", "电话" , "得分","服务单数","身份","上级员工","优秀员工","首页显示"],
		data_column : [ "row_number", "name","photo_url", "phone", "rider_code" ,"rider_sum","level_name","leader_name","is_excellent","is_show"],
		contextType : [ "text", "text", "img" , "text", "text", "text", "text" , "text", "text", "text"],
		title_column_width : [ "8%", "8%", "8%", "8%", "8%", "8%", "8%", "8%", "8%", "8%" ],
		hide_button :[{datakey:"age",dataval :12,hideindex :0},{datakey:"name",dataval :"8585",hideindex :1}],
		optr : [ "操作" ],
		optr_project : [ "编辑","删除","详情","设置服务项"],
		optr_color : [ "#62a8d1", "#66cc99","#62a8d1","#66cc99"],
		optr_callback : [ "edita","del","detail" ,"setservice"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

var setid;
function setservice(id){
	setid = id;
	var parm = {
			title : "设置服务项",
			html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/riderelegant/setitem_ridermanager",
			width : "50%",
			height : "50%",
			div_obj : $("#new_div"),
			buttons : [ "保存", "退出" ],
			buttons_callback : [setitem,exit]
		};
		show_new_div(parm);
	
	
}

function setitem(){
	var obj = new Object();
	obj.id = setid;
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/delete_By_Rider.action",
		data : obj
	});
	
	$("#item :checked").each(function(){
		
		obj.rider_id = setid;
		obj.service_item_id = $(this).val();
		//alert($(this).val());
		$.ajax({
			url : getRootPath() + "/Riderelegant_Manager_Controller_4W/insert_t_u_ride_service_item.action",
			data : obj
		});
		
	});
	flush();
}



var detail_id;
function detail(id){
	detail_id = id;
	var parm = {
		title : "员工详情",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/riderelegant/detail_ridermanager",
		width : "75%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "退出"],
		buttons_callback : [exit]
	};
	show_new_div(parm);
	
	
}


//批量删除
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/delete_all_manager_rider.action",
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
var leader_id;
function edita(id){
//	alert("id:"+id);
	update_id = id;
	var parm = {
		title : "编辑员工",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/riderelegant/edit_ridermanager",
		width : "60%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [update_riderelegant,exit]
	};
	show_new_div(parm);
	
}

function update_riderelegant(){
	//alert("[update_riderelegant][调用]");
	var obj = new Object();
	var phone = $("#phone").val();
	var name = $("#name").val();
	var pwd=$("#pwd").val();
	var cpwd = $("#cpwd").val();
	var user_manager_role_id=$("#user_manager_role_id").val();
	var leader_id=$("#leader_role_id").val();
	var is_login = $("#is_login").val();
	//alert("leader_id:"+leader_id);
	//alert("leader_role_id:"+leader_role_id);
	obj.id = update_id;
	obj.phone=phone;
	obj.name=name;
	obj.pwd=pwd;
	obj.user_manager_role_id=user_manager_role_id;
	obj.leader_id=leader_id;
	obj.is_login = is_login;
	
//	alert("[update_riderelegant][photo]"+photo);
	if($.trim(pwd) == $.trim(cpwd)){
		$.ajax({
			url : getRootPath() + "/Riderelegant_Manager_Controller_4W/update_t_u_rider.action",
			data : obj,
			success : flush
		});
	}else{
		alert("密码不匹配,请重新输入");
	}
	
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
	//alert("id:"+id);
	var obj = new Object();
	obj.id = id;
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/delete_t_u_rider.action",
		data : obj,
		success : flush
	});
}

function show_add() {
	var parm = {
		title : "新增测试数据",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/riderelegant/add_ridermanager",
		width : "50%",
		height : "60%",
		div_obj : $("#new_div"),
		buttons : [ "添加", "退出" ],
		buttons_callback : [add, exit]
	};
	show_new_div(parm);
	
}



/**
 * 添加员工
 * @returns
 */
function add(){
	/*alert("add_id:"+add_id);*/
	var phone = $("#phone").val();
	var name = $("#name").val();
	var pwd = $("#pwd").val();
	var cpwd = $("#cpwd").val();
	//alert("photo:"+photo);
//	alert($("#system_file_name").val());
	//alert(photo_url)
	var user_manager_role_id = $("#user_manager_role_id").val();
	var leader_id = $("#leader_role_id").val();
	var is_login = $("#is_login").val();

	var obj = new Object();
	obj.leader_id = leader_id;
	obj.phone = phone;
	obj.name = name;
	obj.pwd = pwd;
	obj.user_manager_role_id = user_manager_role_id;
	
	obj.is_login = is_login;
	if($.trim(pwd) == $.trim(cpwd)){
		$.ajax({
			url :getRootPath()+"/Riderelegant_Manager_Controller_4W/insert_t_u_rider.action",
			data : obj,
			success : flush
		});
	}else{
		alert("密码不匹配,请重新输入");
	}
	
}

function flush(){
	query();
	exit();
}



