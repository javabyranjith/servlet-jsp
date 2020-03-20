package jbr.servlets;
//Requesting Information

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ranservlet2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>Requeting Information</h1>");
	out.println("Method: " + req.getMethod());
	out.println("Request URI: "+req.getRequestURI());
	out.println("Protocol: "+req.getProtocol());
	out.println("PathInfo: "+req.getPathInfo());
	out.println("Remote Address: "+req.getRemoteAddr());
	out.println("</body>");
	out.println("</html>");
	}

	/*public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
		{
		doGet(req,res);
		}*/
}
