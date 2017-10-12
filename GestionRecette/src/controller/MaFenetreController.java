/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VM.FabriqueRecetteVM;
import VM.LivreDeCuisineVM;
import VM.RecetteVM;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import metier.FabriqueLivreDeCuisine;
import metier.FabriqueRecette;
import metier.LivreDeCuisine;
import metier.SerializerLoader;
import metier.SerializerSaver;

/**
 * FXML Controller class
 *
 * @author pipetit1
 */
public class MaFenetreController {
    @FXML TextField textDescription;
    @FXML ListView<RecetteVM> listViewRecette;
    private LivreDeCuisineVM livre;
    private LivreDeCuisine livreLoad;
    public void initialize() throws IOException, FileNotFoundException, ClassNotFoundException {
        try {
            livreLoad = (LivreDeCuisine) SerializerLoader.load("sauvegarde2.bin");
        } catch (Exception e) {
            System.out.println("pas de fichier sauvegarde");
        }
        
            
        
        if(livreLoad != null) {
            livre = new LivreDeCuisineVM(FabriqueLivreDeCuisine.creer());
            livreLoad.getListeRecette().forEach((recette) -> livre.ajouterRecette(FabriqueRecetteVM.creer(recette)));
            livreLoad.getListeRecette().forEach((recette) -> System.out.println(recette.getDescription()));
        }else {
            livre = new LivreDeCuisineVM(FabriqueLivreDeCuisine.creer());
            livre.ajouterRecette(FabriqueRecetteVM.creer(FabriqueRecette.creer("Recette 1")));
            livre.ajouterRecette(FabriqueRecetteVM.creer(FabriqueRecette.creer("Recette 2")));
        }
        listViewRecette.setCellFactory(param -> {
            return new FabriqueCell();
        });
        listViewRecette.itemsProperty().bindBidirectional(livre.listeRecetteProperty());
        
        listViewRecette.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<RecetteVM>() {
            @Override
            public void changed(ObservableValue<? extends RecetteVM> observable, RecetteVM oldValue, RecetteVM newValue) {
                if(oldValue != null) {
                    textDescription.textProperty().unbindBidirectional(oldValue.descriptionProperty());
                }
                if(newValue != null) {
                    textDescription.textProperty().bindBidirectional(newValue.descriptionProperty());
                }
            }
        });
        
    } 
    
    @FXML
    public void ajouterRecette() {
        Random r = new Random();
        livre.ajouterRecette(FabriqueRecetteVM.creer(FabriqueRecette.creer("recette num"+String.valueOf(r.nextInt()))));
    }
    @FXML 
    public void sauvegarder() throws IOException {
        SerializerSaver.save("sauvegarde2.bin", livre.metier);
    }
}
