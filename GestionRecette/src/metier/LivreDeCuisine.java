/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import VM.RecetteVM;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pipetit1
 */
public class LivreDeCuisine implements Serializable{
    public static final String PROP_LIST = "listeRecette";
    public static final String PROP_LIST_ADD = "add";
    
    private List<Recette> listeRecette;
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    public List<Recette> getListeRecette() {
        return listeRecette;
    }
    
    public void setListRecette(List<Recette>list) {
        List<Recette> oldList = this.listeRecette;
        this.listeRecette = listeRecette;
        propertyChangeSupport.firePropertyChange(PROP_LIST, oldList, listeRecette);
    }
    
    
    public LivreDeCuisine() {
        listeRecette = new ArrayList();
    }
    public void ajouterRecette(Recette r, int index) {
        propertyChangeSupport.fireIndexedPropertyChange(PROP_LIST_ADD, index, null, r);
        listeRecette.add(r);
    }
    public LivreDeCuisine getInstance() {
        return this;
    }
    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
