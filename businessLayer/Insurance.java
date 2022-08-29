package businessLayer;

import java.util.ArrayList;
import java.util.Random;

import dataLayer.DBHandler;

public class Insurance {
	private String ins_type;
	private String accnum;
	private int ins_number;
	private int amont;
	Payment pay=new Payment();
	


	public String getIns_type() {
		return ins_type;
	}

	public void setIns_type(String ins_type) {
		this.ins_type = ins_type;
	}

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public int getIns_number() {
		return ins_number;
	}

	public void setIns_number(int ins_number) {
		this.ins_number = ins_number;
	}

	public int getAmont() {
		return amont;
	}

	public void setAmont(int amont) {
		this.amont = amont;
	}

	public Insurance() {
		
	}

	public Insurance(String ins_type, String accnum,int amont) {
		 Random r=new Random();
		this.ins_type = ins_type;
		this.accnum = accnum;
		this.ins_number = r.nextInt(1000);
		this.amont=amont;
	}

	boolean makeInsurance(String instype, String accnum,int amnnt) {
		//  System.out.println(""+user);
	   //   System.out.println(""+pass);
		//Bank.accounts=p.readAccountsRecord();
		//boolean flag=false;
		Insurance ins=new Insurance(instype, accnum, amnnt);

		Account.insurances.add(ins);
		DBHandler p = new DBHandler();
	   p.SaveInsurance(ins.ins_number, ins.ins_type, ins.amont, ins.accnum);
			 
		printList(Account.insurances);
	   pay.makePayment1(ins.accnum, ins.amont);
	 for(Account a:Bank.accounts) {
	 		if(accnum.equals(a.acc_number)) {
	p.Update(accnum, a.balance);
//		 flag=true;
	}}
		//	}
		//	}if(flag==false) {
				//System.out.println(" Order not confirmed");
				
			
			return true;
			
		
	}

	public void printList(ArrayList<Insurance> insurances){
	    for(Insurance o : Account.insurances){
	    	System.out.println(" Investment number: "+o.ins_number+" Investment: "+o.getIns_type()+" Accnum: "+o.getAccnum()+"  ");
	    }
	}

}
