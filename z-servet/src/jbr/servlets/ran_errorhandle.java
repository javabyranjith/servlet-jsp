package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_errorhandle extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

PrintWriter out=res.getWriter();
res.setContentType("text/html");

String str1=req.getParameter("ad1");
int a=Integer.parseInt(str1);

String str2=req.getParameter("ad2");
int b=Integer.parseInt(str2);

int sum=a+b;

out.println("Addtion is: "+sum);

}

}