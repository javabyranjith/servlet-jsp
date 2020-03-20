package jbr.servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomeApp extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    HttpSession session = null;
    session = req.getSession(true);

    int price1 = 0;
    int price2 = 0;
    int price3 = 0;
    int price4 = 0;
    int total = 0;

    String username = (String) session.getAttribute("user");
    out.println("Hi! <b>" + username + "</b> welcome to Home Appliances...");
    String items[] = req.getParameterValues("homeapp");
    out.println("<html><body bgcolor=yellow>");
    out.println("<br>");
    out.println("No of Items Selected: " + items.length);
    out.println("<br>");

    if (items != null) {
      out.println("<center>");
      out.println("<table border=3>");
      out.println("<tr><th>ITEM</th></tr>");
      for (int i = 0; i < items.length; i++) {
        out.println("<tr><td>" + items[i] + "</td></tr>");

        if (items[i].equals("Television")) {
          price1 = 10000;
        }

        if (items[i].equals("Refrigerator")) {
          price2 = 15000;
        }

        if (items[i].equals("Grinder")) {
          price3 = 4500;
        }
        if (items[i].equals("Mixie")) {
          price4 = 2500;
        }
      }
      out.println("</table>");
      out.println("<br>");
      total = price1 + price2 + price3 + price4;
      out.println("Total Price on Home Appliances is: " + total);
    } else {
      out.println("You Didnt Select Anyone");
    }

    out.println("<form name=\ran\" action=\"http://localhost:8080/examples/servlet/bill\">");
    out.println("<center><input type=\"submit\" value=\"Total Bill\"></center></form>");

    out.println("<form name=\ran\" action=\"http://localhost:8080/examples/index.html\">");
    out.println("<center><input type=\"submit\" value=\"Index\"></center></form>");

    out.println("<form name=\ran\" action=\"http://localhost:8080/examples/homeapp.html\">");
    out.println("<center><input type=\"submit\" value=\"Back\"></center></form>");

    out.println("</center></body></html>");

    String total1 = total + "";
    session.setAttribute("homebill", total1);

  }
}