<%@ page import="java.sql.*" %>
<%! 
Connection con; 
Statement st;
String query;
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
%>
	<html><body>
	<form method="get" action="delete.jsp">
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