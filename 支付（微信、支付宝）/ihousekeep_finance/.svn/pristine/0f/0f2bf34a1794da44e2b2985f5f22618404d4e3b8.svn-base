$(document).ready(function() { 
	query_add_saler();
});
//查询直销商收款方式
function query_add_saler() {
	$.ajax({
				url : getRootPath()+ "/Saler_Controller_4W/queryAll_receive_type.action",
				data : null,
				success : show_add_saler
			});
}
//将直销商收款方式回显到编辑框
function show_add_saler(data) {
	var d = $(data);
	for(var i=0;i<d.length;i++){
		var option = $("<option>");
		option.attr("value",d[i].type_code);
		option.html(d[i].type_name);
		$("#receive_type").append(option);
	}
}