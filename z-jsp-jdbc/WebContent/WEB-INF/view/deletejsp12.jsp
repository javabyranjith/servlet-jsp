<%@ page import="java.sql.*" %>
<%! 
Connection con; 
Statement st,st1;
ResultSet rs,rs1;
String query,query1,query2;
String no;
int deleted;
%>

<%	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}catch(ClassNotFoundException ce){
	ce.printStackTrace();
	}

	try{
	con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
	st=con.createStatement();

	query1="select * from ranjsp2";
	rs=st.executeQuery(query1);
%>
	<b>Before Delete An Item</b><br>
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


	<html><body>
	<form method="get" action="deletejsp12.jsp">
	<br>Enter No to delete: <input type=text name="no"  size=5>
	
<%	
	no=request.getParameter("no");
%>
	<input type=submit value="Delete">	
<%      query="delete from ranjsp2 where no='"+no+"'";
	deleted= st.executeUpdate(query);
	System.out.println("Deleted Rows: "+deleted);
	out.println("<br><b>Deleted Row is: </b>"+no);
	out.println("<br><b>No of Rows Deleted: </b>"+deleted);
%>
	</form>		
	</html></body>
<% con.setAutoCommit(true);%>
<%
	st1=con.createStatement();
	query2="select * from ranjsp2";
	rs1=st1.executeQuery(query2);
%>
	<b>After Deleted An Item</b><br>
	<html><body>
	<table border=1>
	<tr><th>NO</th><th>NAME</th><th>AGE</th><th>DEPT</th></tr>

<%	while(rs1.next()){%>
	<tr><td><%= rs1.getString("no")%></td>
	    <td><%= rs1.getString("name")%></td>
	    <td><%= rs1.getString("age")%></td>
	    <td><%= rs1.getString("dept")%></td>
	</tr>

<%	}%>
	</table>
	</html></body>

<%	}catch(SQLException e){
	e.printStackTrace();
	}
	
%>