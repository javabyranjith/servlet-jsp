package jbr.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class servletinfo extends GenericServlet{
ServletConfig sc;
	
	public void init(){
	System.out.println("This is Init Method; this is called only once");	
	System.out.println("Test for Destroy Method");
	}
	
	public void destroy(){
	System.out.println("This is destroy Method by ranjith");
	}
			
	public void service(ServletRequest req, ServletResponse res)throws IOException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	
	String s=sc.getServletName();
	System.out.println("Name"+ s);
	}
}