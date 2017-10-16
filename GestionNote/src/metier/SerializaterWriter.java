/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author pipetit1
 */
public class SerializaterWriter {
    public static void ecrire(String nomFichier, Serializable obj) throws IOException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier));
        oos.writeObject(obj);
    }
}
