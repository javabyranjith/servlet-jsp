<html>
<body>
<%! int counter=0;
public void jspInit(){
counter++;
System.out.println("Counter printed in jspInit() method: "+counter);
}
%>
<%
int a=10;
int b=30;
int c=20;
out.println("Sum is: "+(a+b+c));
out.println("<br>Counter incremented in init() method from 0 to "+counter);
%>
</body>
</html>