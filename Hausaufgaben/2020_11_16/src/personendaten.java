import java.util.Scanner;
import java.util.HashMap;

public class personendaten {
    static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, String> daten = new HashMap<String, String>();

    public static void main(String[] args) {
        System.out.println("System zur Erfasssung von Personenendaten");
        setPersonendaten();
        showSinglePerson();


    }
    static void setPersonendaten(){
        System.out.print("Wie viele Personen möchten sie erfassen?");
        int anzahl = scanner.nextInt();
        String bugfix = scanner.nextLine();//Bug die erste String Scanner Eingabe ist verbuggt und wird übersprungen
        for(int i = 0; i < anzahl; i++){
            System.out.print("Bitte geben Sie den "+(i+1)+". Vornamen ein: ");
            String tempVornamen = scanner.nextLine();
            System.out.print("Bitte geben Sie den "+(i+1)+". Nachnamen ein: ");
            String tempNachnamen = scanner.nextLine();
            daten.put(tempVornamen, tempNachnamen);
        }
        System.out.println("Eingabe akzeptiert");
    }
    HashMap getPersonendaten(){
        return daten;
    }
    void showMenu(){
        System.out.println("Bitte wählen sie aus: \n[A]lle Personenen anzeigen \n[E]ine bestimmte Person anzeigen \n[N]eue Eingabe \n[B]eenden");
        String option = scanner.nextLine();
        if (option.equalsIgnoreCase("a")){

        }
    }
    static void showSinglePerson(){
        System.out.print("Bitte geben Sie den Nachnamen der anzuzeigenden Person ein: ");
        String tempName = scanner.nextLine();
        if (daten.containsValue(tempName)) {
            System.out.println("Persdaten.get(tempName));
        }
    }

}
