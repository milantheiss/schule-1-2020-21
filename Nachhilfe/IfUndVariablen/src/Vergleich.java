public class Vergleich {
    public static void main(String[] args) {
        System.out.println("Vergleich");

        System.out.println("1. Zahl: ");
        int zahl1 = Tastatur.leseZahl();

        System.out.println("2. Zahl: ");
        int zahl2 = Tastatur.leseZahl();


        if (zahl1 > zahl2){
            System.out.println("Größter Wert: " + zahl1);
        }
        else if (zahl2 > zahl1){
            System.out.println("Größter Wert: " + zahl2);
        }
        else if (zahl1 == zahl2){
            System.out.println("Beide Zahlen gleich groß.");
        }
        else {
            System.out.println("Ein Fehler ist aufgetreten.");
        }

        System.out.println("Programmende Vergleich.");
    }
}
