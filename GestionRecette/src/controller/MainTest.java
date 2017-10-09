/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.deploy.util.FXLoader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import metier.FabriqueLivreDeCuisine;
import metier.FabriqueRecette;
import metier.LivreDeCuisine;
import metier.Recette;
import metier.SerializerLoader;
import metier.SerializerSaver;

/**
 *
 * @author pipetit1
 */
public class MainTest extends Application{
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/maFenetre.fxml"));
            Scene maScene = new Scene(root);
            primaryStage.setScene(maScene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /*public static void main(String args[]) {
        LivreDeCuisine livre = FabriqueLivreDeCuisine.creer();
        livre.ajouterRecette(FabriqueRecette.creer("Recette 1"));
        livre.ajouterRecette(FabriqueRecette.creer("Recette 2"));
        try {
            SerializerSaver.save("sauvegarde.bin", livre);
        } catch (IOException ex) {
            System.out.println("erreur fichier1");
        }
        
        try {
            LivreDeCuisine l;
            l = (LivreDeCuisine) SerializerLoader.load("sauvegarde.bin");
            for(Recette r : l.getListeRecette()) {
                System.out.println(r.getDescription());
            }
        } catch (IOException ex) {
           System.out.println("erreur fichier2");
        } catch (ClassNotFoundException ex) {
            System.out.println("erreur fichier3");
        }
    }*/
}
