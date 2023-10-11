package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Connection.DBConnection;

public class insert {

	public static boolean insertintodatabase(SG s) {
		boolean f = false;
		
		try {
			//getconnection 
			Connection con = DBConnection.getConnection();
			String q = "insert into user(usename,password,email,phone) values(?,?,?,?)";
			
			//preparedstatment
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the values of parameter
			pstmt.setString(1, s.getUsename());
			pstmt.setString(2, s.getPassword());
			pstmt.setString(3, s.getEmail());
			pstmt.setString(4, s.getPhone());
			
			//executeupdate
			pstmt.executeUpdate();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}return f;
		
	}
}
