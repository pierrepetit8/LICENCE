/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabriques;

import VM.ArcVM;
import metier.Arc;

/**
 *
 * @author petit
 */
public class FabriqueArcVM {
     public static ArcVM creerArc(Arc arc) {
        return new ArcVM(arc);
    }
}
