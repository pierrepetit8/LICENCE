/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvegarde;

import Fabriques.FabriqueCiel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Arc;
import metier.Ciel;

/**
 *
 * @author petit
 */
public class Sauvegarde {
    public static void save(String nomFichier, Serializable s) throws IOException {
      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier))) {
            oos.writeObject(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arc.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public static void loadCiel(String nomFichier) throws FileNotFoundException, IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichier))) {
            Ciel c = (Ciel) ois.readObject(); 
            
            
        } 
    }
    
}
