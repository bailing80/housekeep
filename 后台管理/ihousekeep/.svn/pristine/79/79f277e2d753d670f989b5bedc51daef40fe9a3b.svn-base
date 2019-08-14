$(document).ready(function() {
	$("#edit_button").click(myupload);
	
	queryEditserviceiteam(update_id);
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
	$("#item_picture").attr("src",httpFileBasePath+data)
}

function queryEditserviceiteam(id) {

	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()
						+ "/ServiceItem_Controller_4W/query_service_item_By_Id.action",
				data : obj,
				success : show_edit_serviceiteam
			});

}
//编辑页面回显数据
function show_edit_serviceiteam(data) 
{
	//conlllert查idfanhuiyigejihe
	var d = $(data)[0];
	$("#item_name").val(d.item_name);
	$("#item_price").val(d.item_price);
	$("#unit_id").val(d.unit_id);
	$("#item_picture").attr("src",httpFileBasePath+d.item_picture);
	$("#project_id").val(d.project_id);
	$("#item_upper_limit").val(d.item_upper_limit);
	$("#item_lower_limit").val(d.item_lower_limit);
	$("#upper_per_price").val(d.upper_per_price);
	$("#upper_total_price").val(d.upper_total_price);
	$("#lower_per_price").val(d.lower_per_price);
	$("#lower_total_price").val(d.lower_total_price);
}