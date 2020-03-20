package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class errorservlet2 extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
doPost(req,res);

}

public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<html><body>");

Exception exc=(Exception)req.getAttribute("EXCEPTION");
String msg=exc.getMessage();

out.println("An Error Occured");
out.println("<br>");
out.println("Exception type: "+exc.getClass());
out.println("<br>");
out.println("Message is: "+msg);
out.println("</body></html>");
}


}