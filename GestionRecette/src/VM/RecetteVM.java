/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import metier.Recette;

/**
 *
 * @author pipetit1
 */
public class RecetteVM implements PropertyChangeListener {

    private final StringProperty description = new SimpleStringProperty();
        public String getDescription() { return description.get();}
        public void setDescription(String value) { description.set(value);}
        public StringProperty descriptionProperty() { return description; }
    public Recette metier;
    public RecetteVM(Recette recette) {
        
        this.metier = recette;
        setDescription(recette.getDescription());
        metier.addPropertyChangeListener(this);
        description.addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                metier.setDescription(newValue);
            }
        });
    }

    @Override
    public String toString() {
        return metier.getDescription();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(metier.PROP_DESCRIPTION)) {
            setDescription((String) evt.getNewValue());
        }
    }
   
    
    
}
