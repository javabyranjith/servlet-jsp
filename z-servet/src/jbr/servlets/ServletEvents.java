package jbr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ServletEvents extends HttpServlet{

ServletContext ctx;
PrintWriter out;

public void init(ServletConfig cfig){
ctx=cfig.getServletContext();
}

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

out=res.getWriter();
res.setContentType("text/html");

ctx.setAttribute("URL","jdbc:odbc:ran1");
out.println("The Jdbc URL has been set a context attributee at "+new Date());

ctx.removeAttribute("URL");
out.println("The Jdbc URL has been removed from context attributee at "+new Date());
}
}