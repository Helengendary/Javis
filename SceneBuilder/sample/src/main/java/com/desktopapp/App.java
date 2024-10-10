package com.desktopapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene scene = MainController.CreateScene(0);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
