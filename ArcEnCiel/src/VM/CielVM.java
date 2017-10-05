/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import VM.ArcVM;
import java.io.IOException;
import java.io.Serializable;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.Arc;
import metier.Ciel;
import sauvegarde.Sauvegarde;

/**
 *
 * @author pipetit1
 */
public class CielVM implements Serializable{
    public ObservableList<ArcVM> cielObs;
    
    private final ListProperty<ArcVM> listPropertyCiel = new SimpleListProperty<>();
    public ObservableList<ArcVM> getListPropertyCiel() {
        return listPropertyCiel.get();
    }
    public void setListPropertyCiel(ObservableList value) {
        listPropertyCiel.set(value);
    }
    public ListProperty<ArcVM> listPropertyCielProperty() {
        return listPropertyCiel;
    }
    public Ciel ciel;
    public CielVM(Ciel ciel) {
        cielObs = FXCollections.observableArrayList();
        listPropertyCielProperty().set(cielObs);
        this.ciel = ciel;
       
    }
    public Ciel getInstance() {
        return ciel;
    }
    
    public void ajouterArc(ArcVM a) {
        cielObs.add(a);
        ciel.ajouterArc(a.modele);
    }
    public void enregistrerCiel(String nom) throws IOException {
        Sauvegarde.save(nom, this.getInstance());
    }
    public void supprimerArc(ArcVM a) {
        cielObs.remove(a);
        ciel.supprimerArc(a.modele);
    }
    
}
