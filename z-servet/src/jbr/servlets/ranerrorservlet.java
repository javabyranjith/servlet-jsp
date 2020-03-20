package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ranerrorservlet extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String str1=req.getAttributer("age");


Exception myexception=(Exception)req.getAttribute("EXCEPTION");
String errmsg=myexception.getMessage();
out.println("<html>");
out.println("<body>");
out.println("<br>");
out.println("Sorry An Error Occured");
out.println("<br>");
out.println("Exception Type is: "+ myexception.getClass());
out.println("<br>");
out.println("Message is: "+errmsg);
out.println("</body>");
out.println("</html>");
}
}