package application;

import java.io.IOException;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenucontroller {
	Main m=new Main();
	@FXML
	public Button Login,notification,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn, issuebtn;
	
	
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public MainMenucontroller()
	 {
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 public void goToLogin(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/Login.fxml");
		
		 
	 }
	 public void goToNotification(ActionEvent event) throws IOException  
	 {
		
	/*	Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/Login.fxml");
		
		*/ 
	 }
	 public void goToTransferAmount(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/TranferAmount.fxml");
		
		 
	 }
	 public void gotoissue(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/IssueComplaints.fxml");
		
		 
	 }
	 
	 public void goToLoan(ActionEvent event) throws IOException  
	 {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/Loan.fxml");
		
		 
	 }
	 
	 public void goToTax(ActionEvent event) throws IOException  
	 {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/PayTax.fxml");
		
		 
	 }
	 
	 
	 public void goToInvest(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/Investment.fxml");
		
		 
	 }
	 
	 public void goToInsurance(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/Insurance.fxml");
		
		 
	 }
	 
	 public void goToOrder(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/OrderCheque.fxml");
		
		 
	 }
	 
	 public void goToPay(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/Payment.fxml");
		
		 
	 }
	 
	 
}
