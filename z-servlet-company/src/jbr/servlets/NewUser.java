package jbr.servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewUser extends HttpServlet {

  public void init(ServletConfig cfig) throws ServletException {
    super.init(cfig);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    Connection con = null;
    Statement st = null;

    out.println("<html><body bgcolor=yellow>");

    String eno = req.getParameter("eno");
    int eno1 = Integer.parseInt(eno);

    String ename = req.getParameter("ename");

    String age = req.getParameter("age");
    int age1 = Integer.parseInt(age);

    String dob = req.getParameter("dob");
    String doj = req.getParameter("doj");
    String addr = req.getParameter("addr");

    String mob = req.getParameter("mob");
    int mob1 = Integer.parseInt(mob);

    String email = req.getParameter("email");

    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    } catch (ClassNotFoundException e1) {
      e1.printStackTrace();
    }

    try {
      con = DriverManager.getConnection("jdbc:odbc:ran1", "scott", "tiger");
      con.setAutoCommit(true);

      String sql = "insert into newuser2 values(?,?,?,?,?,?,?,?)";
      PreparedStatement pst = con.prepareStatement(sql);

      pst.setInt(1, eno1);
      pst.setString(2, ename);
      pst.setInt(3, age1);
      pst.setObject(4, dob);
      pst.setObject(5, doj);
      pst.setString(6, addr);
      pst.setInt(7, mob1);
      pst.setString(8, email);

      int changes = pst.executeUpdate();

      out.println("<center><h3><b> User is Added Successfully</b></h3></center>");

      out.println("<form name=\ran\" action=\"http://localhost:8080/examples/cometsw.html\">");
      out.println("<center><input type=\"submit\" value=\"Home\"></center></form>");

      out.println("<form name=\ran\" action=\"http://localhost:8080/examples/newuser.html\">");
      out.println("<center><input type=\"submit\" value=\"Back\"></center></form>");

      out.println("</body></html>");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}