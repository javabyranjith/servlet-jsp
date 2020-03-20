package jbr.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Bill extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    HttpSession session = req.getSession(true);

    int a = 0;
    int b = 0;
    int c = 0;
    int d;

    String username = (String) session.getAttribute("user");

    String compbill = (String) session.getAttribute("compbill");
    if (compbill != null) {
      a = Integer.parseInt(compbill);
    } else {
      a = 0;
    }

    String homebill = (String) session.getAttribute("homebill");
    if (homebill != null) {
      b = Integer.parseInt(homebill);
    } else {
      b = 0;
    }

    String sportbill = (String) session.getAttribute("sportbill");
    if (sportbill != null) {
      c = Integer.parseInt(sportbill);
    } else {
      c = 0;
    }

    d = a + b + c;
    out.println("<center>Hi! " + username + " ." + "Your Total Bill is: Rs. <b>" + d + "</b></center>");
    out.println("<form name=\ran\" action=\"http://localhost:8080/examples/index.html\">");
    out.println("<center><input type=\"submit\" value=\"Index\"></center></form>");
  }
}