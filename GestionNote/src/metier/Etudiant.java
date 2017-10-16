/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;

/**
 *
 * @author pipetit1
 */
public class Etudiant implements Serializable{
    public CarnetDeNote carnet;
    public Etudiant(String nom) {
        this.carnet = new CarnetDeNote();
        this.nom = nom;
    }
    private String nom;

    public String getNom() {
        return nom;
    }
    public void ajouterNote(Double note) {
        if(note<0 || note > 20) {
            throw new IllegalArgumentException("La note doit etre entre 0 et 20");
        }
        else carnet.ajouterNote(note);
    }
    public void afficherNote() {
        carnet.afficherNotes();
    }
}
