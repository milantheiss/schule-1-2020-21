import java.util.Scanner;

public class AutomatAlt {
    public static void main(String[] args) {
        double gesamtGuthaben = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen im Automaten Interface.\nGeben sie die Anzahl an Münzen an: ");

        System.out.print("10 Cent: ");
        int anzahl10C = scanner.nextInt();
        gesamtGuthaben = gesamtGuthaben + (anzahl10C*0.1);

        System.out.print("20 Cent: ");
        int anzahl20C = scanner.nextInt();
        gesamtGuthaben = gesamtGuthaben + (anzahl20C*0.2);

        System.out.print("50 Cent: ");
        int anzahl50C = scanner.nextInt();
        gesamtGuthaben = gesamtGuthaben + (anzahl50C*0.5);

        System.out.print("1 Euro: ");
        int anzahl1E = scanner.nextInt();
        gesamtGuthaben = gesamtGuthaben + (anzahl1E*1);

        System.out.print("2 Euro: ");
        int anzahl2E = scanner.nextInt();
        gesamtGuthaben = gesamtGuthaben + (anzahl2E*2);

        System.out.println("Gesamt Guthaben: "+gesamtGuhaben);

    }
}
