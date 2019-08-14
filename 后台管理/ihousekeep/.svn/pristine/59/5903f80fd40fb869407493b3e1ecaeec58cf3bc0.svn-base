function upload_callback(formobj,callback) {
	formobj.ajaxSubmit(
			function(data) {
				var testJson = data.data;
				var b = decodeURI(decodeURI(testJson)).replace(
						new RegExp("%3A", 'g'), ":").replace(
						new RegExp("%2C", 'g'), ",");
				// alert("b="+b);
				var nnn = JSON.parse(b);
				pic = nnn.data.filename;
				// $("#system_file_name").text(nnn.data.filename);
				$("#success").text("上传成功");
				callback(pic);
				alert("上传成功!");
			});
}

function uploadsuccess(filename){
	alert("上传成功!回调的文件名:"+filename)
}