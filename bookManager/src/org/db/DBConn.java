package org.db;

import java.sql.*;

public class DBConn {
	
	public static Connection conn;  //Connection ∂‘œÛ
	
	public static Connection getConn(){
		try{
			
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MBOOK","wumingzhao","root");
			return conn;
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
			
		}
	}
	
	
	public static void CloseConn(){
		try{
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
