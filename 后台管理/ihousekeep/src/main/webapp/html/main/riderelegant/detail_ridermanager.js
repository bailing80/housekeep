$(document).ready(function() {
	detailManager(detail_id);
});



function detailManager(id) {
	var obj = new Object();
	var obj1 = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/queryByManager_Rider.action",
				data : obj,
				success : show_detail_manager_1
			});
	obj1.rider_id = id;
	$.ajax({
		url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/queryAllItem_Name.action",
		data : obj1,
		success : show_detail_manager_2
	});
}

function show_detail_manager_1(data){
	var d =$(data)[0];
	$("#phone").val(d.phone);
	$("#name").val(d.name);
	$("#level_name").val(d.level_name);
	$("#leader_name").val(d.leader_name);
	if(d.is_login==1){
		$("#is_login").val("是");
	}else{
		$("#is_login").val("否");
	}
	
	$("#location").val(d.latitude+d.longitude);
	$("#order_statue").val(d.order_statue);
	$("#rider_code").val(d.rider_code);
	if(d.is_excellent=='01'){
		$("#is_excellent").val("是");
	}else{
		$("#is_excellent").val("否");
	}
	//$("#is_excellent").val(d.is_excellent);
	$("#rider_sum").val(d.rider_sum);
	$("#photo").attr('src',httpFileBasePath+d.photo_url); 
//	$("#is_show").val(d.is_show);
	/*if(d.is_show=='01'){
		$("#is_show").val("显示");
	}else{
		$("#is_show").val("隐藏");
	}

	$("#photo").val(d.photo_url);
	photo=d.photo_url;
	$("#photo").attr('src',httpFileBasePath+photo); 
//	alert(photo);*/
}
function show_detail_manager_2(data){
	var d =$(data);
	for(var i = 0;i<d.length;i++){
		if(d[i].rider_id!=null){
		$("#service_item").append("<lable>["+d[i].item_name+"]</lable>");
		}
	}

}
