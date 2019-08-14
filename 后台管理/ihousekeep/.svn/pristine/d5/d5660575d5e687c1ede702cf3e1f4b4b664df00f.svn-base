$(document).ready(function() {
	editRiderelegant(update_id);
	$("#up_button").click(myupload);
});

function myupload(){
	
	upload_callback($("#photo_form"),uploadsuccess);
	
}

var photo;

function uploadsuccess(data){
//	alert("####"+data);
	//将上传函数返回的数据传给全局变量
	photo = data;
	//alert(photo);
	//$("#up_button").hide();
//	$("img").remove();
//	$("#up_button").append("<img src='"+httpFileBasePath+photo+"'  width='100' heigh='100'/>");
	//alert(httpFileBasePath+photo);
	$("#photo").attr('src',httpFileBasePath+photo); 
}


function editRiderelegant(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/queryBy_t_u_rider.action",
				data : obj,
				success : show_edit_riderelegant
			});
}

function show_edit_riderelegant(data){
	//alert("[show_edit_riderelegant][调用]");
	var d =$(data)[0];
	$("#name").val(d.name);
	$("#show_order").val(d.show_order);
	$("#link_pic").val(d.link_pic);
	//$("#user_manager_role_id").append("<option value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
	//alert(d.is_show);
	if(d.is_show=='01'){
		$("#is_show").append("<option value='01'>"+"显示"+"</option>");
		$("#is_show").append("<option value='02'>"+"隐藏"+"</option>");
	}else{
		$("#is_show").append("<option value='02'>"+"隐藏"+"</option>");
		$("#is_show").append("<option value='01'>"+"显示"+"</option>");
	}
//	$("#is_show_link").val(d.is_show_link);
	if(d.is_show_link=='01'){
		$("#is_show_link").append("<option value='01'>"+"显示连接"+"</option>");
		$("#is_show_link").append("<option value='02'>"+"隐藏连接"+"</option>");
	}else{
		$("#is_show_link").append("<option value='02'>"+"隐藏连接"+"</option>");
		$("#is_show_link").append("<option value='01'>"+"显示连接"+"</option>");
	}
//	$("#is_excellent").val(d.is_excellent);
	if(d.is_excellent=='01'){
		$("#is_excellent").append("<option value='01'>"+"优秀员工"+"</option>");
		$("#is_excellent").append("<option value='02'>"+"非优秀员工"+"</option>");
	}else{
		$("#is_excellent").append("<option value='02'>"+"优秀员工"+"</option>");
		$("#is_excellent").append("<option value='01'>"+"非优秀员工"+"</option>");
	}
	$("#photo").val(d.photo_url);
	photo=d.photo_url;
	$("#photo").attr('src',httpFileBasePath+photo); 
//	alert(photo);
}
