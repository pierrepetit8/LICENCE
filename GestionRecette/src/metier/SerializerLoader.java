/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pipetit1
 */
public class SerializerLoader {
    public static Serializable load(String nomFichier) throws FileNotFoundException, IOException, ClassNotFoundException {
        Serializable obj;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichier))) {
            obj = (Serializable) ois.readObject();
        }
        return obj;      
    }
        
}
