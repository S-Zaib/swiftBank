package businessLayer;

import java.util.ArrayList;

import dataLayer.DBHandler;

public class Tax {
	private String TaxType;
	private String ConsumerNumber;
	private String OrgName;
	Payment pay=new Payment();
	
	public Tax(String taxType, String consumerNumber, String orgName) {
		this.TaxType = taxType;
		this.ConsumerNumber = consumerNumber;
		this.OrgName = orgName;
	}
	public String getTaxType() {
		return TaxType;
	}
	public void setTaxType(String taxType) {
		TaxType = taxType;
	}
	public String getConsumerNumber() {
		return ConsumerNumber;
	}
	public void setConsumerNumber(String consumerNumber) {
		ConsumerNumber = consumerNumber;
	}
	public String getOrgName() {
		return OrgName;
	}
	public void setOrgName(String orgName) {
		OrgName = orgName;
	}
	
	public Tax(){
		
	}
	
	boolean Tax(String TaxType, String num,String Orgnam) {
		
		
		Tax t = new Tax(TaxType, num, Orgnam);
		Account.taxes.add(t);
		DBHandler p = new DBHandler();
	
			p.SaveTax(t.TaxType, t.ConsumerNumber, t.OrgName); 
		printList(Account.taxes);
		String a = "property tax";
		String b = "Income tax";
		int amount = 750;
		int amount1 = 2000;
		System.out.println(TaxType);
		if(TaxType.equals(a)) {
		
			pay.makePayment1(t.ConsumerNumber, amount);
		}
		else if(TaxType.equals(b)) {
			pay.makePayment1(t.ConsumerNumber, amount1);
		}
	   
	 for(Account a1:Bank.accounts) {
	 		if(num.equals(a1.acc_number)) {
	 			
	p.Update(num, a1.balance);

	}}
		
			
			return true;
			
		
	}
	public void printList(ArrayList<Tax> taxes){
	    for(Tax o : Account.taxes){
	    	System.out.println(" Investment number: "+o.getTaxType()+" Investment: "+o.ConsumerNumber+" Accnum: "+o.getOrgName()+" ");
	    }
	}
}
