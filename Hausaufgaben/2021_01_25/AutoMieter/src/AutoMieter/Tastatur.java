package AutoMieter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Diese Klasse dient dazu, Zahlen, Buchstaben und Texte von der AutoMieter.Tastatur
 * einzulesen.
 */
public class Tastatur {
  /**
   * Einlesen eines einzelnen Buchstabens.
   */
  public static char leseZeichen() {
    try {
      return leseText().charAt(0);
    } catch (Exception e) {
      char tmp = ' ';
      return tmp;
    }
  }

  /**
   * Einlesen einer Zahl.
   */
  public static int leseZahl() {
    try {
      return Integer.parseInt(leseText());
    } catch (Exception e) {
      return 0;
    }
  }

  public static double leseKommazahl() {
    try {
      return Double.parseDouble(leseText().replace(',', '.'));
    } catch (Exception e) {
      return 0;
    }
  }

  /**
   * Einlesen eines Textes.
   */
  public static String leseText() {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      return reader.readLine();
    } catch (IOException e) {
    }
    return null;
  }
}
