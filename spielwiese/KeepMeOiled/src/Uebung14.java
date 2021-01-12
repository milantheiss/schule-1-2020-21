import java.util.Scanner;

public class Uebung14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();
        int addResult = 0;
        for (int i = yourNumber; i > 0; i--) {
            addResult = addResult + i;
            System.out.println(i + " " + addResult);
        }
        System.out.println(addResult);
    }
}
