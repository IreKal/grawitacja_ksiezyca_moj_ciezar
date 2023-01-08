package com.example.grawitacja_ksiezyca_moj_ciezar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        double grawitacja;
        double ciezar;
        ciezar = 63.5;
        grawitacja = ciezar * 0.17;
        System.out.println(" Moja waga na ksiazycu wynosi: " + grawitacja);

    }
}