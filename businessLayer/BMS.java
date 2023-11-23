package businessLayer;

public class BMS {

	Admin a= new Admin();
    Account ac=new Account();
    Loan l=new Loan();
    Tax t=new Tax();
    Payment p = new Payment();
   Order o=new Order();
   Investment in=new Investment();
   Insurance io = new Insurance();
   Complaints com = new Complaints();
   Transaction trans = new Transaction();
   private static BMS instance = new BMS();
	private BMS() {

	}
	
	public static BMS getInstance(){
	      return instance;
	   }
	/*
	public boolean accountLogin(String name, String password) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
			boolean flag=a.Login(name, password);

			return flag;

		}*/
	public boolean RequestLoan(String borrower, String loantype,int amount,int income) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			boolean flag=l.RequestLoan(borrower, loantype, amount, income);
           System.out.println("BMS"+flag);
			return flag;

		}
	public boolean makeInvestment(String investmenttype, String accnum,int amnnt) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			boolean flag=in.makeInvestment(investmenttype, accnum, amnnt);
          System.out.println("BMS"+flag);
			return flag;

		}
	public boolean makeInsurance(String insurancetype, String accnum,int amnnt) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			boolean flag=io.makeInsurance(insurancetype, accnum, amnnt);
         System.out.println("BMS"+flag);
			return flag;

		}
	public boolean paytax(String type, String consumerNumber,String orgname) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			boolean flag=t.Tax(type, consumerNumber, orgname);
        System.out.println("BMS"+flag);
			return flag;

		}
	public boolean comp(String a, String b,String c, String d) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			boolean flag=com.Complaint(a, b, c, d);
       System.out.println("BMS"+flag);
			return flag;

		}
	public boolean payAmont(String type, String company,String acc,int c,String b) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			boolean flag=p.Pay(type, company, acc, c, b);
       System.out.println("BMS"+flag);
			return flag;

		}
	public boolean ReceiveAmount(String type, String company,String acc,int c) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			boolean flag=trans.Pay1(type, company, acc, c);
     System.out.println("BMS"+flag);
			return flag;

		}
	public boolean TransferAmount(String fromaccount, String toaccount,int amount) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		ac.printList(Bank.accounts);
			boolean flag=ac.TransferAmount(fromaccount, toaccount, amount);
            System.out.println("BMS"+flag);
			return flag;

		}
	public Order placeOrder(String date, String ordertype,String accnum) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
		
			Order flag=o.placeOrder(ordertype, date, accnum);
           System.out.println("BMS"+flag);
			return flag;

		}
	Account account3=new Account();
	public Account accountLogin(String name, String password) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
			 account3 =ac.accountLogin(name, password);
			 //show account details

			return account3;

		}

		//return current account
		public Account getAccount() {
			return account3;
		}
	
	public boolean AcceptLoan(int loan) {
	     //  System.out.println("BL"+name);
	     //  System.out.println("BL"+password);
			boolean flag =l.AcceptLoan(loan,account3.acc_number);

			return flag;

		}

	public String adminLogin(String name, String password) {
     //  System.out.println("BL"+name);
     //  System.out.println("BL"+password);
		String pass=a.Login(name, password);

		return pass;

	}

	
}
