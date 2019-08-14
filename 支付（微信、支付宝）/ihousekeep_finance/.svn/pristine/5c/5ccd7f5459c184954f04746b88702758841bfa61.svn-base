function showTable(parm) {
	// 分页属性
	pageTableParam = parm;
	var t = parm.table_obj;
	t.html("");
	var head_tr = $("<tr>");

	// 是否需要分页

	if (parm.firstcheck != false) {
		var td0 = $("<td>").text("选择");
		var check_all = $("<input type='checkbox' id='checkall'>");
		check_all.click(checkAll_or_not);
		td0.append(check_all);
		td0.css("width", "5%");
		head_tr.append(td0);
	}

	for (var i = 0; i < parm.title.length; i++) {

		var head_table = $("<table>");
		var tr = $("<tr>");
		var td1 = $("<td>");
		td1.text(parm.title[i]);
		tr.append(td1);

		var head_td = $("<td>").append(head_table);
		// 初始化排序
		if (parm.order_column != undefined && parm.order_column != null
				&& parm.order_column[i] != "") {
			var order_table = doorder_init(parm.order_column[i], i,
					parm.order_queryfun);
			var td2 = $("<td>");
			td2.append(order_table);
			tr.append(td2);
		}
		head_table.append(tr);
		head_td.css("width", parm.title_column_width[i]);
		head_tr.append(head_td);

	}

	for (var i = 0; i < parm.optr.length; i++) {
		var head_td = $("<td>").text(parm.optr[i]);
		head_td.css("width", parm.optr_column_width[i]);
		head_tr.append(head_td);
	}
	t.append(head_tr);
	// 表头-----------------------------------结束--------------
	$
			.ajax({
				url : parm.url,
				data : parm.data,
				type : "post",
				success : function(data) {
					if (parm.isDoPage != false) {
						initPage();
					}
					$(data)
							.each(
									function(i, d) {
										var data_tr = $("<tr>");
										if (parm.firstcheck != false) {
											var checkbox = $(
													"<input type='checkbox' name='data_checkbox'>")
													.val(d.id);
											var td0 = $("<td>")
													.append(checkbox);
											data_tr.append(td0);
										}
										// 隐藏的字段
										var hidden_str = "";
										if (parm.data_hidden != null
												&& parm.data_hidden != ""
												&& parm.data_hidden != undefined) {
											for (var i = 0; i < parm.data_hidden.length; i++) {
												hidden_str += d[parm.data_hidden[i]]
														+ ",";
											}
										}

										for (var i = 0; i < parm.title.length; i++) {
											var data_td = $("<td>");
											if (parm.contextType != null
													&& parm.contextType != undefined) {
												if (parm.contextType[i] == "img") {
													data_td
															.append($(
																	"<img onerror='this.src=../images/cancle.png' width='42' height='42' alt=''>")
																	.attr(
																			"src",
																			d[parm.data_column[i]]));
												} else {
													var t_text = d[parm.data_column[i]];
													if (t_text == null
															|| t_text == "null") {
														t_text = "-";
													}
													data_td.text(t_text);
												}
											}
											data_tr.append(data_td);
										}
										// --操作
										var td_optr = $("<td>");
										for (var i = 0; i < parm.optr_project.length; i++) {
											var func = " \"  if(confirm('确认操作【"
													+ parm.optr_project[i]
													+ "】?')){    "
													+ parm.optr_callback[i]
													+ "('" + d.id + "','"
													+ hidden_str
													+ "') }    \" ";
											// var func = parm.optr_callback[i]
											// + "('" + d.id + "','"
											// + hidden_str + "')";

											// 检查是否有隐藏按钮
											var is_hide_button = false;
											if (parm.hide_button != undefined) {
												for (var b = 0; b < parm.hide_button.length; b++) {

													// alert(parm.hide_button[b].datakey+"
													// "+parm.hide_button[b].dataval+"
													// "+parm.hide_button[b].hideindex);
													if (d[parm.hide_button[b].datakey] == parm.hide_button[b].dataval
															&& parm.hide_button[b].hideindex == i) {
														is_hide_button = true;
														break;
													}
												}
											}
											// alert(is_hide_button);
											if (is_hide_button == false) {
												var a_optr = $(
														"<button style='color:#ffffff' onclick="
																+ func + ">")
														.text(
																parm.optr_project[i]);
												if (parm.optr_color != null
														&& parm.optr_color != undefined
														&& parm.optr_color[i] != null
														&& parm.optr_color[i] != undefined) {
													a_optr.css("background",
															parm.optr_color[i]);
												}
												td_optr.append(a_optr);
											}

											data_tr.append(td_optr);
											data_tr.css("margin", "5px");
										}
										t.append(data_tr);
									});
				}
			});
}

