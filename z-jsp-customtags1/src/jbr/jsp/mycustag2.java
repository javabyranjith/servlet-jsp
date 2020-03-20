package jbr.jsp;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.GregorianCalendar;

public class mycustag2 extends BodyTagSupport{
private String name;
private PageContext pageContext;
private Tag parent;
String color;
public mycustag2(){
	super();
}

public void setName(String name){
this.name=name;
}

public void setColor(String color){
this.color=color;
}

public int doAfterBody() throws JspException{
	try{
	BodyContent bc=getBodyContent();
	String body=bc.getString();
	JspWriter out=bc.getEnclosingWriter();
	String dt;
	GregorianCalendar now=new GregorianCalendar();
	dt=now.getTime().toString();
	String dt1=dt.substring(11,16);
	out.println("<body bgcolor="+color+">");
	if(body!=null)
	out.println("Hi! "+body);
	if(dt1.compareTo("12.00")<0)
	out.println("Good Morning");
	if(dt1.compareTo("12.00")>0)
	out.println("Good Evening");
	out.println("Current Time is: "+dt1);
	}catch(IOException ioe){
	ioe.printStackTrace();
	}
return SKIP_BODY;
}
}
