import java.util.Scanner;

public class GroesserKleiner {
    public static void main(String[] args) {
        double zahl1, zahl2, zahl3 = 0;
        Scanner scanner = new Scanner(System.in);

        zahl1 = scanner.nextDouble();
        zahl2 = scanner.nextDouble();
        zahl3 = scanner.nextDouble();

        if (zahl1 > zahl2 && zahl1 > zahl3){
            System.out.println(zahl1 + " ist am größten");
        }
        else if (zahl2 > zahl1 && zahl2 > zahl3){
            System.out.println(zahl2 + " ist am größten");
        }
        else if (zahl3 > zahl2 && zahl3 > zahl1){
            System.out.println(zahl3 + " ist am größten");
        }
        else if (zahl1 == zahl2){
            System.out.println("Zahl 1 und Zahl 2 (" + zahl1 + ") sind am größten und gleich groß");
        }
        else if (zahl2 == zahl3){
            System.out.println("Zahl 2 und Zahl 3 (" + zahl2 + ") sind am größten und gleich groß");
        }
        else if (zahl1 == zahl3){
            System.out.println("Zahl 1 und Zahl 3 (" + zahl1 + ") sind am größten und gleich groß");
        }
        else{
            System.out.println("Ein Fehler liegt vor");
        }
    }
}
