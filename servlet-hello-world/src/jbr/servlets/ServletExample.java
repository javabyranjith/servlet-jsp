package jbr.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet {

  @Override
  public void init() throws ServletException {
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    PrintWriter out = resp.getWriter();

    out.println("Context Path: " + req.getContextPath());
    out.println("</br>Port: " + req.getLocalPort());
    out.println("</br>Server Name: " + req.getServerName());
    out.println("</br>Query String: " + req.getQueryString());

    Enumeration<String> enums = req.getHeaderNames();

    out.println("</br> Header Information");
    while (enums.hasMoreElements()) {
      out.println("</br> " + enums.nextElement());
    }
  }
}
