import java.io.*;
import java.net.*;
public class EchoServer {
  public EchoServer (int port) throws IOException {
    try {
      // Server starten, d.h. neuen ServerSocket erstellen:
      ServerSocket ssocket = new ServerSocket(port);
      // Der Server soll maximal 20 Sekunden auf Anfrage warten:
      ssocket.setSoTimeout(50000);
      // Ausgabe 
      System.out.println("Der Server wartet auf Verbindung an Port "+port);
      // Auf Anfragen des Clients warten
      Socket asocket = ssocket.accept();
      // Eingabestrom zum Lesen von Daten �ffnen
      InputStream in = asocket.getInputStream();
      //"H�lle" zum Arbeiten mit Char-Streams
      InputStreamReader reader = new InputStreamReader(in);
      //"H�lle" zur zeilenweisen Verarbeitung
      BufferedReader bReader = new BufferedReader(reader);
      // Anfrage vom Client entgegennehmen.
      String antwort = bReader.readLine();
      System.out.println("Der Client hatte gesendet: "+antwort);
      // Datenkanal zum Client hin �ffnen um Nachricht zur�ck senden zu k�nnen
      OutputStream out = asocket.getOutputStream();
      // Writer erstellen
      OutputStreamWriter writer = new OutputStreamWriter(out);
      // Antwort an Client senden
      writer.write("Sie hatten gesendet: "+antwort+"\n");
      // Flush zum leeren des Ausgabekanals
      writer.flush();
      asocket.close();
      ssocket.close();
    } catch (SocketTimeoutException e) {
      System.out.println("Das Serverprogramm wurde durch Timeout beendet.");
    }
  }
}
