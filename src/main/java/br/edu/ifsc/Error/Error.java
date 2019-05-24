package br.edu.ifsc.Error;

import br.edu.ifsc.Entidades.Strings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Error extends Application {

	private String message;

	public Error(String message) {
		this.message = message;
	}

	@Override
	public void start(Stage stage) throws Exception {
		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(280, 120);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		Label lblMessage = new Label(message);
		lblMessage.setLayoutX(10);
		lblMessage.setLayoutY(10);

		// creating the Ok button
		Button btnOk = new Button(Strings.btnOk);
		btnOk.setLayoutX(167);
		btnOk.setLayoutY(10);
		btnOk.setOnMouseClicked(e -> close(stage));

		// adding all created components to the pane
		pane.getChildren().add(lblMessage);
		pane.getChildren().add(btnOk);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	white	0%,	silver	100%);");

		stage.show();
	}

	private void close(Stage stage) {
		stage.close();
	}

}
