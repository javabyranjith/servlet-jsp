package jbr.servlets;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class refreshservlet extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

String s1,s2;
s1=req.getParameter("t1");
s2=req.getParameter("t2");

res.setContentType("text/html");
PrintWriter out=res.getWriter();

	try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:ran1","scott","tiger");
	Statement st=con.createStatement();
	String sql="insert into userdata values('"+s1+"','"+s2+"')";
	System.out.println(sql);
	
	st.executeUpdate(sql);
	System.out.println(sql);
	
	ResultSet rs=st.executeQuery("select * from userdata");
	
	out.println("<html>");
	out.println("<head>"+"<meta http-equiv=\"refresh\" content=\"5\">");
	out.println("<table cell padding=20 cell spacing 10 border=5><tr><th>Emp No</th><th>Emp Name</th></tr>");
	
		while(rs.next()){
		out.println("<tr><td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getString(2)+"</td></tr>");
		out.println("</font></body></html>");		
		}

	}catch(ClassNotFoundException e){
	e.printStackTrace();
	}catch(SQLException se){
	se.printStackTrace();
	}
}

}