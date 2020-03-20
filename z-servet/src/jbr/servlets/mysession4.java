package jbr.servlets;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class mysession4 extends HttpServlet
{

 HttpSession session;

 public void doGet(HttpServletRequest req,HttpServletResponse res)
 throws ServletException,IOException
 {

  res.setContentType("text/html");
  session=req.getSession(true);

  if(session.getAttribute("username") == null)

  {
         session.setAttribute("username","stranger");
         }

     PrintWriter out=res.getWriter();
     out.println("<html>");
     out.println("<body>");
     out.println("<h1> a session example </h1>");
     out.println("<p>");
     out.println("<form action=\"");
     out.println(res.encodeURL("mysession4"));
     out.println("\"");
     out.println("method = Post");
     out.println("<br>");
     out.println("<br>");
     out.println("<br>");
     out.println("<input type=text size=20 name=myname>");
     out.println("<br>");
     out.println("<input type=submit>");
     out.println("</form>");
     out.println((String)session.getAttribute("username"));
     out.println("<p>");
     out.println("</body>");
     out.println("</html>");
     out.close();
     }

    
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException
    {

    session=req.getSession(true);
    session.setAttribute("username",req.getParameter("myname"));
    doGet(req,res);
    }
   }



     








