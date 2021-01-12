import java.util.Scanner;

public class Schleifen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;
        System.out.println("DoItAgain Testprogramm für Schleifen");
        do {
            System.out.print("Bitte geben Sie einen Anfangswert ein: ");
            int anfangswert = scanner.nextInt();
            System.out.print("Bitte geben Sie einen Endwert ein: ");
            int endwert = scanner.nextInt();

            if (endwert < anfangswert) {
                int temp = anfangswert;
                anfangswert = endwert;
                endwert = temp;
            }

            System.out.println("Welche Schleifenart mächten Sie testen? \n[F]or-Schleife, [W]hile- oder [D]o-While-Schleife: ");
            option = Character.toUpperCase(scanner.next().charAt(0));

            if (option == 'F') {
                for (int i = anfangswert; i < endwert; i++) {
                    System.out.print(i + ", ");
                }
                System.out.print(endwert);
            } else if (option == 'W') {
                while (anfangswert < endwert) {
                    System.out.print(anfangswert + ", ");
                    anfangswert++;
                }
                System.out.print(endwert);
            } else if (option == 'D') {
                do {
                    System.out.print(anfangswert + ", ");
                    anfangswert++;
                } while (anfangswert < endwert);
                System.out.print(anfangswert);
            } else {
                System.out.print("'" + option + "' ist keine Option");
            }
            System.out.println("Möchten Sie das Testprogramm [B]eenden oder [N]ochmal");
            option = Character.toUpperCase(scanner.next().charAt(0));
        }while(option == 'N');
    }
}
