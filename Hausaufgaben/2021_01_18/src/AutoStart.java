import java.util.Scanner;

public class AutoStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = new Auto(40, 10, 7.0);
        System.out.println("Tankvolumen: "+auto.getTankvolumen()+" Tankinhalt: "+auto.getTankinhalt()+" Verbrauch: "+(auto.getVerbrauch()));
        System.out.print("\nWie viel Liter Kraftstoff wollen sie tanken? ");
        auto.tanken(scanner.nextDouble());
        System.out.println("Tankvolumen: "+auto.getTankvolumen()+" Tankinhalt: "+auto.getTankinhalt()+" Verbrauch: "+(auto.getVerbrauch()*100));
        System.out.println("Maximale Strecke: "+auto.maxFahrbareStrecke());
        System.out.print("\nWie viele Kilometer wollen sie fahren? ");
        auto.fahren(scanner.nextDouble());
        System.out.print("\nSie können noch: "+auto.maxFahrbareStrecke()+"km fahren");
    }
}
