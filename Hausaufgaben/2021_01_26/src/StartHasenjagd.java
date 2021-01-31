import java.util.Scanner;

public class StartHasenjagd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Spiel Hasenjagd!");
        // Objekt f�r einen Hasen erzeugen
        Hase hase1 = new Hase("Hasi"); //@todo User input

        // Objekt f�r einen Jaeger erzeugen
        Jaeger jaeger1 = new Jaeger("Franz"); //@todo User input

        // 1:1-Assoziation herstellen
        hase1.setJeager(jaeger1);
        jaeger1.setHase(hase1);

        // Hase futtert M�hrchen
        //(Benutzer soll dem Hasen so lange einzelne M�hrchen f�ttern, bis er das F�ttern beendet,
        // die Hasenschnelligkeit wird auf die Anzahl der gefressenen M�hrchen festgelegt)
        System.out.println("Wie viele M�hrchen werden verf�ttert");
        hase1.setGegesseneMoehrchen(scanner.nextInt());

        // Jaeger trinkt Zielwasser
        // (Mit einer Zufallszahl (Random) zwischen 1 und 10 wird die Zielgenauigkeit festgelegt)
        jaeger1.setZielgenauigkeit();
        System.out.println(jaeger1.getZielgenauigkeit());

        // Die Jagd beginnt
        System.out.println("Jagdbeginnt!");

        // J�ger schaut was ihm vor die Flinte kommt
        // (Zugriff �ber das J�gerobjekt auf den Namen des Hasen)
        System.out.println("J�ger sucht nach ");
        System.out.println("Der J�ger sieht Hase "+jaeger1.getHase().getName());


        // Hase schnuppert wer auf ihn zielt
        // (Zugriff �ber das Hasenobjekt auf den Namen des J�gers)
        System.out.println("Hase sucht nach gefahren");
        System.out.println("Der Hase sieht J�ger "+hase1.getJeager().getName());

        // Der J�ger schie�t
        // (Auswertung Hasenschnelligkeit : Zielgenauigkeit)
        System.out.println("Der J�ger schie�t!");
        if(jaeger1.getHase().getGegesseneMoehrchen()/jaeger1.getZielgenauigkeit()  >= 1){
            System.out.println("Der J�ger trifft den Hase!");
        }else {
            System.out.println("Der Hase entwicht dem J�ger");
        }

        // Spielende
        System.out.println("Spielende");

    } // end of main
} // end of class Start
