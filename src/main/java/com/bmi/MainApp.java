package com.bmi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("BMI.fxml")
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("BMI Calculator");
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(650);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
