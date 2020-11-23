import java.util.HashMap;
import java.util.Scanner;

public class Spielerei {
    static int[] userGuess = new int[2];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        setUserguess();
        System.out.println(userGuess[0]);
        System.out.println(userGuess[1]);
    }
    static void setUserguess(){
        do {
            System.out.println("Bitte geben Sie eine Position ein");
            String tempPos = scanner.nextLine();
            String tempXGuess = tempPos.substring(0, 1);
            userGuess[1] = Integer.parseInt(tempPos.substring(1,2));
            System.out.println("temp: "+tempPos);
            if(tempXGuess.equalsIgnoreCase("a")){
                userGuess[0] = 1;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("b")){
                userGuess[0] = 2;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("c")){
                userGuess[0] = 3;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("d")){
                userGuess[0] = 4;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("e")){
                userGuess[0] = 5;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("f")){
                userGuess[0] = 6;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("g")){
                userGuess[0] = 7;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("h")){
                userGuess[0] = 8;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("i")){
                userGuess[0] = 9;
                break;
            }
            else if(tempXGuess.equalsIgnoreCase("j")){
                userGuess[0] = 10;
                break;
            }
            else {
                System.out.println("Invalid Input. Try again");
            }
        }while (true);
    }
    /*public static void main(String[] args) {
        String test = "B5";
        String testes = test.substring(0,1);
        int tester = Integer.parseInt(test.substring(1,2));
        System.out.println(testes);
        System.out.println(tester);
    }*/
}
