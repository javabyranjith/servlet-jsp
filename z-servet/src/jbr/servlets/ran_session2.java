package jbr.servlets;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_session2 extends HttpServlet{
HttpSession session;
public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
session=req.getSession(true);

if(session.getAttribute("username")==null){
session.setAttribute("username","Stranger");
}

PrintWriter out=res.getWriter();
out.println("Session id is: "+session.getId());
out.println("<html><body>");
out.println("A Session example page 2");
out.println("<br>");
out.println("Welcome " +(String)session.getAttribute("username")+ "!");
out.println("<p><a href=\"ran_session1\"> go to page 1</a>");

out.println("</body></html>");
out.close();

}

}