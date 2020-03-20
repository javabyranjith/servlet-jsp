package jbr.servlets;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_session1 extends HttpServlet{

HttpSession session;
PrintWriter out;
public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
session=req.getSession(true);
if(session.getAttribute("username") == null){
session.setAttribute("username","Stranger");
}

out=res.getWriter();

out.println("Session id: "+session.getId());
out.println("<br>");
out.println("Creation Time: "+session.getCreationTime());
out.println("<br>");
out.println("Last Accessed Time: "+session.getLastAccessedTime());
out.println("Inactive Internal Before: "+session.getMaxInactiveInterval());

out.println("<html><body><br>");
out.println("A session example page 1");
out.println("<p>");
out.println("<form action=\"");
out.println(res.encodeURL("ran_session1"));
out.println("\" ");
out.println("method=post>");
out.println("What is ur Name");
out.println("<br>");
out.println("<input type=text name=myname>");
out.println("<br>");
out.println("<input type=submit>");
out.println("</form>");

out.println("Welcome "+session.getAttribute("username")+"!");
out.println("<p><a href=\"ran_session2\"> go to page 2</a>");
out.println("</body></html>");
out.close();

}
//out.println("Set Inactive Interval: "+session.setMaxInactiveInterval(100000));
//out.println("Inactive Internal After: "+session.getMaxInactiveInterval());

public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

session=req.getSession(true);
session.setAttribute("username",req.getParameter("myname"));
doGet(req,res);


}


}