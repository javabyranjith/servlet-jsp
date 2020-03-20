<%@ page import="java.sql.*" %>
<%! 
Connection con;
Statement st;
PreparedStatement pst,pst1;
ResultSet rs;
String query,query1;
String no,name,age,dept;
String no1,no2,name1,age1,dept1;
int changes;
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
	<html><body bgcolor=palegreen>
	<center>
	<form method="get" action="selectjsp123.jsp">
	<h3>Enter Values to Insert</h3>
	<table border=1>
	<tr><th>No</th><th>Name</th><th>Age</th><th>Dept</th>
	<tr>
	<td><input type=text name="no" size=6></td>
	<td><input type=text name="name" size=15></td>
	<td><input type=text name="age" size=4></td>
	<td><input type=text name="dept" size=6></td>
	</tr>
	</table>
	<input type=submit value="Insert">
	<input type=reset value="Clear">
	</form>
	</html></body>

	<html><body>
	<form method="get" action="selectjsp123.jsp">
	<h3>Enter Value to Update</h3>
	<table border=1>
	<tr><th>No</th><th>Name</th><th>Age</th><th>Dept</th><th>No to Update</th>
	<tr>
	<td><input type=text name="no1" size=6></td>
	<td><input type=text name="name1" size=15></td>
	<td><input type=text name="age1" size=4></td>
	<td><input type=text name="dept1" size=6></td>
	<td><input type=text name="no2"></td>
	</tr>
	</table>
	<input type=submit value="Update">
	<input type=reset value="Clear">
	</form>
	</html></body>

	<html><body>
	<form method="get" action="selectjsp123.jsp">
	<h3>Enter Values to Delete</h3>
	<table border=1>
	<tr><th>No</th><th>Name</th><th>Age</th><th>Dept</th>
	<tr>
	<td><input type=text name="no" size=6></td>
	<td><input type=text name="name" size=15></td>
	<td><input type=text name="age" size=4></td>
	<td><input type=text name="dept" size=6></td>
	</tr>
	</table>
	<input type=submit value="Delete">
	<input type=reset value="Clear">
	</center>
	</form>
	</body></html>	

<%	no=request.getParameter("no");
	name=request.getParameter("name");
	age=request.getParameter("age");
	dept=request.getParameter("dept");	
%>
<%	query="insert into ranjsp2 values(?,?,?,?)";
	pst=con.prepareStatement(query);
	pst.setObject(1,no);
	pst.setObject(2,name);
	pst.setObject(3,age);
	pst.setObject(4,dept);
	int changes=pst.executeUpdate();	
	out.println(changes + " Row Inserted");
	%>
<% con.setAutoCommit(true); %>

<%	no1=request.getParameter("no1");
	name1=request.getParameter("name1");
	age1=request.getParameter("age1");
	dept1=request.getParameter("dept1");
	no2=request.getParameter("no2");
%>
<%	query1="update ranjsp2 set no='"+no1+"',name='"+name1+"',age='"+age1+"',dept='"+dept1+"' where no='"+no2+"'";
	pst1=con.prepareStatement(query1);
	changes=pst1.executeUpdate();
	out.println(no2+" Row Updated");
%>
<% con.setAutoCommit(true); %>

<%
	}catch(SQLException e){
	e.printStackTrace();
	}
%>