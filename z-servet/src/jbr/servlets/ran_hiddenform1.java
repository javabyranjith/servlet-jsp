package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_hiddenform1 extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String a=req.getParameter("user");

out.println("Hello, Click Submit to proceed");
out.println("<form name=\"login\" action=\"http://localhost:8080/examples/servlet/ran_hiddenform2\">");
out.println("<input type=\"hidden\" name=\"user\" value="+a+">");
out.println("<input type=\"submit\" value=\"Submit\">");

}
}