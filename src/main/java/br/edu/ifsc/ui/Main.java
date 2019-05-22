package br.edu.ifsc.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;

public class Main extends Application {

	private String username;
	private Button btnMenuSair;
	private Button btnMenuAluno;
	private Button btnMenuProfessor;
	private Button btnMenuRotinaClasse;
	private Button btnMenuBiblioteca;

	public Main(String username) {
		this.username = username;
	}

	@Override
	public void start(Stage stage) throws Exception {
		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(480, 300);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		// creating the label component
		Label lblMain = new Label(Strings.lblMain + " " + username + "!");
		lblMain.setLayoutX(10);
		lblMain.setLayoutY(10);

		// creating the exit menu button
		btnMenuSair = new Button(Strings.btnMenuSair);
		btnMenuSair.setLayoutX(370);
		btnMenuSair.setLayoutY(30);
		btnMenuSair.setMaxWidth(90);
		btnMenuSair.setMinWidth(15);
		btnMenuSair.setPrefWidth(150);

		// creating the student menu button
		btnMenuAluno = new Button(Strings.btnMenuAluno);
		btnMenuAluno.setLayoutX(30);
		btnMenuAluno.setLayoutY(100);
		btnMenuAluno.setMaxWidth(150);
		btnMenuAluno.setMinWidth(190);
		btnMenuAluno.setPrefWidth(150);

		// creating the teacher menu button
		btnMenuProfessor = new Button(Strings.btnMenuProfessor);
		btnMenuProfessor.setLayoutX(240);
		btnMenuProfessor.setLayoutY(100);
		btnMenuProfessor.setMaxWidth(150);
		btnMenuProfessor.setMinWidth(190);
		btnMenuProfessor.setPrefWidth(150);

		// creating the menu button class routine
		btnMenuRotinaClasse = new Button(Strings.btnMenuRotinaClasse);
		btnMenuRotinaClasse.setLayoutX(30);
		btnMenuRotinaClasse.setLayoutY(155);
		btnMenuRotinaClasse.setMaxWidth(150);
		btnMenuRotinaClasse.setMinWidth(190);
		btnMenuRotinaClasse.setPrefWidth(150);

		// creating the library menu button
		btnMenuBiblioteca = new Button(Strings.btnMenuBiblioteca);
		btnMenuBiblioteca.setLayoutX(240);
		btnMenuBiblioteca.setLayoutY(155);
		btnMenuBiblioteca.setMaxWidth(150);
		btnMenuBiblioteca.setMinWidth(190);
		btnMenuBiblioteca.setPrefWidth(150);

		// adding all created components to the pane
		pane.getChildren().add(lblMain);
		pane.getChildren().add(btnMenuAluno);
		pane.getChildren().add(btnMenuProfessor);
		pane.getChildren().add(btnMenuRotinaClasse);
		pane.getChildren().add(btnMenuBiblioteca);
		pane.getChildren().add(btnMenuSair);

		// applying the LIGHT style from the JMetro library to the pane
		new JMetro(JMetro.Style.LIGHT).applyTheme(pane);

		// setting some stage (window) properties
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
	}

}
