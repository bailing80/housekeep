function upload(formobj,nameobj) {
	formobj.ajaxSubmit(
			function(data) {
				
				var testJson = data.data;
				var b = decodeURI(decodeURI(testJson)).replace(
						new RegExp("%3A", 'g'), ":").replace(
						new RegExp("%2C", 'g'), ",");
				var nnn = JSON.parse(b);
				pic = nnn.data.filename;
				nameobj.text(nnn.data.filename);
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