<%@ page import="java.sql.*" %>
<%! 
Connection con;
Statement st;
ResultSet rs;
String query;
String no;
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
	<form method="get" action="select.jsp">
	<br>Enter Number: <input type=text name="no">
<%	
	no=request.getParameter("no");
%>
	<br><input type=submit value="Select">
<%
	st=con.createStatement();
	query="select no,name,age,dept from ranjsp2 where no='"+no+"'";
	rs=st.executeQuery(query);
%>
	<table border=1>
	<tr><th>NO</th><th>NAME</th><th>AGE</th><th>DEPT</th></tr>
<%	while(rs.next()){%>
	<tr>
	<td><%= rs.getString("no")%></td>
	<td><%= rs.getString("name")%></td>
	<td><%= rs.getString("age")%></td>
	<td><%= rs.getString("dept")%></td>
	</tr>
<%	}%>
	</table>
	</form></body></html>	
<%
	}catch(SQLException e){
	e.printStackTrace();
	}
%>