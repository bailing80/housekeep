$(document).ready(function(){
	$("#import_excel").click(show_import);
	
});


function show_import() {
	var parm = {
		title : "批量导入数据",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/data/import_excel",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ save_excel, exit ]
	};
	show_new_div(parm);
}


function save_excel(){
	var excel_name = $("#excel_name").text();
	if(excel_name == null || excel_name==""){
		alert("文件不能为空");
	}else{
		$.ajax({
			url : getRootPath()+"/Excel_Import_Controller_4W/importExcel.action?excel_name="+excel_name,
			success : excel_import_success
		});
	}
}

function excel_import_success(data){
	alert(data);
}





