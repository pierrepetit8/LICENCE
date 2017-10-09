/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VM.FabriqueRecetteVM;
import VM.LivreDeCuisineVM;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import metier.FabriqueLivreDeCuisine;
import metier.FabriqueRecette;
import metier.LivreDeCuisine;

/**
 * FXML Controller class
 *
 * @author pipetit1
 */
public class MaFenetreController {
    @FXML Text textDescription;
    @FXML ListView listViewRecette;
    public void initialize() {
        LivreDeCuisineVM livre = new LivreDeCuisineVM(FabriqueLivreDeCuisine.creer());
        
        livre.ajouterRecette(FabriqueRecetteVM.creer(FabriqueRecette.creer("Recette 1")));
        livre.ajouterRecette(FabriqueRecetteVM.creer(FabriqueRecette.creer("Recette 1")));
        listViewRecette.itemsProperty().bindBidirectional(livre.listeRecetteProperty());
        
        
    } 
    
}
