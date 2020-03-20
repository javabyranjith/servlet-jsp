package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_reqdispatch2 extends HttpServlet{

RequestDispatcher rd2;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{
System.out.println("Despatcher 2 Called");
res.setContentType("text/html");
PrintWriter out=res.getWriter();

String salary=req.getParameter("salary");
double sal=Integer.parseInt(salary);
double bonus=(sal*(4.33/100))*12;

out.println("<html><body> Salary is: "+sal);
out.println("Bonus is: "+bonus);
out.println("</body></html>");
}

}