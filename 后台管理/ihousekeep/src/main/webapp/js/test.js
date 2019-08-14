$(document).ready(init);

function init() {
	$("#addbutton").click(add);
	queryUser();
}

function add() {
	var name = $("#name").val();
	var pass = $("#pass").val();
	var age = $("#age").val();
	var user = new Object();
	user.name = name;
	user.password = pass;
	user.age = age;
	$.ajax({
		url : "../member/add.action",
		type : "post",
		data : user,
		success : function(){
			queryUser();
		}
	});
}


function queryUser(){
	$.ajax({
		url : "../member/queryAll.action",
		type : "post",
		success : queryUserSuccess
	});
}

function queryUserSuccess(data){
	var table = $("#usertable");
	table.html("");
	$(data).each(function(index,d){
		var tr = $("<tr>");
		var td1 = $("<td>");
		var td2 = $("<td>");
		var td3 = $("<td>");
		var td4 = $("<td>");
		var td5 = $("<td>");
		td1.text(d.id);
		td2.text(d.name);
		td3.text(d.password);
		td4.text(d.age);
		var a = $("<button>删除</button>");
		a.click(function(){
			deleteUser(d.id);
		});
		td5.append(a);
		tr.append(td1);
		tr.append(td2);
		tr.append(td3);
		tr.append(td4);
		tr.append(td5);
		table.append(tr);
	});
}

function deleteUser(id){
	var user = new Object();
	user.id = id;
	$.ajax({
		url : "../member/deleteUser.action",
		type : "post",
		data: user,
		success : function(){
			queryUser();
		}
	});
}
