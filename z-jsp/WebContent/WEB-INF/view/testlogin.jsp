<%@ page errorPage="loginerror.jsp"%>
<html><body>
<form method="get" >
UserName: <input type="text" name="user">
Password: <input type="text" name="pass">
<input type=submit>
</form>

<%!
String user1, pass1;
%>

<%
if(request.getParameter("user")!=null && request.getParameter("pass")!=null){
user1=request.getParameter("user");
pass1=request.getParameter("pass");
int a=Integer.parseInt(pass1);
	
	if(user1.equals("ranji") && pass1.equals("comet")){
	out.println("success");
	}else{
	out.println("Unsuccesful");
	}
}
%>
</body></html>