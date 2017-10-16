/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import metier.Etudiant;

/**
 *
 * @author pipetit1
 */
public class EtudiantVM {
    private Etudiant metier;
    private CarnetDeNoteVM carnet;
    public EtudiantVM(Etudiant etudiant) {
        this.metier = etudiant;
        carnet = new CarnetDeNoteVM();
    }

    private final StringProperty nom = new SimpleStringProperty();

    public String getNom() {return nom.get();}
    public void setNom(String value) {nom.set(value);}
    public StringProperty nomProperty() {return nom;}
    
    public Etudiant getInstance() {
        return metier;
    }
    
    public void ajouterNote(Double note) {
        
    }
    
}
