package com.jpaul;// Created by pticlavilca@gmail.com on 07/08/2015.

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setMaximized(true);

        stage.setWidth(800);
        stage.setHeight(800);

        Scene scene = new Scene(new Group());

        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        webEngine.load("http://www.laserdisc.com");

        scene.setRoot(webView);
        stage.setScene(scene);
        stage.show();


    }
}
