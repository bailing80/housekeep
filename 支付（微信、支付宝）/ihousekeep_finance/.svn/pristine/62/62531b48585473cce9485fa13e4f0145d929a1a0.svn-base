package com.ccunix.ihousekeeping.base.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.util.GlobalSetting;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;

@RequestMapping("EditorController")
@Controller
public class EditorController extends BaseMultiController {

	public static String fileSavePath;

	public static String os;

	public static void initFileSavePath() {
		// 取当前操作系统
		os = System.getProperty("os.name").toUpperCase();
		if (os.indexOf("WINDOWS") >= 0) {
			fileSavePath = GlobalSetting.fileSavePath_windows_2;
		} else {
			fileSavePath = GlobalSetting.fileSavePath_linux_2;
		}
	}

	@RequestMapping("saveEditor")
	@ResponseBody
	public String saveEditor(String text) {
		initFileSavePath();
		String a = UUID_Tools.getUUID() + ".html";
		File f = new File(fileSavePath + "\\" + a);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
			bw.write(text);
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  a;
	}

}
