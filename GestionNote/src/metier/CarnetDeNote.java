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
public class CarnetDeNote implements Serializable {
    private List<Double> listeNote;
    public CarnetDeNote() {
        this.listeNote = new ArrayList<>();
    }
    public void ajouterNote(Double note) {
        listeNote.add(note);
    }
    public void afficherNotes() {
        listeNote.forEach((note) -> {
            System.out.println(String.valueOf(note));
        });
    }
}
