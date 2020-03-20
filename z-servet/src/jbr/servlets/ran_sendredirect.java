package jbr.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_sendredirect extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

PrintWriter out=res.getWriter();
res.setContentType("text/html");

String str=req.getParameter("rb1");

if(str.equals("Java"))
res.sendRedirect("http://localhost:8080/examples/java.html");
if(str.equals("J2EE"))
res.sendRedirect("http://localhost:8080/examples/j2ee.html");
}

}