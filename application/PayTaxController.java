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

public class PayTaxController {
	Main m=new Main();
	@FXML
	public Button PayBtn,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn , PaytaxBtn;
	
	
	
	@FXML 
	private MenuButton TaxTypeButton;
	
	@FXML 
	private MenuItem PropertyBtn;
	@FXML 
	private MenuItem IncomeBtn;
	
	@FXML
	private TextField ConsumerNumber;

	
	@FXML 
	private MenuButton orgbtn;
	
	@FXML 
	private MenuItem fbrbtn;
	@FXML 
	private MenuItem prbbtn;
	@FXML 
	private MenuItem srbbtn;

	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public PayTaxController()
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
	 public void gotoproperty(ActionEvent event) throws IOException  
	 {

				TaxTypeButton.setText(PropertyBtn.getText());
		 
	 }
	 
	 public void gotoincome(ActionEvent event) throws IOException  
	 {

				TaxTypeButton.setText(IncomeBtn.getText());
		 
	 }
	 public void gotofbr(ActionEvent event) throws IOException  
	 {

				orgbtn.setText(fbrbtn.getText());
		 
	 }
	 public void gotoprb(ActionEvent event) throws IOException  
	 {

				orgbtn.setText(prbbtn.getText());
		 
	 }
	 public void gotosrb(ActionEvent event) throws IOException  
	 {

				orgbtn.setText(srbbtn.getText());
		 
	 }

	 public void Paytax(ActionEvent event) {
		 String Tax=TaxTypeButton.getText();
		 System.out.println(Tax);
		 String Num=ConsumerNumber.getText();
		 String nameorg=orgbtn.getText();
		 System.out.println(nameorg);
		 boolean  flager= BMS.getInstance().paytax(Tax,Num,nameorg);
		 System.out.println(flager);
	 }
}
