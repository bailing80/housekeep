$(document).ready(function() {
	// 初始化查询数据
	query();
	//新增事件
	$("#add_receive_acct").click(show_add);
	//删除事件
	$("#delete_receive_acct").click(show_delete);
	//查询事件
	$("#query_receive_acct").click(query);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});
//查询功能
function query() {
	var obj = new Object();
	obj.keyword = $("#querydata").val();
	var parm = {
		url : getRootPath() + "/Receive_acct_Controller_4W/queryAll_receive_acct.action",
		data : obj,
		table_obj : $("#datatable"),
		title : [ "序号", "分销商名称" ],
		data_column : [ "rownumber", "acct_name" ],
		contextType : [ "text", "text" ],
		title_column_width : [ "30%", "50%" ],
		optr : [ "操作" ],
		optr_project : [ "设置","详细","删除"],
		optr_color : [ "#62a8d1","#66cc99", "#62a8d1"],
		optr_callback : [ "edit","details","del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}
//删除功能
function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/Receive_acct_Controller_4W/delete_receive_acct.action",
		data : obj,
		success : flush
	});
}
//批量删除 
function show_delete(e) {
	var param = {
		url : getRootPath()+ "/Receive_acct_Controller_4W/delete_batch_receive_acct.action",
		error : flush,
		success : flush,
	}
	delete_obj(param);
}
//弹出添加页面
function show_add() {
	var parm = {
		title : "新增数据",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/receive_acct/add_receive_acct",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_receive_acct, exit]
	};
	show_new_div(parm);
}
//添加功能
function add_receive_acct(){
	//分销商名称
	var acct_name = $("#acct_name").val();
	var obj = new Object();
	obj.acct_name = acct_name;
	$.ajax({
		url :getRootPath()+"/Receive_acct_Controller_4W/add_receive_acct.action",
		data : obj,
		success : flush
	});
}
//定义全局edit_id用于设置页查询当前ID数据
var edit_id;
//弹出设置页面
function edit(id) {
	edit_id = id;
	var parm = {
		title : "编辑分销商",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/receive_acct/edit_receive_acct",
		width : "50%",
		height : "110%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [ execute_edit, exit ]
	};
	show_new_div(parm);
}
//设置功能
function execute_edit() {
	var obj = new Object();
	var check = 0;
	//微信账号
	var wx_acc = $("#wx_acc").val();
	//微信收款密匙
	var wx_key = $("#wx_key").val();
	//支付宝账号
	var zfb_acc = $("#zfb_acc").val();
	//支付宝收款密匙
	var zfb_key = $("#zfb_key").val();
	//APPID
	var app_id = $("#app_id").val();
	//商户私钥
	var merchant_private_key = $("#merchant_private_key").val();
	//支付宝公钥
	var alipay_public_key = $("#alipay_public_key").val();
	//异步通知路径
	var notify_url = $("#notify_url").val();
	//同步通知路径
	var return_url = $("#return_url").val();
	//签名方式
	var sign_type = $("#sign_type").val();
	//字符编码格式
	var charset = $("#charset").val();
	//支付宝网关
	var gatewayurl = $("#gatewayurl").val();
	//支付宝数据格式
	var zfbchar = $("#zfbchar").val();
	if($("input[name='ckb_wx']:checked").val()){
		check+=2;
	}
	if($("input[name='ckb_zfb']:checked").val()){
		check++;
	}
	obj.id = edit_id;
	obj.check = check;
	obj.wx_acc = wx_acc;
	obj.wx_key = wx_key;
	obj.zfb_acc = zfb_acc;
	obj.zfb_key = zfb_key;
	obj.app_id = app_id;
	obj.merchant_private_key = merchant_private_key;
	obj.alipay_public_key = alipay_public_key;
	obj.notify_url = notify_url;
	obj.return_url = return_url;
	obj.sign_type = sign_type;
	obj.charset = charset;
	obj.gatewayurl = gatewayurl;
	obj.zfbchar = zfbchar;
	$.ajax({
				url : getRootPath()+ "/Receive_acct_Controller_4W/edit_receive_acct.action",
				data : obj,
				success : flush
			});
}
//定义全局details_id用于查看详细信息
var details_id;
//弹出详情页面
function details(id) {
	details_id = id;
	var parm = {
		title : "分销商详情",
		html : getRootPath()+ "/BaseMultiController/toPage.action?page=main/receive_acct/details_receive_acct",
		width : "50%",
		height : "110%",
		div_obj : $("#new_div"),
		buttons : [ "退出" ],
		buttons_callback : [ exit ]
	};
	show_new_div(parm);
}
//刷新功能
function flush(){
	query();
	exit();
}
//退出功能
function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
}
