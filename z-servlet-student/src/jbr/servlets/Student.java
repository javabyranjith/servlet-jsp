package jbr.servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Student extends HttpServlet {

  static int i;
  Connection con;
  Statement st;
  ResultSet rs;
  PrintWriter out;

  public void init() {

    i = 0;
    con = null;
    st = null;
    rs = null;
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    i++;
    out = res.getWriter();
    out.println("<center><h2> Welcome to Student's Details </h2></center>");
    out.println("<h4> U R user No: " + i + " of this page </h4>");

    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con = DriverManager.getConnection("jdbc:odbc:ran1", "scott", "tiger");

      PreparedStatement pstmt = null;
      String query = null;

      query = "select sname,branch,year from ranjith where sno=?";
      pstmt = con.prepareStatement(query);

      pstmt.setInt(1, Integer.parseInt(req.getParameter("sno")));
      rs = pstmt.executeQuery();

      out.println("<center><b> Student Details </b></center>");

      ResultSetMetaData rsmd = rs.getMetaData();
      int colcount = rsmd.getColumnCount();

      out.println("<table align=center border=1>");

      out.println("<TR>");
      for (int i = 1; i <= colcount; i++) {
        out.println("<TH>" + rsmd.getColumnLabel(i) + "</th>");
      }
      out.println("</tr>");

      while (rs.next()) {
        out.println("<tr>");
        out.println("<TD>" + rs.getString("sname") + "</td>");
        out.println("<TD>" + rs.getString("branch") + "</td>");
        out.println("<TD>" + rs.getString("year") + "</td>");
      }
      out.println("</table>");
      out.println("</body>");
    } catch (Exception e) {
      out.println(e.toString());
    }

  }

  public void destroy() {
    try {
      i = 0;
      con.close();
      st.close();
      rs.close();
    } catch (Exception e1) {
      out.println(e1.toString());
    }
  }
}