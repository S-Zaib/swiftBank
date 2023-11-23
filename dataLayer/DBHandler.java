package dataLayer;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import businessLayer.Account;
import businessLayer.Bank;
import businessLayer.Loan;


public class DBHandler {
		Connection con=null;
		public void connectDB() {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","$Zaib524719");
			if(con == null) {
			System.out.println("DB connection failed");}
			else {
				System.out.println("DB connection successful");
			}

			}
			catch(Exception e) {
			System.out.println("exception: "+e);
			}
			}
		
		
		public ArrayList<Account> readAccountsRecord() {
			//empty the arraylist
			Bank.accounts.clear();
			connectDB();
			//ArrayList<Order> Orders= new ArrayList<Order>();
			
	
			Statement stmt;
			try {
				stmt = (Statement) con.createStatement();
				String sql="Select * from account";
				ResultSet rs= (ResultSet) stmt.executeQuery(sql);
				while(rs.next()) {
					
					Bank.accounts.add(new Account(rs.getString(1), rs.getString(2),rs.getString(3), rs.getInt(4)));
					}
				
				con.close();
			}

			catch (SQLException e) {

				System.out.println("exception: "+e);
			}
			
			System.out.println("Read successfully");
			return Bank.accounts;
			
			
		}
		public void Update(String AccNum, int balance) {
			connectDB();
			System.out.println(balance);
			System.out.println("hello");
			String sql = "UPDATE account SET balance ='"+balance+"' WHERE accnumber = '"+AccNum+"'";
			System.out.println(AccNum);
					PreparedStatement statement;
					try {
						statement = (PreparedStatement) con.prepareStatement(sql);
						//statement.setString(1, balance);
						//statement.setString(2, AccNum);
						
						int rowsUpdated = statement.executeUpdate();
						if (rowsUpdated > 0) {
						System.out.println("An existing user was updated successfully!");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			}
		
		
		
		
	/*	public void updateAcount(String username, String pass) {
			// TODO Auto-generated method stub
				System.out.println(username);
				System.out.println(pass);
				connectDB();
				String sql = "INSERT INTO account(username, password) Values(?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setString(1, username );
					statement.setString(2, pass);
					
					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new account logged in");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		public void SaveOrders(int orderID, String orderType,String orderDate,String deliverydate,String accountnum) {
			//TODO Auto-generated method stub
				System.out.println("DB"+orderDate);
				//System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO orderrecord(orderID,orderType,orderDate,deliveryDate,accountnumber) Values(?,?,?,?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setInt(1, orderID );
					statement.setString(2, orderType);
					statement.setString(3, orderDate);

					 statement.setString(4, deliverydate);
					 statement.setString(5, accountnum);
					

					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new order ");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		public void SaveInvestment(int investnumber,String investtype,int amount,String accountnum) {
			//TODO Auto-generated method stub
				
				//System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO investment(investmentID,investment_Type,invested_amount,accountnumber) Values(?,?,?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setInt(1, investnumber );
					statement.setString(2, investtype);
					statement.setInt(3, amount);

					 statement.setString(4, accountnum);
					// statement.setString(5, accountnum);
					

					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new invested recorder ");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		public void SaveInsurance(int insurancenumber,String insurancetype,int amount,String accountnum) {
			//TODO Auto-generated method stub
				
				//System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO insurance(insuranceID,insurance_Type,insurance_amount,accountnumber) Values(?,?,?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setInt(1, insurancenumber );
					statement.setString(2, insurancetype);
					statement.setInt(3, amount);

					 statement.setString(4, accountnum);
					// statement.setString(5, accountnum);
					

					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new insurance recorder ");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		public void SaveTax(String TaxType, String num,String Orgnam) {
			//TODO Auto-generated method stub
				
				//System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO Tax(TaxType,ConsumerNumber,OrganizationName) Values(?,?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setString(1, TaxType );
					statement.setString(2, num);
					statement.setString(3, Orgnam);
					

					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new Tax recorder ");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		public void SavePayment(String Type, String comp,int Ac, String cons, int p) {
			//TODO Auto-generated method stub
				
				//System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO Payment(Type,company,Amount,ConsumerNumber,ID) Values(?,?,?,?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setString(1, Type );
					statement.setString(2, comp);
					statement.setInt(3, Ac);
					statement.setString(4, cons);
					statement.setInt(5, p);
					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new Paymeny ");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		public void SaveAdvancePayment(String Type, String comp, String cons, int p) {
			//TODO Auto-generated method stub
				
				//System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO AdvancePayment(Company,Account,Reason,Salary) Values(?,?,?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setString(1, Type );
					statement.setString(2, comp);
					statement.setString(3, cons);
					statement.setInt(4, p);
					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new Advance Payment ");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		public void SaveComplaints(String a, String b,String c, String d) {
			//TODO Auto-generated method stub
				
				//System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO Complaint(name,email,message,suggestion) Values(?,?,?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setString(1, a );
					statement.setString(2, b);
					statement.setString(3, c);
					statement.setString(4, d);
				
					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new Complaint ");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		public void SaveLoan(int loannumber, String status,String loantype,int income,int amount,String borrower) {
		//TODO Auto-generated method stub
			System.out.println("DB"+loannumber);
			System.out.println("DB"+status);
			connectDB();
			String sql = "INSERT INTO loan(loannumber,status,loantype,income,amount,borrower) Values(?,?,?,?,?,?)";
			PreparedStatement statement;
			try {
				statement = (PreparedStatement) con.prepareStatement(sql) ;
				   statement.setInt(1, loannumber );
				statement.setString(2, status);
				statement.setString(3, loantype);

				 statement.setInt(4, income );
				 statement.setInt(5, amount );
					statement.setString(6, borrower);

				int rowsInserted = statement.executeUpdate();
				if (rowsInserted > 0) {
					System.out.println("A new loan requested");
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public ArrayList<Loan> readLoansRecord() {
			connectDB();
			//ArrayList<Order> Orders= new ArrayList<Order>();
			
	
			Statement stmt;
			try {
				stmt = (Statement) con.createStatement();
				String sql="Select * from loan";
				ResultSet rs= (ResultSet) stmt.executeQuery(sql);
				while(rs.next()) {
					
					Bank.loans.add(new Loan(rs.getInt(4), rs.getInt(5),rs.getString(3),rs.getString(6),rs.getInt(1)));
					System.out.println(rs.getInt(4)+""+ rs.getInt(5)+""+rs.getString(3)+""+rs.getString(6));
					}
				
				con.close();
			}

			catch (SQLException e) {

				System.out.println("exception: "+e);
			}
			
			System.out.println("Read successfully");
			return Bank.loans;
			
			
		}
		public void UpdateLoan(int loan, String status) {
			connectDB();
			System.out.println(status);
			System.out.println("hello");
			String sql = "UPDATE loan SET status ='"+status+"' WHERE loannumber = '"+loan+"'";
			System.out.println(loan);
					PreparedStatement statement;
					try {
						statement = (PreparedStatement) con.prepareStatement(sql);
						//statement.setString(1, balance);
						//statement.setString(2, AccNum);
						
						int rowsUpdated = statement.executeUpdate();
						if (rowsUpdated > 0) {
						System.out.println("An existing user was updated successfully!");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			}
		public void insertNotification(String Accnumber,String notification) {
			//TODO Auto-generated method stub
			//	System.out.println("DB"+loannumber);
			//	System.out.println("DB"+status);
				connectDB();
				String sql = "INSERT INTO notification(accountnumber,Notification) Values(?,?)";
				PreparedStatement statement;
				try {
					statement = (PreparedStatement) con.prepareStatement(sql) ;
					   statement.setString(1, Accnumber);
					statement.setString(2, notification);
					

					int rowsInserted = statement.executeUpdate();
					if (rowsInserted > 0) {
						System.out.println("A new notification requested");
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		


}
