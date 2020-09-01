import java.util.Scanner;

public class Widerstand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1, r2, rGesamt;

        System.out.println("Widerstands-Schaltung");
        System.out.print("(P)arallel- oder (R)eihenschaltung? ");
        char option = sc.next().charAt(0);
        System.out.println("R1 in Ohm: ");
        r1 = sc.nextDouble();
        System.out.println("R2 in Ohm: ");
        r2 = sc.nextDouble();
        if(option == 'P' || option=='p'){
           rGesamt = (r1*r2)/(r1+r2);
           System.out.println("Der Gesamtwert der Parallelschaltung ist "+rGesamt+" Ohm");
        }
        else if (option == 'R' || option == 'r'){
            rGesamt = r1+r2;
            System.out.println("Der Gesamtwert der Reihenschaltung ist "+rGesamt+" Ohm");
        }
        else {
            System.out.println("Ein Fehler ist aufgetreten. Versuche es erneut.");
        }
        System.out.println("Programmende.");
    }
}