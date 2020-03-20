package jbr.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Projects extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    PrintWriter out = res.getWriter();
    res.setContentType("text/html");

    try {
      String employees[];
      employees = req.getParameterValues("employees");

      String name = employees[0];
      out.println("<html><body bgcolor=palegreen>");
      out.println("<marquee><h4><b>Welcome to " + name + " Team Members Details</b></h4></marquee>");
      out.println("<center><table border=1>");
      out.println("<tr>");
      out.println("<th> Name </th>");
      out.println("<th> Qualification </th>");
      out.println("<th> College </th>");
      out.println("<th> Passout </th>");
      out.println("</tr>");

      if (name.equals("www.cometsoftwares.com")) {
        String name1[] = { "Jayakumar", "Parithy", "Ranjith", "Srikanth", "Lavanya" };
        String qual[] = { "B.E(IT)", "B.E(ECE)", "B.Tech(IT)", "B.E(MECH)", "B.E(IT)" };
        String college[] = { "Mailam", "Mailam", "Thiruvalluvar", "SRM", "REC" };
        String pass[] = { "2005", "2005", "2005", "2005", "2005" };

        for (int i = 0; i <= 4; i++) {
          out.println("<tr>");
          out.println("<td>" + name1[i] + "</td>");
          out.println("<td>" + qual[i] + "</td>");
          out.println("<td>" + college[i] + "</td>");
          out.println("<td>" + pass[i] + "</td>");
          out.println("</tr>");
        }
      }

      if (name.equals("www.itjobhelp.com")) {
        String name1[] = { "Jayakumar", "Parithy", "Ranjith", "Srikanth", "Lavanya" };
        String qual[] = { "B.E(IT)", "B.E(ECE)", "B.Tech(IT)", "B.E(MECH)", "B.E(IT)" };
        String college[] = { "Mailam", "Mailam", "Thiruvalluvar", "SRM", "REC" };
        String pass[] = { "2005", "2005", "2005", "2005", "2005" };

        for (int i = 0; i <= 4; i++) {
          out.println("<tr>");
          out.println("<td>" + name1[i] + "</td>");
          out.println("<td>" + qual[i] + "</td>");
          out.println("<td>" + college[i] + "</td>");
          out.println("<td>" + pass[i] + "</td>");
          out.println("</tr>");
        }
      }

      if (name.equals("www.chennairentals.com")) {
        String name1[] = { "Ranjith", "Srikanth", "Lavanya" };
        String qual[] = { "B.Tech(IT)", "B.E(MECH)", "B.E(IT)" };
        String college[] = { "Thiruvalluvar", "SRM", "REC" };
        String pass[] = { "2005", "2005", "2005" };

        for (int i = 0; i <= 2; i++) {
          out.println("<tr>");
          out.println("<td>" + name1[i] + "</td>");
          out.println("<td>" + qual[i] + "</td>");
          out.println("<td>" + college[i] + "</td>");
          out.println("<td>" + pass[i] + "</td>");
          out.println("</tr>");
        }
      }

      if (name.equals("www.chennaiproperties.com")) {
        String name1[] = { "Jayakumar", "Parithy" };
        String qual[] = { "B.E(IT)", "B.E(ECE)", };
        String college[] = { "Mailam", "Mailam", };
        String pass[] = { "2005", "2005" };

        for (int i = 0; i <= 1; i++) {
          out.println("<tr>");
          out.println("<td>" + name1[i] + "</td>");
          out.println("<td>" + qual[i] + "</td>");
          out.println("<td>" + college[i] + "</td>");
          out.println("<td>" + pass[i] + "</td>");
          out.println("</tr>");
        }
      }

      out.println("</table></center>");
      out.println("</body></html>");
      out.flush();

    } catch (Exception e) {
      out.println("Plz use HTML page" + e);
    }

    out.println("<html><body>");
    out.println("<form name=\ran\" action=\"http://localhost:8080/examples/cometsw.html\">");
    out.println("<center><input type=\"submit\" value=\"Home\"></center></form>");
    out.println("</html></body>");

  }

}