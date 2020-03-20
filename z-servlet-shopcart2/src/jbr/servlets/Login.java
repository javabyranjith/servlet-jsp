package jbr.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {

  String user = null;
  HttpSession session = null;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    session = req.getSession(true);
    // out.println("Session ID: "+session.getId());

    String username = req.getParameter("user");
    String password = req.getParameter("pass");
    System.out.println(username);

    session.setAttribute("user", username);

    if ((username.equals("ranjith")) && (password.equals("ranji"))) {
      getServletContext().getRequestDispatcher("/ranshopitems.html").forward(req, res);
    }
    if ((username.equals("varnan")) && (password.equals("comet"))) {
      getServletContext().getRequestDispatcher("/ranshopitems.html").forward(req, res);
    }

  }
}