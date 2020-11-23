import java.util.Scanner;

public class UserGuess {
    Scanner scanner = new Scanner(System.in);
    private int guess;
    void setGuess(){
        boolean fehler = true;
        boolean fehlerZahl = true;
        do {
            System.out.println("Bitte geben Sie eine Position ein");
            String tempPos = scanner.nextLine();
            String tempXGuess = tempPos.substring(0, 1);
            try {
                guess = Integer.parseInt(tempPos.substring(1,2));
                fehlerZahl = false;
            }catch (Exception e){
                System.out.println("Invalid Input. Try again");
                fehlerZahl = true;
            }
            if(tempXGuess.equalsIgnoreCase("a")){
                guess = guess + 10;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("b")){
                guess = guess + 20;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("c")){
                guess = guess + 30;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("d")){
                guess = guess + 40;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("e")){
                guess = guess + 50;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("f")){
                guess = guess + 60;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("g")){
                guess = guess + 70;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("h")){
                guess = guess + 80;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("i")){
                guess = guess + 90;
                fehler = false;
            }
            else if(tempXGuess.equalsIgnoreCase("j")){
                guess = guess + 100;
                fehler = false;
            }
            else {
                System.out.println("Invalid Input. Try again");
                fehler = true;
            }
        }while (fehler || fehlerZahl);
    }
    int getGuess(){
        return guess;
    }
}
