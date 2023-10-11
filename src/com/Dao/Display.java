package com.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Connection.DBConnection;

public class Display {
	
	public static void showAlluser() {
		boolean f = false;
		
		try {
			Connection con = DBConnection.getConnection();
			String q = "select * from user";
			
			//create statement
			Statement stm = con.createStatement();
			
			//resultset
			ResultSet set = stm.executeQuery(q);
			
			while (set.next()){
				
				int user_Id = set.getInt(1);
				String usename = set.getString(2);
				String password = set.getString(3);
				String email = set.getString(4);
				String phone = set.getString(5);
				
				System.out.println("user_id : " + user_Id);
				System.out.println("username : " + usename);
				System.out.println("password : " + password);
				System.out.println("email : " + email);
				System.out.println("phone : " + phone);
				System.out.println("**************************************");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
