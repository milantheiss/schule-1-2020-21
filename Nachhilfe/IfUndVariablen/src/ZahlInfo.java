public class ZahlInfo{
  public static void main(String argv[]){
    System.out.println("ZahlInfo");
    System.out.print("Zahl: ");                                          //Benutzer Anweisungen
    int zahl = Tastatur.leseZahl();                                      //Zuweisung zahl zu int; Eingabe zahl
    if (zahl < 0) {                                                      //if abfrage (Wertebereich)
      System.out.print("Eingegebene Zahl ist kleiner 0 ");               //Ausgabe Ergebnis
    }
    else {                                                           //else case (anderer Wertebereich)
      if (zahl == 0) {                                                   //Abfrage ob Zahl 0 ist
        System.out.print("Eingegebene Zahl ist gleich 0 ");              //Ausgebe Ergebnis
      } else {                                                           //Letzte Möglichkeit Zahl über 0 
        System.out.print("Eingegebene Zahl ist größer 0 ");              //Ausgebe Ergebnis
      }
    }
    int test = zahl % 2;                                                 //Modulo ( % ) abfrage ob Rest bleibt
    if (test == 0) {                                                     //if abfrage (Gleichheit)
      System.out.println("und gerade.");                                 //Ausgabe Ergebnis
    } else {                                                             //else case (Ungleichheit)
      System.out.println("und ungerade!");                               //Ausgabe Ergebnis
    }
    System.out.println("Programmende ZahlInfo");                         //Programmende
  }
}
