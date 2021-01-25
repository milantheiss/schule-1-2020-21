import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programm Start");

        Kunde kunde1 = new Kunde();
        Anzeige anzeige1 = new Anzeige();

        kunde1.setMeineAnzeige(anzeige1);
        anzeige1.setMeinKunde(kunde1);

        System.out.println("Wie ist ihr Name: ");
        kunde1.setName(scanner.nextLine());

        System.out.println("Wie ist ihre Telefon Nummer: ");
        kunde1.setTelefon(scanner.nextLine());

        System.out.println("Geben sie die Beschreibung ein: ");
        anzeige1.setBeschreibung(scanner.nextLine());

        System.out.println("Geben sie den Preis: ");
        anzeige1.setPreis(scanner.nextDouble());

        System.out.println(kunde1.getName());
        System.out.println(kunde1.getTelefon());
        System.out.println(kunde1.getMeineAnzeige().getBeschreibung());
        System.out.println(kunde1.getMeineAnzeige().getPreis());
    }
}
