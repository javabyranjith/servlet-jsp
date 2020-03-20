<%@ page import="java.sql.*" %>
<%--<%@ page import="ranbean.*" %>--%>

<jsp:useBean id="myconnection" class="ranbean.conbean"/>

<% 	<%--conbean cb=new conbean();--%>
	try{
	Statement st=myconnection.conmethod().createStatement();
	String query="select * from ranjsp2";
	ResultSet rs=st.executeQuery(query);
%>	
	<html><body>
	<center>
	<table border=1>
	<tr><th>NO</th><th>NAME</th><th>AGE</th><th>DEPT</th></tr>
<%	while(rs.next()){%>
	<tr><td><%= rs.getString("no")%></td>
	    <td><%= rs.getString("name")%></td>
	    <td><%= rs.getString("age")%></td>
	    <td><%= rs.getString("dept")%></td>
	</tr>
<%	}%>
	</table>
	</html></body>			

<%}	catch(SQLException e){
	e.printStackTrace();
	}
%>