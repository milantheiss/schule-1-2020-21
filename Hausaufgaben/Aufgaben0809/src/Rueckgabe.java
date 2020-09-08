import java.util.Scanner;

public class Rueckgabe {
    public static void main(String[] args) {
        double getraenkepreis, guthaben, rueckgeld=0;
        double anzahl10C = 0, anzahl20C = 0, anzahl50C = 0, anzahl1E = 0, anzahl2E = 0;
        boolean ichWeissNichtWieIchDieVariableNenne = false;
        Scanner scanner = new Scanner(System.in);

        guthaben = scanner.nextDouble()*100;
        getraenkepreis = scanner.nextDouble()*100;

        rueckgeld = guthaben - getraenkepreis;
        double zuWenig = (getraenkepreis-guthaben)/100;

        if (rueckgeld < 0){
            System.out.println("Zu wenig Geld eingeworfen ("+zuWenig+")");
        }
        else if (rueckgeld > 0){
                while(rueckgeld >= 200){
                    rueckgeld = rueckgeld - 200;
                    anzahl2E++;
                }
                while(rueckgeld >= 100){
                    rueckgeld = rueckgeld - 100;
                    anzahl1E++;
                }
                while(rueckgeld >= 50){
                    rueckgeld = rueckgeld - 50;
                    anzahl50C++;
                }
                while(rueckgeld >= 20){
                    rueckgeld = rueckgeld - 20;
                    anzahl20C++;
                }
                while(rueckgeld >= 10){
                    rueckgeld = rueckgeld - 10;
                    anzahl10C++;
                }

                boolean test= false;

                System.out.print("Du bekommst ");
                if (anzahl2E > 0){
                    System.out.print((int)anzahl2E+"x 2 Euro Stücke ");
                    test = true;
                }
                if (anzahl1E > 0){
                    if(test==true){
                        System.out.print("+ ");
                    }
                    System.out.print((int)anzahl1E+"x 1 Euro Stücke ");
                    test = true;
                }
                if (anzahl50C > 0){
                    if(test==true){
                        System.out.print("+ ");
                    }
                    System.out.print((int)anzahl50C+"x 50 Cent Stücke ");
                    test = true ;
                }
                if (anzahl20C > 0){
                    if(test==true){
                        System.out.print("+ ");
                    }
                    System.out.print((int)anzahl20C+"x 20 Cent Stücke ");
                    test = true ;
                }
                if (anzahl10C > 0){
                    if(test==true){
                        System.out.print("+ ");
                    }
                    System.out.print((int)anzahl10C+"x 10 Cent Stücke ");
                }
                System.out.println("zurück.");
        }
        else if (rueckgeld == 0){
            System.out.println("Kein Rückgeld!");
        }
        else {
            System.out.println("FUUUUUUCK irgentetwas funktioniert wieder nicht");
        }
    }
}