package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import businessLayer.BMS;
//import businessLayer.BMS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
//import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InvestmentController {
	Main m=new Main();
	@FXML
	public Button PayBtn,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn;
	public MenuButton SelectInvestmentPlanMenuBtn;
	
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	 @FXML
	 private TextField accnum;
	 @FXML
 private TextField name;
	 @FXML
	 private TextField amount;
	 @FXML
	 private TextField intype;
	// Add a public no-args constructor
	 public InvestmentController()
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
 @FXML
 public void Pay(ActionEvent event) throws IOException {
		 String investtype=intype.getText();
		    String am=amount.getText();
			int amnt=Integer.parseInt(am);
			
			String accnumber=accnum.getText();
			//int income=Integer.parseInt(incom);
		
		 boolean  flager= BMS.getInstance().makeInvestment(investtype,accnumber,amnt);
		 System.out.println(flager);
	 }
	 
	
}
