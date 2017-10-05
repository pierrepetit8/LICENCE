/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabriques;

import metier.Arc;

/**
 *
 * @author pipetit1
 */
public class FabriqueArc {
    public static Arc creerArc(String nom) {
        return new Arc(nom);
    }
}