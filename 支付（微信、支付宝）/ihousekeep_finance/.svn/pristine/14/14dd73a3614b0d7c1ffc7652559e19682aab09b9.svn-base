<!-- 洗车次数换奖品活动页 -->
<%@page import="com.ccunix.icar.base.util.HttpUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>


<%
	String userId = request.getParameter("userId");
	String system = HttpUtil.getOsAndBrowserInfo(request).toLowerCase();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>赢奖品</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>

<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>

<script language="javascript">
    var userid='<%=userId%>';
	if(userid ==null || userid==''){
	}else{
		/** 获取此人兑换状态 */
	    getgiftstatus();
	}
	
    function getgiftstatus(){
    	  var baseurl = '<%=baseurl%>';
    	  var obj=new Object();
          obj.member_id='<%=userId%>';
          $.ajax({
			url : baseurl+"/AppActivity_Controller_4M/queryGoods.action",
// 			url : "http://192.168.2.114:8080/icarweb/Activity_Controller/queryGoods.action",
// 			dataType : 'json',
			contentType : 'application/json;charset=UTF-8', //contentType很重要 
       		data : obj,
       		success : function (data) {
       			$.each(data,function(index,d){
       				if(d.receive_type=="05"){
     					if(d.goods_status=="02")	{//已完成
     						document.getElementById("registgiftbutton").src = '<%=baseurl%>'+"/images/html/app_activity/img/getgiftfinishedicon.png";
     						document.getElementById("registgiftbutton").onclick=null
     					}else if(d.goods_status=="01"){//未领取
     						document.getElementById("registgiftbutton").src = '<%=baseurl%>'+"/images/html/app_activity/img/getgiftreachedicon.png";
     						document.getElementById("registgiftbutton").onclick= function(){
     							getgift(d.id)
     						}
     					}
     				}
       			});
       		}
          });
    }

	/** 页面跳转 */
	function getgift(a) {
// 		alert(a);
	 	var baseurl = '<%=baseurl%>';
  	  	var obj=new Object();
        obj.member_id='<%=userId%>';
        obj.id = a;
        $.ajax({
//         	dataType : 'json',
			contentType : 'application/json;charset=UTF-8', //contentType很重要 
//         	url : "http://192.168.2.114:8080/icarweb/Activity_Controller/receive_goods.action",
        	url : baseurl+"/AppActivity_Controller_4M/receive_goods.action",
     		data : obj,
     		success : function (data) {
     			if(data=="1"){
     				
					showSuccess("#outerdiv", "#innerdiv", "#bigimg", $(this));
					getgiftstatus();
				}else{
					showfail();
				}
     		}
        });

	}
	
	function showSuccess(outerdiv, innerdiv, bigimg, _this){
	    var src = '<%=baseurl%>'+ "/images/html/app_activity/img/getgiftsuccessshow.png";//获取当前点击的pimg元素中的src属性
		$(bigimg).attr("src", src);//设置#bigimg元素的src属性
		/*获取当前点击图片的真实大小，并显示弹出层及大图*/
		$("<img/>").attr("src", src).load(function() {
			var windowW = $(window).width();//获取当前窗口宽度
			var windowH = $(window).height();//获取当前窗口高度
			var realWidth = this.width;//获取图片真实宽度
			var realHeight = this.height;//获取图片真实高度
			var imgWidth, imgHeight;
			var scale = 0.8;//缩放尺寸，当图片真实宽度和高度大于窗口宽度和高度时进行缩放
			if (realHeight > windowH * scale) {//判断图片高度
				imgHeight = windowH * scale;//如大于窗口高度，图片高度进行缩放
				imgWidth = imgHeight / realHeight * realWidth;//等比例缩放宽度
				if (imgWidth > windowW * scale) {//如宽度扔大于窗口宽度
					imgWidth = windowW * scale;//再对宽度进行缩放
				}
			} else if (realWidth > windowW * scale) {//如图片高度合适，判断图片宽度
				imgWidth = windowW * scale;//如大于窗口宽度，图片宽度进行缩放
				imgHeight = imgWidth / realWidth * realHeight;//等比例缩放高度
			} else {//如果图片真实高度和宽度都符合要求，高宽不变
				imgWidth = realWidth;
				imgHeight = realHeight;
			}
			$(bigimg).css("width", imgWidth);//以最终的宽度对图片缩放
			var w = (windowW - imgWidth) / 2;//计算图片与窗口左边距
			var h = (windowH - imgHeight) / 2;//计算图片与窗口上边距
			$(innerdiv).css({
				"top" : h,
				"left" : w
			});//设置#innerdiv的top和left属性
			$(outerdiv).fadeIn("fast");//淡入显示#outerdiv及.pimg
		});
		$(outerdiv).click(function() {//再次点击淡出消失弹出层
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

<style type="text/css">
div span {
	display: block;
	width: 30%;
	height: 60%;
	float: left;
	margin: 30px;
}
</style>


</head>
<body
	style="background: url(<%=baseurl%>/images/html/app_activity/img/getgiftfromwashtimesbg.png); background-size:cover;overflow-x: hidden;">

	<div style="text-align: center;">
		<div style="width: 100%; height: 100%; text-align: center;">
			<div>
				<img id="topImg"
					src="<%=baseurl%>/images/html/app_activity/img/getgifttopicon.png"
					style="width: 100%; height: 100%;">
			</div>


			<table style="width: 100%; " >
				<tr style="width: 100%; height: 200px">
					<td>
						<!-- 			老用户下单 -->
						<div style="width: 100%; margin-top: 0px;">
							<div style="width: 50%; height: 100%; float: left;">
								<img id="regist"
									src="<%=baseurl%>/images/html/app_activity/img/getgiftgifticon.png"
									style="width: 70%; height: 100%;" />
							</div>

							<div style="width: 50%; height: 100%; float: right;">
								<div style="width: 80%; height: 100%;">
									<img
										src="<%=baseurl%>/images/html/app_activity/img/oldusergetgifticon.png"
										style="width: 80%; height: 100%;" /> <img
										id="registgiftbutton" style="width: 80%; height: 100%;"
										src="<%=baseurl%>/images/html/app_activity/img/getgiftnotreachedicon.png" />
								</div>
							</div>
						</div>
					</td>
				</tr>
				<tr style="width: 100%; height: 50px">
				</tr>
			</table>


			<div class="container" >
				<img id="rulesimg"
					src="<%=baseurl%>/images/html/app_activity/img/getgiftrulesimg.png"
					style="width: 100%; height: 100%;">
			</div>
			
			<div style="width: 100%; height: 100px;" >
			</div>

		</div>


		<div id="outerdiv"
			style="position: fixed; top: 0; left: 0; background: rgba(0, 0, 0, 0.7); z-index: 2; width: 100%; height: 100%; display: none;">
			<div id="innerdiv" style="position: absolute;">
				<img id="bigimg" src="" />
			</div>
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
</html>