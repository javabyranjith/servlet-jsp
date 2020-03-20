package jbr.jsp;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class mycustag extends TagSupport{
public int doEndTag() throws JspException{

JspWriter out=pageContext.getOut();
	try{
	out.println("This is my custom tag");
	}catch(Exception e){
	e.printStackTrace();
	}
return super.doEndTag();
}

}