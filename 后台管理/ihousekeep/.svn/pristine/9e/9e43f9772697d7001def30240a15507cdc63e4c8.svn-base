$(document).ready(function() { 
	queryAddAdvertisement();
});
//查询广告管理id
function queryAddAdvertisement() {
	$.ajax({
				url : getRootPath()+ "/Advertisement_Controller_4W/queryAll_t_s_advertisement_type.action",
				data : null,
				success : show_add_advertisement
			});
}
//将广告管理id回显到编辑框
function show_add_advertisement(data) {
	var d = $(data);
	for(var i=0;i<d.length;i++){
		var option = $("<option>");
		option.attr("value",d[i].id);
		option.html(d[i].type_name);
		$("#type_id").append(option);
	}
}