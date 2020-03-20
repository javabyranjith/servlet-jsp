<%@ page import="java.sql.*" %>
<%@ page errorPage="jspjdbcerror.jsp"%>
<%! 
Connection con;
PreparedStatement pst,pst1;
String option;
String no,name,age,dept;
String no1,name1,age1,dept1,no2,no3,no4;
String query,query1;
int inserted,updated,deleted;
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
<%
	no=request.getParameter("no");
	name=request.getParameter("name");
	age=request.getParameter("age");
	dept=request.getParameter("dept");
	
	no1=request.getParameter("no1");
	name1=request.getParameter("name1");
	age1=request.getParameter("age1");
	dept1=request.getParameter("dept1");
	no2=request.getParameter("no2");

	no3=request.getParameter("no3");
	no4=request.getParameter("no4");
%>
<%
	option=request.getParameter("rb");
%>
<%	if(option.equals("insert")){
	query="insert into ranjsp2 values(?,?,?,?)";
	pst=con.prepareStatement(query);
	pst.setObject(1,no);
	pst.setObject(2,name);
	pst.setObject(3,age);
	pst.setObject(4,dept);	
	inserted=pst.executeUpdate();
	}
	out.println("Row inserted: "+inserted);
%>
<%	if(option.equals("update")){
	query1="update ranjsp2 set no='"+no1+"',name='"+name1+"',age='"+age1+"',dept='"+dept1+"' where no='"+no2+"'";
	pst1=con.prepareStatement(query1);
	updated=pst1.executeUpdate();
	out.println("Row inserted: "+updated);
	}
%>

<%	if(option.equals("select")){
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select no,name,age,dept from ranjsp2 where no='"+no3+"'");
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
	out.println("Row Selected");
	}
	}
%>
<%
	if(option.equals("delete")){
	Statement st4=con.createStatement();
	String del="delete from ranjsp2 where no='"+no4+"'";
	int deleted=st4.executeUpdate(del);
	out.println("Row Deleted: "+deleted);
	}
%>

<% con.setAutoCommit(true);%>

<%	}catch(SQLException e){
	e.printStackTrace();
	}
%>