/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author pipetit1
 */
public class FabriqueRecette {
    public static Recette creer(String description) {
        return new Recette(description);
    }
}
