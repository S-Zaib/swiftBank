package application;


import java.io.IOException;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class LoanController {
	Main m=new Main();
	@FXML
	public Button homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn;
	@FXML
	public Button requestForLoanBtn, CalculateInterestonLoanbtn, CalculateInterestonDepositedAmountbtn;
	
	
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public LoanController()
	 {
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 @FXML
	 public void goToHome(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/MainMenu.fxml");
		
		 
	 }
	 @FXML
	 public void goToRequestLoan(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/RequestLoam.fxml");
		
		 
	 }
	 
	 @FXML
	 public void goToInterestLoan(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/Interest_on_Loan.fxml");
		
		 
	 }
	 @FXML
	 public void goToInterestDeposit(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/Interest_on_Deposit.fxml");
		
		 
	 }
}
