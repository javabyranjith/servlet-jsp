<%@ page import="java.sql.*" %>
<%! Connection con=null; %>
<%
	String no=request.getParameter("no");
	String no1=request.getParameter("no1");

	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}catch(ClassNotFoundException ce){
	ce.printStackTrace();
	}

	try{
	con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
	con.setAutoCommit(true);
	Statement st=con.createStatement();
	out.println("<center>");
	out.println("<b>Before Updation of Table</b>");
	
	String query11="select * from ranjsp2";
	ResultSet rs1=st.executeQuery(query11);

	while(rs1.next()){
	out.println("<br>");
	out.println("Number is: "+rs1.getString("no"));
	}
	out.println("<br>");
	String query="update ranjsp2 set no='"+no1+"' where no='"+no+"'";
	int changes=st.executeUpdate(query);
	
	out.println("<b>After Updation of Table</b>");
	String query1="select * from ranjsp2";
	ResultSet rs=st.executeQuery(query1);
	while(rs.next()){
	out.println("<br>");
	out.println("Number is: "+rs.getString("no"));
	}
	out.println("<br>");
	out.println("<b>Row Updated</b>");
	out.println("</center>");
	}catch(SQLException e){
	e.printStackTrace();
	}
%>