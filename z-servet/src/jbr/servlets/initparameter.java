package jbr.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class initparameter extends HttpServlet{

String value=null;
Enumeration e=null;

public void init() throws ServletException{

getServletContext().getInitParameter("Ranjith Init Parameter");
value = getServletContext().getInitParameter("param1");
System.out.println("Init Parameter is called" +value);

/*e=getServletConfig().getInitParameterNames();
for(;e.hasMoreElements();){
String name=(String)e.nextElement();
System.out.println("Name is: "+ name);
value=getServletConfig().getInitParameter(name);
System.out.println("Value is: "+value);
}*/

}

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{
PrintWriter out=res.getWriter();
res.setContentType("text/html");

out.println("<html><head><title>Init Parameter Servlet</title></head><body>");
out.println("Today date is: "+(new java.util.Date()));
out.println(value);
out.println("</body></html>");
out.close();

}


}