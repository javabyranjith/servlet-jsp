package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class errorservlet1 extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

doPost(req,res);

}

public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

ServletConfig cfig=getServletConfig();
ServletContext ctx=cfig.getServletContext();

RequestDispatcher rd=ctx.getRequestDispatcher("/servlet/errorservlet2");

	try{
	String str1=req.getParameter("a");
	int a=Integer.parseInt(str1);
	String str2=req.getParameter("b");
	int b=Integer.parseInt(str2);
	
	int c=a+b;
	out.println("Sum is: "+c);



//	int x=Integer.parseInt("Ranji");

	}catch(Exception e){
	req.setAttribute("EXCEPTION",e);
	rd.forward(req,res);
	}
}


}