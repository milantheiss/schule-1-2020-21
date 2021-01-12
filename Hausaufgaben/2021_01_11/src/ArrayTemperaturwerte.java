import java.util.Scanner;

public class ArrayTemperaturwerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;

        do {
            System.out.println("Programm zur Eingabe von Temperaturwerten");
            System.out.print("\nWie viele Werte möchten Sie eingaben? ");
            int anzahl = scanner.nextInt();
            double[] temperaturwerte = new double[anzahl];

            System.out.println("");

            for (int i = 0; i < anzahl; i++) {
                System.out.print("Bitte geben Sie den Temperaturwert " + (i + 1) + " ein: ");
                temperaturwerte[i] = scanner.nextDouble();
            }

            double max = temperaturwerte[0];
            int tagMax = 1;
            for (int i = 1; i < temperaturwerte.length; i++) {
                if (temperaturwerte[i] > max) {
                    max = temperaturwerte[i];
                    tagMax = i + 1;
                }
            }

            double min = temperaturwerte[0];
            int tagMin = 1;
            for (int i = 1; i < temperaturwerte.length; i++) {
                if (temperaturwerte[i] < min) {
                    min = temperaturwerte[i];
                    tagMin = i + 1;
                }
            }

            double durchschnitt = 0;
            for (int i = 0; i < temperaturwerte.length; i++) {
                durchschnitt = durchschnitt + temperaturwerte[i];
            }
            durchschnitt = durchschnitt / temperaturwerte.length;

            System.out.println("\nFolgende Temperaturwerte wurden eingegeben: ");
            for (int i = 0; i < temperaturwerte.length; i++) {
                System.out.println("Tag " + (i + 1) + " " + temperaturwerte[i] + " Grad Celsius");
            }

            System.out.println("\nDie Durchschnittstemperatur der eingegebene Werte beträgt: " + durchschnitt + " Grad Celsius.");

            System.out.println("\nDer Maximalwert beträgt: " + max + " Grad Celsius.\nDer Maximalwert wurde am Tag " + tagMax + " erreicht.");

            System.out.println("\nDer Minimalwert beträgt: " + min + " Grad Celsius.\nDer Minimalwert wurde am Tag " + tagMin + " erreicht.");

            System.out.println("\nMöchten Sie das Programm [w]iederholen oder [b]eenden: ");
            option =  Character.toUpperCase(scanner.next().charAt(0));
        }while (option == 'W');
    }
}
