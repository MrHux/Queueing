/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathsFunctions;

/**
 *
 * @author hux
 */
public class Factorielle {
        
    public static int Factoriel(int n) {
       return n > 1?n * Factoriel(n-1):1;
    }
        
}
