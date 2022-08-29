package application;


import java.io.IOException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import businessLayer.BMS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RequestLoamController {
	Main m=new Main();
	@FXML
	public Button PayBtn,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField loantype;
	
	@FXML
	private TextField amount;
	@FXML
	private TextField income;
	 // The reference of show button will be injected by the FXML loader
	 @FXML
		private Text error;
		
	 @FXML
		private Text success;
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public RequestLoamController()
	 {
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 @FXML
	 public void goToLoan(ActionEvent event) throws IOException  
	 {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/Loan.fxml");
		
		 
	 }
	 @FXML
	 public void RequestLoan(ActionEvent event) throws IOException  
	 {
		String borrowerName=name.getText();
	    String am=amount.getText();
		int amnt=Integer.parseInt(am);
		String loantyp=loantype.getText();
		String incom=income.getText();
		int income=Integer.parseInt(incom);
	
	 boolean  flager= BMS.getInstance().RequestLoan(borrowerName,loantyp,amnt,income);
	 System.out.println(flager);
		if(flager==true) {
			success.setText("Request Sent Successfully ");
	 
		 }
		else {
			error.setText("Sorry! Couldn't send Request");
		}
		
		 
	 }
	 
}
