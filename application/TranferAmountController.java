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

public class TranferAmountController {
	Main m=new Main();
	@FXML
	public Button transferBtn,homeBtn,transferAmountBtn,loanBtn,payTaxBtn,investBtn,insuranceBtn,checkBtn,paymentBtn;
	
	@FXML
	private TextField fromaccount;
	
	@FXML
	private TextField toaccount;
	
	@FXML
	private TextField amount;
	 // The reference of show button will be injected by the FXML loader
	@FXML
	private Text errorText;
	
 @FXML
	private Text successmsg;
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public TranferAmountController()
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
	 public void Transfer(ActionEvent event) throws IOException  
	 {    String fromuser=fromaccount.getText();
	 String touser=toaccount.getText();
	 String am=amount.getText();
	 int amnt=Integer.parseInt(am);
 boolean  flager= BMS.getInstance().TransferAmount(fromuser,touser,amnt);
 System.out.println(flager);
	if(flager==true) {
		successmsg.setText("Successfully Transferred");
 
	 }
	else {
		errorText.setText("Sorry! Couldn't Transfer");
	}
		}
}
