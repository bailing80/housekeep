$(document).ready(init);

function init(){
	//取token
	getToken();
	getSession();
}

function getToken(){
	$.ajax({
		url : "UtilController/getToken.action",
		type : "post",
		success : getTokenSuccess
	});
}

function getTokenSuccess(data){
	$("#token_str").val(data);
}

function getSession(){
	$.ajax({
		url : "UtilController/getSession.action",
		type : "post",
		success : getSessionSuccess
	});
}

function getSessionSuccess(data){
	$("#session_str").val(data);
}