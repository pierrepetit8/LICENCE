/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pipetit1
 */
public class LivreDeCuisine implements Serializable{
    private List<Recette> listeRecette;

    public List<Recette> getListeRecette() {
        return listeRecette;
    }
    
    public LivreDeCuisine() {
        listeRecette = new ArrayList();
    }
    public void ajouterRecette(Recette r) {
        listeRecette.add(r);
    }
    public LivreDeCuisine getInstance() {
        return this;
    }
}
