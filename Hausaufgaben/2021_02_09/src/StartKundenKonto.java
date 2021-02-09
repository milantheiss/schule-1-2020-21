import java.util.ArrayList;
import java.util.Scanner;

public class StartKundenKonto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kunde k1 = new Kunde();
        Kunde k2 = new Kunde();

        System.out.println("Bitte geben Sie einen Namen für den neuen Kunden ein: ");
        k1.setName(scanner.nextLine());
        System.out.println("Bitte geben Sie einen Namen für den zweiten Kunden ein: ");
        k2.setName(scanner.nextLine());

        k1.setMeineKonten(new Konto("11111"));
        k1.setMeineKonten(new Konto("22222"));

        k2.setMeineKonten(new Konto("33333"));
        k2.setMeineKonten(new Konto("44444"));

        System.out.println("Hier die Konten von Frau/Herr "+k1.getName());
        System.out.println("Das Konto 1 hat die Nummer: " + k1.getMeineKonten().get(0).getKontonummer());
        System.out.println("Das Konto 2 hat die Nummer: " + k1.getMeineKonten().get(1).getKontonummer());

        System.out.println("Hier die Konten von Frau/Herr "+k2.getName());
        System.out.println("Das Konto 1 hat die Nummer: " + k2.getMeineKonten().get(0).getKontonummer());
        System.out.println("Das Konto 2 hat die Nummer: " + k2.getMeineKonten().get(1).getKontonummer());
    }
}
