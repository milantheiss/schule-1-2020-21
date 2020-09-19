import java.util.Scanner;

public class UserZaehlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Startzahl: ");
        int startzahl = scanner.nextInt();
        System.out.print("Endzahl: ");
        int endzahl = scanner.nextInt();

        while (true){
            if (startzahl < endzahl){
                System.out.print(startzahl + " ");
                startzahl++;
            }
            else if (startzahl > endzahl){
                System.out.print(startzahl + " ");
                startzahl--;
            }
            if (startzahl == endzahl){
                System.out.print(startzahl);
                break;
            }
        }
    }
}
