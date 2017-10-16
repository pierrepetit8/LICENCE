/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM;

import metier.Etudiant;

/**
 *
 * @author pipetit1
 */
public class FabriqueEtudiantVM {
    public static EtudiantVM creer(Etudiant etu) {
        return new EtudiantVM(etu);
    }
}
