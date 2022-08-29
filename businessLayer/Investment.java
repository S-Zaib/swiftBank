package businessLayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import dataLayer.DBHandler;

public class Investment {
private String investment_type;
private String accnumber;
private int investment_number;
private int amount;
Payment pay=new Payment();
public String getAccnumber() {
	return accnumber;
}

public void setAccnumber(String accnumber) {
	this.accnumber = accnumber;
}

public String getInvestment_type() {
	return investment_type;
}

public void setInvestment_type(String investment_type) {
	this.investment_type = investment_type;
}

public int getInvestment_number() {
	return investment_number;
}

public void setInvestment_number(int investment_number) {
	this.investment_number = investment_number;
}



public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}
public Investment() {
	
}

public Investment(String investment_type, String accnumber,int amount) {
	 Random r=new Random();
	this.investment_type = investment_type;
	this.accnumber = accnumber;
	this.investment_number = r.nextInt(1000);
	this.amount=amount;
}

boolean makeInvestment(String investmenttype, String accnum,int amnnt) {
	//  System.out.println(""+user);
   //   System.out.println(""+pass);
	//Bank.accounts=p.readAccountsRecord();
	//boolean flag=false;
	Investment invest=new Investment(investmenttype, accnum, amnnt);

	Account.investments.add(invest);
	DBHandler p = new DBHandler();
   p.SaveInvestment(invest.investment_number, invest.investment_type, invest.amount, invest.accnumber);
		//p.updateAcount(fromacc, toacc);  
	printList(Account.investments);
   pay.makePayment1(invest.accnumber , invest.amount);
 for(Account a:Bank.accounts) {
 		if(accnum.equals(a.acc_number)) {
p.Update(accnum, a.balance);
//	 flag=true;
}}
	//	}
	//	}if(flag==false) {
			//System.out.println(" Order not confirmed");
			
		
		return true;
		
	
}

public void printList(ArrayList<Investment> investments){
    for(Investment o : Account.investments){
    	System.out.println(" Investment number: "+o.investment_number+" Investment: "+o.getInvestment_type()+" Accnum: "+o.getAccnumber()+"  ");
    }
}



}
