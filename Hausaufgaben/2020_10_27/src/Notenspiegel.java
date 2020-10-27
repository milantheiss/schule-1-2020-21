/**
 *
 * Übungsaufgabe Notenspiegel - Array AB
 *
 * @version vom 27.10.2020
 * @author Milan Theiß
 */

import java.util.Scanner;

public class Notenspiegel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notenspiegel[] = new int[6];
        for (int i = 0; i < notenspiegel.length; i++){
            notenspiegel[i] = scanner.nextInt();
        }
        double durchschnitt = 0;
        double teilnehmer = 0;
        for (int i = 0; i < notenspiegel.length; i++) {
            durchschnitt = durchschnitt + (notenspiegel[i]*(i+1));
            teilnehmer = teilnehmer + notenspiegel[i];
        }
        durchschnitt = durchschnitt/teilnehmer;

        System.out.println("Notendurchschnitt: "+durchschnitt);
    }
}
