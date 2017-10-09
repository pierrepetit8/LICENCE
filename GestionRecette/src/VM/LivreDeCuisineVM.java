/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import java.util.Collection;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.LivreDeCuisine;
import metier.Recette;

/**
 *
 * @author pipetit1
 */
public class LivreDeCuisineVM {
    public ObservableList<RecetteVM> obsListeRecette;
    private final ListProperty<RecetteVM> listeRecette = new SimpleListProperty<>();
        public ObservableList getListeRecette() {return listeRecette.get();}
        public void setListeRecette(ObservableList value) {listeRecette.set(value);}
        public ListProperty listeRecetteProperty() {return listeRecette;}
    
        
    public LivreDeCuisine metier;
    public LivreDeCuisineVM(LivreDeCuisine livre) {
        obsListeRecette = FXCollections.observableArrayList();
        this.metier  = livre;
        listeRecetteProperty().set(obsListeRecette);
    }
    
    public void ajouterRecette(RecetteVM recette) {
        obsListeRecette.add(recette);
        metier.ajouterRecette(recette.metier);
    }
}
