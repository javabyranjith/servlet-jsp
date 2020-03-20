package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ranforwarderror extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {

ServletConfig config=getServletConfig();
ServletContext ctx=config.getServletContext();
RequestDispatcher rd=ctx.getRequestDispatcher("/servlet/ranerrorservlet");

try{
String myage=req.getParameter("age");
int x=Integer.parseInt(myage);
}catch(Exception e){
req.setAttribute("EXCEPTION",e);
rd.forward(req,res);
}

}
}