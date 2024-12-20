package com.dani.eventos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MyApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader((MyApp.class.getResource("/com/dani/calculadora/calculadora-view.fxml")));

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Calculadora!");

        stage.setScene(scene);

        stage.setMinWidth(380);
        stage.setMinHeight(420);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}