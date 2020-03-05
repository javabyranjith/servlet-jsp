package jbr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegistration extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    this.doPost(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Connection connection;
    PreparedStatement ps;
    resp.setContentType("text/html;charset=UTF-8");
    PrintWriter out = resp.getWriter();

    try {
      // get request parameters
      String name = req.getParameter("name");
      String address = req.getParameter("address");
      String email = req.getParameter("email");
      String username = req.getParameter("username");
      String password = req.getParameter("password");

      // load driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");

      // create connection
      connection = DriverManager.getConnection("jdbc:derby://localhost:1527/servlets", "ranjith", "sekar");

      // insert
      ps = connection.prepareStatement("insert into users values(?,?,?,?,?)");

      ps.setString(1, name);
      ps.setString(2, address);
      ps.setString(3, email);
      ps.setString(4, username);
      ps.setString(5, password);

      int i = ps.executeUpdate();

      if (i > 0) {
        out.println("You are sucessfully registered");
      }
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
