package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ranservlet1 extends HttpServlet{

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {

	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>This is my first servlet program</h1>");
	out.println("</body>");
	out.println("</html>");
}
}