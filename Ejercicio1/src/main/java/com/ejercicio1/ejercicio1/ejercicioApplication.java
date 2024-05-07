package com.ejercicio1.ejercicio1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ejercicioApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ejercicioApplication.class.getResource("ejercicio1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Ejercicio 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}