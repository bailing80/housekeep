$(document).ready(function() {
	$("#sub").click(upload);
	$("#download").click(download);
	$("#submuti").click(uploadmuti);
});
var pic;
var logo;
var priview;
function upload() {
	$("#uploadform").ajaxSubmit(
			function(data) {
				
				var testJson = data.data;
				var b = decodeURI(decodeURI(testJson)).replace(
						new RegExp("%3A", 'g'), ":").replace(
						new RegExp("%2C", 'g'), ",");
//				alert("b="+b);
				var nnn = JSON.parse(b);
//				alert("nnn="+nnn);
//				if (nnn.data.filelist.length > 0) {
//					logo = nnn.data.filelist[0];
//					priview = nnn.data.filelist[1];
//				}
				pic = nnn.data.filename;
				$("#system_file_name").text(nnn.data.filename);
				$("#success").text("上传成功");
				alert("success!");
			});
}
function download() {
	location.href = "./FileUpLoadController/download.action?filename=201805090006751907.xls";
}

function uploadmuti() {
	$("#uploadform_muti").ajaxSubmit(
			function(data) {

				var testJson = data.data;
				var b = decodeURI(decodeURI(testJson)).replace(
						new RegExp("%3A", 'g'), ":").replace(
						new RegExp("%2C", 'g'), ",");
				$("#system_file_name_muti").text(b);
			});
}