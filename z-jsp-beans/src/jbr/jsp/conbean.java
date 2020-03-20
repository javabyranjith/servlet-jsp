package jbr.jsp;

import java.sql.*;

public class conbean{

public Connection con;
public conbean(){
System.out.println("Bean Initialized");

	
	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.println("Driver Loaded");
	}catch(ClassNotFoundException ce){
	ce.printStackTrace();
	}
	
	try{	
	con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
	System.out.println("connection created");
	}catch(SQLException e){
	e.printStackTrace();
	}
}
}