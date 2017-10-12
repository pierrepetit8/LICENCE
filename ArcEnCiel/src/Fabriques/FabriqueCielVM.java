/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabriques;

import VM.CielVM;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Ciel;

/**
 *
 * @author petit
 */
public class FabriqueCielVM {

     public static CielVM creerCiel(Ciel c) throws IOException, FileNotFoundException {
         try {
             return new CielVM(c);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(FabriqueCielVM.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
}
