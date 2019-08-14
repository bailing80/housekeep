$(document).ready(function() { 
	query_edit();
});
//查询编辑数据
function query_edit() {
	var obj = new Object();
	obj.id = edit_id;
	$.ajax({
				url : getRootPath()+ "/Saler_Controller_4W/show_saler.action",
				data : obj,
				success : show_edit
			});
}
//收款方式
var receive_type;
//回显到编辑框
function show_edit(data) {
	var d = $(data)[0];
	//直销商收款方式
	receive_type = d.receive_type;
	//直销商名称
	$("#saler_name").val(d.saler_name);
	//收款账号
	$("#receive_acct").val(d.receive_acct);
	//分成比例
	$("#divide").val(d.divide);
	//营业时间开始
	$("#service_begin").val(d.service_begin);
	//营业结束时间
	$("#service_end").val(d.service_end);
	//是否跨天
	if(d.over_day==1){
		$("#over_day_1").attr("checked","checked");
	}
	if(d.over_day==2){
		$("#over_day_2").attr("checked","checked");
	}
	//查询直销商收款方式
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
		if(receive_type==d[i].type_code){
			option.attr("selected","selected");
		}
		$("#receive_type").append(option);
	}
}