$(document).ready(function() {
	//$("#up_button").click(myupload);
	queryEditAdvertisement(update_id);
});

/*function myupload(){
	upload_callback($("#photo_form"),uploadsuccess);
}
var photo;
function uploadsuccess(data){
	alert("####"+data);
	photo = data;
	$("img").remove();
	$("#up_button").append("<img src='"+httpFileBasePath+photo+"'  width='100' heigh='100'/>");
}*/
//通过ID查询广告数据
function queryEditAdvertisement(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/ServiceProject_Controller_4W/query_service_project_By_Id.action",
				data : obj,
				success : show_edit_advertisement
			});
}
//将广告信息回显到编辑框
function show_edit_advertisement(data) {
	var d = $(data)[0];
//	alert( d.top_picture);
	//广告名称
	$("#project_order").val(d.project_order);
	//广告位置
	$("#project_name").val(d.project_name);
	$("#on_price").val(d.on_price);
	$("#picture").attr("src", httpFileBasePath+d.top_picture);
}