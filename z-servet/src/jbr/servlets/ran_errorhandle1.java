package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_errorhandle1 extends HttpServlet{

final String EXC="javax.servlet.error.exception";
final String MSG="javax.servlet.error.message";
final String ST="javax.servlet.error.status_code";

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

ServletContext sc=getServletContext();
PrintWriter out=res.getWriter();
res.setContentType("text/html");

Exception exc=(Exception)req.getAttribute(EXC);
Integer st_cd=(Integer)req.getAttribute(ST);
String msg=(String)req.getAttribute(MSG);

out.println("<html>");
out.println("<body>");
out.println("<h3>Sorry An Error Occured</h3>");
out.println("Status Code: "+st_cd);
out.println("Type of Exception: "+exc.getClass());
out.println("Message Description: "+msg);

String str=exc.toString()+st_cd.toString()+msg;
sc.log("Exception Occured",exc);

out.println("Plz try again");

out.println("</body>");
out.println("</html>");
}

}