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
public class FabriqueCouleurVM {
    public static CouleurVM creerCouleurVM(Couleur c) {
        return new CouleurVM(c);
    }
}
