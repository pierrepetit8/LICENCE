/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javafx.scene.paint.Color;

/**
 *
 * @author pipetit1
 */
public class Couleur {

    public Color getC() {
        return c;
    }
    public Color c;
    
    public Couleur(double r, double v, double b) {
        c = new Color(r, r, b, 1);
    }

    @Override
    public String toString() {
        return "Couleur{" + "c=" + c + '}';
    }
    
}
