/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import VM.EcoleVM;
import VM.EtudiantVM;
import VM.FabriqueEtudiantVM;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.beans.property.Property;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import metier.Ecole;
import metier.FabriqueEtudiant;

/**
 * FXML Controller class
 *
 * @author pipetit1
 */
public class MaFenetreController {

    @FXML public ListView<EtudiantVM> listView;
    
    public void initialize() {
        Ecole e = new Ecole();
        EcoleVM ecole = new EcoleVM(e);
        EtudiantVM etu = FabriqueEtudiantVM.creer(FabriqueEtudiant.creer("pierre"));
        ecole.ajouterEtudiant(etu);
        listView.itemsProperty().bind(ecole.listeEtudiantProperty());

        
    }    
    @FXML 
    public void ajouterEtudiant() {
        
    }
    
}
