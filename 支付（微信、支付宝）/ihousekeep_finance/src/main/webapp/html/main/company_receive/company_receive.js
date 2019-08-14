/**
 * 
 */
$(document).ready(function() {
	// 初始化就查询数据
	query();
	//$("#add_test").click(show_add);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

function query() {
	var parm = {
		url : getRootPath() + "/T_lz_receive_type_Controller_4W/queryAllreceive_type.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "收款方式id", "收款方式代号","收款方式名称"],
		data_column : [ "id","type_code","type_name"],
		contextType : [ "text", "text","text"],
		title_column_width : [ "25%", "25%", "30%" ],
		optr : [ "操作" ],
		optr_project : ["编辑"],
		optr_color : ["#62a8d1"],
		optr_callback : [ "edit"],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
//var update_id; 
//function edit(id) {
//	update_id = id;
//	var parm = {
//		title : "编辑数据",
//		html : getRootPath()
//				+ "/BaseMultiController/toPage.action?page=main/update_company_receive/update_company_receive",
//		width : "50%",
//		height : "50%",
//		div_obj : $("#new_div"),
//		buttons : [ "保存", "退出" ],
//		buttons_callback : [ update_business, exit ]
//	};
//	show_new_div(parm);
//}
//function update_business(){
//	var system_acct = $("#system_acct").val();
//	var receive_type = $("input[name='is_enable']:checked").val();
//	alert(receive_type);
//	alert(system_acct);
//	var obj = new Object();
//	obj.id = update_id;
//	obj.system_acct = system_acct;
//	obj.receive_type = receive_type;
//	$.ajax({
//		url :getRootPath()+"/T_lz_systemacct_Controller_4W/update_systemacct_By_Id.action",
//		data : obj,
//		success : flush
//	});
//}