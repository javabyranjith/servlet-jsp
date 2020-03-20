package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_urlrewriting extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
doPost(req,res);

}

public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String username=req.getParameter("user");

out.println("Hai! <a href=\"http://localhost:8080/examples/servlet/ran_urlrewriting1?uname="+username+"\"> Click Here</a> to see UR Name.");

}


}