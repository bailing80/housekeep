<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<%
	String userId = request.getParameter("userId");
%>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>免费洗车</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/base_table.js"></script>
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>

<style>
.left {
	float: left;
	width: 20%;
}
</style>

</head>
<body
	style="background: url(<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_bg.png) no-repeat center center; background-size:cover;overflow-x: hidden;background-attachment:fixed;">
	<div id="backdiv"></div>
	<div id="box2">
		<div style="text-align: center;">

			<div>
				<img id="topImg"
					src="<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_top_icon.png"
					style="width: 100%; height: 100%;">
			</div>

			<div
				style="width: 100%; height: 100%; background: url(<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_center_bg.png)  no-repeat center center;
				 background-size:contain;overflow-x: hidden;">
				<div style="width: 100%; height: 20px;"></div>
				<div id="wrap" style="text-align: center; display: inline-block;">
					<div class="left">
						<img id="img_1"
							src="<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_notwashicon.png"
							style="width: 60px; height: 60px;">
						<div align="center">第一次</div>
					</div>
					<div class="left">
						<img id="img_2"
							src="<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_notwashicon.png"
							style="width: 60px; height: 60px;">
						<div align="center">第二次</div>
					</div>
					<div class="left">
						<img id="img_3"
							src="<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_notwashicon.png"
							style="width: 60px; height: 60px;">
						<div align="center">第三次</div>
					</div>
					<div class="left">
						<img id="img_4"
							src="<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_notwashicon.png"
							style="width: 60px; height: 60px;">
						<div align="center">第四次</div>
					</div>

					<div class="left">
						<img id="img_5"
							src="<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_notwashicon.png"
							style="width: 60px; height: 60px;">
						<div align="center">第五次</div>
					</div>
				</div>
				<div style="width: 100%; height: 20px;"></div>
				<div align="center" style="font-size: 8px">洗满四次之后赠送一次洗车，东学上门洗车优惠多多</div>
				<div style="width: 100%; height: 20px;"></div>
				<div align="center">
					<img id="submitbtn"
						src="<%=baseurl%>/images/html/app_activity/img/get_coupon.png"
						style="width: 60%; height: 80%;" onClick="getcoupon()">
				</div>
				<div style="width: 100%; height: 20px;"></div>
			</div>
		</div>
	</div>

	<div style="width: 100%; height: 40px;"></div>

	<div class="container" align="center">
		<img id="rulesimg" 
			src="<%=baseurl%>/images/html/app_activity/img/freewashfromfourtimes_rulers.png"
			style="width: 90%; height: 100%;">
	</div>

	<div style="width: 100%; height: 100px;"></div>
			<div id="successdiv"
			style="position: fixed; top: 0; left: 0; background: rgba(0, 0, 0, 0.7); z-index: 2; width: 100%; height: 100%; display: none;">
			<a
				style="display: block; text-align: center; color: white; width: 100%; height: 50%;">
			</a> <a
				style="display: block; text-align: center; color: white; width: 100%; height: 50%;">
				领取成功 </a>
		</div>
	
	
			<div id="faildiv"
			style="position: fixed; top: 0; left: 0; background: rgba(0, 0, 0, 0.7); z-index: 2; width: 100%; height: 100%; display: none;">
			<a
				style="display: block; text-align: center; color: white; width: 100%; height: 50%;">
			</a> <a
				style="display: block; text-align: center; color: white; width: 100%; height: 50%;">
				领取失败 </a>
		</div>
</body>

<script>

	var userid='<%=userId%>';
	var cangetcoupon='0';
	document.getElementById("submitbtn").style.visibility="hidden";
	if(userid ==null || userid==''|| userid=='null'){
	}else{
		getstatus()
	}
	
	function getstatus(){
		  var baseurl = '<%=baseurl%>';
		  var obj=new Object();
		  var alreadygotted = "0"; //0:未领取   1:已领取
	      obj.member_id='<%=userId%>';
	    $.ajax({
	//  		url : "http://192.168.2.114:8080/icarweb/Activity_Controller/queryAllGoods.action",
			url : baseurl+"/AppActivity_Controller_4M/querOrder.action",
	 		data : obj,
			contentType : 'application/json;charset=UTF-8', //contentType很重要 
	 		success : function (data) {
	 			if(data[0] == 0){
	 				if(data[1]>0){
	 					document.getElementById("img_1").src = '<%=baseurl%>'+"/images/html/app_activity/img/freewashfromfourtimes_washedicon.png";
	 				}else if(data[1]>1){
	 					document.getElementById("img_2").src = '<%=baseurl%>'+"/images/html/app_activity/img/freewashfromfourtimes_washedicon.png";
	 				}else if(data[1]>2){
	 					document.getElementById("img_3").src = '<%=baseurl%>'+"/images/html/app_activity/img/freewashfromfourtimes_washedicon.png";
	 				}else if(data[1]>3){
	 					document.getElementById("img_4").src = '<%=baseurl%>'+"/images/html/app_activity/img/freewashfromfourtimes_washedicon.png";
	 				}else if(data[1]>4){
	 					document.getElementById("img_5").src = '<%=baseurl%>'+"/images/html/app_activity/img/freewashfromfourtimes_washedicon.png";
	 				}
	 			
		 			if(data[1]==4){
		 				cangetcoupon = '1';
		 				document.getElementById("submitbtn").style.visibility="visible";
		 			}
	 			}else{
	 				document.getElementById("submitbtn").style.visibility="visible";
	 				document.getElementById("submitbtn").src = '<%=baseurl%>'+"/images/html/app_activity/img/already_gotten_coupon.png";
	 				cangetcoupon = '0';
	 			}
	 			
	 		}
	    });
	}
	
	/** 页面跳转 */
	function getcoupon(a) {
		if(cangetcoupon=="0"){
			return;
		}
		var baseurl = '<%=baseurl%>';
  	  	var obj=new Object();
        obj.member_id='<%=userId%>';
        $.ajax({
//         	url : "http://192.168.2.114:8080/icarweb/Activity_Controller/receive_goods.action",
        	url : baseurl+"/AppActivity_Controller_4M/receive_coupon.action",
     		data : obj,
//      		dataType : 'json',
			contentType : 'application/json;charset=UTF-8', //contentType很重要 
     		success : function (data) {
     			if(data=="1"){
     				showsuccess();
     				getstatus();
				}else{
					showfail();
				}
     		}
        });

	}
	
	function showsuccess() {
		$(successdiv).fadeIn("fast");//淡入显示#outerdiv及.pimg
		$(successdiv).click(function() {//再次点击淡出消失弹出层
			$(this).fadeOut("fast");
		});
	}
	
	function showfail() {
		$(faildiv).fadeIn("fast");//淡入显示#outerdiv及.pimg
		$(faildiv).click(function() {//再次点击淡出消失弹出层
			$(this).fadeOut("fast");
		});
	}

</script>
</html>