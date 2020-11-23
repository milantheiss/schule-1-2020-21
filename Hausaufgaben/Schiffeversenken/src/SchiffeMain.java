import java.util.Scanner;

public class SchiffeMain {
    static Scanner scanner = new Scanner(System.in);
    static UserGuess guess = new UserGuess();
    static byte anzahl = 2;
    static Schiffe schiffe = new Schiffe(anzahl);
    static int[][] tempSquares = schiffe.getBlockedSquares();
    String[][] x = new String[11][11];

    for (int i = 1; i < x.length; i++) { //@TODO: 23.11.2020      In Spielfeld einbinden
        for (int j = 1; j < x.length; j++) {
            x[i][j] = " ";
        }
    }
    x[0][0] = "- "; x[0][1] = "A"; x[0][2] = "B"; x[0][3] = "C"; x[0][4] = "D"; x[0][5] = "E"; x[0][6] = "F"; x[0][7] = "G"; x[0][8] = "H"; x[0][9] = "I"; x[0][10] = "J";
    x[1][0] = "1 "; x[2][0] = "2 "; x[3][0] = "3 "; x[4][0] = "4 "; x[5][0] = "5 "; x[6][0] = "6 "; x[7][0] = "7 "; x[8][0] = "8 "; x[9][0] = "9 "; x[10][0] = "10";

    public static void main(String[] args) {

    }
    /*static byte[] setUserguess(){
        boolean fehler = true;
        boolean fehlerZahl = true;
        do {
            System.out.println("Bitte geben Sie eine Position ein");
            String tempPos = scanner.nextLine();
            String tempXGuess = tempPos.substring(0, 1);
            try {
                userGuess[1] = Byte.parseByte(tempPos.substring(1,2));
                fehlerZahl = false;
            }catch (Exception e){
                System.out.println("Invalid Input. Try again");
                fehlerZahl = true;
            }
            if(tempXGuess.equalsIgnoreCase("a")){
                userGuess[0] = 1;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("b")){
                userGuess[0] = 2;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("c")){
                userGuess[0] = 3;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("d")){
                userGuess[0] = 4;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("e")){
                userGuess[0] = 5;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("f")){
                userGuess[0] = 6;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("g")){
                userGuess[0] = 7;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("h")){
                userGuess[0] = 8;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("i")){
                userGuess[0] = 9;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("j")){
                userGuess[0] = 10;
                fehler = false;
            }
            else {
                System.out.println("Invalid Input. Try again");
                fehler = true;
            }
        }while (fehler || fehlerZahl);
        return userGuess;
    }*/
    /*static byte[][] getPosition(){
        position[0][2] = (byte)(Math.random()*2); //Rotation des Schiffes 0 == horizontal | 1 == vertikal
        if (position[0][2] == 0) { //horizontales Schiff
            position[0][0] = (byte)((Math.random()*8)+1);
            position[0][1] = (byte)((Math.random()*10)+1);
        }
        else {
            position[0][0] = (byte)((Math.random()*10)+1);
            position[0][1] = (byte)((Math.random()*8)+1);
        }
        return position;
    }*/
    static void checkSquare(){//@todo Lösungsalgorhytmus fertigstellen
        for (int i = 0; i < anzahl; i++) {
            for (int j = 0; j < ; j++) {
                if (tempSquares[i][j] == guess.getGuess()) {
                    for (int k = 0; k < ; k++) { //@todo Wenn Guess richtig auf Array X + Koordinaten ändern

                    }
                }
            }
        }
    }
    void showPlayingField(){
        System.out.print("\n");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i][0]);
            for (int j = 1; j < x.length; j++) {
                System.out.print("["+x[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
}
