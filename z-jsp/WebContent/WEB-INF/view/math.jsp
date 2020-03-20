<%
String st1=request.getParameter("no1");
int num1=Integer.parseInt(st1);
String st2=request.getParameter("no2");
int num2=Integer.parseInt(st2);

String option=request.getParameter("r1");

if(option.equals("add")){
out.println("Addition is selected <br>");
int add=num1+num2;
out.println("Added value is: "+add);
}

if(option.equals("sub")){
out.println("Subtraction is selected <br>");
int sub=num1-num2;
out.println("Subtrated Value is: "+sub);
}

if(option.equals("mul")){
out.println("Multiplication is selected <br>");
int mul=num1*num2;
out.println("Multiplied Values is: "+mul);
}

if(option.equals("div")){
out.println("Division is selected <br>");
int div=num1/num2;
out.println("Division value is: "+div);
}
%>
