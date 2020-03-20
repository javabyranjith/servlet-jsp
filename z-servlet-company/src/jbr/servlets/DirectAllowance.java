package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DirectAllowance extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String dasend=null;

	try{
	String da=(String)req.getAttribute("basicpay");
	double da1=Double.parseDouble(da);
	double da2=(da1*0.05);
	
	dasend=""+da2;

	}catch(Exception e){
	e.printStackTrace();
	}
req.setAttribute("da",dasend);

}

}