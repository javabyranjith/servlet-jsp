package jbr.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_initparam extends HttpServlet{

String value=null;
Enumeration e=null;

public void init() throws ServletException{
getServletContext().log("Ranjith Parameter");
value=getServletConfig().getInitParameter("param1");
System.out.println("Init Param1 called");

e=getServletConfig().getInitParameterNames();
for(;e.hasMoreElements();){
String name=(String)e.nextElement();
System.out.println("Name is: "+ name);

value=getServletConfig().getInitParameter(name);
System.out.println(value);
}
}

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{
PrintWriter out=res.getWriter();
res.setContentType("text/html");
out.println("<html><head><title>InitParameter Example</title></head>");
out.println("Today Date is: "+(new java.util.Date()));
out.println(value);
out.println("</body></html>");
out.close();

}

}