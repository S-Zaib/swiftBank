package businessLayer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import dataLayer.DBHandler;

public class Order {
	private LocalDate order_date;
	private LocalDate delivery_date;
	private String order_type;
	private int order_id;
	String accnum;
	DBHandler p = new DBHandler();
	
	Payment pay=new Payment();
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public LocalDate getOrder_date() {
		return order_date;
	}
	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}
	public LocalDate getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(LocalDate delivery_date) {
		this.delivery_date = delivery_date;
	}
	public Order() {
		
	}
	public Order(LocalDate order_date, String order_type,String accnum) {
		this.order_type=order_type;
		this.order_date = order_date;
		this.delivery_date = order_date.plusDays(5);
		Random rand=new Random();
		this.accnum=accnum;
		this. order_id = rand.nextInt(1000); 
		if(order_type=="ChequeBook") {
			 //cheqbook=new ChequeBook();
			ChequeBook cheqbook=new ChequeBook();
			
			 cheqbook.setIssue_date(delivery_date);
			 cheqbook.setExpiry_date(delivery_date.plusDays(180));
			 System.out.println(" Cheque book number:"+cheqbook.chequeNumber);
		}
		else if(order_type=="CreditCard"){
			CreditCard card=new CreditCard();
			 card.setIssue_date(delivery_date);
			 card.setExpiry_date(delivery_date.plusDays(180));
			 System.out.println(" Credit card number:"+card.card_number);
		}
	}
	
	Order placeOrder(String ordertype,String orderdate,String accnumber) {
		//  System.out.println(""+user);
	   //   System.out.println(""+pass);
		//Bank.accounts=p.readAccountsRecord();
		//boolean flag=false;
		
		 
		LocalDate date = LocalDate.parse(orderdate);
System.out.println(date);
		Order order=new Order(date,ordertype,accnumber);
		System.out.println(order.getOrder_date()+" delivery date: "+order.getDelivery_date()+" orderID: "+order.order_id+"  ");
		Account.orders.add(order);
		
	    p.SaveOrders(order.getOrder_id(), order.order_type,order.order_date.toString(), order.getDelivery_date().toString(),accnumber);
			//p.updateAcount(fromacc, toacc);  
		printList(Account.orders);
	   pay.makePayment(accnumber);
	 for(Account a:Bank.accounts) {
	 		if(accnumber.equals(a.acc_number)) {
p.Update(accnumber, a.balance);
	//	 flag=true;
}}
		//	}
		//	}if(flag==false) {
				//System.out.println(" Order not confirmed");
				
			
			return order;
			
		
	}
	public void printList(ArrayList<Order> orders){
	    for(Order o : orders){
	    	System.out.println(o.getOrder_date()+" delivery date: "+o.getDelivery_date()+" orderID: "+o.order_id+"  ");
	    }
	}
	
}
