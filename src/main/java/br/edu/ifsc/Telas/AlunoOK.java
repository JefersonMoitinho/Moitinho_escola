package br.edu.ifsc.Telas;

import com.jfoenix.controls.JFXButton;

import br.edu.ifsc.Entidades.Strings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AlunoOK extends Application {
	
	private String message2;
	
	public AlunoOK(String message2) {
		this.message2 = message2;
	}

	@Override
	public void start(Stage stage) throws Exception {
		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(210, 110);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		Label lblMessage2 = new Label(message2);
		lblMessage2.setLayoutX(10);
		lblMessage2.setLayoutY(10);

		// creating the Ok button
		JFXButton btnOk2 = new JFXButton(Strings.btnOk2);
		btnOk2.setLayoutX(95);
		btnOk2.setLayoutY(50);
		btnOk2.setOnMouseClicked(e -> {Back(stage);});
		btnOk2.setStyle("-fx-background-color: #007FFF; -fx-text-fill: white;");

		// adding all created components to the pane
		pane.getChildren().add(lblMessage2);
		pane.getChildren().add(btnOk2);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	white	0%,	silver	100%);");

		stage.show();
	}

	private void Back(Stage stage) {
		try {
			new StudentScream().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
