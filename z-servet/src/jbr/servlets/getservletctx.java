package jbr.servlets;
import java.io.*;
import javax.servlet.*;

public class getservletctx extends GenericServlet{

ServletContext ctx;
String url;

public void init(ServletConfig cfig){
ctx=cfig.getServletContext();
}

public void service(ServletRequest req, ServletResponse res) throws 
		ServletException, IOException{
PrintWriter out=res.getWriter();
res.setContentType("text/html");

url=(String)ctx.getAttribute("URL");
out.println("<B> The URL value is: </b>" + url);

}

}