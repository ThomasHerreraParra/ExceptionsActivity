package com.example.exceptions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class HelloApplicationpunto5 extends Application {

    @Override
    public void start(Stage stage) {
        try {
            //Punto 5
            URL fxmlLocation = getClass().getResource("helloview.fxml");
            if (fxmlLocation == null)
                throw new OurExceptions("El archivo no se encontró.");
            Scene scene = new Scene(new FXMLLoader(fxmlLocation).load(), 320, 240);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (OurExceptions e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al cargar el FXML.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
