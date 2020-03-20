<%@ page import="java.sql.*" %>
<%! 
Connection con;
PreparedStatement pst;
String query;
String name,age;
%>
	
<%
	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}catch(ClassNotFoundException ce){
	ce.printStackTrace();
	}

	try{
	con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
%>
	<html><body>
	<form method="get" action="insertjsp12.jsp">
	<br>Enter Name: <input type=text name="name">
	<br>Enter  Age: <input type=text name="age">

<%	
	name=request.getParameter("name");
	age=request.getParameter("age");
%>
	<br><input type=submit value="Insert">

<%	query="insert into ranjsp1 values(?,?)";
	pst=con.prepareStatement(query);
	
	pst.setObject(1,name);
	pst.setObject(2,age);
	int changes=pst.executeUpdate();	
%>
	</form></body></html>	
<% con.setAutoCommit(true); %>
<%
	out.println("<b>"+changes+" Row Inserted</b>");
	}catch(SQLException e){
	e.printStackTrace();
	}
%>