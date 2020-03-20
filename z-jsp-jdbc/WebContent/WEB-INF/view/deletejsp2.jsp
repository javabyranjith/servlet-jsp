<%@ page import="java.sql.*" %>
<%! Connection con=null; Connection con1=null; %>
<%
	String no=request.getParameter("no");

	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}catch(ClassNotFoundException ce){
	ce.printStackTrace();
	}

	try{

	con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
	Statement st=con.createStatement();
	String query1="select * from ranjsp2";
	ResultSet rs=st.executeQuery(query1);
	
	out.println("<b>Before Delete An Item</b><br>");
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

	Statement st1=con.createStatement();
	String query2="delete from ranjsp2 where no='"+no+"'";
	int deleted=st1.executeUpdate(query2);
	System.out.println("Deleted Item: "+deleted);

	con.setAutoCommit(true);

	Statement st2=con.createStatement();
	String query3="select * from ranjsp2";
	ResultSet rs1=st2.executeQuery(query3);
	out.println("<b>After Delete An Item</b><br>");
	out.println("<table border=1>");
	out.println("<tr><th>NO</th><th>NAME</th><th>AGE</th><th>DEPT</th></tr>");
	while(rs1.next()){
	System.out.println("Ranjith");
	out.println("<tr>");
	out.println("<td>"+rs1.getString("no")+"</td>");
	out.println("<td>"+rs1.getString("name")+"</td>");
	out.println("<td>"+rs1.getString("age")+"</td>");
	out.println("<td>"+rs1.getString("dept")+"</td>");
	out.println("</tr>");
	}
	out.println("</table>");
	}catch(SQLException e){
	e.printStackTrace();
	}
%>