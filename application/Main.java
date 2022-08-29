package application;

	
import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	Stage stage;
	FXMLLoader loader = new FXMLLoader();
	@Override
	public void start(Stage primaryStage) {
		try {
			
			String fxmlDocPath = "src/login.fxml";
			FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			 
			AnchorPane root = (AnchorPane) loader.load(fxmlStream);
			 
	
			Scene scene = new Scene(root,1366,768);
		    primaryStage.setMaximized(true);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
// this function is responsible to change scenes on current stage.
	public void changeScene(Stage currentStage, String fxmlDocPath) throws IOException  
	{
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		 
		Scene scene = new Scene(pane,1366,768);
		currentStage.setFullScreen(true);
		currentStage.setScene(scene);
		currentStage.show();
		
	}

}
