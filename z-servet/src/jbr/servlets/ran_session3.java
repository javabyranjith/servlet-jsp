package jbr.servlets;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_session3 extends HttpServlet{

HttpSession session;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
session=req.getSession(true);
System.out.println(session.isNew());

if(session.getAttribute("username")==null){
session.setAttribute("username","Stranger");
}

PrintWriter out=res.getWriter();

out.println("<html><body>");
out.println("<h3> Session Page 3</h3>");
out.println("<form action=\"");
out.println(res.encodeURL("ran_session3"));
out.println("\"");
out.println("method=post>");
out.println("Enter UR Name");
out.println("<br>");
out.println("<input type=text name=myname>");
out.println("<br>");
out.println("<input type=submit>");
out.println("</form>");
out.println((String)session.getAttribute("username"));
out.println("<p><a href=\"ran_session2\">go to page 2</a>");
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