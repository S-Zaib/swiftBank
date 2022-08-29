package businessLayer;
import java.util.ArrayList;
import java.util.Random;

public class Customer {
String customer_name;
String address;
String phone_number;
int customer_id;
int password;
//ArrayList<Account>accounts;

Account acc;
public Customer() {
	this.customer_name = "";
	this.address = "";
	this.phone_number = "";
	
}


public String getCustomer_name() {
	return customer_name;
}


public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getPhone_number() {
	return phone_number;
}


public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}


public int getCustomer_id() {
	return customer_id;
}


public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}


public int getPassword() {
	return password;
}


public void setPassword(int password) {
	this.password = password;
}


public Account getAcc() {
	return acc;
}


public void setAcc(Account acc) {
	this.acc = acc;
}



public Customer(String customer_name, String address, String phone_number,Account acc) {
	Random rand = new Random();
	Random r=new Random();
	
	this. customer_id = rand.nextInt(1000); 
	this.password=r.nextInt(700);
	this.customer_name = customer_name;
	this.address = address;
	this.phone_number = phone_number;
	this.acc=acc;
	

}
 


public void printList(ArrayList<Customer> customerlist){
    for(Customer c : customerlist){
        System.out.println("Name: "+c.customer_name+"  Address:"+c.address+"  Phone:"+c.phone_number+" ID:"+c.customer_id+" Password:"+c.password);
    }
}




}
