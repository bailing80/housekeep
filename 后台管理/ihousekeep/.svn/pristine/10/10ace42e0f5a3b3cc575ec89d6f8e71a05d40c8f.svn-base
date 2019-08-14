$(document).ready(function() {
	queryAllItem(setid);
	// alert("[setitem_ridermanager页面][初始化]");
});

function queryAllItem(id){
	var obj = new Object();
	obj.rider_id=id;
	$.ajax({
		url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/queryAllItem_Name.action",
		data : obj,
		success : show_AllSetItem
	});
}

function show_AllSetItem(data){
	// alert("[show_AllSetItem][调用]");
	var d =$(data);
	//var exp=null;
	// alert("[d.length]"+d.length);
	for(var i = 0;i<d.length;i++){
		if(d[i].rider_id==null){
			$("#item").append("<li class='child'><input type='checkbox' value='"+d[i].id+"'/>["+d[i].item_name+"]</li>");
		}else{
			$("#item").append("<li class='child'><input checked='true' type='checkbox' value='"+d[i].id+"'/>["+d[i].item_name+"]</li>");
		}
	}
}