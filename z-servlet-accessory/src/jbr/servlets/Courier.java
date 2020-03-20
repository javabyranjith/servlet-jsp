package jbr.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Courier extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String courier1 = (String) req.getAttribute("discount1");
    // System.out.println("<h3><center>Total Amount To Pay(with Courier Charge):
    // "+ courier1+"</center></h3>");

    double d = Double.parseDouble(courier1);
    out.println("<h3><center>Total Amount To Pay(with Courier Charge) : " + (d + 100) + "</center></h3>");

  }

}