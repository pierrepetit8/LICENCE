/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import VM.ArcVM;
import VM.CouleurVM;
import javafx.scene.control.ListCell;
import javafx.scene.shape.Circle;
import metier.Couleur;

/**
 *
 * @author petit
 */
public class ArcCell extends ListCell<CouleurVM> {

    @Override
    protected void updateItem(CouleurVM item, boolean empty) {
        super.updateItem(item, empty);
        if(item != null) {
            textProperty().bind(item.couleurProperty());
        }   
    }

    
    
}
