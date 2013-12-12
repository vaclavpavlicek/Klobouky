/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package klobouky;

/**
 *
 * @author Venda
 */
public class Klobouky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int klobouku = 1 ;
        
        System.out.println("Mám " + klobouku + " klobouk " +
                (klobouku== 1? "." : "y ."));
        
        klobouku++;     // Proměnná klobouku rovná se 2
        
        System.out.println("Mám " + klobouku + " klobouk" + 
                (klobouku == 1? "." : "y ."));
        
    }
    
}
