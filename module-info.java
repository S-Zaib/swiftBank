module KillMe {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires java.sql;
	requires mysql.connector.j;

	opens application to javafx.graphics, javafx.fxml;
	
	

	
}
