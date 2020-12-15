import java.io.*;
import java.net.*;
public class EchoClient {
  public EchoClient(String host, int port) throws IOException {
    // Texteingabe durch Benutzer
    System.out.println("Bitte geben Sie den Texte ein, der zum Server gesendet werden soll:");
    String eingabe = Tastatur.leseText();
    //Verbindung zum Server aufbauen
    Socket csocket = new Socket(host,port);
    // Datenkanal zum Server hin �ffnen um Nachricht senden zu k�nnen
    OutputStream out = csocket.getOutputStream();
    // Writer erstellen;
    OutputStreamWriter writer = new OutputStreamWriter(out);
    // Anfrage an Server senden (\n f�r Zeilenumbruch)
    writer.write(eingabe+"\n");
    // Leeren des Ausgabekanals
    writer.flush();
    
    // Echo des Servers entgegen nehmen:
    // Eingabestrom zum Lesen von Daten �ffnen
    InputStream in = csocket.getInputStream();
    // "H�lle" zum Arbeiten mit Char-Streams
    InputStreamReader reader = new InputStreamReader(in);
    // "H�lle" zur zeilenweisen Verarbeitung
    BufferedReader bReader = new BufferedReader(reader);
    //Antwort vom Server entgegennehmen.
    String antwort = bReader.readLine();
    // Ausgabe der Antwort in der Konsole
    System.out.println(antwort);
    csocket.close();
  }
}