package businessLayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import dataLayer.DBHandler;

public class Payment {
private int payment_id;
private String  type;
private String  company;
private String  account;
private int  amount;
private String  consumernumber;
public Payment( String type, String company, String account, int amount, String consumernumber) {
	 Random r=new Random();
	this.payment_id = r.nextInt(1000);
	this.type = type;
	this.company = company;
	this.account = account;
	this.amount = amount;
	this.consumernumber = consumernumber;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public String getConsumernumber() {
	return consumernumber;
}

public void setConsumernumber(String consumernumber) {
	this.consumernumber = consumernumber;
}

public Payment() {
	
}
DBHandler p = new DBHandler();

public void makePayment(String accountnumber ) {
	Bank.accounts=p.readAccountsRecord();
	boolean flag=false;
	for(Account a:Bank.accounts) {
		if(accountnumber.equals(a.acc_number)) {
		     a.balance=a.balance-1000;
				System.out.println("Payment made");

			flag=true;
			
			
		}
	}if(flag==false) {
		System.out.println("Payment not made");
		
	}
}
public void makePayment1(String accountnumber , int amount) {
	Bank.accounts=p.readAccountsRecord();
	boolean flag=false;
	for(Account a:Bank.accounts) {
		if(accountnumber.equals(a.acc_number)) {
		     a.balance=a.balance-amount;
				System.out.println("Payment made");

			flag=true;
			
			
		}
	}if(flag==false) {
		System.out.println("Payment not made");
		
	}
}
public void makePayment2(String accountnumber , int salary) {
	Bank.accounts=p.readAccountsRecord();
	boolean flag=false;
	for(Account a:Bank.accounts) {
		if(accountnumber.equals(a.acc_number)) {
		     a.balance=a.balance+salary;
				System.out.println("Payment made");

			flag=true;
			
			
		}
	}if(flag==false) {
		System.out.println("Payment not made");
		
	}
}
public int getPayment_id() {
	return payment_id;
}
public void setPayment_id(int payment_id) {
	this.payment_id = payment_id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}


boolean Pay(String Type, String comp,String account, int c, String b) {
	
	
	Payment p1 = new Payment(Type, comp, account,c,b);
	Account.payments.add(p1);
	DBHandler p = new DBHandler();

	p.SavePayment(p1.type, p1.company, p1.amount, p1.consumernumber, p1.payment_id); 
	printList(Account.payments);
	
	
	
		makePayment1(p1.account, p1.amount);
	
	
   
 for(Account a1:Bank.accounts) {
 		if(account.equals(a1.acc_number)) {
 			//System.out.println("chlo chlo imran");
p.Update(account, a1.balance);

}}
	
		
		return true;
		
	
}
public void printList(ArrayList<Payment> payments){
    for(Payment o : Account.payments){
    	System.out.println(" Investment number: "+o.getPayment_id()+" Investment: "+o.getType()+" Accnum: "+o.getAccount()+" ");
    }
}
}
