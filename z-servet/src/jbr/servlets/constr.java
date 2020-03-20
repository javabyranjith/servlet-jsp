package jbr.servlets;
//test for constructor

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class constr extends GenericServlet{

public void init(ServletConfig c) throws ServletException{
System.out.println("This is Init() Method");
}

//out.println("This is constructor program");
public constr(){
System.out.println("This is Constructor which is called before Init()");
}

public void service(ServletRequest req, ServletResponse res)throws IOException{
System.out.println("This is service() Method");
}
}