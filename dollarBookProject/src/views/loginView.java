package views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class loginView {
	
	private Scene scene;
	private BorderPane bPane;
	private GridPane gPane;
	private Label loginLbl, emailLbl, passwordLbl, noAccLbl;
	private TextField emailTF;
	private PasswordField passwordField;
	private Button signInBtn;
	
	public loginView(Stage stage) {
		init();
		setLayout();
		
		stage.setScene(scene);
	}
	
	private void init() {
		bPane = new BorderPane();
		gPane = new GridPane();
		
		loginLbl = new Label("Login");
		emailLbl = new Label("Email");
		passwordLbl = new Label("Password");
		noAccLbl = new Label("Don't have an account? Register here!");
		
		emailTF = new TextField();
		passwordField = new PasswordField();
		
		signInBtn = new Button("Sign In");
		
		scene = new Scene(bPane, 500, 500);
		
	}
	
	private void setLayout() {
		gPane.setAlignment(javafx.geometry.Pos.CENTER);
		
		gPane.add(loginLbl, 0, 0);
		gPane.add(emailLbl, 0, 1);
		gPane.add(emailTF, 0, 2);
		gPane.add(passwordLbl, 0, 3);
		gPane.add(passwordField, 0, 4);
		gPane.add(signInBtn, 0, 5);
		
		bPane.setCenter(gPane);
		
	}

}