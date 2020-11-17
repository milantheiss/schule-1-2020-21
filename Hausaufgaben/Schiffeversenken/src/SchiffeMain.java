import java.util.Scanner;

public class SchiffeMain {
    private static byte[][] position = new byte[1][2];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] x = new String[11][11];
        x[0][0] = "- "; x[0][1] = "A"; x[0][2] = "B"; x[0][3] = "C"; x[0][4] = "D"; x[0][5] = "E"; x[0][6] = "F"; x[0][7] = "G"; x[0][8] = "H"; x[0][9] = "I"; x[0][10] = "J";
        x[1][0] = "1 "; x[2][0] = "2 "; x[3][0] = "3 "; x[4][0] = "4 "; x[5][0] = "5 "; x[6][0] = "6 "; x[7][0] = "7 "; x[8][0] = "8 "; x[9][0] = "9 "; x[10][0] = "10";


        for (int i = 1; i < x.length; i++) {
            for (int j = 1; j < x.length; j++) {
                x[i][j] = " ";
            }
        }
        System.out.print("\n");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i][0]);
            for (int j = 1; j < x.length; j++) {
                System.out.print("["+x[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
    static byte[][] getUserguess(){
        System.out.println("Bitte geben Sie eine Position ein");
        String tempPos = scanner.nextLine();
        
        return null;
    }
    static byte[][] getPosition(){
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
    }


}