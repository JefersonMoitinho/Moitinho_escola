package br.edu.ifsc.Telas;

import com.jfoenix.controls.JFXButton;

import br.edu.ifsc.Entidades.Strings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TeacherOK extends Application{

private String message3;
	
	public TeacherOK(String message3) {
		this.message3 = message3;
	}

	@Override
	public void start(Stage stage) throws Exception {
		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(210, 110);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		Label lblMessage3 = new Label(message3);
		lblMessage3.setLayoutX(10);
		lblMessage3.setLayoutY(10);

		// creating the Ok button
		JFXButton btnOk3 = new JFXButton(Strings.btnOk3);
		btnOk3.setLayoutX(95);
		btnOk3.setLayoutY(50);
		btnOk3.setOnMouseClicked(e -> {Back(stage);});	
		btnOk3.setStyle("-fx-background-color: #007FFF; -fx-text-fill: white;");

		// adding all created components to the pane
		pane.getChildren().add(lblMessage3);
		pane.getChildren().add(btnOk3);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	white	0%,	silver	100%);");

		stage.show();
	}

	private void Back(Stage stage) {
		try {
			new TeacherScream().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
