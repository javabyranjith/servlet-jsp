package jbr.servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Accessory extends HttpServlet {

  Statement st = null;
  Connection con = null;
  String netval = null;

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String str1 = req.getParameter("accessory");
    String str2 = req.getParameter("quantity");

    out.println("<html><body bgcolor=yellow>");
    out.println("<H2><center>Welcome to Ranji's Computer Peripherals</center></H2>");

    out.println("<center><h3>Your Selected Item is: " + str1 + "</h3>");
    out.println("<center><h3>Your Quantity is: " + str2 + "</h3>");

    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try {
      con = DriverManager.getConnection("jdbc:odbc:ran1", "scott", "tiger");
      String query = "select rate from accessory where item='" + str1 + "'";
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        String str3 = rs.getString(1);
        out.println("<h3>Unit Rate is: " + str3 + "</h3>");

        int a = Integer.parseInt(str2);
        int b = Integer.parseInt(str3);

        int c = a * b;
        netval = "" + c;
        out.println("<h3>Nett Amount is: " + c + "</h3>");
        out.println("</center></body></html>");

      }

    } catch (Exception e1) {
      out.println(e1.toString());
    }

    req.setAttribute("netvalue", netval);
    ServletContext sc = this.getServletContext();
    RequestDispatcher discount = sc.getRequestDispatcher("/servlet/discount");
    discount.include(req, res);

    ServletContext sc1 = this.getServletContext();
    RequestDispatcher courier = sc1.getRequestDispatcher("/servlet/courier");
    courier.include(req, res);

  }

}