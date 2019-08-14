$(document).ready(function(){
	/**
	 * 监听上传按钮点击事件，调用myupload函数
	 * @returns
	 */
	$("#up_button_1").click(myupload_1);
	$("#up_button_2").click(myupload_2);
	$("#up_button_3").click(myupload_3);
	$("#edit_button_1").click(myedit_1);
	$("#edit_button_2").click(myedit_2);
	$("#edit_button_3").click(myedit_3);
	queryAdList();
	$("#project_name").change(function(){
	})
});
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

}
/**
 * 调用upload_callback上传函数
 * $("#photo_form")绑定form表单
 * uploadsuccess为回调函数，用于接收upload_callback返回的字符串
 * @returns
 */

function myupload_1(){
	upload_callback($("#photo_form_1"),uploadsuccess_1);
}
function myupload_2(){
	upload_callback($("#photo_form_2"),uploadsuccess_2);
}
function myupload_3(){
	upload_callback($("#photo_form_3"),uploadsuccess_3);
}

function myedit_1(){
	upload_callback($("#photo_form_1"),editsuccess_1);
}
function myedit_2(){
	upload_callback($("#photo_form_2"),editsuccess_2);
}
function myedit_3(){
	upload_callback($("#photo_form_3"),editsuccess_3);
}
/**
 * 定义的全局变量，用于存储uploadsuccess函数接收到的数据，用于主页的接收
 */
var photo_1;
var photo_2;
var photo_3;
/**
 * upload_callback上传函数的回调函数，data存储着上传函数返回的数据
 * @param data
 * @returns
 */
function uploadsuccess_1(data){
	//将上传函数返回的数据传给全局变量
	photo_1 = data;
	$("#picture").attr("src", httpFileBasePath+photo_1);
}
function uploadsuccess_2(data){
	//将上传函数返回的数据传给全局变量
	photo_2= data;
	$("#picture_bef").attr("src", httpFileBasePath+photo_2);
}
function uploadsuccess_3(data){
	//将上传函数返回的数据传给全局变量
	photo_3 = data;
	$("#picture_aft").attr("src", httpFileBasePath+photo_3);
}
function editsuccess_1(data){
	//将上传函数返回的数据传给全局变量
	photo_1 = data;
	$("#picture").attr("src", httpFileBasePath+photo_1);
	
}
function editsuccess_2(data){
	//将上传函数返回的数据传给全局变量
	photo_2 = data;
	$("#picture_bef").attr("src", httpFileBasePath+photo_2);
}
function editsuccess_3(data){
	//将上传函数返回的数据传给全局变量
	photo_3 = data;
	$("#picture_aft").attr("src", httpFileBasePath+photo_3);
}