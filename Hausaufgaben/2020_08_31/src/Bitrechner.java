/**
 *
 * Aufgaben vom 31.08.2020
 *
 * @version finish - 31.08.2020
 * @MilanTheiß
 */

import java.util.Scanner;

public class Bitrechner {
    public static void main(String[] args) {
        double dezimalErg=0;
        int exponent=7;
        int[] binaryDigit = new int[8]; //Nur möglich für 8 Stellen lange Binärezahl --> Startet höhster (8.) Stelle
        boolean wrongInput = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Gebe deine Binär Zahl in einzelnen Stellen an: ");

        for (int i = 0; i < 8; i++){
            do {
                binaryDigit[i] = sc.nextInt();
                wrongInput = false;

                if (binaryDigit[i] != 0 && binaryDigit[i] != 1){ //Testet ob Eingabe richtig
                    System.out.println("Das binäre Zahlensystem besteht nur aus 0 und 1 wiederhole die Eingabe.");
                    wrongInput = true;
                }
            }while(wrongInput);

            if(binaryDigit[i] == 1){
                dezimalErg = dezimalErg + Math.pow(2, exponent); //gibt Ziffer einen Wert
            }
            exponent--;
        }
        System.out.println((int)dezimalErg);

    }
}
