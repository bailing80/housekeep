$(document).ready(function() {
	$("#up_button_1").click(myupload_1);
	$("#edit_button_1").click(myedit_1);
	queryAdList();
	$("#project_name").change(function(){
//		alert($("#project_name").val())
	})
});

function myupload_1(){
	upload_callback($("#photo_form_1"),uploadsuccess_1);
}
function myedit_1(){
	upload_callback($("#photo_form_1"),editsuccess_1);
}

var photo_1;
function uploadsuccess_1(data){
	photo_1=data;
	$("#picture").attr("src", httpFileBasePath+photo_1);
}
function editsuccess_1(data){
	//将上传函数返回的数据传给全局变量
	photo_1 = data;
	$("#picture").attr("src", httpFileBasePath+photo_1);
	
}

function queryAdList(){
	var obj = new Object();
	obj.is_show = '2'
	$.ajax({
		url : getRootPath() + "/ServiceProject_Controller_4W/query_show_service_project_Service_manager.action",
		data : obj,
		success : add_adList
	});
}

function add_adList(data){
	var $data= $(data)
	for (var i = 0; i < $data.length; i++) {
		var option = $('<option>');
		option.attr("value",$data[i].id);
		option.html($data[i].project_name);
		$("#project_name").append(option);
	}
	//update_id = $("#project_name").val()
	
	
	
//	
//	alert(d.id)
//	alert(d1.id)
//	alert($(data).length)
//	
//	var option1 = $('<option>');
//	option1.value="556";
//	option1.html("dada");
//	$("#adList").append(option1);
//	
//	var option2 = $('<option>');
//	option2.value="556";
//	$("#adList").append(option2);
//	
//	var option3 = $('<option>');
//	option3.value="556";
//	$("#adList").append(option3);
}