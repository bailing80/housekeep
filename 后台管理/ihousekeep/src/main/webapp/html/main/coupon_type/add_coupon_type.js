$(document).ready(function() {
	$("#up_button_1").click(myupload_1);
	$("#edit_button_1").click(myedit_1);
	queryAdList();
});

function myupload_1() {
	upload_callback($("#photo_form_1"), uploadsuccess_1);
}
function myedit_1() {
	upload_callback($("#photo_form_1"), editsuccess_1);
}

var photo_1;
function uploadsuccess_1(data) {
	photo_1 = data;
	$("#picture").attr("src", httpFileBasePath + photo_1);
}
function editsuccess_1(data) {
	// 将上传函数返回的数据传给全局变量
	photo_1 = data;
	$("#picture").attr("src", httpFileBasePath + photo_1);

}

function queryAdList() {
	var obj = new Object();
	$.ajax({
		url : getRootPath()
				+ "/Coupon_type_Controller_4W/queryAll_coupon_type.action",
		data : obj,
		success : add_adList
	});
}

function add_adList(data) {
	var $data = $(data)
	for (var i = 0; i < $data.length; i++) {
		var option = $('<option>');
		option.value = $data[i].id;
		option.html($data[i].project_name);
		$("#project_name").append(option);
	}

}