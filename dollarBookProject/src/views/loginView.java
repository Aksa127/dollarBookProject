package views;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
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
		// Pane
		bPane = new BorderPane();
		gPane = new GridPane();
		
		// TextField
		emailTF = new TextField();
		passwordField = new PasswordField();
			
		signInBtn = new Button("Sign In");
		
		// Label
		loginLbl = new Label("Login");
		loginLbl.setPrefWidth(300);
		loginLbl.setFont(Font.font("Arial", FontWeight.BOLD, 36.0));
		loginLbl.setTextAlignment(TextAlignment.CENTER);;
		loginLbl.setBorder(Border.stroke(null));
		
		emailLbl = new Label("Email");
		emailLbl.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 14.0));

		
		passwordLbl = new Label("Password");
		noAccLbl = new Label("Don't have an account? Register here!");
		
		
		
		// Scene
		scene = new Scene(bPane, 800, 500);
		
	}
	
	private void setLayout() {
		gPane.setAlignment(Pos.CENTER);
		gPane.setVgap(8);
		
		gPane.add(loginLbl, 0, 0);
		gPane.add(emailLbl, 0, 1);
		gPane.add(emailTF, 0, 2);
		gPane.add(passwordLbl, 0, 3);
		gPane.add(passwordField, 0, 4);
		gPane.add(signInBtn, 0, 5);
		gPane.add(noAccLbl, 0, 6);
		
		bPane.setCenter(gPane);
		
	}

}
