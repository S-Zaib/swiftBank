package businessLayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import dataLayer.DBHandler;

public class Account {
ChequeBook cheqbook;
CreditCard card;
String acc_type;
int balance;
String acc_number;
String password;
public static ArrayList<Order>orders = new ArrayList<Order>();
public static ArrayList<Investment>investments = new ArrayList<Investment>();
public static ArrayList<Insurance>insurances = new ArrayList<Insurance>();
public static ArrayList<Tax>taxes = new ArrayList<Tax>();
public static ArrayList<Payment>payments = new ArrayList<Payment>();
public static ArrayList<Complaints>Complaintss = new ArrayList<Complaints>();
public static ArrayList<Transaction>transactions = new ArrayList<Transaction>();
public static ArrayList<String>Notifications = new ArrayList<String>();
DBHandler p = new DBHandler();
Order o;

public String getAcc_type() {
	return acc_type;
}
public void setAcc_type(String acc_type) {
	this.acc_type = acc_type;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getAcc_number() {
	return acc_number;
}
public void setAcc_number(String acc_number) {
	this.acc_number = acc_number;
}


public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Account() {
	
	// TODO Auto-generated constructor stub
}
/*
public Account(String acc_type, int balance) {
	String save="SAV";
	String curr="CUR";
	Random ran = new Random();
    Random r=new Random();
	this.password=r.nextInt(700)+"";;
	this.acc_type = acc_type;
	this.balance = balance;
	if(acc_type=="Saving") {
		int num=ran.nextInt(1000);
		this.acc_number=save+num;
		
	}
	else {
		int num=ran.nextInt(1000);
		this.acc_number=curr+num;
		
	}
}*/

public Account(String acc_number, String password ,int balance) {
	String save="SAV";
	String curr="CUR";
	Random ran = new Random();
    Random r=new Random();
	this.password=password;
	//this.acc_type = acc_type;
	this.balance = balance;
	//if(acc_type=="Saving") {
	//	int num=ran.nextInt(1000);
		this.acc_number=acc_number;
		
	//}
	/*else {
		int num=ran.nextInt(1000);
		this.acc_number=curr+num;
		
	}*/
}


boolean Login(String user,String pass) {
	//  System.out.println(""+user);
   //   System.out.println(""+pass);
	
	if(user.equalsIgnoreCase(acc_number) && pass.equals(pass)) {
		//d.saveRecord1(user, pass);
		System.out.println("matched");
		return true;
	}
	
	else {
		System.out.println("didnt match");
		return false;
	}
	
}
public void printAccount(){
    
        System.out.println("Account Number: "+acc_number+"  Balance:"+balance);
    
}

boolean searchAccount(String accnum) {
	boolean flag=false;
	
	for(Account a:Bank.accounts) {
		if(accnum.equals(a.acc_number)) {
			System.out.println("Verified"+a.acc_number);
			flag=true;
			
			
		}
	}if(flag==false) {
		System.out.println("Verification failed");
		
	}return flag;
	
}
boolean TransferAmount(String fromacc,String toacc,int amount) {
	//  System.out.println(""+user);
   //   System.out.println(""+pass);
	
	boolean transfer=false;
	  Bank.accounts=p.readAccountsRecord();
	  printList(Bank.accounts);
	 boolean acc1= searchAccount(fromacc);
	 
	  boolean acc2=searchAccount(toacc);
	  if(acc1&&acc2) {
		  for(Account a:Bank.accounts) {
				if(fromacc.equals(a.acc_number)) {
					if(a.balance>=amount) {
						
					a.balance=a.balance-amount;
					String a1=a.acc_number;
					int bal1=a.balance;
					System.out.println("faizan"+a1+bal1);
					 p.Update(a1, bal1);
					
					transfer=true;}
				}
				if(toacc.equals(a.acc_number)) {
					a.balance=a.balance+amount;
					transfer=true;
					String a2=a.acc_number;
					int bal2=a.balance;
					System.out.println("faizan"+a2+bal2);
					 p.Update(a2, bal2);
				
				}
				
		  }
			
		  System.out.println("Successfuly transferred");
		//p.updateAcount(fromacc, toacc);  
	  } return transfer;
	  
	
}


public Account accountLogin(String user,String pass)
{
Account acc=new Account();
Bank.accounts=p.readAccountsRecord();

	for(Account a:Bank.accounts) {
		if(user.equals(a.acc_number)&&pass.equals(a.password)) {
			System.out.println("Login successful");
			//flag=true;
			acc= a;
			
		}
	}if(acc==null) {
		System.out.println("Login failed");
		
	}return acc;
}
public void printList(ArrayList<Account> accounts){
    for(Account c : accounts){
        System.out.println("Account Number: "+c.acc_number+"  Balance:"+c.balance);
    }
}

	
	
	
//}
/*public void printAccountsList(ArrayList<Account> accounts){
    for(Account a : accounts){
        System.out.println("Account Number: "+a.acc_number+"  Balance:"+a.balance);
    }
}

*/
}
