package main;

import javafx.application.Application;
import javafx.stage.Stage;
import views.loginView;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		loginView loginPage = new loginView(primaryStage);
		primaryStage.show();
		primaryStage.setTitle("Dollar Book Shop");
	}

}
