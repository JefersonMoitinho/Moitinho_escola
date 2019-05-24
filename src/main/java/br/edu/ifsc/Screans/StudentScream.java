package br.edu.ifsc.Screans;

import br.edu.ifsc.Entidades.Strings;
import br.edu.ifsc.ui.Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StudentScream extends Application {

	private Button btnMenuVoltar;
	
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
		btnMenuVoltar = new Button(Strings.btnMenuVoltar);
		btnMenuVoltar.setLayoutX(360);
		btnMenuVoltar.setLayoutY(30);
		btnMenuVoltar.setMaxWidth(80);
		btnMenuVoltar.setMinWidth(15);
		btnMenuVoltar.setPrefWidth(150);
		btnMenuVoltar.setOnMouseClicked(e ->{Menu(stage);});

		// adding all created components to the pane
		pane.getChildren().add(lblStudentScream);
		pane.getChildren().add(btnMenuVoltar);

		// melhorando aparencia do painel principal
		pane.setStyle("-fx-background-color:	linear-gradient(\n"
				+ "from	0%	0%	to	100%	100%,	grey	0%,	silver	100%);");

		// setting some stage (window) properties
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
	}
	
	private void Menu(Stage stage) {
		try {
			new Main().start(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
