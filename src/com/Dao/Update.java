package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.Dao.SG;

import com.Connection.DBConnection;

public class Update {
	public static boolean Updatestudent(int user_id) {
		boolean f = false;
		try {
			Connection con = DBConnection.getConnection();
			String q = "update user set usename=?,email=?,password=?,phone=? where user_id=?";

			// preparedstatement
			PreparedStatement pstmt = con.prepareStatement(q);

			// set the values of parameter
			pstmt.setInt(1, user_id);
			
			// execute
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		return f;
	}
}