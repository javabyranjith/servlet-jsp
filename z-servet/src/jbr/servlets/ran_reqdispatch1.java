package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_reqdispatch1 extends HttpServlet{

RequestDispatcher rd1;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{
System.out.println("Despatcher 1 called");
res.setContentType("text/html");
PrintWriter out=res.getWriter();
getServletContext().getRequestDispatcher("/servlet/ran_reqdispatch2").forward(req,res);

}

}