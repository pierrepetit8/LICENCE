/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Fabriques.FabriqueArc;
import Fabriques.FabriqueArcVM;
import Fabriques.FabriqueCiel;
import Fabriques.FabriqueCielVM;
import Fabriques.FabriqueCouleur;
import Fabriques.FabriqueCouleurVM;
import java.awt.Color;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import VM.ArcVM;
import VM.CielVM;
import VM.CouleurVM;
import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.shape.Rectangle;
import metier.Arc;
import metier.Ciel;
import metier.Couleur;

/**
 * FXML Controller class
 *
 * @author pipetit1
 */
public class MaFenetreController {
    @FXML ListView<ArcVM> listViewArc;
    @FXML TextField field1, field2, field3, nomField;
    @FXML Circle rond1, rond2, rond3;
    @FXML ListView<CouleurVM> listViewColor;
    @FXML VBox vbox;
    @FXML Button suprBtn;
    
    private CielVM c;
    private ArcVM a;
    private ObservableList obs;
    public void initialize() throws IOException {
        c = FabriqueCielVM.creerCiel(FabriqueCiel.creerCiel());
        a = FabriqueArcVM.creerArc(FabriqueArc.creerArc("premier arc"));
        ArcVM b = FabriqueArcVM.creerArc(FabriqueArc.creerArc("deuxieme arc"));
        c.ajouterArc(a);
        c.ajouterArc(b);
        b.ajouterCouleur(FabriqueCouleurVM.creerCouleurVM(FabriqueCouleur.creerCouleur(0.3,0.3,0.3)));
        b.ajouterCouleur(FabriqueCouleurVM.creerCouleurVM(FabriqueCouleur.creerCouleur(0.6,0.6,0.5)));
        
        listViewArc.itemsProperty().bindBidirectional(c.listPropertyCielProperty());
        
        //listViewColor.itemsProperty().bindBidirectional(a.listCouleurProperty());
        /*listViewArc.getSelectionModel().selectedItemProperty().addListener((ObservableValue observable, ArcVM oldValue, ArcVM newValue) -> {
            if(oldValue != null) {
                nomField.textProperty().unbindBidirectional(oldValue.nomArcProperty());
                //rond1.fillProperty().bindBidirectional(((Arc)oldValue).getC().couleurProperty());
            }
            if (newValue != null) {
                //field1.textProperty().bind(((Arc)newValue).getC().rougeToString());
                nomField.textProperty().bindBidirectional(newValue.nomArcProperty());
                for (Object c3 : ((ArcVM)newValue).getListCouleur()) {
                    //vbox.getChildren().add(new Circle().fillProperty().bindBidirectional(((Couleur)c).couleurProperty()));
                    Circle circle = new Circle(10);
                    circle.setFill(((CouleurVM) c3).getCouleur());
                    vbox.getChildren().add(circle);
                }
                //rond1.fillProperty().bindBidirectional(((Arc)newValue).getC().couleurProperty());
            }
        });*/
     
        listViewArc.getSelectionModel().selectedItemProperty().addListener(( observable,  oldValue,  newValue) -> {
            if(oldValue != null) {
                
                //nomField.textProperty().unbindBidirectional(oldValue.nomArcProperty());
                vbox.getChildren().clear();
            }
            
            if(newValue != null) {
                vbox.getChildren().clear();
                //nomField.textProperty().bindBidirectional(newValue.nomArcProperty());
                for(CouleurVM c : newValue.getListCouleur()) {
                    Rectangle r = new Rectangle(60.0,10.0);
                    r.setFill(c.getCouleur());
                    vbox.getChildren().add(r);
                    //vbox.getChildren().add(new Rectangle(10.0,10.0).fillProperty().bindBidirectional(c.couleurProperty()));
                }
                
            }
            
        });
        
        
    }    
    @FXML
    public void ajouterArc() {
       
        c.ajouterArc(new ArcVM(FabriqueArc.creerArc(nomField.getText())));
        
    }
    @FXML 
    public void supprimerArc() {
        c.supprimerArc(listViewArc.getSelectionModel().selectedItemProperty().getValue());
    }
    
    @FXML
    public void ajouterCouleur() {
        vbox.getChildren().clear();
        System.out.println("dfsqfsds");
        double r = Double.valueOf(field1.getText());
        double v = Double.valueOf(field1.getText());
        double b = Double.valueOf(field1.getText());
        System.out.println(r+""+v+""+b); 
       Couleur c = FabriqueCouleur.creerCouleur(r, v, b);
        CouleurVM cvm = FabriqueCouleurVM.creerCouleurVM(c);
        //listViewArc.getSelectionModel().selectedItemProperty().getValue().ajouterCouleur(cvm);
        listViewArc.getSelectionModel().getSelectedItems().get(0).ajouterCouleur(cvm);
    }
    @FXML 
    public void sauvegarder() throws IOException {
        c.enregistrerCiel("FICHIERSAVE.bin");
    }
    
    
}
