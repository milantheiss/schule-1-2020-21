import java.util.Scanner;

public class Taschenrechner1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ergebnis, modulo;

        System.out.println("Gebe Zahl 1 ein: ");
        int zahl1 = sc.nextInt();
        System.out.println("Gebe Zahl 2 ein: ");
        int zahl2 = sc.nextInt();
        System.out.println("Gebe Operator ein: ");
        char operator = sc.next().charAt(0);

        switch (operator) { //Je nach Operator wir einen Rechnung ausgeführt
            case '+':
                ergebnis = zahl1 + zahl2;
                System.out.println(zahl1 + " + " + zahl2 + " = " +  ergebnis);
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                System.out.println(zahl1 + " - " + zahl2 + " = " +  ergebnis);
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                System.out.println(zahl1 + " * " + zahl2 + " = " +  ergebnis);
                break;
            case '/':
                ergebnis = zahl1 / zahl2;
                modulo = zahl1 % zahl2;
                System.out.println(zahl1 + " / " + zahl2 + " = " +  ergebnis+"  Rest: " + modulo);
                break;
            default:
                System.out.println("Falscher operator");
        }

        System.out.println("Programmende.");
    }

}
