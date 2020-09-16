import javax.swing.text.html.Option;
import java.util.Scanner;

public class ZahlenRaten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option = ' ';
        do {
            int computerZahl = (int) (Math.random() * 101);
            do {
                System.out.print("Wähle eine ganze Zahl zwischen 0 und 100: ");
                int userZahl = scanner.nextInt();

                if (userZahl == computerZahl){
                    System.out.println("Richtig! Die Zahl war "+computerZahl);
                    break;
                }
                else if (userZahl > computerZahl){
                    System.out.println("Falsch! Deine Zahl ist zu groß.");
                }
                else if (userZahl < computerZahl){
                    System.out.println("Falsch! Deine Zahl ist zu klein.");
                }
            }while (true);
            System.out.println("Willst du nochmal spielen? y/n");
            option = scanner.next().charAt(0);
        }while (option == 'y' || option == 'Y');

    }
}
