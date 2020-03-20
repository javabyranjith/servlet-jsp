package jbr.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cometsw extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    PrintWriter out = res.getWriter();
    res.setContentType("text/html");

    String str = req.getParameter("rb1");

    if (str.equals("proj")) res.sendRedirect("http://localhost:8080/examples/projects.html");
    if (str.equals("team")) res.sendRedirect("http://localhost:8080/examples/employees.html");
    if (str.equals("sal")) res.sendRedirect("http://localhost:8080/examples/ranemp.html");
    if (str.equals("newuser")) res.sendRedirect("http://localhost:8080/examples/newuser.html");

  }

}