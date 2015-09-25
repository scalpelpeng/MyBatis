package cn.dcr.mybatis.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

	public static void main(String[] srg){
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:9033;DatabaseName=creditExchange";
		String userName = "sa";
		String userPwd = "Welcome@123";
		Connection dbConn;
		try{
			Class.forName(driverName);
			dbConn = DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("Connection Successful!");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
