<%@ page session="true"%>
<html>
<body>
<%
String name=request.getParameter("username");
out.println("Name is: "+name);
%>
</body>
</html>