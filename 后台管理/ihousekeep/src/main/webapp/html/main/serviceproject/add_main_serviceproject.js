$(document).ready(function() {
	$("#up_button_top_picture").click(upload_top_picture);
	$("#up_button_front_picture").click(upload_front_picture);
});
//上传顶部图片按钮点击事件
function upload_top_picture() {
	upload_callback($("#photo_form_top_picture"), uploadsuccess_top_picture);
}
//上传底部图片按钮点击事件
function upload_front_picture() {
	upload_callback($("#photo_form_front_picture"), uploadsuccess_front_picture);
}
//顶部图片
var top_picture;
//底部图片
var front_picture;
// 将上传函数返回的数据传给全局变量
function uploadsuccess_top_picture(data) {
	top_picture = data;
	$("#top_picture").attr("src", httpFileBasePath + top_picture);
}
// 将上传函数返回的数据传给全局变量
function uploadsuccess_front_picture(data) {
	front_picture = data;
	$("#front_picture").attr("src", httpFileBasePath + front_picture);
}
