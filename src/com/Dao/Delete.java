package com.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Connection.DBConnection;

public class Delete {
	
	public static boolean deletestudentintodatabases(int userId) {
		boolean f = false;
		
		try {
			// jdbc code........
			Connection con = DBConnection.getConnection();
			String q = "delete from user where user_id=?";
		
			// preparedstatment
			PreparedStatement pstmt = con.prepareStatement(q);

			// set the values of parameters
			pstmt.setInt(1, userId);

			// execute update
			pstmt.executeUpdate();
			f = true;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}return f;
		
	}
}
