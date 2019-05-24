package br.edu.ifsc.Telas;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;

import br.edu.ifsc.Entidades.Strings;
import br.edu.ifsc.Mensagem.AlunoOK;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CadStudent extends Application {
	
	private TextField txtnomeStudent;
	private TextField txtNascStudent;
	private TextField txtRgStudent;
	private TextField txtCpfStudent;

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
		
		// creating the label component
		Label lblNomeStudent = new Label(Strings.lblNomeStudent);
		lblNomeStudent.setLayoutX(10);
		lblNomeStudent.setLayoutY(40);
		
		// creating the label component
		Label lblNascStudent = new Label(Strings.lblNascStudent);
		lblNascStudent.setLayoutX(300);
		lblNascStudent.setLayoutY(40);
		
		// creating the label component
		Label lblRgStudent = new Label(Strings.lblRgStudent);
		lblRgStudent.setLayoutX(10);
		lblRgStudent.setLayoutY(100);
		
		// creating the label component
		Label lblCpfStudent = new Label(Strings.lblCpfStudent);
		lblCpfStudent.setLayoutX(300);
		lblCpfStudent.setLayoutY(100);
		
		// creating the label component
		Label lblSexoStudent = new Label(Strings.lblSexoStudent);
		lblSexoStudent.setLayoutX(10);
		lblSexoStudent.setLayoutY(160);
		
		// creating the return button
		Button btnStudentAdd = new JFXButton(Strings.btnStudentAdd);
		btnStudentAdd.setLayoutX(260);
		btnStudentAdd.setLayoutY(240);
		btnStudentAdd.setMaxWidth(80);
		btnStudentAdd.setMinWidth(15);
		btnStudentAdd.setPrefWidth(150);
		btnStudentAdd.setOnMouseClicked(e -> {Add(stage);});
		btnStudentAdd.setStyle("-fx-background-color: #007FFF; -fx-text-fill: white;");
				
		// creating the return button
		JFXButton btnStudentCanc = new JFXButton(Strings.btnStudentCanc);
		btnStudentCanc.setLayoutX(360);
		btnStudentCanc.setLayoutY(240);
		btnStudentCanc.setMaxWidth(80);
		btnStudentCanc.setMinWidth(15);
		btnStudentCanc.setPrefWidth(150);
		btnStudentCanc.setOnMouseClicked(e -> {Cancel(stage);});
		btnStudentCanc.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white;");
		
		// creating the name textfield
		txtnomeStudent = new TextField();
		txtnomeStudent.setLayoutX(10); 
		txtnomeStudent.setLayoutY(60);
		txtnomeStudent.setMaxWidth(150);
		txtnomeStudent.setMinWidth(250);
		txtnomeStudent.setPrefWidth(150);
		
		// creating the Birth textfield
		JFXDatePicker txtNascStudent = new JFXDatePicker();
		txtNascStudent.setLayoutX(300);
		txtNascStudent.setLayoutY(60);
		txtNascStudent.setMaxWidth(150);
		txtNascStudent.setMinWidth(150);
		txtNascStudent.setPrefWidth(150);
		
		// creating the Rg textfield
		txtRgStudent = new TextField();
		txtRgStudent.setLayoutX(10);
		txtRgStudent.setLayoutY(120);
		txtRgStudent.setMaxWidth(150);
		txtRgStudent.setMinWidth(150);
		txtRgStudent.setPrefWidth(150);
				
		// creating the CPF textfield
		txtCpfStudent = new TextField();
		txtCpfStudent.setLayoutX(300);
		txtCpfStudent.setLayoutY(120);
		txtCpfStudent.setMaxWidth(150);
		txtCpfStudent.setMinWidth(150);
		txtCpfStudent.setPrefWidth(150);
		
		CheckBox cb1 = new CheckBox ("Segundo");
		cb1.setText ("M");
		cb1.setSelected (true);
		cb1.setLayoutX(10);
		cb1.setLayoutY(180);
		
		CheckBox cb2 = new CheckBox ("Segundo");
		cb2.setText ("F");
		cb2.setSelected (true);
		cb2.setLayoutX(70);
		cb2.setLayoutY(180);
	
		
		// adding all created components to the pane
		pane.getChildren().add(lblCadStudent);
		pane.getChildren().add(lblNomeStudent);
		pane.getChildren().add(lblNascStudent);
		pane.getChildren().add(lblRgStudent);
		pane.getChildren().add(lblCpfStudent);
		pane.getChildren().add(lblSexoStudent);
		pane.getChildren().add(btnStudentAdd);
		pane.getChildren().add(btnStudentCanc);
		pane.getChildren().add(txtnomeStudent);
		pane.getChildren().add(txtNascStudent);
		pane.getChildren().add(txtRgStudent);
		pane.getChildren().add(txtCpfStudent);
		pane.getChildren().add(cb1);
		pane.getChildren().add(cb2);

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
			new StudentScream().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void Add(Stage stage) {
		try {
			new AlunoOK(Strings.message2).start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
