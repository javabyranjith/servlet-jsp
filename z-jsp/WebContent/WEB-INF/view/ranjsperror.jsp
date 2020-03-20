<%--Error Page--%>

<%@ page errorPage="jsperrorpage.jsp"%>
<html>
<body><form method="get">
Enter 1st No: <input type="text" name="no1">
Enter 2nd No: <input type="text" name="no2">
<input type=submit value="Add">
</form>

<%!
int a,b;
%>

<%
if(request.getParameter("no1")!=null){
a=Integer.parseInt(request.getParameter("no1"));
}

if(request.getParameter("no2")!=null){
b=Integer.parseInt(request.getParameter("no2"));
}
	b=a+b;
	out.println("Sum is: "+b);
%>
</body>
</html>