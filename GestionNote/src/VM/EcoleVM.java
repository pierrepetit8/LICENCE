/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.Ecole;
import metier.Etudiant;

/**
 *
 * @author pipetit1
 */
public class EcoleVM {
    private ObservableList<EtudiantVM> obsList;
    private final ListProperty<EtudiantVM> listeEtudiant = new SimpleListProperty<>();

    public ObservableList getListeEtudiant() {
        return listeEtudiant.get();
    }

    public void setListeEtudiant(ObservableList value) {
        listeEtudiant.set(value);
    }

    public ListProperty listeEtudiantProperty() {
        return listeEtudiant;
    }
    public Ecole metier;
    public EcoleVM(Ecole ecole) {
        this.metier = ecole;
        obsList =  FXCollections.observableArrayList();
        setListeEtudiant(obsList);
    }
    public void ajouterEtudiant(EtudiantVM e) {
        obsList.add(e);
        metier.ajouterEtudiant(e.getInstance());
    }
    
    
    
}
