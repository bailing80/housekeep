$(document).ready(function() { 
	queryEditAdvertisement_item(update_id);
});
//通过ID查询广告数据
function queryEditAdvertisement_item(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Advertisement_item_Controller_4W/query_Advertisement_item_By_Id.action",
				data : obj,
				success : show_edit_advertisement_item
			});
}
//将广告信息回显到编辑框
var edit_id
function show_edit_advertisement_item(data) {
	var d = $(data)[0];
	edit_id = d.manger_id;
	//项目路径
	$("#item_url").val(d.item_url);
	//题目
	$("#title").val(d.title);
	//是否有二级链接
	if (d.is_sec_link ==1) {
		$("#is_sec_link_1").attr("checked", "checked");
	} else if (d.is_sec_link ==2) {
		$("#is_sec_link_2").attr("checked", "checked");
	}
	//链接标题
	$("#link_title").val(d.link_title);
	//二级链接地址
	$("#sec_url").val(d.sec_url);
	//播放顺序
	$("#board_order").val(d.board_order);
	$.ajax({
		url : getRootPath()+ "/Advertisement_item_Controller_4W/query_advertisement_manager.action",
		data : null,
		success : show_edit_advertisement_item_success
	});
}
//将广告管理id回显到编辑框
function show_edit_advertisement_item_success(data) {
	var d = $(data);
	for(var i=0;i<d.length;i++){
		var option = $("<option>");
		option.html(d[i].advertisment_name);
		option.attr("value",d[i].id);
		if(d[i].id==edit_id){
			option.attr("selected","selected");
		}
		$("#manger_id").append(option);
	}
}