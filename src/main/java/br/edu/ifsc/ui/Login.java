package br.edu.ifsc.ui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import br.edu.ifsc.Entidades.Strings;
import br.edu.ifsc.Error.Error;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Login extends Application {
	private JFXTextField txtUsername;
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
		lblLogin = new Label();
		lblLogin.setLayoutX(10);
		lblLogin.setLayoutY(10);

		lblPassword = new Label();
		lblPassword.setLayoutX(10);
		lblPassword.setLayoutY(70);

		// creating the username textfield
		txtUsername = new JFXTextField();
		txtUsername.setPromptText("Digite aqui seu login");
		txtUsername.setLayoutX(10);
		txtUsername.setLayoutY(31);
		txtUsername.setMaxWidth(150);
		txtUsername.setMinWidth(150);
		txtUsername.setPrefWidth(150);

		// creating the password textfield
		JFXPasswordField txtPassword = new JFXPasswordField();
		txtPassword.setPromptText("Digite aqui sua senha");
		txtPassword.setLayoutX(10);
		txtPassword.setLayoutY(91);
		txtPassword.setMaxWidth(150);
		txtPassword.setMinWidth(150);
		txtPassword.setPrefWidth(150);

		// creating the login button
		JFXButton btnLogin = new JFXButton(Strings.btnLogin);
		btnLogin.setLayoutX(200);
		btnLogin.setLayoutY(30);
		btnLogin.setStyle("-fx-background-color: #007FFF; -fx-text-fill: white;");
		btnLogin.setOnMouseClicked(e -> login(stage, txtUsername.getText().trim(), txtPassword.getText().trim())); // setting
																	         // the button behavior using a lambda expression
	

		// adding all created components to the pane
		pane.getChildren().add(lblLogin);
		pane.getChildren().add(lblPassword);
		pane.getChildren().add(btnLogin);
		pane.getChildren().add(txtUsername);
		pane.getChildren().add(txtPassword);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	white	0%,	silver	100%);");

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