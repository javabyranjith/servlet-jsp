package jbr.servlets;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_session4 extends HttpServlet{

HttpSession session;
public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
session=req.getSession(true);

if(session.getAttribute("username")==null){
session.setAttribute("username","Stranger");
}

PrintWriter out=res.getWriter();

out.println("<html><body>");
out.println("<h3> Session Page 4</h3>");
out.println("<form action=\"");
out.println(res.encodeURL("ran_session4"));
out.println("\"");
out.println("method=post>");
out.println("Enter UR Name");
out.println("<input type=text name=myname>");
out.println("<input type=submit>");
out.println((String)session.getAttribute("username"));
out.println("<p>");
out.println("</body></html>");
out.close();
}

public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

session=req.getSession(true);
session.setAttribute("username",req.getParameter("myname"));
doGet(req,res);

}

}