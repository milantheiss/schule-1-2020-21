import java.util.Scanner;

public class UserGuess {
    Scanner scanner = new Scanner(System.in);
    private byte inputX, inputY;
    private String input;

    void setInput(){ // Neue Input
        input = scanner.nextLine();
    }

    byte getX(){ // Nimmt die X Koordinate aus Userinput und konvertiert den Input von Buchstabe zu Zahl --> A1 = 1 1
        if(input.substring(0, 1).equalsIgnoreCase("a")){
            inputX = 1;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("b")){
            inputX = 2;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("c")){
            inputX = 3;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("d")){
            inputX = 4;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("e")){
            inputX = 5;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("f")){
            inputX = 6;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("g")){
            inputX = 7;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("h")){
            inputX = 8;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("i")){
            inputX = 9;
        }
        else if(input.substring(0, 1).equalsIgnoreCase("j")){
            inputX = 10;
        }
        else {
            System.out.println("There is a Problem in converting the X Coordinate");
        }
        return inputX;
    }

    byte getY(){ // Nimmt die Y Koordinate aus dem Userinput und returnt diese
        try {
            inputY = Byte.parseByte(input.substring(1));
        } catch (Exception e) {
            System.out.println("There is a Problem in converting the Y Coordinate");
        }
        return inputY;
    }
}
