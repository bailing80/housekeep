$(document).ready(function() {

	init();
});

function init() {
	queryAllTable();
	$("#chooseall").click(chooseAll);
	$("#buttonmakecode").click(makecode);
}
// 读所有的表
function queryAllTable() {
	$.ajax({
		url : "../../../TableController/queryAllTable.action",
		success : queryAllTableSuccess
	});
}

function queryAllTableSuccess(data) {
	alert(data.length+"*******");
	var table = $("#datatable");
	table.html("");
	$("#nums").text(data.length);
	$.each(data, function(i, d) {
		var tr = $("<tr>");
		var check = $("<input type='checkbox' name='tablecheckbox' value='"+d.table_name+"'>");
		var td1 = $("<td>");
		var td2 = $("<td>").text(d.table_name);
		var td3 = $("<td>").text(d.comments);
		td1.append(check);
		tr.append(td1);
		tr.append(td2);
		tr.append(td3);
		table.append(tr);
	});
}

function chooseAll() {
	var c = $("#chooseall").prop("checked");
	var allcheckbox = $("input[name='tablecheckbox']");
	if (c == true) {
		allcheckbox.prop("checked",true);
	}else{
		allcheckbox.prop("checked",false);
	}
}

function makecode(){
	var allcheckbox =$("input[name='tablecheckbox']:checked");
	var tablenames = "";
	$.each(allcheckbox,function(i,d){
		tablenames += $(d).val()+",";
	});
	$.ajax({
		url :"../../../TableController/makeCode.action",
		data: "tablenames="+tablenames,
		success: makecodeSuccess
	});
}

function makecodeSuccess(data)
{
	alert(data);
}
