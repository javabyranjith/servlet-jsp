package jbr.servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmpHome extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    Connection con = null;
    String basic = null;
    String name = null;

    out.println("<html><body bgcolor=palegreen><center>");
    out.println("<h2>Welcome to Comet Emp Salary Details</h2>");

    String str1 = req.getParameter("eno");

    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    } catch (ClassNotFoundException e1) {
      e1.printStackTrace();
    }

    try {
      con = DriverManager.getConnection("jdbc:odbc:ran1", "scott", "tiger");
      String query = "select ename,basicpay from ranemp where eno='" + str1 + "'";
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        name = rs.getString(1);
        basic = rs.getString(2);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    String bas = "" + basic;
    req.setAttribute("basicpay", bas);

    RequestDispatcher da = getServletContext().getRequestDispatcher("/servlet/empda");
    da.include(req, res);

    RequestDispatcher hra = getServletContext().getRequestDispatcher("/servlet/emphra");
    hra.include(req, res);

    RequestDispatcher convey = getServletContext().getRequestDispatcher("/servlet/empconveyance");
    convey.include(req, res);

    double basic1 = Double.parseDouble(basic);

    String newda = (String) req.getAttribute("da");
    double newda1 = Double.parseDouble(newda);

    String newhra = (String) req.getAttribute("hra");
    double newhra1 = Double.parseDouble(newhra);

    String newconvey = (String) req.getAttribute("convey");
    double newconvey1 = Double.parseDouble(newconvey);

    double total = (basic1 + newconvey1 + newhra1 + newda1);
    out.println("<H3>");
    out.println("<table border=2 cellpadding=5> ");
    out.println("<tr>");
    out.println("<td>Employee No</td>" + "<td>" + str1 + "</td>");
    out.println("</tr>");
    out.println("<tr>");
    out.println("<td>EName</td>" + "<td>" + name + "</td>");
    out.println("</tr>");
    out.println("<tr>");
    out.println("<td>Basic Pay Rs.</td>" + "<td>" + basic + "</td>");
    out.println("</tr>");
    out.println("<tr>");
    out.println("<td>HRA Rs.</td>" + "<td>" + newhra1 + "</td>");
    out.println("</tr>");
    out.println("<tr>");
    out.println("<td>Da Rs.</td>" + "<td>" + newda1 + "</td>");
    out.println("</tr>");
    out.println("<tr>");
    out.println("<td>Total Pay Rs.</td>" + "<td><b>" + total + "</b></td>");
    out.println("</tr>");
    out.println("</table>");
    out.println("</H3>");

    out.println("<form name=\ran\" action=\"http://localhost:8080/examples/cometsw.html\">");
    out.println("<center><input type=\"submit\" value=\"Home\"></center></form>");

    out.println("<form name=\ran\" action=\"http://localhost:8080/examples/ranemp.html\">");
    out.println("<center><input type=\"submit\" value=\"Back\"></center></form>");

    out.println("</center></body></html>");
  }

}