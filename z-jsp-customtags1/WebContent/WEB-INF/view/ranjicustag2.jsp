<%@ taglib uri="tldxml2.tld" prefix="first"%>
<html>
<head>Customized Tag</head>
<body>
<%
String str=request.getParameter("r1");
	if(str.compareTo("G")==0){
%>
	<first:ranjith2 color="LIGHTGREEN">
	<%=request.getParameter("uname")%>
	</first:ranjith2>
<%
	}if(str.compareTo("R")==0){
%>
	<first:ranjith2 color="RED">
	<%=request.getParameter("uname")%>
	</first:ranjith2>
<%
	}if(str.compareTo("B")==0){
%>
	<first:ranjith2 color="BLUE">
	<%=request.getParameter("uname")%>
	</first:ranjith2>
<%
	}if(str.compareTo("Y")==0){
%>
	<first:ranjith2 color="YELLOW">
	<%=request.getParameter("uname")%>
	</first:ranjith2>

<%
	}
%>
</body>
</html>