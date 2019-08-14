<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>
<title>二维码生成</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no" />
<script type="text/javascript"
	src="http://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript"
	src="http://static.runoob.com/assets/qrcode/qrcode.min.js"></script>
</head>
	<%out.print("<input type=\"text\" style=\"display:none\" id=\"hidden\" value=\"");%><%=request.getParameter("param")%><%out.print("\">");%>
<body>

	<div id="qrcode" style="width: 100px; height: 100px; margin-top: 15px;"></div>

	<script type="text/javascript">
		var qrcode = new QRCode(document.getElementById("qrcode"), {
			width : 200,
			height : 200
		});

		function makeCode() {
			var elText = document.getElementById("hidden");
			

			if (!elText.value) {
				alert("Input a text");
				elText.focus();
				return;
			}

			qrcode.makeCode(elText.value);
		}

		makeCode();

		$("#text").on("blur", function() {
			makeCode();
		}).on("keydown", function(e) {
			if (e.keyCode == 13) {
				makeCode();
			}
		});
	</script>
</body>
</html>