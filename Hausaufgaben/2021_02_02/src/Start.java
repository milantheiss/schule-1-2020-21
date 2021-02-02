import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Firma firma1 = new Firma();
        Automat automat1 = new Automat();
        Scanner scanner = new Scanner(System.in);

        firma1.setMeineAutomaten(automat1);

        automat1.setMeineFirma(firma1);

        System.out.println("Was ist der Name der Firma: ");
        firma1.setName(scanner.nextLine());

        for (int i = 0; i < firma1.getMeineAutomaten().size(); i++) {
            System.out.println("Typ des " + (i+1) + " Automatens");
            firma1.getMeineAutomaten().get(i).setTyp(scanner.nextLine());

            System.out.println("Kassenstand des " + (i+1) + " Automatens");
            firma1.getMeineAutomaten().get(i).setKassenstand(scanner.nextDouble());
        }

        for (int j = 0; j < firma1.getMeineAutomaten().size(); j++) {
            System.out.println("Besitzer des Automaten: "+firma1.getName());
            System.out.println("Type des Automatens: " + firma1.getMeineAutomaten().get(j).getTyp());
            System.out.println("Kassenstand des Automatens: " + firma1.getMeineAutomaten().get(j).getKassenstand());
        }

        scanner.close();
    }
}
