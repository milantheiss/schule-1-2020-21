import java.util.Scanner;

public class SchiffeMain {
    static String[][] spielfeld = new String[11][11];
    static byte[][] schiffefeld = new byte[11][11];
    static int anzahlSchiffe = 3;
    static Schiff[] schiffArr = new Schiff[3];
    static UserGuess input = new UserGuess();
    static int maxHitcount = 0;
    static int hitcount = 0;

    public static void main(String[] args) {
        //Rand des Spielfeld
        spielfeld[0][0] = "- ";
        spielfeld[0][1] = "A";
        spielfeld[0][2] = "B";
        spielfeld[0][3] = "C";
        spielfeld[0][4] = "D";
        spielfeld[0][5] = "E";
        spielfeld[0][6] = "F";
        spielfeld[0][7] = "G";
        spielfeld[0][8] = "H";
        spielfeld[0][9] = "I";
        spielfeld[0][10] = "J";
        spielfeld[1][0] = "1 ";
        spielfeld[2][0] = "2 ";
        spielfeld[3][0] = "3 ";
        spielfeld[4][0] = "4 ";
        spielfeld[5][0] = "5 ";
        spielfeld[6][0] = "6 ";
        spielfeld[7][0] = "7 ";
        spielfeld[8][0] = "8 ";
        spielfeld[9][0] = "9 ";
        spielfeld[10][0] = "10";

        for (int i = 1; i < spielfeld.length; i++) {//Legt für jedes übrige Feld in Spielfeld einen leeren String an
            for (int j = 1; j < spielfeld.length; j++) {
                spielfeld[i][j] = " ";
            }
        }
        for (int i = 1; i < schiffefeld.length; i++) {//Schiffefeld Default = 0 --> Kein Schiff
            for (int j = 1; j < schiffefeld.length; j++) {
                schiffefeld[i][j] = 0;
            }
        }

        for (int i = 0; i < schiffArr.length; i++) {
            schiffArr[i] = new Schiff();
        }

        System.out.println("SCHIFFEVERSENKEN");
        System.out.print("Mit wie Vielen Schiffen willst du spielen: ");
        //@todo 3 mit Scanner ersetzen damit anzahlSchiffe variabel ist --> in Instanzvariable ändern

        for (int i = 0; i < schiffArr.length; i++) { //Für jedes Schiff wird in schiffefeld sein Platz auf 1 gesetzt
            setSchiffefeld(schiffArr[i].getRotation(), schiffArr[i].getLength(), schiffArr[i].getxPos(), schiffArr[i].getyPos());
        }

        showShipField();

        do {
            showPlayingField();
            System.out.print("Auf welchem Platz liegt ein Schiff?: ");
            input.setInput();
            checkCoordinates();
            if (checkCoordinates()) {
                System.out.println("Treffer!");
            } else {
                System.out.println("Miss");
            }
        } while (hitcount < maxHitcount);

        showPlayingField();

    }

    static void showShipField(){ //Zeigt Spielfeld an --> spielfeld Variable
        System.out.print("\n");
        for (int i = 0; i < schiffefeld.length; i++) {
            System.out.print(schiffefeld[i][0]);
            for (int j = 1; j < schiffefeld.length; j++) {
                System.out.print("["+schiffefeld[i][j]+"]");
            }
            System.out.print("\n");
        }
    }

    static void showPlayingField(){ //Zeigt Spielfeld an --> spielfeld Variable
        System.out.print("\n");
        for (int i = 0; i < spielfeld.length; i++) {
            System.out.print(spielfeld[i][0]);
            for (int j = 1; j < spielfeld.length; j++) {
                System.out.print("["+spielfeld[i][j]+"]");
            }
            System.out.print("\n");
        }
    }

    static void setSchiffefeld(byte rotation, byte length, byte xStart, byte yStart){ //Übergibt an schiffefeld die Information welches Feld von Schiffen belegt ist
        if(rotation == 0){//Horizontal
            schiffefeld[yStart][xStart] = 1;
            maxHitcount++;
            if(xStart > (10-length)){ //X9 oder gerößer --> weiter Generierung x- --> nach LINKS
                for (int i = 1; i < length; i++) {
                    schiffefeld[yStart][(xStart - i)] = 1;
                    maxHitcount++;
                }
            }
            else{//x8 oder kleiner --> weiter Generierung x+ --> nach RECHTS
                for (int i = 1; i < length; i++) {
                    schiffefeld[yStart][(xStart + i)] = 1;
                    maxHitcount++;
                }
            }
        }
        else if(rotation == 1){//Vertikal
            schiffefeld[yStart][xStart] = 1;
            maxHitcount++;
            if(yStart > (10-length+1)){ //y9 oder gerößer --> weiter Generierung y- --> nach OBEN
                for (int i = 1; i < length; i++) {
                    schiffefeld[(yStart - i)][xStart] = 1;
                    maxHitcount++;
                }
            }
            else{//y8 oder kleiner --> weiter Generierung y+ --> nach UNTEN
                for (int i = 1; i < length; i++) {
                    schiffefeld[(yStart + i)][xStart] = 1;
                    maxHitcount++;
                }
            }
        }
        else {
            System.out.println("Fehler: Rotation != 0 || 1");
        }
    }

    static boolean checkCoordinates(){
        boolean hit = false; //Ermöglicht die Ausgabe eines Hits
        if(schiffefeld[input.getY()][input.getX()] == 1){ // Wenn der Wert des Schiffefeld auf den Koordinaten des Input 1 sind ist es ein Hit
            spielfeld[input.getY()][input.getX()] = "X"; // Zeigt auf dem Spielfeld ein X für Treffer an
            hitcount++;
            hit = true;
        }
        else{// Wenn der Wert des Schiffefeld auf den Koordinaten des Input 0 sind ist es kein Hit
            spielfeld[input.getY()][input.getX()] = "-"; // Zeigt auf dem Spielfeld ein - für keinen Treffer an
            hit = false;
        }
        return hit;
    }
}
