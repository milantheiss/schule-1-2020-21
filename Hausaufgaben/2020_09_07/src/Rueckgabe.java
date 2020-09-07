import java.util.Scanner;

public class Rueckgabe {
    public static void main(String[] args) {
        double getraenkepreis, guthaben, rueckgeld;
        double anzahl10C, anzahl20C, anzahl50C, anzahl1E, anzahl2E;
        boolean stop= false, kein10C= false, kein20C= false, kein50C = false, kein2E = false, kein1E = false;
        Scanner scanner = new Scanner(System.in);
        guthaben = scanner.nextDouble();
        getraenkepreis = scanner.nextDouble();

        rueckgeld = guthaben - getraenkepreis;
        System.out.println(rueckgeld);

        if (rueckgeld < 0){
            System.out.println("Zu wenig Geld eingeworfen");
        }
        else if (rueckgeld == 0){
            System.out.println("Kein Rückgeld");
        }
        else {
            anzahl2E = rueckgeld % 2;
            rueckgeld = rueckgeld - anzahl2E*2;
            System.out.println(anzahl2E + " "+rueckgeld);

            anzahl1E = (int)rueckgeld / 1;
            rueckgeld = rueckgeld - anzahl1E*1;
            System.out.println(anzahl1E + " "+rueckgeld);

            anzahl50C = (int)(rueckgeld*10) / 50;
            rueckgeld = rueckgeld - anzahl50C*0.5;
            System.out.println(anzahl50C + " "+rueckgeld);

            anzahl20C = (int)(rueckgeld*10) / 20;
            rueckgeld = rueckgeld - anzahl20C*0.2;
            System.out.println(anzahl20C + " "+rueckgeld);

            anzahl10C = (int)(rueckgeld*10) / 10;
            rueckgeld = rueckgeld - anzahl10C*0.1;
            System.out.println(anzahl10C + " "+ rueckgeld);

            System.out.println("Du bekommst ");
            if (anzahl2E > 0){
                System.out.print(anzahl2E+"x 2 Euro Stücke + ");
            }
            if (anzahl1E > 0){
                System.out.print(" + "+anzahl1E+"x 1 Euro Stücke");
            }
            if (anzahl50C > 0){
                System.out.print(" + "+anzahl50C+"x 50 Cent Stücke");
            }
            if (anzahl20C > 0){
                System.out.print(" + "+anzahl20C+"x 20 Cent Stücke");
            }
            if (anzahl10C > 0){
                System.out.print(" + "+anzahl10C+"x 10 Cent Stücke ");
            }
            System.out.println("zurück.");
        }
    }
}
