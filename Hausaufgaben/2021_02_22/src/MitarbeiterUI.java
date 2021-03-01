import java.util.Scanner;

public class MitarbeiterUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;

        System.out.println("_______________________Erfassung Mitarbeiter_______________________");
        System.out.print("Bitte geben Sie die Mitarbeiter-Nummer an: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Bitte geben Sie den Vornamen an: ");
        String vname = scanner.nextLine();
        System.out.print("Bitte geben Sie den Nachnamen an: ");
        String name = scanner.nextLine();
        Mitarbeiter m1 = new Mitarbeiter(id, vname, name);
        System.out.println("___________________________________________________________________\n");

        do {
            System.out.println("______________________Erfassung einer Aufgabe______________________");
            System.out.print("Bitte geben Sie die Bezeichnung der Aufgabe ein: ");
            String aufgabe = scanner.nextLine();
            System.out.print("Zu erledigen bis <Datum>: ");
            String datum = scanner.nextLine();
            System.out.print("Zu erledigen bis <Uhrzeit>: ");
            String uhrzeit = scanner.nextLine();
            System.out.println("Aufgabe " + aufgabe + " gespeichert.");
            m1.setMeineAufgaben(new Aufgabe(aufgabe, datum, uhrzeit, m1));
            System.out.print("[N]eue Aufgabe oder [E]nde: ");
            option = scanner.nextLine();
            System.out.println("___________________________________________________________________\n");
        }while (option.equalsIgnoreCase("n"));

        System.out.println("_________________________Ausgabe der Daten_________________________");
        System.out.println("ID des Mitarbeiters: "+m1.getId());
        System.out.println("Vorname des Mitarbeiters: "+m1.getVorname());
        System.out.println("Nachname des Mitarbeiters: "+m1.getName());
        System.out.println("___________________________________________________________________\n");

        System.out.println("_____________________Aufgaben des Mitarbeiters_____________________");
        for (int i = 0; i < m1.getMeineAufgaben().size(); i++) {
            System.out.println("Aufgaben "+(i+1)+":");
            System.out.println("Bezeichnung: "+m1.getMeineAufgaben().get(i).getTodo());
            System.out.println("Zu erledigen bis <Datum>: "+m1.getMeineAufgaben().get(i).getDatum());
            System.out.println("Zu erledigen bis <Uhrzeit>: "+m1.getMeineAufgaben().get(i).getUhrzeit());
            System.out.println("Mitarbeiter der Aufgabe: "+m1.getName());
        }
        System.out.println("___________________________________________________________________");
    }
}