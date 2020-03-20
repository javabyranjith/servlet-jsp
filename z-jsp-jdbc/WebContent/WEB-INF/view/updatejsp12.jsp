<%@ page import="java.sql.*" %>
<%! 
Connection con;
PreparedStatement pst;
String query;
String name,name1;
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
	<form method="get" action="updatejsp12.jsp">
	<br>Enter Original Name : <input type=text name="name">
	<br>Enter Name to Update: <input type=text name="name1">

<%	
	name=request.getParameter("name");
	name1=request.getParameter("name1");
%>
	<br><input type=submit value="Update">

<%	query="update ranjsp1 set name='"+name1+"' where name='"+name+"'";
	pst=con.prepareStatement(query);
	int changes=pst.executeUpdate();	
%>
	</form></body></html>	
<% con.setAutoCommit(true); %>
<%
	out.println("<b>"+changes+" Row Updated</b>");
	}catch(SQLException e){
	e.printStackTrace();
	}
%>