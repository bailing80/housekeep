$(document).ready(function() {
	modelchange();
	$("#model").change(modelchange);
	$("#modelfunc").click(funcchange);
	$("#send").click(send);
});

var m0 = [ "M0-0用户注册", "M0-1用户登录" ,"M0-2检测手机号是否在客户端注册","M0-3用户请求验证码","M0-4获取优惠券","M0-5优惠券兑换码","M0-6","M0-7修改密码","M0-8返回版本地址"];
var k0 = [ "/Register_Controller_4M/doregister", "/Login_Conntroller_4M/dologin","/PhoneValidate_Controller_4M/validate","","/Qcoupon_Controller_4M/queryCoupon","/GetVoucher_Conntroller_4M/getVoucher","","/Register_Controller_4M/changePassword","/UpdateAPPController/versionAddress"];
var m1 = ["M1-0提交招募代理","M1-1设置头像"];
var k1 = ["/SubmitAgency_Controller_4M/submitAgency","/FranchiseeInformation_Controller_4M/dofranchiseeinformation"];

var m2 = [ "M2-0首页"];
var k2 = ["/Washing_Controller_4M/queryWashLocation"];

var m3 = [ "M3-0查看已完成订单列表","M3-1获取待评价订单列表","M3-2获取待评价详情页","M3-3提交评价","M3-4下单接口","M3-5洗手实时状态","M3-6查询订单","M3-7获取增值服务","M3-8获取订单明细","M3-9取消订单","M3-10获取订单评价详情页"];
var k3= ["/OrderCom_Conntroller_4M/getOrderCom","/Evalution_Controller_4M/queryevalution","/GetEvaluation_Controller_4M/getevaluation","/SubmitEvaluation_Controller_4M/submitevaluation","/GetOrder_Conntroller_4M/getOrder","/GetOrdersStatus_Controller_4M/queryorderstatus","/QueryOrder_Controller_4M/queryOrder","/GetAddedServices_Controller_4M/getAddedServices","/GetOrderDetail_Controller_4M/queryOrder","/CancelOrder_Controller_4M/cancelOrder","/GetEvaluation_Controller_4M/getEvaluationDetails"];


var m4 = ["M4-0请求爱车","M4-1添加爱车","M4-2删除爱车","M4-3修改爱车"];
var k4= ["/GetMyCar_Controller_4M/getmycar","/AddLoveCar_Conntroller_4M/addLoveCar","/DeleteLoveCar_Controller_4M/deletecar","/UpdateLoveCar_Conntroller_4M/updateLoveCar"];


var m5 = [ "M5-0HTTP根路径","M5-1高德地图根据经纬度获取真实地址","M5-2高德地图获取两点之间距离和所需时间","M5-3手机号虚拟绑定","M5-4手机号虚拟解绑","M5-5发送验证码","M5-6验证验证码是否有效"];
var k5= ["/UtilController/getHttpBaseUrl","/GoldMap_Conntroller/regeo","/GoldMap_Conntroller/distance","/vphone_Conntroller/bindAxb","/vphone_Conntroller/unbind","/ShortMessage_Conntroller_4M/sendsms","/ShortMessage_Conntroller_4M/validate"];

var m6= [ "查询省份","查询省份下的市","修改营业时间段","查询省份设置时间","M5-4手机号虚拟解绑","M5-5发送验证码","M5-6验证验证码是否有效"];
var k6= ["/UpdateBusinessTime_Controller_4W/queryProvince","/UpdateBusinessTime_Controller_4W/queryProvinceCity","/UpdateBusinessTime_Controller_4W/UpdateBusinessTime","/UpdateBusinessTime_Controller_4W/queryProvinceTime","/vphone_Conntroller/unbind","/ShortMessage_Conntroller_4M/sendsms","/ShortMessage_Conntroller_4M/validate"];

var m7= ["M7-0支付宝收款"];
var k7= [""];

var m8= ["M8-0洗手上线","M8-1洗手出发","M8-2洗手到达洗车地点","M8-3洗手完成洗车","M8-4洗手下线","M8-5保存洗手位置信息","M8-6读取首页信息","M8-7立即前往","M8-8找到车辆","M8-9","M8-10开工洗车","M8-11","M8-12洗手意见反馈","M8-13洗手登录","M8-14","M8-15","M8-16修改工作意愿","M8-17洗手申请取消订单","M8-18获取审批信息","M8-19洗手获取已评价订单详情","M8-20洗手正在洗车","M8-21洗手获取完成订单","M8-22洗手修改密码"];
var k8= ["/Washing_Controller_4M/upper","/WashUserGo_Conntroller_4M/washUserGo","/WReachDestination_Controller_4M/insertOrderImpl","/OrderFin_Controller_4M/orderFin","/Washing_Controller_4M/lower","/Washing_Controller_4M/savePosition","/WasherLogin_Controller_4M/WasherLogin","/WasherInstantGo_Controller_4M/queryInfo","/FindCar_Controller_4M/arriveDestination","","/StartCarWash_Controller_4M/startCarWash","","/WasherIdeaBack_Controller_4M/washerIdeaBack","/WashUsersLogin_Controller_4M/washUsersLogin","","","/Washing_Controller_4M/workingDesire","/WApplyCancleOrder_Controller_4M/applyCancleOrder","/GetApplyCancelOrder_Controller_4M/getCancelOrderInfo","/GetCompleteEvaluation_Controller_4M/getcompleteevaluation","/OrderFin_Controller_4M/orderCarWash","/WashingOrders_Controller_4M/washingOrders","/Washing_Controller_4M/changePassword"];

var m9= ["M9-0派单员发送支付请求给用户","M9-1派单员派单"];
var k9= ["/Picketing_Controller_4M/chequePayment","/Picketing_Controller_4M/washingOrders"];

var m10= ["M10_0","M10_1 获取全部车辆品牌信息","M10_2获取车辆型号信息"];
var k10= ["","/CarBrandModel_Controller_4M/queryCarBrand","/CarBrandModel_Controller_4M/queryCarModel"];

var m11 =["M11_0设置洗手位置","清理在线洗手","派单详情","web登录测试"];
var k11 = ["/AssignedOrder_Controller_4M/setPosition","/AssignedOrder_Controller_4M/clearSession_area_map","/AssignedOrder_Controller_4M/getOrderAndFranchiness",""];

var m12= ["M12_0获取用户积分","M12_1确认送达","M12_2已兑换商品是否派送列表","M12_3确认派送已兑换商品","M12_4积分兑换界面信息查询",
          "M12_5积分兑换商品详细信息查询","M12_6用户查询已兑换商品列表","M12_7用户兑换商品"];
var k12= ["/Integral_Conntroller_4M/getIntegral","/Integral_Conntroller_4M/deliveryCommodity","/Integral_Conntroller_4M/exchangeGoods",
          "/Integral_Conntroller_4M/confirmExchangeGoods","/exchange_Controller_4M/queryExchangePageInfo",
          "/exchange_Controller_4M/queryExchangeProductInfo","/exchange_Controller_4M/queryExchangeProductList","/exchange_Controller_4M/userExchangeProduct"];


var M = [ m0, m1, m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12];
var K = [ k0, k1, k2 ,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12];

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

