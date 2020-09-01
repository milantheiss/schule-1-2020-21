import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tp = sc.nextDouble(); //Temperatur Variable

        if (tp < 0){
            System.out.println("frostig");
        }
        else if (tp >= 0 && tp < 15){
            System.out.println("kalt");
        }
        else if (tp >= 15 && tp < 30){
            System.out.println("warm");
        }
        else if (tp >= 30 && tp <= 55){
            System.out.println("heiß");
        }
        else {
            System.out.println("Fehler");
        }
    }
}
