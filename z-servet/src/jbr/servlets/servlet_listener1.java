package jbr.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;

public class servlet_listener1 implements ServletContextListener, ServletContextAttributeListener{
	
	ServletContext contx;
	String name;
	String value;

	public void contextInitialized(ServletContextEvent ce){
	contx=ce.getServletContext();
	contx.log("Context has been initialized at: "+new Date());
	}

	public void contextDestroyed(ServletContextEvent ce){
	contx.log("Context has been Destroyed at: "+new Date());
	}
	
	public void attributeAdded(ServletContextAttributeEvent scae){
	name=(String)scae.getName();
	value=(String)scae.getValue();
	contx.log("An Attribute with Name: "+name+"and value: "+value+" added to the context at: "+new Date());
	}
	
	public void attributeReplaced(ServletContextAttributeEvent scae){
	contx.log("An Attribute with Name: "+name+"and value: "+value+" replaced on the context at: "+new Date());
	}

	public void attributeRemoved(ServletContextAttributeEvent scae){
	contx.log("An Attribute with Name: "+name+"and value: "+value+" Removed from the context at: "+new Date());
	}
	
	/*public void requstInitialized(ServletRequestEvent e){
	contx.log("A request has been initialized at : "+new Date());
	}

	public void requstDestroyed(ServletRequestEvent e){
	contx.log("A request has been Destroyed at : "+new Date());
	}*/

}