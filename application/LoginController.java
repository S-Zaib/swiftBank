package application;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import businessLayer.Account;
import businessLayer.BMS;
public class LoginController {
	public LoginController()
	{
		
	}
	@FXML 
	private TextField username;
	
	@FXML
	private TextField password;
	@FXML 
	private MenuButton MB;
	
	@FXML 
	private MenuItem AD;
	@FXML 
	private MenuItem CT;
	
	
	Main m =new Main();
	//DBHandler o = new DBHandler();
	
		 public Button Loginbtn;
		
		 public void gotoAD(ActionEvent event) throws IOException  
		 {

					MB.setText(AD.getText());
			 
		 }
		 
		 public void gotoCT(ActionEvent event) throws IOException  
		 {

					MB.setText(CT.getText());
			 
		 }
			

		 public void goToHome(ActionEvent event) throws IOException  
		 { 
			 String option = MB.getText();
			 String user=username.getText();
			 String pass=password.getText();
			System.out.println(option);
			 
			 if(option.equals("Customer")) {
				 
				 Account  acc= BMS.getInstance().accountLogin(user, pass);
				// System.out.println();
					if(acc!=null) {
						// Pass the Account object to MainMenucontroller
						String path = "src/MainMenu.fxml";



						Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
						m.changeScene(s, path);
			            }
					else {
						  Alert alert1= new Alert(AlertType.ERROR);
						   alert1.setTitle("Warning");
						   alert1.setHeaderText("Wrong User Id or passward");
						   alert1.showAndWait();
					}
				 
			 }
			 else if(option.equals("Admin")) {
				 String  password= BMS.getInstance().adminLogin(user,pass);
				 System.out.println(password);
					if(password!=null) {
						//BMS.getInstance().setCurrentUser(username.getText(), 1);
						Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
						m.changeScene(s,"src/AdminMenu.fxml");
			            }
					else {
						  Alert alert1= new Alert(AlertType.ERROR);
						   alert1.setTitle("Warning");
						   alert1.setHeaderText("Wrong User Id or passward" + password);
						   alert1.showAndWait();
					}
			 }
			// faizainisvad.settext();
			 /*if(curruser.equalsIgnoreCase("Administration")) {
					//int check= BMS.getInstance().verifyAdmin(username.getText(), password.getText());
					 boolean  flager= BMS.getInstance().adminLogin(user,pass);
					if(flager!=true) {
						//BMS.getInstance().setCurrentUser(username.getText(), 1);
						Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
						m.changeScene(s,"src/MainMenu.fxml");
			            }
					else {
						  Alert alert1= new Alert(AlertType.ERROR);
						   alert1.setTitle("Warning");
						   alert1.setHeaderText("Wrong User Id or passward");
						   alert1.showAndWait();
					}
				}*/
			 /*
				
				  if(curruser.equalsIgnoreCase("Customer")) {
					  
					  int check2= BMS.getInstance().verifyStudent(username.getText(), password.getText());
						
						if(check2!=-1) {
							BMS.getInstance().setCurrentUser(username.getText(), 3);
							Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
							m.changeScene(s,"src/MainMenu.fxml");
					 }
						else {
						  Alert alert1= new Alert(AlertType.ERROR);
						   alert1.setTitle("Warning");
						   alert1.setHeaderText("Wrong User Id or passward");
						   alert1.showAndWait();
					}//flager;
			 */
		/* boolean  flager= BMS.getInstance().adminLogin(user,pass);
		
			if(flager==true) {
			Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
			m.changeScene(s,"src/MainMenu.fxml");
			System.out.println("Login");
			}
			else{
				System.out.println("Login failed");

			}*/
			 
		 }
		 
}
