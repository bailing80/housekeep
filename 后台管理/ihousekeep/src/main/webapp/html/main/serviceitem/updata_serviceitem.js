$(document).ready(function() {
	$("#up_button").click(myupload);
	queryEditserviceiteam(update_id);
});


function myupload(){
	
	upload_callback($("#photo_form"),uploadsuccess);
	
	
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
	//将上传函数返回的数据传给全局变量
	photo = data;
	//$("#up_button").hide();
	$("img").remove();
	$("#up_button").append("<img src='"+httpFileBasePath+photo+"'  width='100' heigh='100'/>");
}




function queryEditserviceiteam(id) {

	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()
						+ "/ServiceProject_Controller_4W/query_service_project_By_Id.action",
				data : obj,
				success : show_edit_serviceiteam
			});

}
//更新



function show_edit_serviceiteam(data) {
	var d = $(data)[0];
	$("#project_name").val(d.project_name);
	$("#picture").attr("src", httpFileBasePath+d.front_picture);
	$("#picture_bef").attr("src", httpFileBasePath+d.picture_bef);
	$("#picture_aft").attr("src", httpFileBasePath+d.picture_aft);
	$("#introduce").val(d.introduce);
	$("#characteristic").val(d.characteristic);
	$("#front_picture_link").val(d.front_picture_link);
	$("#picture_bef_link").val(d.picture_bef_link);
	$("#picture_aft_link").val(d.picture_aft_link);
	$("#project_order").val(d.project_order);
	
	
}