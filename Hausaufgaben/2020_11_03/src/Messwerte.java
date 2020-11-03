/*
 * Übungsaufgaben 8 - Messwerte
 * @version 2 - 03.11.2020
 * @author Milan Theiß
 */

import java.util.Scanner;

public class Messwerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Messwerte: ");
        int anzahl = scanner.nextInt();

        double messwerteArr[] = new double[anzahl];

        System.out.println("Gebe die Messwerte ein.");
        for (int i = 0; i < messwerteArr.length; i++){
            messwerteArr[i] = scanner.nextDouble();
        }
        System.out.println("Durchschnitt: "+ durchschnittswert(messwerteArr));
        System.out.println("Maximalwert: " + max(messwerteArr));
        System.out.println("Minimalwert: " + min(messwerteArr));

        System.out.println("Position Min:" + (findIndex(messwerteArr, min(messwerteArr))+1));
        System.out.println("Position Max:" + (findIndex(messwerteArr, max(messwerteArr))+1));

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

    static int findIndex(double arr[], double wert)
    {
        if (arr == null) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++) {
            if (arr[index] == wert) {
                return index;
            }
        }
        return -1;
    }
}
