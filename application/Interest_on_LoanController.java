package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Interest_on_LoanController {
	Main m=new Main();
	@FXML
	public Button PayBtn,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn;
	
	
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public Interest_on_LoanController()
	 {
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 public void goToLoan(ActionEvent event) throws IOException  
	 {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/Loan.fxml");
		
		 
	 }
}
