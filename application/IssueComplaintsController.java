package application;

import java.io.IOException;

import businessLayer.BMS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class IssueComplaintsController {
	public IssueComplaintsController()
	{
		
	}
	@FXML 
	private TextField name;
	
	@FXML
	private TextField email;

	@FXML
	private TextField message;

	@FXML
	private TextField suggestion;
	
	public void initialize()
	{
		
	}
	
	Main m = new Main();
		 public Button homeBtn;
		 
		
		
		 public void goToHome(ActionEvent event) throws IOException  
		 {  
			Stage s=(Stage)((Node)event.getSource()).getScene().getWindow();
			m.changeScene(s,"src/MainMenu.fxml");
			
		 }
		 public void Submit(ActionEvent event) {
			 String user=name.getText();
			 System.out.println(user);
			 String em=email.getText();
			 String msg=message.getText();
			 String sgs=suggestion.getText();
			boolean  flager= BMS.getInstance().comp(user,em,msg,sgs);
			 System.out.println(flager);
		 }
}
