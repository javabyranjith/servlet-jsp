package jbr.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HouseRentAllowance extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String hra3 = null;

    try {
      String hra = (String) req.getAttribute("basicpay");
      double hra1 = Double.parseDouble(hra);
      double hra2 = (hra1 * 0.02);

      hra3 = "" + hra2;

    } catch (Exception e) {
      e.printStackTrace();
    }

    req.setAttribute("hra", hra3);

  }

}