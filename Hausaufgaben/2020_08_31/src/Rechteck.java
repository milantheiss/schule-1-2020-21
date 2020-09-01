/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.08.2020
 * @author
 */
import java.util.*;

public class Rechteck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie erst Seite A dann Seite B an: ");
        double seiteA = sc.nextDouble();
        double seiteB = sc.nextDouble();
        System.out.println("Wähle:\n1: Umfang\n2: Diagonale\n3: Fläche");
        char option = sc.next().charAt(0);
        switch (option){
            case '1':
                System.out.println(umfang(seiteA, seiteB));
                break;
            case '2':
                System.out.println(diagonale(seiteA, seiteB));
                break;
            case '3':
                System.out.println(flaeche(seiteA, seiteB));
                break;
        }

    } // end of main

    static double umfang(double ua, double ub){
        double u = ua*2 + ub*2;
        return u;
    }

    static double diagonale(double da, double db){
        double x = (double) da;
        double y = (double) db;
        double ergebnis = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        return ergebnis;
    }

    static double flaeche(double aa, double bb){
        double flaecheVar = aa*bb;
        return flaecheVar;
    }
} // end of class Rechteck
