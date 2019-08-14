$(document).ready(function(){
	$("#excel_name").text("");
	$("#upload_excel").click(upload_excel);
});

function upload_excel(){
	upload_callback($("#excel_form"),uploadexcelsuccess);
}

function uploadexcelsuccess(data){
	$("#excel_name").text(data);
}