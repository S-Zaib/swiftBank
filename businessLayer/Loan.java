package businessLayer;

import java.util.ArrayList;
import java.util.Random;

import dataLayer.DBHandler;

//import java.time.LocalDate;

public class Loan {
	private int income;
	private int loan_amount;
	private String loan_type;
	private int loan_number;
	private String borrowerName;
	private String status;
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public int getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(int loan_number) {
		this.loan_number = loan_number;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Loan() {
		
	}
	
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public Loan(int income, int loan_amount, String loan_type, String borrowerName) {
		Random rand = new Random();
		this.loan_number=rand.nextInt(1000); 
		this.income = income;
		this.loan_amount = loan_amount;
		this.loan_type = loan_type;
		this.borrowerName = borrowerName;
		this.status="Requested";
		
	}
	public Loan(int income, int loan_amount, String loan_type, String borrowerName,int loannumber) {
		//Random rand = new Random();
		this.loan_number=loannumber; 
		this.income = income;
		this.loan_amount = loan_amount;
		this.loan_type = loan_type;
		this.borrowerName = borrowerName;
		//this.status="Requested";
		
	}
	DBHandler p = new DBHandler();

boolean RequestLoan(String borrower,String loantype,int amount,int income) {
	//  System.out.println(""+user);
   //   System.out.println(""+pass);  
	Loan loan1=new Loan(income,amount,loantype,borrower);
	System.out.println(loan1.getLoan_number()+""+loan1.getStatus());
	
		 Bank.loans.add(loan1);
		 p.SaveLoan(loan1.getLoan_number(), loan1.getStatus(), loan1.getLoan_type(), loan1.getIncome(), loan1.getLoan_amount(), loan1.getBorrowerName());
		//p.updateAcount(fromacc, toacc);  
	 printList(Bank.loans);
	return true;
	
}

boolean AcceptLoan(int loan,String account) {
	boolean flag=false;
	 Bank.loans=p.readLoansRecord();
	 printList(Bank.loans);
	 for(Loan l:Bank.loans) {
			if(loan==l.loan_number) {
			
	            l.status="Accepted";
	        	System.out.println("Loan accepted "+l.status);
				p.UpdateLoan(loan, l.status);
			//S	p.insertNotification(account,"Loan accepted for loanNumber: "+l.loan_number );
			//	 p.SaveLoan(l.getLoan_number(), l.getStatus(), l.getLoan_type(), l.getIncome(), l.getLoan_amount(), l.getBorrowerName());
				 flag=true;
			}
		}if(flag==false) {
			System.out.println("Loan unable to find ");
			
		}return flag;
		
		
		//p.updateAcount(fromacc, toacc);  
	
	//return flag;
	
}

	public void printList(ArrayList<Loan> loans){
	    for(Loan l : loans){
	        System.out.println("Loan Number: "+l.loan_number+"  Borrower:"+l.borrowerName+"  Amount:"+l.loan_amount+"  Income:"+l.income+"  Loan Type:"+l.loan_type);
	    }
	}

}
