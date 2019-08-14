package com.ccunix.ihousekeeping.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtil {
	/**
	 * 
	 * @param response
	 *            --httpresponse 下载使用 null为不下载
	 * @param filename
	 *            --文件名
	 * @param sheetName
	 *            --sheet名
	 * @param title
	 *            --表头（数组）
	 * @param data
	 *            --表数据
	 * 
	 * @return
	 * @throws IOException
	 */
	///home/pirecture/
	public static String EXCEL_FILE_PATH = "";


	public static String createExcel(HttpServletResponse response, String filename, String sheetName, String[] title,
			List<Object[]> data) throws IOException {

		// 创建HSSFWorkbook对象(excel的文档对象)
		HSSFWorkbook wb = new HSSFWorkbook();
		// 建立新的sheet对象（excel的表单）
		HSSFSheet sheet = wb.createSheet(sheetName);
		// 在sheet里创建第一行
		HSSFRow row0 = sheet.createRow(0);
		// 创建单元格并设置单元格内容
		for (int i = 0; i < title.length; i++) {
			row0.createCell(i).setCellValue(title[i]);
		}
		// 在sheet里创建第2行，以及以后的数据
		for (int i = 0; i < data.size(); i++) {
			HSSFRow row_data = sheet.createRow(1 + i);
			Object[] d_str = data.get(i);
			for (int j = 0; j < d_str.length; j++) {
				if(d_str[j] == null){
					row_data.createCell(j).setCellValue("-");
				}else{
					row_data.createCell(j).setCellValue(d_str[j].toString());
				}
			}
		}
		// .....省略部分代码
		// 输出Excel文件
		if (response != null) {
			OutputStream output = response.getOutputStream();
			response.reset();
			response.setHeader("Content-disposition", "attachment; filename=东学数据文件.xls");
			response.setContentType("application/msexcel");
			wb.write(output);
			output.close();
		}
		if (filename != null) {
			OutputStream fileoutput = new FileOutputStream(filename);
			System.out.println("excl生成路径为+++++++++++++++++++"+ filename);
			wb.write(fileoutput);
			fileoutput.close();
		}
		return null;
	}

	public static List readExcel(String filename, String sheetname) throws Exception {
		List ls = new ArrayList();
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(filename)));
		HSSFSheet sheet = null;
		int i = workbook.getSheetIndex(sheetname); // sheet表名
		sheet = workbook.getSheetAt(i);
		for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum
			// 获取最后一行的行标
			HSSFRow row = sheet.getRow(j);
			String[] r = new String[row.getLastCellNum()];
			if (row != null) {
				for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum
																// 是获取最后一个不为空的列是第几个
					if (row.getCell(k) != null) { // getCell 获取单元格数据
						r[k] = row.getCell(k).toString();
//						System.out.print(row.getCell(k) + "\t");
					} else {
						r[k] = "";
//						System.out.print("\t");
					}
				}
			}
			ls.add(r);
			
		}
		return ls;
	}
	public static List readExcelxlsx(String filename, String sheetname) throws Exception {
		List ls = new ArrayList();
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(filename)));
		XSSFSheet sheet = null;
		int i = workbook.getSheetIndex(sheetname); // sheet表名
		sheet = workbook.getSheetAt(i);
		for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {// getLastRowNum
			// 获取最后一行的行标
			XSSFRow row = sheet.getRow(j);
			String[] r = new String[row.getLastCellNum()];
			if (row != null) {
				for (int k = 0; k < row.getLastCellNum(); k++) {// getLastCellNum
																// 是获取最后一个不为空的列是第几个
					if (row.getCell(k) != null) { // getCell 获取单元格数据
						r[k] = row.getCell(k).toString();
//						System.out.print(row.getCell(k) + "\t");
					} else {
						r[k] = "";
//						System.out.print("\t");
					}
				}
			}
			ls.add(r);
			
		}
		return ls;
	}
	
	public static void main(String[] args) {
//		String title[] ={"序号","收款户名","收款账户","金额"};
//		List<Object[]> data = new ArrayList();
//		String[] d1 = {"1","孙一石1","aaaaa1","100"};
//		String[] d2 = {"2","孙一石2","aaaaa2","200"};
//		String[] d3 = {"3","孙一石3","aaaaa3","300"};
//		String[] d4 = {"4","孙一石4","aaaaa4","400"};
//		
//		data.add(d1);
//		data.add(d2);
//		data.add(d3);
//		data.add(d4);
//		
//		try {
//			createExcel(null,"a2018-05-01-01.xls","s1",title,data);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			//moveFolderAndFileWithSelf("f:/tx/hl","f:/tx/bf");
		    String   filename ="/home/pirecture/tx/hl/\2018-6-2-9hh17mi12ss.xls";
			filename = filename.replace("\\", "");
			System.out.println(filename);
			
			
			
//			List ls = readExcel("F:/hongnan118-4-6-15-23-15.xls","s1");
//			for(int i=1;i<ls.size();i++){
//				String[] d = (String[])ls.get(i);
//				System.out.println(d[0]+"  "+d[1]+"  "+d[2]+" "+d[3]+" "+d[4]);
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static List readfile(String filepath) throws FileNotFoundException, IOException {
		List list = new ArrayList();
        try {
            File file = new File(filepath);
            if (!file.isDirectory()) {
            } else if (file.isDirectory()) {
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + File.separator + filelist[i]);
                    if (!readfile.isDirectory()) {
                        list.add(readfile.getPath());
                    } else if (readfile.isDirectory()) {
                            readfile(filepath + File.separator + filelist[i]);
                    }
                }
            }

        } catch (FileNotFoundException e) {
                System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return list;
	}
	
	/** 
     * 移动指定文件或文件夹(包括所有文件和子文件夹) 
     *  
     * @param fromDir 
     *            要移动的文件或文件夹 
     * @param toDir 
     *            目标文件夹 
     * @throws Exception 
     */  
    public static void moveFolderAndFileWithSelf(String from, String to) throws Exception {  
        try {  
            File dir = new File(from);  
            // 目标  
            to +=  File.separator + dir.getName();  
            File moveDir = new File(to);  
            if(dir.isDirectory()){  
                if (!moveDir.exists()) {  
                    moveDir.mkdirs();  
                }  
            }else{  
                File tofile = new File(to);  
                dir.renameTo(tofile);  
                return;  
            }  
              
            //System.out.println("dir.isDirectory()"+dir.isDirectory());  
            //System.out.println("dir.isFile():"+dir.isFile());  
              
            // 文件一览  
            File[] files = dir.listFiles();  
            if (files == null)  
                return;  
  
            // 文件移动  
            for (int i = 0; i < files.length; i++) {  
                System.out.println("文件名："+files[i].getName());  
                if (files[i].isDirectory()) {  
                    moveFolderAndFileWithSelf(files[i].getPath(), to);  
                    // 成功，删除原文件  
                    files[i].delete();  
                }  
                File moveFile = new File(moveDir.getPath() + File.separator + files[i].getName());  
                // 目标文件夹下存在的话，删除  
                if (moveFile.exists()) {  
                    moveFile.delete();  
                }  
                files[i].renameTo(moveFile);  
            }  
            //删除文件夹    
            //dir.delete();  
        } catch (Exception e) {  
            throw e;  
        }  
    } 
	
}
