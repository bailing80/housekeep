package com.ccunix.ihousekeeping.alipay;



import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

	public static final String url="jdbc:oracle:thin:@222.169.194.215:1521:backdb";
	public static final String dirver = "oracle.jdbc.driver.OracleDriver";
	public static final String username = "finance";
	public static final String password = "finance";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(dirver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
