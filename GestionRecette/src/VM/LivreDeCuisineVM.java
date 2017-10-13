/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import java.beans.IndexedPropertyChangeEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.FabriqueRecette;
import metier.LivreDeCuisine;
import metier.Recette;

/**
 *
 * @author pipetit1
 */
public class LivreDeCuisineVM implements PropertyChangeListener {
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
        metier.addPropertyChangeListener(this);
    }
    
    public void ajouterRecette(RecetteVM recette) {
        obsListeRecette.add(recette);
        int index  = obsListeRecette.size();
        metier.ajouterRecette(recette.metier, index);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        /*if(evt.getPropertyName().equals(metier.PROP_LIST)) {
            setListeRecette((ObservableList) evt.getNewValue());
        }*/
        if(evt.getPropertyName().equals(metier.PROP_LIST_ADD)) {
            System.out.println("event ajout recette");
            RecetteVM r = FabriqueRecetteVM.creer((FabriqueRecette.creer(((Recette)evt.getNewValue()).getDescription())));
            //RecetteVM r = FabriqueRecetteVM.creer(FabriqueRecetteVM.creer());
            obsListeRecette.add(((IndexedPropertyChangeEvent)evt).getIndex(), r);
        }
    }

    
    
}
