/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

/**
 *
 * @author JulianFOT
 */
public class NodoAVL {
   int altura;
    int key;
    NodoAVL left;
    NodoAVL right;
 
    NodoAVL(int d) {
        key = d;
        altura = 1;
    }  
}
