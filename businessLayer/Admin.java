package businessLayer;

import dataLayer.DBHandler;

public class Admin {
String username="SZaib";
String password="123";
DBHandler d=new DBHandler();
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

String Login(String user,String pass) {
	//  System.out.println(""+user);
   //   System.out.println(""+pass);
	if(user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)) {
		//d.saveRecord1(user, pass);
		System.out.println("matched");
		return password;
	}
	
	else {
		System.out.println("didnt match");
		return null;
	}
	
}
}