function show_new_div(parm) {
	// 显示遮罩层
	$("#backdiv").show();
	$(parm.div_obj).html("");
	var div_head = $("<div>").css("width", "100%").css("line-height", "100px")
			.css("background", "#3F88AF");
	var lable = $("<lable>").text(parm.title).css("color", "#ffffff").css(
			"line-height", "50px").css("letter-spacing", "50px");
	var cancle = $("<img src='../images/cancle.png'>").css("line-height",
			"50px");
	cancle.css("float", "right");
	cancle.click(function() {
		$("#backdiv").hide();
		$(parm.div_obj).hide();
	});
	div_head.append(lable);
	div_head.append(cancle);
	var div_center = $("<div>").css("width", "100%").css("height", "100%").css(
			"background", "#ffffff");
	var div_foot = $("<div>").css("width", "100%").css("line-height", "100px")
			.css("background", "#3F88AF");
	//
	$(parm.div_obj).css("width", parm.width).css("height", parm.height).css(
			"margin", "0 auto").css("position", "absolute").css("top", "20%")
			.css("left", "20%").css("background", "#ffffff").css("z-index",
					"999999");
	
	div_center.load(parm.html, function(response, status, xhr) {
	});
	for (var i = 0; i < parm.buttons.length; i++) {
		var button = $("<button>").css("width", "100").addClass(
				"btn btn-primary").text(parm.buttons[i]);
		div_foot.append(button);
		button.click(parm.buttons_callback[i]);
	}
	$(parm.div_obj).append(div_head);
	$(parm.div_obj).append(div_center);
	$(parm.div_obj).append(div_foot);
	$(parm.div_obj).show();
}

// 全选全不选
function checkAll_or_not(e) {
	var checkbox = $(e.target).prop("checked");
	var data_checkbox = $("input[name='data_checkbox']");
	if (checkbox == true) {
		data_checkbox.prop("checked", true);
	} else if (checkbox == false) {
		data_checkbox.prop("checked", false);
	}
}

function delete_obj(parm) {
	var ch = $("input[name='data_checkbox']:checked");
	var ids = "";
	for (var i = 0; i < ch.length; i++) {
		ids += $(ch[i]).val() + ",";
	}
	if (confirm("确认删除吗?")) {
		var obj = new Object();
		obj.id = ids;
		$.ajax({
			url : parm.url,
			type : "post",
			data : obj,
			error : parm.error,
			success : parm.success
		});
	}
}

var this_order_column;
var this_order_type;

function doorder_init(order_column, index, queryfunc) {
	var t = $("<table>");
	var ur = $("<tr>");
	var ud = $("<td>");
	var orderdata = new Object();
	orderdata.orderby_column = order_column;

	var up_img;
	if (this_order_type == "asc") {
		up_img = "../images/doorder_choose_up.png";
	} else {
		up_img = "../images/doorder_default_up.png";
	}
	var down_img;
	if (this_order_type == "asc") {
		down_img = "../images/doorder_choose_down.png";
	} else {
		down_img = "../images/doorder_default_down.png";
	}

	var um = $("<img>").attr("src", up_img);
	um.click(function() {
		this_order_column = order_column;
		this_order_type = "asc";
		orderdata.orderby_type = "asc";
		dm.attr("src", "../images/doorder_default_up.png");
		um.attr("src", up_img);
		eval(queryfunc + "(orderdata)");
	});
	ud.append(um);
	ur.append(ud);
	t.append(ur);
	var dr = $("<tr>");
	var dd = $("<td>");
	var dm = $("<img>").attr("src", "../images/doorder_choose_down.png");
	dm.click(function() {
		this_order_column = order_column;
		this_order_type = "desc";
		orderdata.orderby_type = "desc";
		um.attr("src", "../images/doorder_default_down.png");
		dm.attr("src", down_img);
		eval(queryfunc + "(orderdata)");
	});
	dd.append(dm);
	dr.append(dd);
	t.append(dr);

	// 弹出 aaa11，bbb11 注意引号‘’，否则报错
	// queryfunc();
	return t;
}
