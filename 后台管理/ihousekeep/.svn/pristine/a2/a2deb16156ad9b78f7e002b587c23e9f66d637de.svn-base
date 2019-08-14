$(document).ready(function() {
	queryEditservice_project(update_id);
});
//根据id查询要显示在详情页数据
function queryEditservice_project(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()
						+ "/ServiceProject_Controller_4W/query_service_project_By_Id.action",
				data : obj,
				success : show_edit_service_project
			});
}
//显示数据
function show_edit_service_project(data) {
	var d = $(data)[0];
	//项目名称
	$("#project_name").html(d.project_name);
	//项目顺序
	$("#project_order").html(d.project_order);
	//是否首页展示
	if (d.is_show =='1') {
		$("#is_show").html("是");
	} else if (d.is_show =='2') {
		$("#is_show").html("否");
	}
	//起价
	$("#on_price").html(d.on_price);
	//顶部项目展示图片
	$("#top_picture").attr("src", httpFileBasePath+d.top_picture);
	//底部封面图片
	$("#picture_bef").attr("src", httpFileBasePath+d.picture_bef);
	//保洁前照片
	$("#front_picture").attr("src", httpFileBasePath+d.front_picture);
	//保洁后照片
	$("#picture_aft").attr("src", httpFileBasePath+d.picture_aft);
	//项目介绍
	$("#introduce").html(d.introduce);
	//项目特色
	$("#characteristic").html(d.characteristic);
	//底部封面链接
	$("#front_picture_link").html(d.front_picture_link);
	//保洁前链接
	$("#picture_bef_link").html(d.picture_bef_link);
	//保洁后链接
	$("#picture_aft_link").html(d.picture_aft_link);
}