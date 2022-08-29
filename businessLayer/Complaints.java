package businessLayer;

import java.util.ArrayList;

import dataLayer.DBHandler;

public class Complaints {
private String name;
private String email;
private String message;
private String suggestion;
public Complaints(String name, String email, String message, String suggestion) {
	this.name = name;
	this.email = email;
	this.message = message;
	this.suggestion = suggestion;
}
public Complaints() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getSuggestion() {
	return suggestion;
}
public void setSuggestion(String suggestion) {
	this.suggestion = suggestion;
}

boolean Complaint(String a, String b,String c, String d) {
	
	Complaints cp = new Complaints(a,b,c,d);
	Account.Complaintss.add(cp);
	DBHandler p = new DBHandler();

		p.SaveComplaints(a, b, c, d); 
	printList(Account.Complaintss);

		return true;
		
	
}
public void printList(ArrayList<Complaints> Complaintss){
    for(Complaints o : Account.Complaintss){
    	
    }
}
}
