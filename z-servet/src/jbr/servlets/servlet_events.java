package jbr.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class servlet_events extends HttpServlet{
ServletContext ctx;
PrintWriter out;
	public void init(ServletConfig cfig){
	ctx=cfig.getServletContext();
	}

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
	
	out=res.getWriter();
	res.setContentType("text/html");

	ctx.setAttribute("Ranjith","Kumar");
	out.println("The Ranjith has set as a context at"+new Date());

	ctx.removeAttribute("Ranjith");
	out.println("The Ranjith has removed from the context at"+new Date());
}
}