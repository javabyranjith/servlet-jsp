package jbr.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Products extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    HttpSession session = null;
    session = req.getSession(true);

    out.println("Session ID: " + session.getId());
    out.println("<br>");

    String username = (String) session.getAttribute("user");
    out.println("User Name is: " + username);

    String items[] = req.getParameterValues("cb1");
    out.println("<html><head><title>Shopping Cart</title></head><body bgcolor=palegreen>");

    if (items != null) {
      out.println("<center>");
      out.println(" UR Selected " + items.length + " Items Are: ");
      out.println("<ul>");
      for (int i = 0; i < items.length; i++) {
        out.println("<li>" + items[i]);
      }
      out.println("</ul>");
    } else {
      out.println("You Didnt Select Anyone");
    }
    out.println("</center>");
    out.println("</body></html>");

  }

}