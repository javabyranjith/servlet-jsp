<jsp:useBean id="add" class="ranbean.testbean"/>


<html>
<body>
<form method="get" action="testbean.jsp">
Enter No1: <input type="text" name="no1">
Enter No2: <input type="text" name="no2">
<input type=submit>
</body>
</htm>

<%
String no1=request.getParameter("no1");
String no2=request.getParameter("no2");
%>
