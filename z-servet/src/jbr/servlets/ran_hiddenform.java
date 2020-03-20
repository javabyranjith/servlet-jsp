package jbr.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ran_hiddenform extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

	out.println("<html><body bgcolor=\"#f3e244\">");

String[] items=req.getParameterValues("items");
out.println("The following items available for shopping <br>");

	if(items==null){
	out.println("None");
	}
	else{
	out.println("<ul>");
	for(int i=0;i<items.length;i++){
	out.println("<li>"+items[i]);
	}
	out.println("</ul>");
	}	
	
	out.println("<form>");
	
	if(items!=null){
	for(int i=0;i<items.length;i++){
	out.println("<input type=hidden name=items value=\""+items[i]+"\">");
	}
	}
	
out.println("Accessory <br>");
out.println("<select name=\"items\" size=1>");
out.println("<option value=\"Keyboard\">Keyboard");
out.println("<option value=\"Mouse\">Mouse");
out.println("<option value=\"CPUpu\">CPU");
out.println("<option value=\"Monitor\">Monitor");
out.println("<option value=\"Motherboard\">Motherboard");
out.println("</select>");
out.println("<input type=submit>");
out.println("</form>");
out.println("</body></html>");

}

}