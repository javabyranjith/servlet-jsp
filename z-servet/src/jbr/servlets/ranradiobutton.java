package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ranradiobutton extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

PrintWriter out=res.getWriter();
res.setContentType("text/html");

String str=req.getParameter("rb1");

if(str!=null){
out.println("Your Selected Course is: "+str);
}else
{
out.println("Select Your Course");
}
out.close();
}

}