package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Conveyance extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String convey11=null;

	try{

	String conveyance=(String)req.getAttribute("basicpay");
	double convey1=Double.parseDouble(conveyance);	
	double convey2=(convey1*0.02);

	convey11=""+convey2;

	}catch(Exception e){
	e.printStackTrace();
	}
req.setAttribute("convey",convey11);

}

}