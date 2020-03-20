package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_includefoot extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<html><body>This is Footer Servlet Page</body></html>");


}


}