package jbr.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmpDetails extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    PrintWriter out = res.getWriter();
    res.setContentType("text/html");

    try {

      String emp[];
      emp = req.getParameterValues("emp");
      String name1 = emp[0];
      out.println("<html><body bgcolor=yellow>");
      out.println("<marquee><h4><b>Welcome to " + name1 + " Details</b></h4></marquee>");
      out.println("<center><table border=1>");
      out.println("<tr>");
      out.println("<th> Name </th>");
      out.println("<th> Fathers Name </th>");
      out.println("<th> Address </th>");
      out.println("<th> E-mail </th>");
      out.println("<th> Mobile </th>");
      out.println("</tr>");

      out.println("<form name=\ran\" action=\"http://localhost:8080/examples/cometsw.html\">");
      out.println("<input type=\"submit\" value=\"Home\"></center></form>");

      out.println("<form name=\ran\" action=\"http://localhost:8080/examples/cometemp.html\">");
      out.println("<input type=\"submit\" value=\"Back\"></center></form>");

      if (name1.equals("jai")) {
        String name2[] = { "Jayakumar" };
        String faname[] = { "Ranga" };
        String addr[] = { "No.5, Anna Street, Vadapalani" };
        String email[] = { "jaya@cometsoftwares.com" };
        String mobile[] = { "9894569825" };

        for (int i = 0; i < 1; i++) {
          out.println("<tr>");
          out.println("<td>" + name2[i] + "</td>");
          out.println("<td>" + faname[i] + "</td>");
          out.println("<td>" + addr[i] + "</td>");
          out.println("<td>" + email[i] + "</td>");
          out.println("<td>" + mobile[i] + "</td>");
          out.println("</tr>");
        }
      }

      if (name1.equals("pari")) {
        String name2[] = { "Parithy" };
        String faname[] = { "Kumar" };
        String addr[] = { "No.6, Anna Street, Vadapalani" };
        String email[] = { "parithy@cometsoftwares.com" };
        String mobile[] = { "9825669825" };

        for (int i = 0; i < 1; i++) {
          out.println("<tr>");
          out.println("<td>" + name2[i] + "</td>");
          out.println("<td>" + faname[i] + "</td>");
          out.println("<td>" + addr[i] + "</td>");
          out.println("<td>" + email[i] + "</td>");
          out.println("<td>" + mobile[i] + "</td>");
          out.println("</tr>");
        }
      }

      if (name1.equals("ranji")) {
        String name2[] = { "Ranjith" };
        String faname[] = { "Sekar" };
        String addr[] = { "No.5, Nehru Street, Tambaram" };
        String email[] = { "ranjith@cometsoftwares.com" };
        String mobile[] = { "9894587857" };

        for (int i = 0; i < 1; i++) {
          out.println("<tr>");
          out.println("<td>" + name2[i] + "</td>");
          out.println("<td>" + faname[i] + "</td>");
          out.println("<td>" + addr[i] + "</td>");
          out.println("<td>" + email[i] + "</td>");
          out.println("<td>" + mobile[i] + "</td>");
          out.println("</tr>");
        }
      }

      if (name1.equals("bala")) {
        String name2[] = { "Balaguru" };
        String faname[] = { "Narayanan" };
        String addr[] = { "No.5, Anna Street, Vadapalani" };
        String email[] = { "bala@cometsoftwares.com" };
        String mobile[] = { "9994187464" };

        for (int i = 0; i < 1; i++) {
          out.println("<tr>");
          out.println("<td>" + name2[i] + "</td>");
          out.println("<td>" + faname[i] + "</td>");
          out.println("<td>" + addr[i] + "</td>");
          out.println("<td>" + email[i] + "</td>");
          out.println("<td>" + mobile[i] + "</td>");
          out.println("</tr>");
        }
      }

      out.println("</html></body>");
    } catch (Exception e) {

      out.println("Plz Choose Anyone." + e);
    }

  }

}