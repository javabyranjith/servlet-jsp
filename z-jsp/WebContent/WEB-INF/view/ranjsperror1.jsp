<%--Error Page--%>

<%@ page errorPage="jsperrorpage.jsp"%>
<html>
<body><form method="get">
Enter 1st No: <input type="text" name="no1">
Enter 2nd No: <input type="text" name="no2">
<input type=submit value="Add">
</form>

<%!
String no1,no2;
int a,b;
%>
<%
no1=request.getParameter("no1");
no2=request.getParameter("no2");
if(no1!=null){
a=Integer.parseInt(no1);
}

if(no2!=null){
b=Integer.parseInt(no2);
}
	b=a+b;
	out.println("Sum is: "+b);
%>
</body>
</html>