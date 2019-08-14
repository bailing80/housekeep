package com.ccunix.ihousekeeping.basedbmodel.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedbmodel.dao.Table_Dao_Iface;
import com.ccunix.ihousekeeping.basedbmodel.domain.Table;
import com.ccunix.ihousekeeping.basedbmodel.domain.Table_Column;

@Service("activity_Table_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Table_Service_Impl extends BaseService implements Table_Service_Iface {

	@Resource
	Table_Dao_Iface tabledao_iface;

	@Override
	public List<Table> queryAllTable() throws Exception {
		List a = tabledao_iface.queryAllTables();

		return a;
	}

	@Override
	public boolean makecode(String tables) throws Exception {
		String t[] = tables.split(",");

		// 1闁靛棔鑳堕弫鎾诲箣閹邦叏鎷烽懡銈嗙獥鐟滃府鎷�
		String basepath = "E:/code/";
		String pack = "com/ccunix/ihousekeeping/basedb/";
		// String pack = "com/atwx/zb/zbweb/basedb/";
		String path = basepath + pack;
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}

		// 2\濞寸姰鍎撮妴鍐及鎼存繄绉撮柛妤佹磻缂嶅懎顕欓搹鍦綄缂佹鍏涚粩瀵哥棯瑜忓ú鎷屻亹閿燂拷
		String[] childpack = { "dao", "service", "controller", "domain" };

		for (String c : childpack) {
			File tab = new File(path + c);
			tab.mkdirs();
			for (String tb : t) {
				String packname = tb.toLowerCase();
				makeFile(path + c + "/", c, tb, pack + c);
			}
		}

		// for (String tb : t) {
		// String packname = tb.toLowerCase();
		// File tab = new File(path + packname);
		// tab.mkdirs();
		// // 3\鐎点倛娅ｉ悵娑氾拷娑欏姇鐎碉拷 controller/service/dao/domain
		// String childpath = path + packname;
		// for (String c : childpack) {
		// String cp = childpath + "/" + c;
		// File s = new File(cp);
		// s.mkdirs();
		//
		// }
		// }

		return false;
	}

	public void makeFile(String pathname, String type, String tablename, String packname) {
		try {
			tablename = tablename.substring(0, 1).toUpperCase() + tablename.substring(1).toLowerCase();
			String n = pathname + tablename;
			switch (type) {
			case "dao":
				String daofile = n + "_Dao_Iface.java";
				File f = new File(daofile);
				f.createNewFile();
				makeDaoFile(daofile, packname, tablename);
				break;
			case "service":
				String service_iface = n + "_Service_Iface.java";
				String service_impl = n + "_Service_Impl.java";
				File fi = new File(service_iface);
				fi.createNewFile();
				makeService_Iface_File(service_iface, packname, tablename);
				File fm = new File(service_impl);
				fm.createNewFile();
				makeService_Impl_File(service_impl, packname, tablename);
				break;
			case "controller":
				String controller = n + "_Controller.java";
				File f3 = new File(controller);
				f3.createNewFile();
				makeController_File(controller, packname, tablename);
				break;
			case "domain":
				String domain = n + ".java";
				File f4 = new File(domain);
				f4.createNewFile();
				String xml = n + ".xml";
				File f5 = new File(xml);
				f5.createNewFile();
				makeDomainJAVA_File(domain, packname, tablename);
				makeDomainXML_File(xml, packname, tablename);
				break;
			}
		} catch (Exception e) {

		}

	}

	String daomethod[] = { "insert_", "update_", "delete_", "queryAll_", "queryBy_" };

	// 闁稿纰嶉弸鍐╃閿燂拷
	public void makeDaoFile(String daofile, String packname, String classname) {
		packname = (packname.replace("/", "."));
		String andClassname = classname.substring(0, 1).toUpperCase() + classname.substring(1).toLowerCase();
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(daofile)));
			bw.write("package " + packname + ";");
			bw.newLine();
			bw.write("import java.util.List;");
			bw.newLine();
			bw.write("import " + packname.substring(0, packname.lastIndexOf(".")) + ".domain." + classname + ";");
			bw.newLine();

			bw.write("@DataSourceType(DataSourceType.main)");

			bw.write("public interface " + classname + "_Dao_Iface {");
			bw.newLine();
			bw.write("public void " + daomethod[0] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public void " + daomethod[1] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public void " + daomethod[2] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public List " + daomethod[3] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public List " + daomethod[4] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void makeService_Iface_File(String daofile, String packname, String classname) {
		packname = (packname.replace("/", "."));
		String andClassname = classname.substring(0, 1).toUpperCase() + classname.substring(1).toLowerCase();
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(daofile)));
			bw.write("package " + packname + ";");
			bw.newLine();
			bw.write("import " + packname.substring(0, packname.lastIndexOf(".")) + ".domain." + classname + ";");
			bw.newLine();
			bw.write("import java.util.List;");
			bw.newLine();
			bw.write("public interface " + classname + "_Service_Iface {");
			bw.newLine();
			bw.write("public void " + daomethod[0] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public void " + daomethod[1] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public void " + daomethod[2] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public List " + daomethod[3] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("public List " + daomethod[4] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception;");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void makeService_Impl_File(String daofile, String packname, String classname) {
		packname = (packname.replace("/", "."));
		String andClassname = classname.substring(0, 1).toUpperCase() + classname.substring(1).toLowerCase();
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(daofile)));
			bw.write("package " + packname + ";");
			bw.newLine();
			bw.write("import java.util.List;");
			bw.newLine();

			bw.write("import javax.annotation.Resource;");
			bw.newLine();
			bw.write("import org.springframework.stereotype.Service;");
			bw.newLine();
			bw.write("import org.springframework.transaction.annotation.Propagation;");
			bw.newLine();
			bw.write("import org.springframework.transaction.annotation.Transactional;");
			bw.newLine();
			bw.write("import com.ccunix.ihousekeeping.base.domain.AppDataModel;");
			bw.newLine();
			bw.write("import com.ccunix.ihousekeeping.base.service.BaseService;");
			bw.newLine();
			bw.write("import " + packname.substring(0, packname.lastIndexOf(".")) + ".domain." + classname + ";");
			bw.newLine();
			bw.write(
					"import " + packname.substring(0, packname.lastIndexOf(".")) + ".dao." + classname + "_Dao_Iface;");
			bw.newLine();
			bw.newLine();
			bw.write("@Service(\"" + classname + "_Service\")");
			bw.newLine();
			bw.write("@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)");
			bw.newLine();

			bw.write("public class " + classname + "_Service_Impl extends BaseService implements " + classname
					+ "_Service_Iface {");
			bw.newLine();

			bw.write("@Resource");
			bw.newLine();
			bw.write("public " + classname + "_Dao_Iface " + classname.toLowerCase() + "_dao_iface;");
			bw.newLine();

			bw.write("public void " + daomethod[0] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception{");
			bw.newLine();
			bw.write(classname.toLowerCase() + "_dao_iface." + daomethod[0] + classname.toLowerCase() + "("
					+ classname.toLowerCase() + ");");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.write("public void " + daomethod[1] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception{");
			bw.newLine();
			bw.write(classname.toLowerCase() + "_dao_iface." + daomethod[1] + classname.toLowerCase() + "("
					+ classname.toLowerCase() + ");");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.write("public void " + daomethod[2] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception{");
			bw.newLine();
			bw.write(classname.toLowerCase() + "_dao_iface." + daomethod[2] + classname.toLowerCase() + "("
					+ classname.toLowerCase() + ");");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.write("public List " + daomethod[3] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception{");
			bw.newLine();
			bw.write("return " + classname.toLowerCase() + "_dao_iface." + daomethod[3] + classname.toLowerCase() + "("
					+ classname.toLowerCase() + ");");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.write("public List " + daomethod[4] + classname.toLowerCase() + "(" + andClassname + " "
					+ classname.toLowerCase() + ") throws Exception{");
			bw.newLine();
			bw.write("return " + classname.toLowerCase() + "_dao_iface." + daomethod[4] + classname.toLowerCase() + "("
					+ classname.toLowerCase() + ");");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.write("}");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Resource
	Table_Column_Service_Iface column_Service_Iface;

	public void makeDomainJAVA_File(String daofile, String packname, String classname) {
		packname = (packname.replace("/", "."));
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(daofile), "GBK"));
			bw.write("package " + packname + ";");
			bw.newLine();
			bw.write("import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;");
			bw.newLine();
			bw.write("import java.util.Date;");
			bw.newLine();
			bw.write("public class " + classname + " extends Base_Model_Business {");
			bw.newLine();

			Table_Column column = new Table_Column();
			column.setTable_name(classname.toUpperCase());
			List<Table_Column> list = column_Service_Iface.queryColumn_By_Table(column);
			for (int i = 0; i < list.size(); i++) {
				Table_Column table_Column = list.get(i);
				String column_name = table_Column.getColumn_name();
				String column_type = table_Column.getData_type();
				String BigColum = column_name.substring(0, 1).toUpperCase() + column_name.substring(1).toLowerCase();
				if (!isBaseColumn(column_name.toLowerCase())) {
					// bw.write("//" + table_Column.getComments());
					// bw.newLine();

					// 为日期Date型变量，多做一个xxx_str
					if (getType(column_type).equals("Date")) {
						bw.write("private String " + column_name.toLowerCase() + "_str ;");
						bw.newLine();
						bw.write("public void set" + BigColum + "_str(String "
								+ column_name.toLowerCase() + "_str ){");
						bw.newLine();
						bw.write("this." + column_name.toLowerCase() + "_str =" + column_name.toLowerCase() + "_str;");
						bw.newLine();
						bw.write("}");
						bw.newLine();
						bw.write("public String  get" + BigColum + "_str (){");
						bw.newLine();
						bw.write("return this." + column_name.toLowerCase() + "_str ;");
						bw.newLine();
						bw.write("}");
						bw.newLine();
					}

					bw.write("private " + getType(column_type) + " " + column_name.toLowerCase() + ";");
					bw.newLine();
					bw.write("public void set" + BigColum + "(" + getType(column_type) + " " + column_name.toLowerCase()
							+ "){");
					bw.newLine();
					bw.write("this." + column_name.toLowerCase() + "=" + column_name.toLowerCase() + ";");
					bw.newLine();
					bw.write("}");
					bw.newLine();
					bw.write("public " + getType(column_type) + " get" + BigColum + "(){");
					bw.newLine();
					bw.write("return this." + column_name.toLowerCase() + ";");
					bw.newLine();
					bw.write("}");
					bw.newLine();

				}

			}

			bw.write("}");
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getType(String oracleType) {
		String javatype = "";
		switch (oracleType) {
		case "VARCHAR2":
			javatype = "String";
			break;
		case "NUMBER":
			javatype = "Integer";
			break;
		case "DATE":
			javatype = "Date";
			break;
		case "CHAR":
			javatype = "String";
			break;
		case "CLOB":
			javatype = "String";
			break;
		case "BLOB":
			javatype = "String";
			break;
		}
		return javatype;

	}

	String finalColumn[] = { "creator", "createtime", "updater", "updatetime", "is_delete", "deletetime", "id",
			"delete_user" };

	public boolean isBaseColumn(String c) {

		for (String k : finalColumn) {
			if (c.equals(k)) {
				return true;
			}
		}
		return false;
	}

	public void makeDomainXML_File(String daofile, String packname, String classname) {
		packname = (packname.replace("/", "."));
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(daofile)));
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
			bw.newLine();
			bw.write(
					"<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\" >");
			bw.newLine();

			bw.write("<mapper namespace=\"" + packname.substring(0, packname.lastIndexOf(".")) + ".dao." + classname
					+ "_Dao_Iface\" >");
			bw.newLine();
			bw.write("<cache type=\"com.ccunix.ihousekeeping.base.util.RedisCache\" />");
			bw.newLine();
			bw.write("<resultMap type=\"" + packname + "." + classname + "\" id=\"result_" + classname + "\"/>");
			bw.newLine();
			bw.write("<parameterMap type=\"" + packname + "." + classname + "\" id=\"param_" + classname + "\"/>");
			bw.newLine();
			bw.write("<insert id=\"" + daomethod[0] + classname.toLowerCase() + "\" parameterMap=\"param_" + classname
					+ "\" >");
			bw.newLine();
			// -------insert----
			bw.newLine();
			bw.write("insert into " + classname.toLowerCase() + "   ");
			bw.newLine();
			bw.write("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">");
			bw.newLine();

			Table_Column column = new Table_Column();
			column.setTable_name(classname.toUpperCase());
			List<Table_Column> list = column_Service_Iface.queryColumn_By_Table(column);
			for (int i = 0; i < list.size(); i++) {
				Table_Column table_Column = list.get(i);
				String column_name = table_Column.getColumn_name();
				String column_type = table_Column.getData_type();
				bw.write("<if test=\"" + column_name.toLowerCase() + " != null and " + column_name.toLowerCase()
						+ " != ''\">");
				bw.newLine();
				bw.write(column_name.toLowerCase() + ",");
				bw.newLine();
				bw.write(" </if>");
				bw.newLine();
			}

			bw.write("</trim>");
			bw.newLine();
			bw.write("VALUES");
			bw.newLine();
			bw.write("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">");
			bw.newLine();
			for (int i = 0; i < list.size(); i++) {
				Table_Column table_Column = list.get(i);
				String column_name = table_Column.getColumn_name();
				String column_type = table_Column.getData_type();
				bw.write("<if test=\"" + column_name.toLowerCase() + " != null and " + column_name.toLowerCase()
						+ " != ''\">");
				bw.newLine();
				if (column_type.equals("CLOB")) {
					bw.write("#{" + column_name.toLowerCase() + ",jdbcType=CLOB},");
				} else {
					bw.write("#{" + column_name.toLowerCase() + "},");
				}
				bw.newLine();
				bw.write(" </if>");
				bw.newLine();
			}
			bw.newLine();
			bw.write("</trim>");
			bw.newLine();
			bw.write("</insert>");

			// -------delete
			bw.newLine();
			bw.newLine();
			bw.newLine();
			bw.write("<update id=\"" + daomethod[2] + classname.toLowerCase() + "\" parameterMap=\"param_" + classname
					+ "\" >");
			bw.newLine();
			bw.write("update " + classname.toLowerCase() + " set is_delete=1,deletetime=sysdate where  id=#{id}");
			bw.newLine();
			bw.write("</update>");
			bw.newLine();

			// ---------update
			bw.write("<update id=\"" + daomethod[1] + classname.toLowerCase() + "\" parameterMap=\"param_" + classname
					+ "\" >");
			bw.write("update " + classname.toLowerCase() + "   ");
			bw.newLine();

			bw.newLine();
			bw.write("<set>");
			bw.newLine();
			for (int i = 0; i < list.size(); i++) {
				Table_Column table_Column = list.get(i);
				String column_name = table_Column.getColumn_name();
				String column_type = table_Column.getData_type();
				if (!column_name.toLowerCase().equals("id")) {
					bw.write("<if test=\"" + column_name.toLowerCase() + " != null and " + column_name.toLowerCase()
							+ " != ''\">");
					bw.newLine();
					if (column_type.equals("CLOB")) {
						bw.write(column_name.toLowerCase() + "=#{" + column_name.toLowerCase() + ",jdbcType=CLOB},");
					} else {
						bw.write(column_name.toLowerCase() + "=#{" + column_name.toLowerCase() + "},");
					}
					bw.newLine();
					bw.write(" </if>");
					bw.newLine();
				}

			}
			bw.newLine();
			bw.write("</set>");
			bw.newLine();
			bw.write(" where id=#{id}");
			bw.newLine();
			bw.write("</update>");
			bw.newLine();
			// queryAll
			bw.write("<select id=\"" + daomethod[3] + classname.toLowerCase() + "\" parameterMap=\"param_" + classname
					+ "\"  resultMap=\"result_" + classname + "\">");
			bw.newLine();
			String allcolumn = "";
			for (int i = 0; i < list.size(); i++) {
				Table_Column table_Column = list.get(i);
				String column_name = table_Column.getColumn_name();
				String column_type = table_Column.getData_type();
				allcolumn += column_name + ",";
				
				//为日期做一个str
				if(column_type.toLowerCase().equals("date")){
					allcolumn+="to_char("+column_name+",'YYYY-MM-DD HH24:MI:SS') "+column_name+"_str,";
				}
				
				
			}
			bw.write("select ");
			allcolumn = allcolumn.substring(0, allcolumn.lastIndexOf(","));
			bw.write(allcolumn);
			bw.newLine();
			bw.write(" from " + classname.toLowerCase() + " where is_delete != 1");
			for (int i = 0; i < list.size(); i++) {
				Table_Column table_Column = list.get(i);
				String column_name = table_Column.getColumn_name();
				String column_type = table_Column.getData_type();
				bw.write("<if test=\"" + column_name.toLowerCase() + " != null and " + column_name.toLowerCase()
						+ " != ''\">");
				bw.newLine();
				if (column_type.equals("CLOB")) {
					bw.write(" and " + column_name.toLowerCase() + "=#{" + column_name.toLowerCase()
							+ ",jdbcType=CLOB},");
				} else {
					bw.write(" and " + column_name.toLowerCase() + "=#{" + column_name.toLowerCase() + "}");
				}
				bw.newLine();
				bw.write(" </if>");
				bw.newLine();
			}
			bw.write("</select>");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();

			bw.newLine();
			bw.write("</mapper>");
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void makeController_File(String daofile, String packname, String classname) {
		packname = (packname.replace("/", "."));
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(daofile)));
			bw.write("package " + packname + ";");
			bw.newLine();
			bw.write("import javax.annotation.Resource;");
			bw.newLine();
			bw.write("import org.springframework.stereotype.Controller;");
			bw.newLine();
			bw.write("import org.springframework.web.bind.annotation.RequestMapping;");
			bw.newLine();
			bw.write("import org.springframework.web.bind.annotation.ResponseBody;");
			bw.newLine();
			bw.write("import com.ccunix.ihousekeeping.base.controller.BaseMultiController;");
			bw.newLine();
			bw.write("import com.ccunix.ihousekeeping.base.domain.AppDataModel;");
			bw.newLine();
			bw.write("import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;");
			bw.newLine();

			bw.write("import " + packname.substring(0, packname.lastIndexOf(".")) + ".domain." + classname + ";");
			bw.newLine();
			bw.write("import " + packname.substring(0, packname.lastIndexOf(".")) + ".service." + classname
					+ "_Service_Iface;");
			bw.newLine();

			bw.write("@Controller");
			bw.newLine();
			bw.write("@RequestMapping(\"" + classname + "_Controller\")");
			bw.newLine();

			bw.write("public class " + classname + "_Controller extends BaseMultiController {");
			bw.newLine();

			bw.write("@Resource");
			bw.newLine();
			bw.write("public " + classname + "_Service_Iface " + classname.toLowerCase() + "_service_iface;");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();
			bw.write("");
			bw.newLine();

			bw.write("}");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
