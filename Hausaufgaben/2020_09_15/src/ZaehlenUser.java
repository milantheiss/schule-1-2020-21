import java.util.Scanner;

public class ZaehlenUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe Zahl ein: ");
        int userZahl = scanner.nextInt();
        if (userZahl > 0){
            for (int i=userZahl; i>-1; i--){
                System.out.print(i);
                if (i!=0){
                    System.out.print(", ");
                }
            }
        }
        else if (userZahl < 0){
            for (int i=userZahl; i<1; i++){
                System.out.print(i);
                if (i!=0){
                    System.out.print(", ");
                }
            }
        }
    }
}
