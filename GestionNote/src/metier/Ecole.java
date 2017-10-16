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
public class Ecole implements Serializable{
    private List<Etudiant> listeEtudiant;

    public Ecole() {
        listeEtudiant = new ArrayList<>();
    }

    public List<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public Ecole(List<Etudiant> listeEtudiant) {    
        this.listeEtudiant = listeEtudiant = new ArrayList<>();
    }
    
    public void ajouterEtudiant(Etudiant e) {
        listeEtudiant.add(e);
    }
    
    
}
