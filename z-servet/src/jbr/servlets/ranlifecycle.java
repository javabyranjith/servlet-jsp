package jbr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ranlifecycle extends HttpServlet{

	
	public void init(){
	System.out.println("This is Init Method; this is called only once");	
	System.out.println("Test for Destroy Method");
	}
	
	public void destroy(){
	System.out.println("This is destroy Method by ranjith");
	System.out.println("Indra");
	}
			
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
//	out.println("Info: "+req.getServletInfo());
	
	System.out.println("Do Get Method Called");
	doPost(req,res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html><body>Do Post Method called</body></html>");
	System.out.println("Doooo post method called");
	}

}