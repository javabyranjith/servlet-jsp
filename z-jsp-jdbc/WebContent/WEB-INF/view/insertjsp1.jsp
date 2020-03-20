<%@ page import="java.sql.*" %>
<%! Connection con=null; %>
<%
	String name=request.getParameter("name");
	System.out.println("Name is: "+name);
	String age=request.getParameter("age");
	int age1=Integer.parseInt(age);
	System.out.println("Age is: "+age);

	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	out.println("Driver Loaded");
	}catch(ClassNotFoundException ce){
	ce.printStackTrace();
	}

	try{
	con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
	con.setAutoCommit(true);
	out.println("Database connected");

	String query="insert into ranjsp1 values(?,?)";
	PreparedStatement pst=con.prepareStatement(query);
	
	pst.setString(1,name);
	pst.setInt(2,age1);
	
	int changes=pst.executeUpdate();
	System.out.println("Changes Made: "+changes);
	out.println("Changes Made: "+changes);
	}catch(SQLException e){
	e.printStackTrace();
	}
%>