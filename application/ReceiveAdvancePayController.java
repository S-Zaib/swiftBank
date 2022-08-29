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

public class ReceiveAdvancePayController {

	
	Main m=new Main();
	@FXML
	public Button payBtn,paymentBtn;
	
	
	@FXML 
	private MenuButton com;
	@FXML 
	private MenuItem N;
	@FXML 
	private MenuItem O;
	@FXML 
	private TextField Acc;
	@FXML 
	private TextField Reason;
	@FXML 
	private TextField Sal;
	
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public ReceiveAdvancePayController()
	 {
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 
	 public void gotoN(ActionEvent event) throws IOException  
	 {

				com.setText(N.getText());
		 
	 }
	 
	 public void gotoO(ActionEvent event) throws IOException  
	 {

				com.setText(O.getText());
		 
	 }
	 public void goToPayment(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/Payment.fxml");
		
	 }
	 
	 public void Receive(ActionEvent event) {
		 String cm=com.getText();
		 String account=Acc.getText();
		 String reas=Reason.getText();
		 String cm1=Sal.getText();
		 int amnt=Integer.parseInt(cm1);

		boolean  flager= BMS.getInstance().ReceiveAmount( cm, account,reas, amnt);
		System.out.println(flager);
	 }
}
