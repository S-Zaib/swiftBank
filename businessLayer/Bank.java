package businessLayer;
import java.time.LocalDate;
import java.util.*; 

import java.util.ArrayList;


public class Bank {
static ArrayList<Customer>customerlist = new ArrayList<Customer>();
public static ArrayList<Account>accounts = new ArrayList<Account>();
public static ArrayList<Loan>loans = new ArrayList<Loan>();
//Account acc=new Account("Saving",1000);
//Account acc2=new Account("Saving",5000);

public static void main(String args[])
{ /* boolean flag=true;
	while(flag) {
	System.out.println("Press 1 to Login");
	System.out.println("Press 2 to Login");
	System.out.println("Press 3 to Login");
	System.out.println("Press 4 to Login");
	System.out.println("Press 5 to Login");
	System.out.println("Press 6 to Login");
	System.out.println("Press 7 to Login");
	System.out.println("Press 0 to Exit");
	
	
	
	
	}
	*/
	//Account acc=new Account("Saving",1000);
	//Account acc2=new Account("Saving",5000);
	
/*
	
	System.out.println("name add phone");
	String name = "Ahmad";
	String add = "Satellite" ;
	String ph = "1234";
	
Customer cust=new Customer(name,add,ph,acc);
System.out.println("Your id is:"+cust.customer_id);
System.out.println("Your password is:"+cust.password);
customerlist.add(cust);
System.out.println(acc.acc_number);
System.out.println(acc2.acc_number);

accounts.add(acc);
accounts.add(acc2);

//cust.acc.printAccount();
//LocalDate date= LocalDate.parse("2018-11-13");
//acc.order(date,"CreditCard");
//acc.o.printorder();

//cust.accounts.add(acc);
//String name2 = "Sabeena";
//String add2 = "Satellite2" ;
//String ph2 = "1234567";
/*Customer cust2=new Customer(name2,add2,ph2);
System.out.println("Your id is:"+cust2.customer_id);
System.out.println("Your password is:"+cust2.password);
customerlist.add(cust2);*/
Customer customer=new Customer();
customer.printList(customerlist);
Account account=new Account();
account.printList(accounts);
//acc.printAccountsList(cust.accounts);
}

}
