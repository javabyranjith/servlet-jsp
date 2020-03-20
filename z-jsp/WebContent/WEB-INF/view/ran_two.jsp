<html>
<body>
<h3>My Second JSP Program</h3>
<%! int a=10, b=20;%>

The Sum is:<%=a+b%><br>

The Mul is:<%=a*b%><br>
The Divison is:<%=a/b%>
<br>
<% 
for(int i=0;i<10;i++){
out.println(i);
%>
<hr width=50 align=left color=blue>
<%
}
%>
</body>
</html>
