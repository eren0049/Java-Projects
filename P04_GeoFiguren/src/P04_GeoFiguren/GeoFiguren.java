/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P04_GeoFiguren;

import java.util.Scanner;

/**
 *
 * @author FIu-20
 */
public class GeoFiguren {  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Eingabe
        double x= 5;    
        double y= 6;
        double z= 7;   //Dreick kante3
        double i =8;   //Trapezförmige Kante1
        double j =11;  //Trapezförmige Kante12
        double k =8;   //Trapezförmige Kante13
        double l =11;  //Trapezförmige Kante14
        double h = 10; //höhe
        double r= 6;   //dreieckradius 
        double pi=3.14;
        
        //Operationen
        double quadratFlächeinhalt = x * x;
        double quadratUmfang=x*4;
        
        double rechteckFlächeinhalt = x*y;
        double rechteckUmfang = 2*(x+y);
        
        double DreieckFlächeinhalt = x*y/2;
        double DreieckUmfang = x+y+z;
        
        double KreisFlächeinhalt = pi*(r*r);
        double KreisUmfang = 2*pi*r;
        
        double TrapezFlächeinhalt = ((i+j)/2)*h;
        double TrapezUmfang = i+j+k+l;
        
        //Ausgabe
        System.out.println("quadratFlächeinhalt:  "+ quadratFlächeinhalt);
        System.out.println("quadratUmfang:        "+ quadratUmfang +"\n");
        System.out.println("rechteckFlächeinhalt: "+ rechteckFlächeinhalt);
        System.out.println("rechteckUmfang:       "+ rechteckUmfang +"\n");
        System.out.println("DreieckFlächeinhalt:  "+ DreieckFlächeinhalt);
        System.out.println("DreieckUmfang:        "+ DreieckUmfang+"\n");
        System.out.println("KreisFlächeinhalt :   "+ KreisFlächeinhalt);
        System.out.println("KreisUmfang:          "+ KreisUmfang+"\n");
        System.out.println("TrapezFlächeinhalt:   "+ quadratFlächeinhalt);
        System.out.println("TrapezUmfang:         "+ quadratFlächeinhalt);
        
    }
}
