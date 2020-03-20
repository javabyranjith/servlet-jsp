package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class shopviewhidden1 extends HttpServlet
{
 public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
 {
  res.setContentType("text/html");
  PrintWriter out=res.getWriter();
  out.println("<html><head><title> shopping </title></head>");
  out.println("<body bgcolor=\"#f3e244\">");
  String[] items=req.getParameterValues("items");
  out.println("you have currnently have the following items in your cart: <br>");
  if(items == null)
  {
   out.println("<b> none </b>");
   }

  else
       {

        out.println("<ul>");

        for(int i=0;i<items.length;i++)
        {
         out.println("<li>"+items[i]);
         }

        out.println("</ul>");

       }
       out.println("<form>");

       if(items != null)
       {
       for( int i=0;i<items.length;i++)
       {
        out.println("<input type=hidden name=items value=\""+items[i] + "\" >");
        }
       }
       out.println("subject <br> ");
       out.println("select name=\"items\" size=1");
       out.println("<option value=\"java\">java");
       out.println("<option value=\"vb\">vb");
       out.println("<option value=\"activex\">activex");
       out.println("<option value=\"oracle\"> oracle");
       out.println("</select>");

       out.println("<input type=submit value=add >");
       out.println("</form>");
       out.println("</body>");
       out.println("</html>");
       }
      
      }


