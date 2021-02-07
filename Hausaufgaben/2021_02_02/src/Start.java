import java.util.Scanner;

public class Start {
    static Firma firma1 = new Firma();
    static int automatenNummer = 0;
    static char option;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programmstart.");

        do {
            System.out.println("****************************");
            System.out.println("[F]irmendaten eingeben\n" +
                    "[A]utomat neu anlegen\n" +
                    "[M]ehrere neue Automaten anlegen\n" +
                    "[D]aten anzeigen\n" +
                    "[B]eenden");
            option = Character.toLowerCase(scanner.next().charAt(0));
            System.out.println("****************************");

            if (option == 'f') {
                setFirmaName();
            }else if (option == 'a') {
                createNewAutomat();
            }else if (option == 'm'){
                createMultipleNewAutomats();
            }else if (option == 'd'){
                showData();
            }
        } while(option != 'b');

        System.out.println("Programmende.");
    }

    static void setFirmaName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist der Name der Firma: ");
        firma1.setName(scanner.nextLine());
    }

    static void createNewAutomat(){
        Scanner scanner = new Scanner(System.in);
        firma1.setMeineAutomaten(new Automat());
        firma1.getMeineAutomaten().get(automatenNummer).setMeineFirma(firma1);

        System.out.println("Typ des Automatens");
        firma1.getMeineAutomaten().get(automatenNummer).setTyp(scanner.nextLine());

        System.out.println("Kassenstand des Automatens");
        firma1.getMeineAutomaten().get(automatenNummer).setKassenstand(scanner.nextDouble());
        automatenNummer++;
    }

    static void createMultipleNewAutomats(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Automaten sollen erstellt werden: ");
        int anzahl = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < anzahl; i++) {
            Automat automat = new Automat();
            firma1.setMeineAutomaten(automat);
            automat.setMeineFirma(firma1);

            System.out.println("Typ des Automatens");
            automat.setTyp(scanner.nextLine());

            System.out.println("Kassenstand des Automatens");
            automat.setKassenstand(Integer.parseInt(scanner.nextLine()));
        }
    }

    static void showData(){
        System.out.println("Besitzer des Automaten: "+firma1.getName());
        for (int j = 0; j < firma1.getMeineAutomaten().size(); j++) {
            System.out.println("Automat Nummer "+(j+1));
            System.out.println("Type des Automatens: " + firma1.getMeineAutomaten().get(j).getTyp());
            System.out.println("Kassenstand des Automatens: " + firma1.getMeineAutomaten().get(j).getKassenstand());
        }
        int kassestand = 0;
        for (int i = 0; i < firma1.getMeineAutomaten().size(); i++) {
            kassestand += firma1.getMeineAutomaten().get(i).getKassenstand();
        }
        System.out.println("Der gesamte Kassenstand ist "+kassestand);
    }
}
