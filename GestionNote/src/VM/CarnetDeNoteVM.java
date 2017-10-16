/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author pipetit1
 */
public class CarnetDeNoteVM {

    private final DoubleProperty note = new SimpleDoubleProperty();

    public double getNote() {
        return note.get();
    }

    public void setNote(double value) {
        note.set(value);
    }

    public DoubleProperty noteProperty() {
        return note;
    }
    
}
