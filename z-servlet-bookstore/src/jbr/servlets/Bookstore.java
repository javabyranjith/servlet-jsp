package jbr.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Bookstore extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = new PrintWriter(res.getOutputStream());
    String subject[];
    subject = req.getParameterValues("subject");
    String name = subject[0];

    out.println("<html>");
    out.println("<head>");
    out.println("<title>RANJI BOOK STORE</TITLE>");
    out.println("</head>");
    out.println("<h2>Dear Customer! these are the new " + name + " books available." + "</h2>");
    out.println("<center><table border=1>");
    out.println("<tr>");
    out.println("<th>AUTHOR</TH>");
    out.println("<th>BOOKS</th>");
    out.println("<th>PRICE</TH>");
    out.println("</tr>");
    if (name.equals("java")) {
      String author[] = { "Ranjith", "Jayakumar", "Parithy", "Bala" };
      String java[] = { "java-complete reference", "java/applets", "jdbc and java", "rmi and java" };
      String price[] = { "Rs.300", "Rs.500", "Rs.400", "Rs.500" };

      for (int i = 0; i < 4; i++) {
        out.println("<tr>");
        out.println("<td>" + author[i] + "</td>");
        out.println("<td>" + java[i] + "</td>");
        out.println("<td>" + price[i] + "</td>");
        out.println("<tr>");
      }
    }

    if (name.equals("struts")) {
      String author[] = { "Kumar", "Jaya", "Balaji", "Ramu" };
      String java[] = { "Struts-complete reference", "Struts stricks", "Struts Programming", "Struts Examples" };
      String price[] = { "Rs.400", "Rs.200", "Rs.300", "Rs.500" };

      for (int i = 0; i < 4; i++) {
        out.println("<tr>");
        out.println("<td>" + author[i] + "</td>");
        out.println("<td>" + java[i] + "</td>");
        out.println("<td>" + price[i] + "</td>");
        out.println("<tr>");
      }
    }

    if (name.equals("swings")) {
      String author[] = { "Hemu", "Ranjith", "Mahi", "Anand" };
      String java[] = { "Swings-complete reference", "Swings stricks", "Swings Programming", "Swings Examples" };
      String price[] = { "Rs.400", "Rs.200", "Rs.300", "Rs.500" };

      for (int i = 0; i < 4; i++) {
        out.println("<tr>");
        out.println("<td>" + author[i] + "</td>");
        out.println("<td>" + java[i] + "</td>");
        out.println("<td>" + price[i] + "</td>");
        out.println("<tr>");
      }
    }

    if (name.equals("oracle")) {
      String author[] = { "Sams", "Orelly", "Hamilton", "John ray" };
      String java[] = { "Oracle-complete reference", "Oracle stricks", "Oracle Programming", "Oracle Examples" };
      String price[] = { "Rs.400", "Rs.200", "Rs.300", "Rs.500" };

      for (int i = 0; i < 4; i++) {
        out.println("<tr>");
        out.println("<td>" + author[i] + "</td>");
        out.println("<td>" + java[i] + "</td>");
        out.println("<td>" + price[i] + "</td>");
        out.println("<tr>");
      }
    }

    out.println("</table></center>");
    out.println("<marquee> Have a Nice Day </marquee>");
    out.println("</html>");
    out.flush();
  }
}
