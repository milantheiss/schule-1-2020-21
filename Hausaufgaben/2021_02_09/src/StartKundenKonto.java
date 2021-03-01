import java.util.ArrayList;
import java.util.Scanner;

public class StartKundenKonto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Kunde> allKunden = new ArrayList<>();
        int index = 0;

        do{
            System.out.print("Bitte geben Sie einen Namen für den neuen Kunden ein: ");
            allKunden.add(new Kunde(scanner.nextLine()));
            System.out.print("Wie viele Konten sollen erstellt werden: ");
            int anzahl = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < anzahl; i++) {
                System.out.print("Geben sie die Kontonummer für das "+(i+1)+". Konto an: ");
                allKunden.get(index).setMeineKonten(new Konto(scanner.nextLine(), allKunden.get(index)));
            }
            index++;
            System.out.print("Soll ein weiterer Kunde erstellt werden: [y/n] ");
        }while(!scanner.nextLine().equalsIgnoreCase("n"));

        for (int i = 0; i < allKunden.size(); i++) {
            System.out.println("Hier die Konten von Frau/Herr "+ allKunden.get(i).getName());
            for (int j = 0; j < allKunden.get(i).getMeineKonten().size(); j++) {
                System.out.println("Das Konto " + (j+1) + ". hat die Nummer: " + allKunden.get(i).getMeineKonten().get(j).getKontonummer());
            }
        }
    }
}