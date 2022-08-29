package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import businessLayer.BMS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OrderChequeController {
	Main m=new Main();
	@FXML
	public Button orderBtn,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn;
	
	@FXML
	private TextField signature;
	
	@FXML
	private TextField ordertype;
	@FXML
	private TextField accnum;
	@FXML
	private Label label;
	//@FXML
	//private TextField success;
	@FXML
	private TextField Date;
	//@FXML
	//private TextField errorText;
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public OrderChequeController()
	 {
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 public void goToHome(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/MainMenu.fxml");
		
	 }
	 
	 public void Order(ActionEvent event) throws IOException  
	 {
		 String orderDate=Date.getText();
	     
	     String ordertyp=ordertype.getText();
	     String acc1= accnum.getText();
	     
		 businessLayer.Order  or= BMS.getInstance().placeOrder(orderDate, ordertyp, acc1);
		 
		 
		 if(or!=null) {
			label.setText("Order Confirmed! Your OrderID: "+or.getOrder_id());
		 
			 }
			else {
			//	errorText.setText("Sorry! Couldn't Order");
			}
		 }
	 }

