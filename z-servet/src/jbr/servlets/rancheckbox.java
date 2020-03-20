package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class rancheckbox extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException{

PrintWriter out=res.getWriter();
res.setContentType("text/html");

String s[]=req.getParameterValues("cb1");

<html><head><title>Software Courses</title></head><body bgcolor=yellow>

//String str="<html><head><title>Software Courses</title></head><body bgcolor=yellow>";
//out.println(str);

	if(s!=null){
	out.println("You are Selected "+s.length +" Courses Are <br>");
	
	out.println("<ul>");
	for(int i=0;i<s.length;i++){
	out.println("<li>"+s[i]);
	}
	out.println("</ul>");
	}else
	{
	out.println("You didnt select any course");
	}
	out.println("</body></html>");
}

}