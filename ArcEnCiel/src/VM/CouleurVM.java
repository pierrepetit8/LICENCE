/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import metier.Couleur;

/**
 *
 * @author pipetit1
 */
public class CouleurVM {

    private final ObjectProperty<Color> couleur;
    public Property<Paint> prop;
    public Color getCouleur() {
        return couleur.get();
    }

    public void setCouleur(Color value) {
        couleur.set(value);
    }

    public ObjectProperty couleurProperty() {
        return couleur;
    }
    
    public CouleurVM(Couleur c) {
        couleur = new SimpleObjectProperty();  
        couleur.set(c.getC());

    }
    
    
}
