import java.io.*;
import java.net.*;
public class EchoClient {
  public EchoClient(String host, int port) throws IOException {
    // Texteingabe durch Benutzer
    System.out.println("Bitte geben Sie den Texte ein, der zum Server gesendet werden soll:");
    String eingabe = Tastatur.leseText();
    //Verbindung zum Server aufbauen
    Socket csocket = new Socket(host,port);
    // Datenkanal zum Server hin öffnen um Nachricht senden zu können
    OutputStream out = csocket.getOutputStream();
    // Writer erstellen;
    OutputStreamWriter writer = new OutputStreamWriter(out);
    // Anfrage an Server senden (\n für Zeilenumbruch)
    writer.write(eingabe+"\n");
    // Leeren des Ausgabekanals
    writer.flush();
    
    // Echo des Servers entgegen nehmen:
    // Eingabestrom zum Lesen von Daten öffnen
    InputStream in = csocket.getInputStream();
    // "Hülle" zum Arbeiten mit Char-Streams
    InputStreamReader reader = new InputStreamReader(in);
    // "Hülle" zur zeilenweisen Verarbeitung
    BufferedReader bReader = new BufferedReader(reader);
    //Antwort vom Server entgegennehmen.
    String antwort = bReader.readLine();
    // Ausgabe der Antwort in der Konsole
    System.out.println(antwort);
    csocket.close();
  }
}