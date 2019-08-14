var global_pagesize = 10;





function initPageScreen(global_pageinfo)
{	//读取屏幕分辨率，设置表格行size（pagesize）
	//服务器端有默认值，不调用这个方法，pagesize为服务器默认值
	global_pagesize = global_pageinfo["pagesize"];
	var obj = new Object();
	obj.pagesize = global_pagesize;
	$.ajax({
		url : getRootPath()+"/PageController/initPageScreen.action",
		data : obj
	});
}
$(document).ready(function(){
	initPageScreen({pagesize:15});
});


function initPage() {
	$.ajax({
		url : getRootPath()+"/PageController/getPageModel.action",
		type : "post",
		success : initPageSuccess
	});
}

function initPageSuccess(data) {
	//共x页  共条数据
	var total_count = data.total_count;
	var maxpage = data.maxpage;
	var pagesize = data.pagesize;
	var nowpage = data.nowpage;
	var text = $("<br><label>").text("共"+total_count+"条记录,共"+maxpage+"页,每页"+pagesize+"条记录,当前第"+nowpage+"页");
	//
	var pagination = $("#pagination"); 
	pagination.html("");
	var first = $("<li onclick='changeToPage(" + (nowpage-1) + ","+maxpage+",this)'><a href='#'>&laquo;</a></li>");
	
	var now=0;
	if(nowpage>6){
		now=nowpage-6;
	}
	var max=0;
	if(maxpage< now+10){
		max=maxpage;
		now=max-10;
		if(now<0){
			now=0;
		}
	}else{
		max=now+10;
	}
	pagination.append(first);
	for (var i = now; i < max; i++) {
		var li = $("<li id='pageli_"+(i+1)+"' onclick='changeToPage(" + (i + 1) + ","+maxpage+",this)'>");
		var a = $("<a>");
		a.text(i + 1);
		li.append(a);
		pagination.append(li);
	}
	var last = $("<li onclick='changeToPage(" + (nowpage+1) + ","+maxpage+",this)'><a href='#'>&raquo;</a></li>");
	
	
	pagination.append(last);
	
	pagination.append(text);
}
var pageTableParam = {};
function changeToPage(jumppage,maxpage,li) {

	if(jumppage<=0){
		alert("已经首页");
	}else if(jumppage >maxpage){
		alert("已经尾页");
	}else{
		var obj = new Object();
		obj.nowpage = jumppage;
		pageTableParam.url = getRootPath()+"/PageController/getNowPageData.action";
		pageTableParam.data =obj;
		showTable(pageTableParam);
		//
		//$("#pageli_"+jumppage).css("background-color","#ff0000").css("color","#ff0000");
	}
}
function changeToPageSuccess(data) {
	alert(data.length);
}
