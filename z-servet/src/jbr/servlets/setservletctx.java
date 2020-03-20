package jbr.servlets;
import java.io.*;
import javax.servlet.*;

public class setservletctx extends GenericServlet{

ServletContext ctx;

public void init(ServletConfig cfig){
ctx=cfig.getServletContext();
}

public void service(ServletRequest req, ServletResponse res) throws 
		ServletException, IOException{
PrintWriter out=res.getWriter();
res.setContentType("text/html");

ctx.setAttribute("URL","jdbc:odbc:RanjithDB");
out.println("<B> The JDBC URL has been set as a context attribute</b>");

}

}