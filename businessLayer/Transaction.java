package businessLayer;

import java.time.LocalDate;

import dataLayer.DBHandler;

public class Transaction {
Payment pay = new Payment();
private String Advance_Company;
	private String Advance_Account;
	private String reason;
	private int salary;

	public Transaction(  String Advance_Company, String Advance_Account,  String reason, int salary) {
		
		
		this.Advance_Company = Advance_Company;
		this.Advance_Account = Advance_Account;
		this.reason = reason;
		this.salary = salary;

	}
	public Transaction() {
		
	}

	public String getAdvance_Company() {
		return Advance_Company;
	}

	public void setAdvance_Company(String advance_Company) {
		Advance_Company = advance_Company;
	}

	public String getAdvance_Account() {
		return Advance_Account;
	}

	public void setAdvance_Account(String advance_Account) {
		Advance_Account = advance_Account;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	boolean Pay1(String a, String b,String c, int d) {
		
		
		Transaction p2 = new Transaction(a, b, c,d);
		Account.transactions.add(p2);
		DBHandler p = new DBHandler();

		//p.SavePayment(p1.type, p1.company, p1.amount, p1.consumernumber, p1.payment_id); 
		//printList(Account.payments);
		p.SaveAdvancePayment(p2.Advance_Company,p2.Advance_Account, p2.reason, p2.salary);
		
			pay.makePayment2(p2.Advance_Account, p2.salary);
		
		
	   
	 for(Account a1:Bank.accounts) {
	 		if(b.equals(a1.acc_number)) {
	 			//System.out.println("chlo chlo imran");
	p.Update(b, a1.balance);

	}}
		
			
			return true;
			
		
	}
}
