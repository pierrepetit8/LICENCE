/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VM.RecetteVM;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.Property;
import javafx.scene.control.ListCell;
import metier.Recette;

/**
 *
 * @author pipetit1
 */
public class FabriqueCell extends ListCell<RecetteVM> {

    @Override
    protected void updateItem(RecetteVM item, boolean empty) {
        super.updateItem(item, empty);
        if(item != null) {
           textProperty().bind(Bindings.format(format, args))
            /*textProperty().bind(    Bindings.createStringBinding(
                    () -> item.getDescription().concat(item.getDescription()), item.descriptionProperty()));*/
          
        }
    }
    
}
