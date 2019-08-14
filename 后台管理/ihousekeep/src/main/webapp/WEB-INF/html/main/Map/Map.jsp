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
</div>
<script type="text/javascript"
        src="https://webapi.amap.com/maps?v=1.4.15&key=ad088f81d5a30e54a598ae1a424e08e9"></script>
<script type="text/javascript">
$(document).ready(function() { 
	queryMap();
});
function queryMap(){
	$.ajax({
		url : getRootPath() + "/Map_H_Controller_4W/query_all_map.action",
		data : null,
		success : re
	});
}

	var d;
	function re(data){
		d = $(data);
		alert(d.length)
		addMarker()
	}
	
    var marker, map = new AMap.Map("container", {
        resizeEnable: true,
        //center: [116.397428, 39.90923],
        zoom: 13
    });

    // 实例化点标记
    function addMarker() {
    	
    	for(var i = 0;i<d.length;i++){
    		
    		if(d[i].color=="blue"){
    			marker = new AMap.Marker({
    	            icon: "//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-default.png",
    	            position: [d[i].longitude,d[i].latitude],
    	            offset: new AMap.Pixel(-13, -30)
    	        });
    	        marker.setMap(map);
    		}else if(d[i].color=="red"){
    			  marker = new AMap.Marker({
    	  	            icon: "//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-red.png",
    	  	            position: [d[i].longitude,d[i].latitude],
    	  	            offset: new AMap.Pixel(-13, -30)
    	  	        });
    	  	        marker.setMap(map);
    	  	
    		}else if(d[i].color=="green"){
    			 marker = new AMap.Marker({
 	  	            icon: "//a.amap.com/jsapi_demos/static/demo-center/icons/poi-marker-green.png",
 	  	            position: [d[i].longitude,d[i].latitude],
 	  	            offset: new AMap.Pixel(-13, -30)
 	  	        });
 	  	        marker.setMap(map);
    		}
    		  
    	}
      
    }
</script>
	
</body>
</html>