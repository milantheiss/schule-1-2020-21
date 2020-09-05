import java.util.Scanner;

public class BenzinV2 {
    public static void main(String[] args) {
        double kilometerGefahren, kraftstoffVerbraucht, verbrauchPro100km, multiplikator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Berechnung des Durchschnittsverbrauchs");

        System.out.print("verbrauchter Kraftsoff in l: ");
        kraftstoffVerbraucht = sc.nextDouble();

        System.out.print("gefahrene Strecke in km: ");
        kilometerGefahren = sc.nextDouble();

        if (kilometerGefahren <= 0) {
            System.out.println("Ungültige Strecke eingegeben");
        }
        else {
            multiplikator = 100 / kilometerGefahren;
            verbrauchPro100km = kraftstoffVerbraucht * multiplikator;
            System.out.println("Der Verbrauch liegt bei " + verbrauchPro100km+"l pro 100km.");
        }
    }
}
