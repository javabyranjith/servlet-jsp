<html>
<body>
<%! 
String location="Melsevalambadi";
String name="Ranjith";
%>

<%
//Scriplet starts
for(int i=0;i<5;i++){%>
Welcome to Ranjith page
<br>
<%}
//scriplet ends
%>	
<br>
<jsp:include page="includeparam1.jsp">
<jsp:param name="location" value="<%=location%>"/>
</jsp:include>
<br>
<jsp:include page="includeparam2.jsp">
<jsp:param name="name" value="<%=name%>"/>
</jsp:include>
</body>
</html>