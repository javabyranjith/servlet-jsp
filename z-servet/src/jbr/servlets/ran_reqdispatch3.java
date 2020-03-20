package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_reqdispatch3 extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws 
		ServletException, IOException{

RequestDispatcher rd=null;
//getServletContext().getRequestDispatcher("/disp.html");

if(rd==null){
	System.out.println("Error is Redirecting");
	res.sendError(res.SC_NO_CONTENT);
	}
//	rd.forward(req,res);

}
}