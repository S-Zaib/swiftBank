package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdminMenuController {
	Main m=new Main();
	@FXML
	public Button homeBtn,AL,IA, Log;
	
	
	 // The reference of show button will be injected by the FXML loader
	 
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public AdminMenuController() {
	
	 }
	 @FXML
	 public void initialize()
	 {
	 }
	 
	 public void gotoAL(ActionEvent event) throws IOException  
	 {
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/AcceptLoan.fxml");
		
		 
	 }
	 
	 public void goToInvestAdmin(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s, "src/ManageInstallments.fxml");
		
		 
	 }
	 public void gotoLog(ActionEvent event) throws IOException  
	 {
		
		Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
		m.changeScene(s,"src/Login.fxml");
		
		 
	 }
}
