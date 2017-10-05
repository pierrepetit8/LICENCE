/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabriques;

import VM.CouleurVM;
import metier.Couleur;

/**
 *
 * @author petit
 */
public class FabriqueCouleur {
    public static Couleur creerCouleur(double r, double v, double b) {
        return new Couleur(r, v,b);
    }
}
