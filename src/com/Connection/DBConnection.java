package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection con;
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/sampledb";
	public static String user = "root";
	public static String pass = "root";
	
	public static Connection getConnection() {
		
		try {
			
			//load the driver
			Class.forName(driver);
			
			//create the connection or getConnection
			con = DriverManager.getConnection(url,user,pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}return con;
	}
		
	
}
