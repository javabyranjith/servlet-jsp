package jbr.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_reqheader extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

PrintWriter out=res.getWriter();
res.setContentType("text/html");

Enumeration hdnames=null;
Enumeration hdvalues=null;

hdnames=req.getHeaderNames();
while(hdnames.hasMoreElements()){
String names=(String)hdnames.nextElement();
//String value=req.getHeader(names);
//out.println(names + " : " + value+ "<br>");

	hdvalues=req.getHeaders(names);
	if(hdvalues!=null){
	while(hdvalues.hasMoreElements()){
	String values=(String)hdvalues.nextElement();
	out.println(names +" : " + values+"<br>"); 
	}
	

	}
}

}
}