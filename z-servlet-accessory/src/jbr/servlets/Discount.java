
package jbr.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Discount extends HttpServlet {

  String dis1 = null;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    try {
      String net = (String) req.getAttribute("netvalue");

      // System.out.println("Discount net");
      // System.out.println("Net in Discount is: "+net);

      double a = Double.parseDouble(net);
      double dis = (a * 0.2);
      out.println("<h3><center>Discount Amount is: " + dis + "</center></h3>");

      double b = (a - dis);

      out.println("<h3><center>Total Amount After Discount: " + b + "</center></h3>");

      dis1 = "" + b;
    } catch (Exception e) {
      e.printStackTrace();
    }

    req.setAttribute("discount1", dis1);
    // System.out.println("Discount is: "+dis1);

  }

}