/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import metier.Recette;

/**
 *
 * @author pipetit1
 */
public class FabriqueRecetteVM {
    public static RecetteVM creer(Recette recette) {
        return new RecetteVM(recette);
    }
}
