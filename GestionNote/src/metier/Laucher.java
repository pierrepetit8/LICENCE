/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pipetit1
 */
public class Laucher extends Application {
    /*public static void main(String args[]) throws IOException {
        Ecole ecole = new Ecole();
        Etudiant e1 = FabriqueEtudiant.creer("pierre");
        Etudiant e2 = FabriqueEtudiant.creer("jean");
        System.out.println(e1.getNom());
        ecole.ajouterEtudiant(e1);
        ecole.ajouterEtudiant(e2);
        e1.ajouterNote(10.0);
        e1.afficherNote();
        try {
            SerializaterWriter.ecrire("save.bin",e1 );
        } catch (IOException ex) {
            System.out.println("probeme fichier");
        }       
        Etudiant nouv;
        try {
            nouv = (Etudiant) SerializaterLoader.load("save.bin");
            nouv.afficherNote();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Laucher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Laucher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MaFenetre.fxml"));
        Scene maScene = new Scene(root);
        primaryStage.setScene(maScene);
        primaryStage.show();
    }
    
}
