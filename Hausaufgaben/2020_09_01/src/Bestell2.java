import java.util.Scanner;

public class Bestell2 {
    public static void main(String[] args) {
        double auftragssumme, rechnungsbetrag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Berechnung des Rechnungsbetrages");
        System.out.print("Auftragssumme in Euro: ");
        auftragssumme = sc.nextDouble();
        if (auftragssumme < 100){
            rechnungsbetrag = auftragssumme + 5.50;
            System.out.println("Rechnungsbetrag: "+ rechnungsbetrag+" EURO (5,50 EURO Porto)");
        }
        else if (auftragssumme >= 100 && auftragssumme < 200){
            rechnungsbetrag = auftragssumme + 3;
            System.out.println("Rechnungsbetrag: "+ rechnungsbetrag+" EURO (3,00 EURO Porto)");
        }
        else if (auftragssumme >= 200){
            rechnungsbetrag = auftragssumme;
            System.out.println("Rechnungsbetrag: "+ rechnungsbetrag+" EURO (0 EURO Porto)");
        }
        else {
            System.out.println("Es ist ein Fehler aufgetreten. Bitte versuche es erneut.");
        }
        System.out.println("Programmende.");
    }
}
