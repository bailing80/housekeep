$(document).ready(function(){
	/**
	 * 监听上传按钮点击事件，调用myupload函数
	 * @returns
	 */
	$("#up_button_1").click(myupload_1);
	
	$("#edit_button_1").click(myedit_1);
	$("#project_id").html(project_id);
	init_unit();

});

function init_unit(){
	$.ajax({
		url : getRootPath()
		+ "/ServiceItem_Controller_4W/query_all__unit_lowerlevel.action",
		success: init_unit_success
	});
}

function init_unit_success(data){
	$("#unit_id").html("");
	$.each(data,function(i,d){
		var op = $("<option>");
		op.val(d.id);
		op.html(d.unit_name);
		$("#unit_id").append(op);
	});
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

function myedit_1(){
	upload_callback($("#photo_form_1"),editsuccess_1);
}

/**
 * 定义的全局变量，用于存储uploadsuccess函数接收到的数据，用于主页的接收
 */
var photo_1;

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

function editsuccess_1(data){
	//将上传函数返回的数据传给全局变量
	photo_1 = data;
	$("#picture").attr("src", httpFileBasePath+photo_1);
	
}
