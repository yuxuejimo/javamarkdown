package com.dzm.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * java markdownÖ÷½çÃæ
 */
public class MarkDown extends Application{
	
	private Stage mainStage;
	
    public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
            // Read file fxml and draw interface.
            Parent root = FXMLLoader.load(getClass()
                    .getResource("main1.fxml"));

            primaryStage.setTitle("JavaMarkDown");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
            setMainStage(primaryStage);

        } catch(Exception e) {
            e.printStackTrace();
        }
	}

	public Stage getMainStage() {
		return mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}
		
}
