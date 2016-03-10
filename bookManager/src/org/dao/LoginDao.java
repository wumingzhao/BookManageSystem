package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.db.DBConn;
import org.model.Login;

public class LoginDao {
	
	Connection conn;
	public Login checkLogin(String name,String password){
		
		try{
			conn = DBConn.getConn();
			PreparedStatement pstmt = conn.prepareStatement("select*from [dbo.login] where name=? "+"and password=?");
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				Login login = new Login();
				login.setId(rs.getInt(1));
				login.setName(rs.getString(3));
				login.setPassword(rs.getString(2));
				login.setRole(rs.getBoolean(4));
				return login;
			}
			return null;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
			
		}finally{
			DBConn.CloseConn();
		}
		
		
	}

}
