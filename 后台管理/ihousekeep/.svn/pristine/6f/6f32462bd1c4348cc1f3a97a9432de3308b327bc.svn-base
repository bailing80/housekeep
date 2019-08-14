$(document).ready(function() {
	// 初始化就查询数据
	//array = new Array();
	query();
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

//var array;
function query() {
	$.ajax({
		url : getRootPath()+ "/T_s_role_2_menu_Controller_4W/query_all_role_1_menu.action",
		data : null,
		success : re
	});
}
function queryt() {
	$.ajax({
		url : getRootPath()+ "/T_s_role_2_menu_Controller_4W/query_all_role_1_menu.action",
		data : null,
		success : ret
	});
}



function  re(data){
	//alert(map_id+"=map_id")
	var d = $(data)[0];
	d_con = d.con;
	d_role_id = d.role_id;
	d_menu_id = d.menu_id;
	for(var i = 0;i<d_role_id.length;i++){
		var tr = $("<tr>");
		  var td1 = $("<td>");
		  var td2 = $("<td>");
		  //<input type=hidden name=coun value=<%=cc%>
		  //var td3= $("<td>");
		 // var input_h =$("<input>")
		  var input = $("<input>")
		  //input_h.attr("type","hidden")
		 // input_h.attr("value",d_role_id[i].id)
		  input.attr("type", "checkbox")
		  input.attr("id", "checkbox"+(i+1))
		  input.attr("value",d_role_id[i].id)
		  input.attr("name", "data_checkbox")
		  td1.html(d_role_id[i].name)
		  td2.html(input)
		 //array[i]=d_role_id[i].id
		  //td3.html(d[i].id)
		  tr.append(td1);
		  tr.append(td2);
		  //tr.append(td3);
		  $("#d").append(tr);
	}
	queryt();
}
function ret(data){
	var d = $(data)[0];
	d_con = d.con;
	d_role_id = d.role_id;
	d_menu_id = d.menu_id;
	for(var i = 0;i<d_role_id.length;i++){
		for(var j = 0;j<d_menu_id.length;j++){
			for(var k = 0 ;k<d_con.length;k++){
				if(d_role_id[i].id==d_con[k].role_id&&d_con[k].menu_id==map_id){// d_menu_id[j].id
					//alert("aaaa");
					//alert(d_menu_id[j].id+" \n"+d_con[k].menu_id);
					$("#checkbox"+(i+1)).attr("checked","checked");
//					for(var l=0;l<array.length;l++){
//						if(d_role_id[i].id==array[l]){
//							$("#checkbox"+l).attr("checked","checked")
//					}
//					}
				}
			}
		}
	}
}


