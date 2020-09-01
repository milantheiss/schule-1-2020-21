package hausaufgaben;

import java.util.Scanner;

/**
 *
 * Hausaufgaben vom 25.08.2020
 *
 * @version 2.0 - 26.08.2020
 * @MilanTheiß
 */

public class Grundgerüst {
    public static void main(String args[]){
        //Aufgabe 2 & 3
        /**
         * print Statment gibt eine Zeichen in der Konsole aus. ln bewirk, dass einzelne Zeile benutzt wird. \n fügt neue Zeile ein
         */
        System.out.println("Hello World!\nneue Zeile" + "\n Mehrere Strings");



        //Aufgabe 4 & 5
        /**
         * hausaufgaben.Tastatur stellt zur Verfügung: leseZeichen(), leseZahl(), leseKommazahl(), leseText()
         */


        /**
         *Möglichkeit 1:
         **/
        Tastatur t1 = new Tastatur();
        String str = t1.leseText();
        System.out.println(str);

        /**
         *Möglichkeit 3:
         **/

        System.out.println(Tastatur.leseText());

        /**
         * Mit Scanner:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type two words: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1+str2);

        //Aufgabe 6
        /**
         * Mit Scanner
         */
        System.out.println("Type: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int erg = i1 + i2;
        System.out.println("Sum: "+erg);

        /**
         * Mit hausaufgaben.Tastatur.java
         */
        int erg2 = Tastatur.leseZahl() + Tastatur.leseZahl();
        System.out.println("Sum: "+erg);

        //Aufgabe 7
        /**
         * Um den Code zu beschreiben und zuerklären
         */


        //Aufgabe 8
        /**
         * int,byte... --> ganze Zahlen double,float --> Kommazahlen String --> Können eine Zeichenkette speichern
         */


        //Aufgabe 9
        /**
         * Variablen sind Container die eine Wert beinhalten. Variablen werden mit Dateintype und Namen deklariert mit einem = werden sie initialiesiert.
         */

    }
}
