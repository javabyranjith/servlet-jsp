package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class setcookie extends HttpServlet{
PrintWriter out=null;

public void doGet(HttpServletRequest req, HttpServletResponse) throws		
			ServletException, IOException{
doPost(req,res);
}

public void doPost(HttpServletRequest req, HttpServletResponse) throws		
			ServletException, IOException{
out=res.getWriter();

//user info from the HttpServlet request.
String username=req.getParameter("user");
String password=req.getParameter("pass");

//create cookie
Cookie ck=new Cookie("user", ranjith);

//add the cookie to the client browser
res.addCookie(ck);

out.println("Cookie containing user name is stored in ur browser");

}

}