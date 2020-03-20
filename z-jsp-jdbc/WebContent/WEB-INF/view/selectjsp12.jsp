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
	<form method="get" action="selectjsp12.jsp">
	<br>Enter Number: <input type=text no="no">
<%	
	no=request.getParameter("no");
%>
	<br><input type=submit value="Select">
<%
	st=con.createStatement();
	query="select no,name,age,dept from ranjsp2 where no='"+no+"'";
	rs=st.executeQuery(query);
%>
<%	
	out.println("<table border=1>");
	out.println("<tr><th>NO</th><th>NAME</th><th>AGE</th><th>DEPT</th></tr>");
	while(rs.next()){
	out.println("<tr>");
	out.println("<td>"+rs.getString("no")+"</td>");
	out.println("<td>"+rs.getString("name")+"</td>");
	out.println("<td>"+rs.getString("age")+"</td>");
	out.println("<td>"+rs.getString("dept")+"</td>");
	out.println("</tr>");
	}
	out.println("</table>");
%>
	</form></body></html>	
<%
	}catch(SQLException e){
	e.printStackTrace();
	}
%>