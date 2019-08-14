$(document).ready(function() {
	$("#menu_1").click(function() {
		change_main(getRootPath()+"/test.html");
	});
});

function getRootPath() {
	var strFullPath = window.document.location.href;
	var strPath = window.document.location.pathname;
	var pos = strFullPath.indexOf(strPath);
	var prePath = strFullPath.substring(0, pos);
	var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);
	return (prePath + postPath);
}

function change_main(url) {
	$("#main").load(url, function() {
	});
}