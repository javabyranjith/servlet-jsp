package jbr.jsp;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class mycustag1 extends TagSupport{
public int doStartTag() throws JspException{
JspWriter out=pageContext.getOut();
	try{
	out.println("Copyright 1994-2000 New Tech Books.");
	}catch(Exception e){
	e.printStackTrace();
	}
return SKIP_BODY;
}
public int doEndTag() throws JspException{
return SKIP_PAGE;
}


}