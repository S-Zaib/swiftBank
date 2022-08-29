package application;


import java.io.IOException;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javax.print.DocFlavor.URL;

import businessLayer.BMS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InsuranceController {
	Main m=new Main();
	@FXML
	public Button BuyInsuranceBtn, homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn;
	
	public MenuButton SelectInsurancePlanBtn;
	 // The reference of show button will be injected by the FXML loader

	 @FXML
	 private TextField AccNum;
	 @FXML
private TextField name;
	 @FXML
	 private TextField amount;
	 @FXML
	 private TextField type;
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public InsuranceController()
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
	 
	 public void BuyIns(ActionEvent event) throws IOException {
		 String instype=type.getText();
		    String am=amount.getText();
			int amnt=Integer.parseInt(am);
			
			String accnumber=AccNum.getText();
			//int income=Integer.parseInt(incom);
		
		 boolean  flager= BMS.getInstance().makeInsurance(instype,accnumber,amnt);
		 System.out.println(flager);
	 }
}
