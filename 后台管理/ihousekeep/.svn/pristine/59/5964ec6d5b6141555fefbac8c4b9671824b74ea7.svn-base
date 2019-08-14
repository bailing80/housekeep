$(document).ready(function() { 
	queryEditData(update_id);
});
//通过ID查询广告数据
function queryEditData(id) {
	var obj = new Object();
	alert(id)
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Map_H_Controller_4W/query_map_By_Id.action",
				data : obj,
				success : show_edit_data
			});
}
//将广告信息回显到编辑框
function show_edit_data(data) {
	var d = $(data)[0];
	$("#longitude").val(d.longitude);
	$("#latitude").val(d.latitude);
	$("#color").val(d.color);
	$("#message").val(d.message);
	
}