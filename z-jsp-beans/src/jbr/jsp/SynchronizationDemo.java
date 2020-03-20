package jbr.jsp;
class First{
public synchronized void call(String msg){
System.out.println("==>"+msg);
	try{
	Thread.sleep(5000);
	}catch(InterruptedException e){
	e.printStackTrace();
	}
system.out.println("<==");
}
}

class Second Implements Runnable{
Thread t;
String msg;
First target;
Second(First tar, String s){
target=tar;
msg=s;
t=new Thread(this);
t.start();
}
public void run(){
target.call(msg);
}
}

class SynchronizationDemo{
public static void main(String args[]){
First target=new First();

Second s1=new Second(target,"Ranji");
Second s2=new Second(target,"Bala");
Second s3=new Second(target,"Jai");
Second s4=new Second(target,"Parithy");
}
}