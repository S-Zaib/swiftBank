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
import javafx.stage.Stage;

public class AcceptLoanController {
	Main m=new Main();
	@FXML
	public Button acceptBtn,homeBtn,h;
	
	@FXML
	private TextField loanID;
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public AcceptLoanController() {
	
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 
	 public void AcceptLoan(ActionEvent event) throws IOException  
	 {   String ID=loanID.getText();
	 int loan=Integer.parseInt(ID);
	 boolean  flager= BMS.getInstance().AcceptLoan(loan);
	 System.out.println(flager);
		if(flager==true) {
			System.out.println("accepted");
			//success.setText("Request Sent Successfully ");
	 
		 }
		else {
			//error.setText("Sorry! Couldn't send Request");
		}
		
		 
		/*Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/AdminMenu.fxml");
		*/
		 
	 }
	 public void gotoh(ActionEvent event) throws IOException  
	 {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/AdminMenu.fxml");
		
		 
	 }
}
