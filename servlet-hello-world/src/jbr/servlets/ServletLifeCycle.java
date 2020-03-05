package jbr.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {

  static {
    System.out.println("Inside static() block");
  }

  public ServletLifeCycle() {
    System.out.println("Inside Constructor!!");
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("Inside init() method!!");
    System.out.println("Servlet Name: " + config.getServletName());
    System.out.println("Init Param (Email): " + config.getInitParameter("email"));
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Inside doGet() method!!");

    String name = req.getParameter("name");
    PrintWriter out = resp.getWriter();
    out.println("Name is: " + name);
  }

  @Override
  public void destroy() {
    System.out.println("Inside destroy() method!!");
  }

}
