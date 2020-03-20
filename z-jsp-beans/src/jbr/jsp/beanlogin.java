package jbr.jsp;
import java.sql.*;
import conpack.packlogin.*;

public class beanlogin{

String user="";
String pass="";
String query;
ResultSet rs;

conpack.packlogin bl;

beanlogin(){
bl=new conpack.packlogin();
System.out.println("Object Created");
}

public String setUser(String user){
this.user=user;
}

public String setPass(String pass){
this.pass=pass;
}

public String getUser(){
return this.user;
}

public String getPass(){
return this.pass;
}


public boolean isUserValid(){
query="select * from ranlogin";
rs=st.executeQuery(query);
while(rs.next()){
	String user1=rs.getString("username")
	if(user1.equals("user")){	
	return uservalid;
	}else{
	return invalid;
	}

}
}

public boolean isPassValid(){
query="Select * from ranlogin";
rs=st.executeQuery(query);
while(rs.next()){
	if((rs.getString("pass").equals("password")){
	return passValid;
	}else{
	return invalid;
	}

}
}

public boolean isValid(){
query="select username,password from ranlogin";
rs=st.executeQuery(query);
while(rs.next(){
	if(((rs.getString("user").equals("username")))&&(((rs.getString("pass").equals("password"))){
	return valid;
	}else{
	return invalid;
	}
}

}


}