package br.edu.ifsc.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;

public class Login extends Application {
	private Button btnLogin;
	private TextField txtUsername;
	private PasswordField txtPassword;
	private Label lblLogin;
	private Label lblPassword;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(280, 120);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		lblLogin = new Label(Strings.lblLogin);
		lblLogin.setLayoutX(10);
		lblLogin.setLayoutY(10);

		lblPassword = new Label(Strings.lblPassword);
		lblPassword.setLayoutX(10);
		lblPassword.setLayoutY(70);

		// creating the username textfield
		txtUsername = new TextField();
		txtUsername.setLayoutX(10);
		txtUsername.setLayoutY(31);
		txtUsername.setMaxWidth(150);
		txtUsername.setMinWidth(150);
		txtUsername.setPrefWidth(150);

		// creating the password textfield
		txtPassword = new PasswordField();
		txtPassword.setLayoutX(10);
		txtPassword.setLayoutY(91);
		txtPassword.setMaxWidth(150);
		txtPassword.setMinWidth(150);
		txtPassword.setPrefWidth(150);

		// creating the login button
		btnLogin = new Button(Strings.btnLogin);
		btnLogin.setLayoutX(167);
		btnLogin.setLayoutY(30);
		btnLogin.setOnMouseClicked(e -> login(stage, txtUsername.getText().trim(), txtPassword.getText().trim())); // setting the button behavior
																						// using a
																						// lambda expression

		// adding all created components to the pane
		pane.getChildren().add(lblLogin);
		pane.getChildren().add(lblPassword);
		pane.getChildren().add(btnLogin);
		pane.getChildren().add(txtUsername);
		pane.getChildren().add(txtPassword);

		// applying the LIGHT style from the JMetro library to the pane
		new JMetro(JMetro.Style.LIGHT).applyTheme(pane);

		// setting some stage (window) properties
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
	}

	private void login(Stage stage, String username, String password) {


		if (!username.equals("admin")) {
			try {
				new Error(Strings.loginError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}

		if (!password.equals("admin")) {
			try {
				new Error(Strings.passwordError).start(new Stage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}

		try {
			new Main(this.txtUsername.getText()).start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}