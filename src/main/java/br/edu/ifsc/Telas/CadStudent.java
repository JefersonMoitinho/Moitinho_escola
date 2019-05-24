package br.edu.ifsc.Telas;

import com.jfoenix.controls.JFXButton;

import br.edu.ifsc.Entidades.Strings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CadStudent extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(480, 300);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		Label lblCadStudent = new Label(Strings.lblCadStudent);
		lblCadStudent.setLayoutX(10);
		lblCadStudent.setLayoutY(10);
		
		// creating the return button
		Button btnStudentAdd = new JFXButton(Strings.btnStudentAdd);
		btnStudentAdd.setLayoutX(260);
		btnStudentAdd.setLayoutY(240);
		btnStudentAdd.setMaxWidth(80);
		btnStudentAdd.setMinWidth(15);
		btnStudentAdd.setPrefWidth(150);
		btnStudentAdd.setStyle("-fx-background-color: #007FFF; -fx-text-fill: white;");
				
		// creating the return button
		JFXButton btnStudentCanc = new JFXButton(Strings.btnStudentCanc);
		btnStudentCanc.setLayoutX(360);
		btnStudentCanc.setLayoutY(240);
		btnStudentCanc.setMaxWidth(80);
		btnStudentCanc.setMinWidth(15);
		btnStudentCanc.setPrefWidth(150);
		btnStudentCanc.setOnMouseClicked(e -> {CadStudent(stage);});
		btnStudentCanc.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white;");
		
		// adding all created components to the pane
		pane.getChildren().add(lblCadStudent);
		pane.getChildren().add(btnStudentAdd);
		pane.getChildren().add(btnStudentCanc);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	white	0%,	silver	100%);");

		// setting some stage (window) properties
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
		}
	
	private void CadStudent(Stage stage) {
		try {
			new StudentScream().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
