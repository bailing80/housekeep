package com.ccunix.ihousekeeping.base.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.base.util.GlobalSetting;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;

@Controller
@RequestMapping("FileUpLoadController")
public class FileUpLoadController extends BaseMultiController {

	public static String fileSavePath;

	public static String os;
	
	static{
		initFileSavePath();
	}

	public static void initFileSavePath() {
		// 取当前操作系统
		os = System.getProperty("os.name").toUpperCase();
		if (os.indexOf("WINDOWS") >= 0) {
			fileSavePath = GlobalSetting.fileSavePath_windows;
		} else {
			fileSavePath = GlobalSetting.fileSavePath_linux;
		}
	}

	public String getFileSavePath_ByType(String type) {
		if (type == null || type.equals("0")) {
			os = System.getProperty("os.name").toUpperCase();
			if (os.indexOf("WINDOWS") >= 0) {
				fileSavePath = GlobalSetting.fileSavePath_windows;
			} else {
				fileSavePath = GlobalSetting.fileSavePath_linux;
			}
		} else if (type.equals("1")) {
			os = System.getProperty("os.name").toUpperCase();
			if (os.indexOf("WINDOWS") >= 0) {
				fileSavePath = GlobalSetting.fileSavePath_windows_1;
			} else {
				fileSavePath = GlobalSetting.fileSavePath_linux_1;
			}
		}
		return fileSavePath;
	}

