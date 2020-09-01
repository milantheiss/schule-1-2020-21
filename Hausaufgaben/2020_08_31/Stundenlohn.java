import java.util.Scanner;

public class Stundenlohn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double stunden = sc.nextDouble();
        double stdgeld = 11.5;
        double endgeld = stunden * stdgeld;

        if (stunden <= 0 || endgeld >= 150 || endgeld<=1) {
            System.out.println("WARNUNG!");
        }

        System.out.println("Du hast "+endgeld+" EURO verdient.");
    }
}
