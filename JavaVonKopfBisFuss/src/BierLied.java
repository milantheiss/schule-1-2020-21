public class BierLied {
    public static void main(String args[]){
        int bierAnzahl = 99;
        String wort = "Flaschen";

        while (bierAnzahl>0){
            if (bierAnzahl == 1)
                wort = "Flasche";
            //Ende if

            System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            System.out.println("Hol eine raus. \nUnd lass sie rumgehen.");

            bierAnzahl--;

            if (bierAnzahl > 0)
                System.out.println(bierAnzahl + " " + wort + " Bier im Kühlschrank");
            //Ende if
            else
                System.out.println("Kein Bier im Kühlschrank");
            //Ende else
            System.out.println("");
        }//Ende while

    }//Ende main
}//Ende class BierLied
