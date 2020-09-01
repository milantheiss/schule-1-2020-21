import java.util.Scanner;

public class Potenzfunktion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Was ist die Basis: ");
        double basis = sc.nextDouble();
        System.out.print("\nWas ist der Exponent: ");
        double exponent = sc.nextDouble();
        double erg = Math.pow(basis, exponent);
        System.out.println("Das Ergebnis ist: " + erg);
    }
}
