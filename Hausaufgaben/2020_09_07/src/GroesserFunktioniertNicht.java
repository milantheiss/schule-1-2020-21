public class GroesserFunktioniertNicht {
    public static void main(String[] args) {
        double[] zahl = new double[4];

        /*for (int z = 0; z < 3; z++){
            zahl[z] = scanner.nextDouble();
            System.out.println(z);
        }*/

        zahl[0] = 2;
        zahl[1] = 3;
        zahl[2] = 4;

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
