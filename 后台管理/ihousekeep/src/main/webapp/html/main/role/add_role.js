$(document).ready(function() {
	queryparent_id();
});

function queryparent_id() {
	var obj = new Object();
	
	   $.ajax({
		url : getRootPath() + "/Role_Controller_4W/query_all_t_s_role_manager.action",
		data :obj,
		success : aaa
	});
}

function aaa(data) {
	$("#parent_id").append("<option value=无>"+"无"+"</option>");
	for(var i =0;i<$(data).length;i++){
	$("#parent_id").append("<option value='"+$(data)[i].this_level+"'>"+$(data)[i].this_level+"</option>");
	
	}
	}
