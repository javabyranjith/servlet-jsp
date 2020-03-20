package jbr.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ServletEventListener implements ServletContextListener,ServletContextAttributeListener,ServletRequestListener{

ServletContext ctx;
String name;
String value;

public void contextInitialized(ServletContextEvent ce){
ctx=ce.getServletContext();
ctx.log("context has been initialized at "+new Date());
}

public void contextDestroyed(ServletContextEvent ce){
ctx.log("Context has been destroyed at: "+new Date());
}

public void attributeAdded(ServletContextAttributeEvent srae){
name=srae.getName();
value=(String)srae.getValue();
ctx.log("An attribute with name: "+name+" and value: "+value +" has been added to the context at: "+new Date());
}

public void attributeRemoved(ServletContextAttributeEvent srae){
ctx.log("Attribute with name: "+name+ " and value: "+value+ " has been removed from the context at: "+new Date());
}

public void attributeReplaced(ServletContextAttributeEvent srae){
ctx.log("Attribute with name: "+name+ " and value: "+value+ " has been replaced context at: "+new Date());
}

public void requestInitialized(ServletRequestEvent e){
ctx.log("A request has been initialized at: "+new Date());
}

public void requestDestroyed(ServletRequestEvent e){
ctx.log("A request has been destroyed at: "+new Date());
}

}