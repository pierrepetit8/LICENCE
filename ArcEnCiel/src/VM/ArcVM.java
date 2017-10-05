/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.Serializable;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.Arc;
import sauvegarde.Sauvegarde;

/**
 *
 * @author pipetit1
 */
public class ArcVM implements Serializable, PropertyChangeListener{

    public ObservableList<CouleurVM> obsArc;
    private final ListProperty<CouleurVM> listCouleur = new SimpleListProperty<>();

    public ObservableList<CouleurVM> getListCouleur() {
        return listCouleur.get();
    }

    public void setListCouleur(ObservableList value) {
        listCouleur.set(value);
    }

    public ListProperty<CouleurVM> listCouleurProperty() {
        return listCouleur;
    }
    private final StringProperty nomArc = new SimpleStringProperty();

    public String getNomArc() {
        return nomArc.get();
    }

    public void setNomArc(String value) {
        nomArc.set(value);
    }

    public StringProperty nomArcProperty() {
        return nomArc;
    }
   
    public void ajouterCouleur(CouleurVM c) {
        obsArc.add(c);
    }

    public Arc modele;
    
    public ArcVM(Arc modele) {
        obsArc = FXCollections.observableArrayList();
        listCouleur.set(obsArc);
        this.modele = modele;
        setNomArc(modele.getNom());
        modele.addPropertyChangeListener(this);
        
        nomArc.addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
               modele.setNom(newValue);
            }
        });
        

    }
    public Arc getInstance() {
        return modele;
    }

    @Override
    public String toString() {
        return nomArc.get();
    }
    
    public void saveArc() throws IOException {
        Sauvegarde.save("arc.bin",this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(modele.PROP_NOM)) {
            nomArc.set((String) evt.getNewValue());
        }
    }
    
}
