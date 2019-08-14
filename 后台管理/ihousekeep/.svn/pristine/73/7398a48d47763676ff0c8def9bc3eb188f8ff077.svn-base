$(document).ready(function() {
	editRiderelegant(update_id);
});

function editRiderelegant(id) {
	//alert("Editid:"+id);
	var obj = new Object();
	obj.id = id;
	$.ajax({
			url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/queryBy_t_u_rider.action",
			data : obj,
			async: false ,
			success : show_edit_riderelegant
		});
	
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAll_USer_Manager_Role.action",
		data :null,
		async: false ,
		success : show_add_riderelegant
	});
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAll_t_u_rider.action",
		data :null,
		async: false ,
		success : show_leader
	});
}
var user_manager_role_id;
function show_edit_riderelegant(data){
	//alert("[show_edit_riderelegant][调用]");
	var d =$(data)[0];
	user_manager_role_id=d.user_manager_role_id;
	leader_id=d.leader_id;
	$("#phone").val(d.phone);
	$("#name").val(d.name);
	$("#pwd").val(d.pwd);
	//alert("leader_id:"+leader_id);
	//alert("d.is_login:"+d.is_login)
	if(d.is_login==1){
		$("#is_login").append("<option value='01'>"+"允许登录"+"</option>");
		$("#is_login").append("<option value='02'>"+"禁止登录"+"</option>");
	}else{
		$("#is_login").append("<option value='02'>"+"禁止登录"+"</option>");
		$("#is_login").append("<option value='01'>"+"允许登录"+"</option>");
	}
}


function show_add_riderelegant(data){
	/*alert("[show_add_riderelegant][调用]");
	alert("$(data)[0].id:"+$(data)[0].id);*/
	//alert("$(data).length:"+$(data).length);
	for(var i =0;i<$(data).length;i++){
		if($(data)[i].id==user_manager_role_id){
			$("#user_manager_role_id").prepend("<option id='init_level' value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
			$("#init_level").attr('selected', true);
		}
		$("#user_manager_role_id").append("<option value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
	}

}

function show_leader(data){
	$("#leader_role_id").append("<option>"+"无"+"</option>");
	for(var i =0;i<$(data).length;i++){
		if($(data)[i].id==leader_id){
			$("#leader_role_id").prepend("<option id='init' value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
			$("#init").attr('selected', true);
		}else if($(data)[i].id != update_id){
			$("#leader_role_id").append("<option value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
		}
		
	}
	
}
