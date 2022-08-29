package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import businessLayer.BMS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PaymentController {
	Main m=new Main();
	@FXML
	public Button payBtn,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn,RAP;
	
	
	@FXML 
	private MenuButton paybtn;
	
	@FXML 
	private MenuItem mobilebtn;
	@FXML 
	private MenuItem billbtn;
	@FXML 
	private TextField company;
	@FXML 
	private TextField company1;
	@FXML 
	private TextField company11;
	@FXML 
	private TextField Num;
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public PaymentController()
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
	 public void goToRAP(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/ReceiveAdvancePay.fxml");
		
	 }
	 public void gotobill(ActionEvent event) throws IOException  
	 {

				paybtn.setText(billbtn.getText());
		 
	 }
	 public void gotomobile(ActionEvent event) throws IOException  
	 {

				paybtn.setText(mobilebtn.getText());
		 
	 }
	 
	 public void PayAmount(ActionEvent event) {
		 String type=paybtn.getText();
		 String cm=company.getText();
		 String account=Num.getText();
		 String cm1=company1.getText();
		 int amnt=Integer.parseInt(cm1);
			
		 String cm11=company11.getText();
		boolean  flager= BMS.getInstance().payAmont(type,cm,account,amnt,cm11);
		 System.out.println(flager);
	 }
}
