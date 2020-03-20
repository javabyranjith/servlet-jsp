package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ranlog extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

ServletContext ctx=getServletContext();

PrintWriter out=res.getWriter();
res.setContentType("text/html");
try{
String str1=req.getParameter("ad1");
String str2=req.getParameter("ad2");

int b=Integer.parseInt(str2);
int a=Integer.parseInt(str1);
int c=a+b;

out.println("Addtion is: "+c);
}catch(Exception e){
//getServletContext().log("Sorry Enter the Numeric values");
ctx.log("Sorry Enter the Numeric values");
}
}

}