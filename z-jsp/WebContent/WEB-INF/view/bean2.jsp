<%@ page import="java.util.*" %>
<%@ page import="ranbean.bean1" %>
<html><head><title>Jsp and Java Bean</title></head>
<jsp:useBean id="FA" scope="application" class="ranbean.bean1"/>
<jsp:setProperty name="FA" property=""/>

<body>

<%
	Vector v=(Vector)FA.getResult();
	Enumeration e=v.elements();
	while(e.hasMoreElements()){
	out.println("Author Name "+e.nextElement());
%>
	<br>
<%
	out.println("Address: "+e.nextElement());
%>
	<br>
<%
	out.println("City: "+e.nextElement());
%>
	<br>
<%
	out.println("State: "+e.nextElement());
%>
	<br>
<%
	out.println("Zip: "+e.nextElement());

	}
%>	
</body></html