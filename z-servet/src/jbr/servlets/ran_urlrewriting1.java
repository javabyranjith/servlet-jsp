package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_urlrewriting1 extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
doPost(req,res);

}

public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String username=req.getParameter("uname");

out.println("Your username is: "+username);

}


}