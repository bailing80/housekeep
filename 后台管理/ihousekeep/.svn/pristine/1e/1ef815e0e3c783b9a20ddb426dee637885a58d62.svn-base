<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html{width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
		#allmap{height:100%;width:100%;}
	</style>
	<script src="<%=baseurl%>/js/jquery.js"></script>
	<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=nKCD9567cb9hXkBIQbiG1OZKxTRp2Lya"></script>
	<title>城市名定位</title>
</head>
<body>
	<div id="allmap"></div>
</body>
</html>
<script type="text/javascript">
// 百度地图API功能
var map = new BMap.Map("allmap");
map.centerAndZoom(new BMap.Point(116.331398,39.897445),11);
map.enableScrollWheelZoom(true);
$(document).ready(function() { 
	queryMap();
});
//通过ajax查询位置数据
function queryMap() {
	$.ajax({
				url : getRootPath()+ "/Map_H_Controller_4W/query_all_map.action",
				data : null,
				success : show_map
			});
}
var array = new Array();
//将位置数据回显到地图上  longitude  latitude
function show_map(data) {
	var d = $(data);
	//alert(d[2].longitude)
	for (var i = 0; i < d.length; i++) {
		var arr = new Array();
		arr[0] = d[i].longitude;
		arr[1] = d[i].latitude;
		arr[2] = d[i].color;
		//alert(d[i].color)
		array[i] = arr;
	}
	theLocation(array)
}
// 用经纬度设置地图中心点
function theLocation(array){
	map.clearOverlays(); 
	for (var i = 0; i < array.length; i++) {
		var new_point = new BMap.Point(array[i][0],array[i][1]);
		if(array[i][2] == "red"){
			//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-red.png
			var myIcon = new BMap.Icon("../html/main/baidu/images/orange.jpg", new BMap.Size(150,100));
			var marker = new BMap.Marker(new_point,{icon:myIcon});  // 创建标注
		}
		if(array[i][2] == "green"){
			var myIcon = new BMap.Icon("../html/main/baidu/images/green.png", new BMap.Size(300,150));
			var marker = new BMap.Marker(new_point,{icon:myIcon});  // 创建标注
		}
		
		if(array[i][2] == "blue"){
			var myIcon = new BMap.Icon("../html/main/baidu/images/blue.png", new BMap.Size(300,150));
			var marker = new BMap.Marker(new_point,{icon:myIcon});  // 创建标注
		}
		
		if(array[i][2] == "orange"){
			var myIcon = new BMap.Icon("../html/main/baidu/images/orange.jpg", new BMap.Size(300,150));
			var marker = new BMap.Marker(new_point,{icon:myIcon});  // 创建标注
		}
		
		if(array[i][2] == "black"){
			var myIcon = new BMap.Icon("../html/main/baidu/images/black.png", new BMap.Size(300,150));
			var marker = new BMap.Marker(new_point,{icon:myIcon});  // 创建标注
		}
		
		if(array[i][2] == "yellow"){
			var myIcon = new BMap.Icon("../html/main/baidu/images/yellow.png", new BMap.Size(300,150));
			var marker = new BMap.Marker(new_point,{icon:myIcon});  // 创建标注
		}
		map.addOverlay(marker);              // 将标注添加到地图中
		map.panTo(new_point);  
	}    
}
</script>
	
