package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_include extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();


RequestDispatcher headinclude=getServletContext().getRequestDispatcher("/servlet/ran_includehead");
headinclude.include(req,res);

out.println("<html><body><h2>This is Main Servlet page</h2></body></html>");

RequestDispatcher footinclude=getServletContext().getRequestDispatcher("/servlet/ran_includefoot");
footinclude.include(req,res);

}


}