	public static void main(String[] args) {
		initFileSavePath();
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec upload(HttpServletRequest request, @RequestParam("file") MultipartFile file)
			throws Exception {
		// initFileSavePath();
		String type = request.getParameter("filetype");

		getFileSavePath_ByType(type);

		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			if (!file.isEmpty()) {
				// 上传文件路径
				// String path =
				// request.getServletContext().getRealPath("/files/");

				// 上传文件�?
				String filename = file.getOriginalFilename();
				String name = filename.substring(0, filename.indexOf("."));
				String pix = filename.substring(filename.indexOf(".") + 1);
				// 生成文件�?
				String system_name = UUID_Tools.getUUID() + "." + pix;
				File filepath = new File(fileSavePath, filename);

				// 判断路径是否存在，如果不存在就创建一�?
				if (!filepath.getParentFile().exists()) {
					filepath.getParentFile().mkdirs();
				}
				// 将上传文件保存到�?个目标文件当�?
				data.put("filename", system_name);
				File f = new File(fileSavePath + File.separator + system_name);
				f.setWritable(true, false);
				file.transferTo(f);
				if (os.indexOf("WINDOWS") < 0) {
					Runtime.getRuntime().exec("chmod 777 -R " + fileSavePath + File.separator + system_name);
				}
				data.put("statue", 1);
				data.put("message", "上传成功");
				k.setData(data);
				k.setMessage("执行成功");
				k.setStatus(1);

			} else {
				k.setStatus(1);
				data.put("statue", 0);
				data.put("message", "上传失败");
				k.setData(data);
				k.setMessage("执行成功");

			}
		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity<byte[]> download(HttpServletRequest request, Model model) throws Exception {
		// 下载文件路径
		String filename = request.getSession().getAttribute("download_filename").toString();
		File file = new File(filename);
		HttpHeaders headers = new HttpHeaders();
		// 下载显示的文件名，解决中文名称乱码问�?
		String downloadFielName = new String(filename.getBytes("UTF-8"), "iso-8859-1");
		// 通知浏览器以attachment（下载方式）打开图片
		headers.setContentDispositionFormData("attachment", downloadFielName);
		// application/octet-stream �? 二进制流数据（最常见的文件下载）�?
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}

	// update 多个
	@RequestMapping(value = "/uploadMulti1", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1)
			throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/uploadMulti2", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1,
			@RequestParam("file2") MultipartFile file2) throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}
			if (!file2.isEmpty()) {
				updateloadOne(file2, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/uploadMulti3", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1,
			@RequestParam("file2") MultipartFile file2, @RequestParam("file3") MultipartFile file3) throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}
			if (!file2.isEmpty()) {
				updateloadOne(file2, filelist);
			}
			if (!file3.isEmpty()) {
				updateloadOne(file3, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/uploadMulti4", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1,
			@RequestParam("file2") MultipartFile file2, @RequestParam("file3") MultipartFile file3,
			@RequestParam("file4") MultipartFile file4) throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}
			if (!file2.isEmpty()) {
				updateloadOne(file2, filelist);
			}
			if (!file3.isEmpty()) {
				updateloadOne(file3, filelist);
			}
			if (!file4.isEmpty()) {
				updateloadOne(file4, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/uploadMulti5", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1,
			@RequestParam("file2") MultipartFile file2, @RequestParam("file3") MultipartFile file3,
			@RequestParam("file4") MultipartFile file4, @RequestParam("file5") MultipartFile file5) throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}
			if (!file2.isEmpty()) {
				updateloadOne(file2, filelist);
			}
			if (!file3.isEmpty()) {
				updateloadOne(file3, filelist);
			}
			if (!file4.isEmpty()) {
				updateloadOne(file4, filelist);
			}
			if (!file5.isEmpty()) {
				updateloadOne(file5, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/uploadMulti6", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1,
			@RequestParam("file2") MultipartFile file2, @RequestParam("file3") MultipartFile file3,
			@RequestParam("file4") MultipartFile file4, @RequestParam("file5") MultipartFile file5,
			@RequestParam("file6") MultipartFile file6) throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}
			if (!file2.isEmpty()) {
				updateloadOne(file2, filelist);
			}
			if (!file3.isEmpty()) {
				updateloadOne(file3, filelist);
			}
			if (!file4.isEmpty()) {
				updateloadOne(file4, filelist);
			}
			if (!file5.isEmpty()) {
				updateloadOne(file5, filelist);
			}
			if (!file6.isEmpty()) {
				updateloadOne(file6, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/uploadMulti7", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1,
			@RequestParam("file2") MultipartFile file2, @RequestParam("file3") MultipartFile file3,
			@RequestParam("file4") MultipartFile file4, @RequestParam("file5") MultipartFile file5,
			@RequestParam("file6") MultipartFile file6, @RequestParam("file7") MultipartFile file7) throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}
			if (!file2.isEmpty()) {
				updateloadOne(file2, filelist);
			}
			if (!file3.isEmpty()) {
				updateloadOne(file3, filelist);
			}
			if (!file4.isEmpty()) {
				updateloadOne(file4, filelist);
			}
			if (!file5.isEmpty()) {
				updateloadOne(file5, filelist);
			}
			if (!file6.isEmpty()) {
				updateloadOne(file6, filelist);
			}
			if (!file7.isEmpty()) {
				updateloadOne(file7, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	@RequestMapping(value = "/uploadMulti8", method = RequestMethod.POST)
	@ResponseBody
	public AppDataModel_Sec uploadMulti(HttpServletRequest request, @RequestParam("file1") MultipartFile file1,
			@RequestParam("file2") MultipartFile file2, @RequestParam("file3") MultipartFile file3,
			@RequestParam("file4") MultipartFile file4, @RequestParam("file5") MultipartFile file5,
			@RequestParam("file6") MultipartFile file6, @RequestParam("file7") MultipartFile file7,
			@RequestParam("file8") MultipartFile file8) throws Exception {

		initFileSavePath();
		AppDataModel_Sec sec = getAppDataMode_sec();
		AppDataModel k = new AppDataModel();
		try {

			Map data = new HashMap();
			// System.out.println("=============" + !file.isEmpty());
			// 如果文件不为空，写入上传路径
			List filelist = new ArrayList();
			if (!file1.isEmpty()) {
				updateloadOne(file1, filelist);
			}
			if (!file2.isEmpty()) {
				updateloadOne(file2, filelist);
			}
			if (!file3.isEmpty()) {
				updateloadOne(file3, filelist);
			}
			if (!file4.isEmpty()) {
				updateloadOne(file4, filelist);
			}
			if (!file5.isEmpty()) {
				updateloadOne(file5, filelist);
			}
			if (!file6.isEmpty()) {
				updateloadOne(file6, filelist);
			}
			if (!file7.isEmpty()) {
				updateloadOne(file7, filelist);
			}
			if (!file8.isEmpty()) {
				updateloadOne(file8, filelist);
			}

			data.put("filelist", filelist);
			data.put("statue", 1);
			data.put("message", "上传成功");
			k.setData(data);
			k.setMessage("执行成功");
			k.setStatus(1);

			k.setStatus(1);
			data.put("statue", 0);
			data.put("message", "上传失败");
			k.setData(data);
			k.setMessage("执行成功");

		} catch (Exception e) {
			e.printStackTrace();
			k.setStatus(0);

		}
		return getAppDataMode_sec().setData(encodeURI(k));
	}

	public void updateloadOne(MultipartFile file, List filelist) {
		String filename = file.getOriginalFilename();
		String name = filename.substring(0, filename.indexOf("."));
		String pix = filename.substring(filename.indexOf(".") + 1);
		// 生成文件�?
		String system_name = UUID_Tools.getUUID() + "." + pix;
		File filepath = new File(fileSavePath, filename);

		// 判断路径是否存在，如果不存在就创建一�?
		if (!filepath.getParentFile().exists()) {
			filepath.getParentFile().mkdirs();
		}
		// 将上传文件保存到�?个目标文件当�?
		// data.put("filename", system_name);
		filelist.add(system_name);
		File f = new File(fileSavePath + File.separator + system_name);
		f.setWritable(true, false);
		try {
			file.transferTo(f);
			if (os.indexOf("WINDOWS") < 0) {
				Runtime.getRuntime().exec("chmod 777 -R " + fileSavePath + File.separator + system_name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
