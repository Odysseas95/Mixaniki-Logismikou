package org.teipir.softeng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sql_Con {
	
	 //Start of Establishing Connection with mysql
    public static Connection dbConnector() throws SQLException, ClassNotFoundException{
    
    	
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","","");
		
		return conn;
	
	
    }
  //End of Establishing Connection with mysql

}
