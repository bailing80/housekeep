$(document).ready(function() {
	querymember_information(member_id);

});

function querymember_information(id) {
	var obj = new Object();
	obj.id = id;
	$
			.ajax({
				url : getRootPath()
						+ "/Member_information_Controller_4W/query_all_member_information.action",
				data : obj,
				success : show_member_information_detail
			});

}

function show_member_information_detail(data) {
	var d = $(data)[0];
	$("#nick_name").html(d.nick_name);
	$("#user_phone").html(d.user_phone);
	$("#address").html(d.address);
	$("#apartment_name").html(d.apartment_name);
	$("#area_name").html(d.area_name);
	$("#true_area").html(d.true_area);
	$("#door_number").html(d.door_number);
	$("#member_state_str").html(d.member_state_str);

}