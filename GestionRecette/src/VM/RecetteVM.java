/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import metier.Recette;

/**
 *
 * @author pipetit1
 */
public class RecetteVM {

    private final StringProperty description = new SimpleStringProperty();

   
        public String getDescription() { return description.get();}
        public void setDescription(String value) { description.set(value);}
        public StringProperty descriptionProperty() { return description; }
    public Recette metier;
    public RecetteVM(Recette recette) {
        this.metier = recette;    
    }
    
}
