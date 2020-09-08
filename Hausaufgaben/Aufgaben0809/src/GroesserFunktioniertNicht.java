import java.util.Scanner;

public class GroesserFunktioniertNicht {
    public static void main(String[] args) {
        double zahl[]  = new double[3];
        Scanner scanner = new Scanner(System.in);

        for (int z = 0; z < zahl.length; z++){
            zahl[z] = scanner.nextDouble();
            System.out.println(z);
        }

        int i = 0;
        int x = 0;
        boolean stop = false;

        do {
            i = 0;
            do {
                if (zahl[x] > zahl[i]) {
                    System.out.println(zahl[x] + " ist am größten");
                    stop = true;
                    break;
                }
                i++;
            } while (true || i < 10);

            x++;
        }while (stop || x < 10);
    }
}