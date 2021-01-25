package AutoMieter;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Mieter mieter1 = new Mieter();
        Scanner scanner = new Scanner(System.in);

        auto1.setMeinMieter(mieter1);
        mieter1.setMeinAuto(auto1);

        String option;

        do {
            System.out.println("Bitte wählen Sie aus: ");
            System.out.println("[M]ieterdaten eingeben");
            System.out.println("[A]utodaten eingeben");
            System.out.println("[D]aten anzeigen");
            System.out.println("[B]eenden");

            option = scanner.nextLine();

            if (option.equalsIgnoreCase("m")) {
                System.out.println("Bitte geben Sie den Namen des Mieters ein: ");
                mieter1.setName(scanner.nextLine());
                System.out.println("Bitte geben Sie die Kundennummer des Mieters ein: ");
                mieter1.setKundennummer(scanner.nextInt());
            } else if (option.equalsIgnoreCase("a")) {
                System.out.println("Bitte geben Sie die Marke des Autos ein: ");
                auto1.setMarke(scanner.nextLine());
                System.out.println("Bitte geben Sie das Modell des Autos ein: ");
                auto1.setModell(scanner.nextLine());
            } else if (option.equalsIgnoreCase("d")) {
                System.out.println("Folgende Daten wurden eingegeben: ");
                System.out.println("Name des Mieters: " + mieter1.getName());
                System.out.println("Kundennummer des Mieters: " + mieter1.getKundennummer());
                System.out.println("Marke: " + mieter1.getMeinAuto().getMarke());
                System.out.println("Modell: " + mieter1.getMeinAuto().getModell());
            } else if(option.equalsIgnoreCase("b")) {
                System.out.println("Programm wird beendet");
            } else {
                System.out.println("Invalid input!");
            }
        }while(!option.equalsIgnoreCase("b"));
    }
}
