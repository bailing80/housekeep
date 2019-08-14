$(document).ready(function() {
	queryAll_User_Manager();
	//alert("[add_riderelegant][页面初始化]");
	//queryUnexcellent();
	$("#up_button").click(myupload);
	$("#select_rider").change(select_change);
});

function select_change(){
//	alert("[select_change][调用]");
	var obj = new Object();
	obj.id = $("#select_rider").val();
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryBy_t_u_rider.action",
		data :obj,
		success : change_add
	});
	
}

/*var add_id;
function change_add(data){
//	alert("[change_add][调用]");
	var d = $(data)[0];
	$("#show_order").val(d.show_order);
	$("#photo").attr('src',httpFileBasePath+d.photo_url); 
	$("#link_pic").val(d.link_pic);
	add_id = d.id;
}*/

/**
 * 调用upload_callback上传函数
 * $("#photo_form")绑定form表单
 * uploadsuccess为回调函数，用于接收upload_callback返回的字符串
 * @returns
 */
function myupload(){
	
	upload_callback($("#photo_form"),uploadsuccess);
	
	
}

function queryAll_User_Manager(){
//	alert("[queryAll_User_Manager][调用]");
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAll_USer_Manager_Role.action",
		data :null,
		success : show_add_riderelegant
	});
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAll_t_u_rider.action",
		data :null,
		success : show_leader
	});
}

function show_leader(data){
	$("#leader_role_id").append("<option value='0'>"+"无"+"</option>");
	for(var i =0;i<$(data).length;i++){
		if($(data)[i].id != update_id){
			$("#leader_role_id").append("<option value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
		}
	}
}

function show_add_riderelegant(data){
	/*alert("[show_add_riderelegant][调用]");
	alert("$(data)[0].id:"+$(data)[0].id);*/
	//alert("$(data).length:"+$(data).length);
	for(var i =0;i<$(data).length;i++){
		$("#user_manager_role_id").append("<option value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
	}
}

/**
 * 定义的全局变量，用于存储uploadsuccess函数接收到的数据，用于主页的接收
 */
var photo
/**
 * upload_callback上传函数的回调函数，data存储着上传函数返回的数据
 * @param data
 * @returns
 */
function uploadsuccess(data){
//	alert("####"+data);
	//将上传函数返回的数据传给全局变量
	photo = data;
	//alert(photo);
	//$("#up_button").hide();
	/*$("img").remove();
	$("#up_button").append("<img src='"+httpFileBasePath+photo+"'  width='100' heigh='100'/>");
	//alert(httpFileBasePath+photo);	
*/
	$("#photo").attr('src',httpFileBasePath+photo);
	
	}