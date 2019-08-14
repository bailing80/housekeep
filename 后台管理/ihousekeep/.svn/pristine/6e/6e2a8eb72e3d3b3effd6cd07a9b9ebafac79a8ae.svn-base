<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
<link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css"/>
<title>Insert title here</title>

<link href="<%=baseurl%>/css/base.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=baseurl%>/html/admin/page/page.js"></script>
<style>
        html, body, #container {
            height: 100%;
            width: 100%;
        }

        .amap-icon img,
        .amap-marker-content img{
            width: 25px;
            height: 34px;
        }

        .marker {
            position: absolute;
            top: -20px;
            right: -118px;
            color: #fff;
            padding: 4px 10px;
            box-shadow: 1px 1px 1px rgba(10, 10, 10, .2);
            white-space: nowrap;
            font-size: 12px;
            font-family: "";
            background-color: #25A5F7;
            border-radius: 3px;
        }

        .input-card{
            width: 18rem;
            z-index: 170;
        }

        .input-card .btn{
            margin-right: .8rem;
        }

        .input-card .btn:last-child{
            margin-right: 0;
        }
    </style>
</head>
<body>
<div id="container"></div>
<div class="input-card">
    <label style="color:grey">点标记操作</label>
    <div class="input-item">
        <input id="addMarker" type="button" class="btn" onclick="addMarker()" value="添加点标记">
        <input id="updateMarker" type="button" class="btn" onclick="updateIcon()" value="更新点标记图标">
    </div>
    <div class="input-item">
        <input id="clearMarker" type="button" class="btn" onclick="clearMarker()" value="删除点标记">
        <input id="updateMarker" type="button" class="btn" onclick="updateContent()" value="更新点标记内容">
    </div>
</div>
<script type="text/javascript"
        src="https://webapi.amap.com/maps?v=1.4.15&key=您申请的key值"></script>
<script type="text/javascript">

$.ajax({
	url : getRootPath() + "/Map_H_Controller_4W/query_all_map.action",
	data : null,
	success : re
});
	var d;
	function re(data){
		d = $(data);
		//d.longitude;
		//d.Latitude;
	}
	
    var marker, map = new AMap.Map("container", {
        resizeEnable: true,
        //center: [116.397428, 39.90923],
        zoom: 13
    });

    // 实例化点标记
    function addMarker() {
    	for(var i = 0;i<d.length;i++){
    		  marker = new AMap.Marker({
    	            icon: "//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-default.png",
    	            position: [d[i].longitude,d[i].latitude],
    	            offset: new AMap.Pixel(-13, -30)
    	        });
    	        marker.setMap(map);
    	}
      
    }
    function updateIcon() {
    	for(var i = 0;i<d.length;i++){
  		  marker = new AMap.Marker({
  	            icon: "//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-red.png",
  	            position: [d[i].longitude,d[i].latitude],
  	            offset: new AMap.Pixel(-13, -30)
  	        });
  	        marker.setMap(map);
  	}
    
      
    }

    function updateContent() {

        if (!marker) {
            return;
        }

        // 自定义点标记内容
        var markerContent = document.createElement("div");

        // 点标记中的图标
        var markerImg = document.createElement("img");
        markerImg.className = "markerlnglat";
        markerImg.src = "//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-red.png";
        markerContent.appendChild(markerImg);

        // 点标记中的文本
        var markerSpan = document.createElement("span");
        markerSpan.className = 'marker';
        markerSpan.innerHTML = "Hi，我被更新啦！";
        markerContent.appendChild(markerSpan);

        marker.setContent(markerContent); //更新点标记内容
        marker.setPosition([116.391467, 39.927761]); //更新点标记位置
    }

    // 清除 marker
    function clearMarker() {

        if (marker) {
            marker.setMap(null);
            marker = null;
        }
    }
</script>
	
</body>
</html>