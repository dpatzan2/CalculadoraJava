/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diegopatzan.System;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;


/**
 *
 * @author Diego Fernando Patzán Marroquín
 * @date 20/04/2021
 * @time 09:25:45
 */
public class Principal extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLview.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Calculadora Diego Patz\u00e1n");
        stage.show();
    }

   
    
}
