import java.util.Scanner;

public class Zinseszins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen beim Zinsenrechner");

        System.out.print("Was ist ihr Startkapital: ");
        double startkapital = scanner.nextDouble();

        System.out.print("Was ist der Prozentsatz ohne Prozentzeichen: ");
        double prozentsatz = scanner.nextDouble();

        System.out.print("Was ist die Laufzeit: ");
        double laufzeit = scanner.nextDouble();

        double endkapital = startkapital*Math.pow(1+prozentsatz/100,laufzeit);
        System.out.println("Das Endkapital ist " + endkapital+" EURO");
    }
}
