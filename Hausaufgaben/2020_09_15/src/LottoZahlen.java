import java.util.Arrays;
import java.util.Scanner;

public class LottoZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ziehung[] = new int[6];
        String option;
        do {
            int superzahl = (int) (Math.random() * 10);
            int richtigeZahlen = 0;

            for (int i = 0; i < ziehung.length; i++) {
                ziehung[i] = (int) (Math.random() * 49) + 1;
            }

            for (int k = 0; k < ziehung.length; k++) {
                for (int l = k + 1; l < ziehung.length; l++) {
                    if (ziehung[k] == ziehung[l]) {
                        ziehung[k] = (int) (Math.random() * 49) + 1;
                    }
                }
            }
            Arrays.sort(ziehung);

            System.out.println("****************************");

            int userZahlen[] = new int[6];
            for (int j = 0; j < userZahlen.length; j++) {
                System.out.print("Geben sie ihre " + (j + 1) + " Zahl ein: ");
                userZahlen[j] = scanner.nextInt();
            }
            Arrays.sort(userZahlen);

            System.out.println("****************************");

            System.out.print("Gebe deine Superzahl zwischen 0 und 9 ein: ");
            int userSuperzahl = scanner.nextInt();

            System.out.println("****************************");

            for (int m = 0; m < ziehung.length; m++) {
                if (ziehung[m] == userZahlen[m]) {
                    richtigeZahlen++;
                }
            }
            if (richtigeZahlen == 6 && superzahl == userSuperzahl) {
                System.out.println("Du hast den Jackport gewonnen!");
            } else if (richtigeZahlen == 6) {
                System.out.println("Du hast gewonnen aber nicht den Jackport");
            } else {
                System.out.println("Du hast nicht gewonnen");
            }
            System.out.println("Noch einmal spielen? (N)eue Ziehung|(E)nde");
            option = scanner.next();
        }while (option.equalsIgnoreCase("n"));
    }
}
