package br.edu.ifsc.Telas;

import com.jfoenix.controls.JFXButton;

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
	
	private TextField txtnome;
	private TextField txtNasc;
	private TextField txtRg;
	private TextField txtCpf;

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
		Label lblNome = new Label(Strings.lblNome);
		lblNome.setLayoutX(10);
		lblNome.setLayoutY(40);
		
		// creating the label component
		Label lblNasc = new Label(Strings.lblNasc);
		lblNasc.setLayoutX(300);
		lblNasc.setLayoutY(40);
		
		// creating the label component
		Label lblRg = new Label(Strings.lblRg);
		lblRg.setLayoutX(10);
		lblRg.setLayoutY(100);
		
		// creating the label component
		Label lblCpf = new Label(Strings.lblCpf);
		lblCpf.setLayoutX(300);
		lblCpf.setLayoutY(100);
		
		// creating the label component
		Label lblSexo = new Label(Strings.lblSexo);
		lblSexo.setLayoutX(10);
		lblSexo.setLayoutY(160);
		
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
		txtnome = new TextField();
		txtnome.setLayoutX(10); 
		txtnome.setLayoutY(60);
		txtnome.setMaxWidth(150);
		txtnome.setMinWidth(250);
		txtnome.setPrefWidth(150);
		
		// creating the Birth textfield
		txtNasc = new TextField();
		txtNasc.setLayoutX(300);
		txtNasc.setLayoutY(60);
		txtNasc.setMaxWidth(150);
		txtNasc.setMinWidth(150);
		txtNasc.setPrefWidth(150);
		
		// creating the Rg textfield
		txtRg = new TextField();
		txtRg.setLayoutX(10);
		txtRg.setLayoutY(120);
		txtRg.setMaxWidth(150);
		txtRg.setMinWidth(150);
		txtRg.setPrefWidth(150);
				
		// creating the CPF textfield
		txtCpf = new TextField();
		txtCpf.setLayoutX(300);
		txtCpf.setLayoutY(120);
		txtCpf.setMaxWidth(150);
		txtCpf.setMinWidth(150);
		txtCpf.setPrefWidth(150);
		
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
		pane.getChildren().add(lblNome);
		pane.getChildren().add(lblNasc);
		pane.getChildren().add(lblRg);
		pane.getChildren().add(lblCpf);
		pane.getChildren().add(lblSexo);
		pane.getChildren().add(btnStudentAdd);
		pane.getChildren().add(btnStudentCanc);
		pane.getChildren().add(txtnome);
		pane.getChildren().add(txtNasc);
		pane.getChildren().add(txtRg);
		pane.getChildren().add(txtCpf);
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
