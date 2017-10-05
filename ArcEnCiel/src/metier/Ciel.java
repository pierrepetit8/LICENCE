/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pipetit1
 */
public class Ciel implements Serializable {

    
    public ArrayList<Arc> listeArc = new ArrayList<>();

    public ArrayList<Arc> getListeArc() {
        return listeArc;
    }
    public void ajouterArc(Arc a) {
        listeArc.add(a);
    }
    public Ciel getInstance() {
        return this;
    }

    public void supprimerArc(Arc modele) {
        listeArc.remove(modele);
    }
    
}
