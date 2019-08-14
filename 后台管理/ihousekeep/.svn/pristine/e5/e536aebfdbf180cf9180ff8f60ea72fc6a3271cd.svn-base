$(document).ready(function() { 
	queryAddAdvertisement_item();
});
//查询广告管理id
function queryAddAdvertisement_item() {
	$.ajax({
				url : getRootPath()+ "/Advertisement_item_Controller_4W/query_advertisement_manager.action",
				data : null,
				success : show_add_advertisement_item
			});
}
//将广告管理id回显到编辑框
function show_add_advertisement_item(data) {
	var d = $(data);
	for(var i=0;i<d.length;i++){
		var option = $("<option>");
		option.attr("value",d[i].id);
		option.html(d[i].advertisment_name);
		$("#manger_id").append(option);
	}
}