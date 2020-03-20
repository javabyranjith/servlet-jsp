<%@ page import="java.sql.*" %>
<%! 
Connection con; 
Statement st;
ResultSet rs;
String query,query1;
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
	<form method="get" action="deletejsp11.jsp">
	<br>Enter No to delete: <input type=text name="no"  size=5>
	
<%	
	no=request.getParameter("no");
%>
	<input type=submit value="Delete">	
<%      query="delete from ranjsp2 where no='"+no+"'";
	deleted= st.executeUpdate(query);
	out.println("<br><b>Row Deleted: </b>"+deleted);
%>
	</form>		
	</html></body>


<%	}catch(SQLException e){
	e.printStackTrace();
	}
	
%>