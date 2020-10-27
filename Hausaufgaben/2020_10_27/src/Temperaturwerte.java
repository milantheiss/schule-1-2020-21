/**
 *
 * Übungsaufgabe Temperaturwerte - Array AB
 *
 * @version vom 27.10.2020
 * @author Milan Theiß
 */

import java.util.Scanner;

public class Temperaturwerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Temperaturwerte wollen sie eingeben: ");
        int anzahl = scanner.nextInt();

        double temperaturen[] = new double[anzahl];

        for (int i = 0; i < temperaturen.length; i++){
            temperaturen[i] = scanner.nextDouble();
        }
        for (int j = 0; j < temperaturen.length; j++){
            System.out.println(temperaturen[j]);
        }

        System.out.println("Durchschnitt: "+durchschnittswert(temperaturen));
        System.out.println("Max: "+max(temperaturen));
        System.out.println("Min: "+min(temperaturen));
    }

    static double durchschnittswert(double ersatz[]) {
        double ergebnis = 0;
        for (int i = 0; i < ersatz.length; i++) {
            ergebnis = ergebnis + ersatz[i];
        }
        ergebnis = ergebnis/ersatz.length;
        return ergebnis;
    }

    static double max(double ersatz[]){
        double max = ersatz[0];
        for (int i = 1; i < ersatz.length; i++)
            if (ersatz[i] > max)
                max = ersatz[i];
        return max;
    }

    static double min(double ersatz[]) {
        double min = ersatz[0];
        for (int i = 1; i < ersatz.length; i++){
            if (ersatz[i] < min)
                min = ersatz[i];
        }
        return min;
    }
}
