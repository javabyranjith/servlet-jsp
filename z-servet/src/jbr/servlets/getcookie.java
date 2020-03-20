package jbr.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class getcookie extends HttpServlet{

PrintWriter out=null;
public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
doPost(req,res);
}
public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{

out=res.getWriter();
String username=null;
//retrive the cookie.
Cookie ck[]=req.getCookies();

if(ck!=null){
for(int i=0;i<ck.length;i++){
	if(ck[i].getName().equals("user"))	
	username=ck[i].getValue();
}
out.println("Hai "+username);
}else{
out.println("Cookies Not Found");
}

}

}