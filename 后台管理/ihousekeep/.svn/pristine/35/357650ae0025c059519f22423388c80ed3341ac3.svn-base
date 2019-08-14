$(document).ready(function() {
	modelchange();
	$("#model").change(modelchange);
	$("#modelfunc").click(funcchange);
	$("#send").click(send);
});

var m0 = [ "测试1-查询所有服务"];
var k0 = [ "/Test_Controller_4X/getAll_ServiceProject"];


var M = [ m0];
var K = [ k0];

function modelchange() {
	clearData();
	var val = $("#model").val();
	var modelfunc = $("#modelfunc");
	modelfunc.html("");
	for (var i = 0; i < M[val].length; i++) {
		var op = $("<option>");
		op.val(i);
		op.text(M[val][i]);
		modelfunc.append(op);
	}
	$("#htmlframe").attr("src", "");
}
var u = "";
function funcchange() {
	clearData();
	var modelfunc = $("#modelfunc").val();
	var model = $("#model").val();
	var url = "html/modelfun/m" + model + "_" + modelfunc + ".html";
	$("#htmlframe").prop("src", url);
	u = "";
	$("#send_url").val(K[model][modelfunc]);
}

function send() {
	var trs = $("#htmlframe").contents().find("tr");
	var str = "";
	$(trs).each(function(index, data) {
		var tds = $(data).find("td");
		var key;
		var value;
		$(tds).each(function(i, d) {
			if (i == 1) {
				key = $(d).text();
			}
			if (i == 2) {
				value = $(d).find("input").val();
			}
		});
		if (key != null && value != "") {
			str += key + "=" + value + "&";
		}
	});
	var send_url = $("#send_url");
	if (u == "") {
		u = send_url.val();
	}
	var s = u + ".action?" + str;
	send_url.val(s);
	$.ajax({
		url : "." + s,
		type : "post",
		dataType : "text",
		success : sendSuccess
	});
}

function clearData() {
	$("#result_data").text("");
}

function sendSuccess(data) {
	var a = (data + "").replace(/[\r\n]/g, "");// 去掉回车换行;

	var testJson = $.parseJSON(a);
	var b = (testJson.data).replace(/[\r\n]/g, "");// 去掉回车换行;

	// b = decryptByDES(b, "wang!@#$");

	b = decodeURI(decodeURI(b)).replace(new RegExp("%3A", 'g'), ":").replace(
			new RegExp("%2C", 'g'), ",");
	// document.write(b);

	$("#result_data").text(b);
}

