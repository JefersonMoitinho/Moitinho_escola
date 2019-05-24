package br.edu.ifsc.Screans;

import com.jfoenix.controls.JFXButton;

import br.edu.ifsc.Entidades.Strings;
import br.edu.ifsc.ui.Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StudentScream extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(480, 300);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		Label lblStudentScream = new Label(Strings.lblStudentScream);
		lblStudentScream.setLayoutX(10);
		lblStudentScream.setLayoutY(10);

		// creating the return button
		Button btnStudentVoltar = new Button(Strings.btnStudentVoltar);
		btnStudentVoltar.setLayoutX(360);
		btnStudentVoltar.setLayoutY(30);
		btnStudentVoltar.setMaxWidth(80);
		btnStudentVoltar.setMinWidth(15);
		btnStudentVoltar.setPrefWidth(150);
		btnStudentVoltar.setOnMouseClicked(e -> {Menu(stage);});
		
		// creating the return button
		Button btnStudentCad = new JFXButton(Strings.btnStudentCad);
		btnStudentCad.setLayoutX(260);
		btnStudentCad.setLayoutY(240);
		btnStudentCad.setMaxWidth(80);
		btnStudentCad.setMinWidth(15);
		btnStudentCad.setPrefWidth(150);
		btnStudentCad.setStyle("-fx-background-color: #007FFF; -fx-text-fill: white;");
		
		// creating the return button
		JFXButton btnStudentDel = new JFXButton(Strings.btnStudentDel);
		btnStudentDel.setLayoutX(360);
		btnStudentDel.setLayoutY(240);
		btnStudentDel.setMaxWidth(80);
		btnStudentDel.setMinWidth(15);
		btnStudentDel.setPrefWidth(150);
		btnStudentDel.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white;");

		// adding all created components to the pane
		pane.getChildren().add(lblStudentScream);
		pane.getChildren().add(btnStudentVoltar);
		pane.getChildren().add(btnStudentCad);
		pane.getChildren().add(btnStudentDel);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	white	0%,	silver	100%);");

		// setting some stage (window) properties
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
	}

	private void Menu(Stage stage) {
		try {
			new Main("admin").start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
