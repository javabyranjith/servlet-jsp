package jbr.servlets;

//Requesting parameters

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ranservlet4 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
String value1 = request.getParameter("firstname");
String value2 = request.getParameter("lastname");
	out.println("<html><body>");
            out.println(value1);
            out.println(value2);
        out.println("</body></html>");
    }

   
}
