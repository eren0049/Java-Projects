/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P03_BruttoNetto;

import java.util.Scanner;

/**
 *
 * @author FIu-20
 */
public class C01_Brutto_Netto {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a Brutto: ");
        double brutto = scanner.nextDouble();
        
        double netto = brutto - (brutto * (19/100.0));
        System.out.println("Netto : " + netto);
    }
}
