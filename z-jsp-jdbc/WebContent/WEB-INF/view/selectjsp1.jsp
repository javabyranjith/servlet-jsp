<%@ page import="java.sql.*" %>
<%! Connection con=null; %>
<%
	String no=request.getParameter("no");
	System.out.println("No is: "+no);

	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}catch(ClassNotFoundException ce){
	ce.printStackTrace();
	}

	try{
	con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
	con.setAutoCommit(true);
	Statement st=con.createStatement();

//	String query="select no,name,age,dept from ranjsp2 where no='"+no+"'";

	String query="select * from ranjsp2 where no='"+no+"'";
	ResultSet rs=st.executeQuery(query);

//	ResultSet rs=st.executeQuery("select * from ranjsp2");
	out.println("<center>");
	out.println("<table border=1>");
	out.println("<tr><th>NO</th><th>NAME</th><th>AGE</th><th>DEPT</th></tr>");
	while(rs.next()){
	out.println("<tr>");
	out.println("<td>"+rs.getString("no")+"</td>");
	out.println("<td>"+rs.getString("name")+"</td>");
	out.println("<td>"+rs.getString("age")+"</td>");
	out.println("<td>"+rs.getString("dept")+"</td>");
	out.println("</tr>");
	out.println("</table>");
	out.println("</center>");
	}	}catch(SQLException e){
	e.printStackTrace();
	}
%>