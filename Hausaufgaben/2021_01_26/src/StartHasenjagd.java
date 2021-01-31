import java.util.Scanner;

public class StartHasenjagd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Spiel Hasenjagd!");
        // Objekt für einen Hasen erzeugen
        Hase hase1 = new Hase("Hasi"); //@todo User input

        // Objekt für einen Jaeger erzeugen
        Jaeger jaeger1 = new Jaeger("Franz"); //@todo User input

        // 1:1-Assoziation herstellen
        hase1.setJeager(jaeger1);
        jaeger1.setHase(hase1);

        // Hase futtert Möhrchen
        //(Benutzer soll dem Hasen so lange einzelne Möhrchen füttern, bis er das Füttern beendet,
        // die Hasenschnelligkeit wird auf die Anzahl der gefressenen Möhrchen festgelegt)
        System.out.println("Wie viele Möhrchen werden verfüttert");
        hase1.setGegesseneMoehrchen(scanner.nextInt());

        // Jaeger trinkt Zielwasser
        // (Mit einer Zufallszahl (Random) zwischen 1 und 10 wird die Zielgenauigkeit festgelegt)
        jaeger1.setZielgenauigkeit();
        System.out.println(jaeger1.getZielgenauigkeit());

        // Die Jagd beginnt
        System.out.println("Jagdbeginnt!");

        // Jäger schaut was ihm vor die Flinte kommt
        // (Zugriff über das Jägerobjekt auf den Namen des Hasen)
        System.out.println("Jäger sucht nach ");
        System.out.println("Der Jäger sieht Hase "+jaeger1.getHase().getName());


        // Hase schnuppert wer auf ihn zielt
        // (Zugriff über das Hasenobjekt auf den Namen des Jägers)
        System.out.println("Hase sucht nach gefahren");
        System.out.println("Der Hase sieht Jäger "+hase1.getJeager().getName());

        // Der Jäger schießt
        // (Auswertung Hasenschnelligkeit : Zielgenauigkeit)
        System.out.println("Der Jäger schießt!");
        if(jaeger1.getHase().getGegesseneMoehrchen()/jaeger1.getZielgenauigkeit()  >= 1){
            System.out.println("Der Jäger trifft den Hase!");
        }else {
            System.out.println("Der Hase entwicht dem Jäger");
        }

        // Spielende
        System.out.println("Spielende");

    } // end of main
} // end of class Start
