/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabriques;

import VM.CielVM;
import metier.Ciel;

/**
 *
 * @author petit
 */
public class FabriqueCielVM {
    
     public static CielVM creerCiel(Ciel c) {
        return new CielVM(c);
    }
}
