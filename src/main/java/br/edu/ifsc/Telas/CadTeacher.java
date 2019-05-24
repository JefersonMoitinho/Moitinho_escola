package br.edu.ifsc.Telas;

import com.jfoenix.controls.JFXButton;

import br.edu.ifsc.Entidades.Strings;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CadTeacher extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(480, 300);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		Label lblCadTeacher = new Label(Strings.lblCadTeacher);
		lblCadTeacher.setLayoutX(10);
		lblCadTeacher.setLayoutY(10);
		
		// creating the return button
		Button btnTeacherAdd = new JFXButton(Strings.btnTeacherAdd);
		btnTeacherAdd.setLayoutX(260);
		btnTeacherAdd.setLayoutY(240);
		btnTeacherAdd.setMaxWidth(80);
		btnTeacherAdd.setMinWidth(15);
		btnTeacherAdd.setPrefWidth(150);
		btnTeacherAdd.setOnMouseClicked(e -> {Add(stage);});
		btnTeacherAdd.setStyle("-fx-background-color: #007FFF; -fx-text-fill: white;");
				
		// creating the return button
		JFXButton btnTeacherCanc = new JFXButton(Strings.btnTeacherCanc);
		btnTeacherCanc.setLayoutX(360);
		btnTeacherCanc.setLayoutY(240);
		btnTeacherCanc.setMaxWidth(80);
		btnTeacherCanc.setMinWidth(15);
		btnTeacherCanc.setPrefWidth(150);
		btnTeacherCanc.setOnMouseClicked(e -> {Cancel(stage);});
		btnTeacherCanc.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white;");
		
		// adding all created components to the pane
		pane.getChildren().add(lblCadTeacher);
		pane.getChildren().add(btnTeacherAdd);
		pane.getChildren().add(btnTeacherCanc);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	white	0%,	silver	100%);");

		// setting some stage (window) properties
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
		}
	
	private void Cancel(Stage stage) {
		try {
			new TeacherScream().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void Add(Stage stage) {
		try {
			new TeacherOK(Strings.message3).start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
