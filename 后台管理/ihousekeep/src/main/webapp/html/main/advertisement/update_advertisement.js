$(document).ready(function() { 
	queryEditAdvertisement(update_id);
});
//通过ID查询广告数据
function queryEditAdvertisement(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Advertisement_Controller_4W/query_Advertisement_manager_By_Id.action",
				data : obj,
				success : show_edit_advertisement
			});
}
//将广告信息回显到编辑框
//广告类型id
var type_id;
function show_edit_advertisement(data) {
	var d = $(data)[0];
	type_id = d.type_id;
	//广告名称
	$("#advertisment_name").val(d.advertisment_name);
	//广告位置
	$("#position").val(d.position);
	//是否轮播
	if (d.is_wheel == '1') {
		$("#wheel_1").attr("selected", "selected");
	} else if (d.is_wheel == '2') {
		$("#wheel_2").attr("selected", "selected");
	}
	//是否上架
	if (d.is_enable == '01') {
		$("#is_enable_1").attr("checked", "checked");
	} else if (d.is_enable == '02') {
		$("#is_enable_2").attr("checked", "checked");
	}
	//轮播时长，单位毫秒
	if (d.wheel_time =='1000') {
		$("#wheel_time_1").attr("selected", "selected");
	} else if (d.wheel_time=='1500') {
		$("#wheel_time_2").attr("selected", "selected");
	}else if (d.wheel_time =='2000') {
		$("#wheel_time_3").attr("selected", "selected");
	}else if (d.wheel_time=='2500') {
		$("#wheel_time_4").attr("selected", "selected");
	}else if (d.wheel_time =='3000') {
		$("#wheel_time_5").attr("selected", "selected");
	}else if (d.wheel_time =='3500') {
		$("#wheel_time_6").attr("selected", "selected");
	}else if (d.wheel_time =='4000') {
		$("#wheel_time_7").attr("selected", "selected");
	}else if (d.wheel_time =='4500') {
		$("#wheel_time_8").attr("selected", "selected");
	}
	$.ajax({
		url : getRootPath()+ "/Advertisement_Controller_4W/queryAll_t_s_advertisement_type.action",
		data : null,
		success : show_edit_advertisement_success
	});
}
//将广告管理id回显到编辑框
function show_edit_advertisement_success(data) {
	var d = $(data);
	for(var i=0;i<d.length;i++){
		var option = $("<option>");
		option.attr("value",d[i].id);
		option.html(d[i].type_name);
		if(type_id==d[i].id){
			option.attr("selected","selected");
		}
		$("#type_id").append(option);
	}
}