import java.util.HashMap;
import java.util.Scanner;

public class Spielerei {
    public static void main(String[] args) {
        int start = 1;
        int length = 2;
        int yStart = 9;
        int[] x = new int[2];
        if(yStart > (10-length+1)){ //ß <
            for (int i = 1; i < length; i++) {
                System.out.println(yStart-i);
            }
        }
        else {
            for (int i = 1; i < length; i++) {
                System.out.println(yStart+i);
            }
        }
    }
}
