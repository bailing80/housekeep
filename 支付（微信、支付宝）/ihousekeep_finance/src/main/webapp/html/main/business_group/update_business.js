/**
 * 
 */
$(document).ready(function() { 
	queryEditbusiness(update_id);
});
function queryEditbusiness(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/T_lz_systemacct_Controller_4W/query_systemacct_By_Id.action",
				data : obj,
				success : show_edit_advertisement
			});
}
////将广告信息回显到编辑框
////广告类型id
//var type_id;
//function show_edit_advertisement(data) {
//	var d = $(data)[0];
//	type_id = d.type_id;
//	//广告名称
//	$("#advertisment_name").val(d.advertisment_name);
//	//广告位置
//	$("#position").val(d.position);
//	$.ajax({
//		url : getRootPath()+ "/Advertisement_Controller_4W/queryAll_t_s_advertisement_type.action",
//		data : null,
//		success : show_edit_advertisement_success
//	});
//}
//返回编辑框
function show_edit_advertisement(data) {
	var d = $(data)[0];
	$("#system_acct").val(d.system_acct);
	//$("input[name='is_enable']:checked").val(d.receive_type);
	//$("#receive_type").val(d.receive_type);
	if (d.receive_type == 'A01') {
		$("#alipay").attr("checked", "checked");
	} else if (d.receive_type == 'A02') {
		$("#wxpay").attr("checked", "checked");
	}
	}
