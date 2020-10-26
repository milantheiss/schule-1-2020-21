/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 26.10.2020
 * @author 
 */
import java.util.*;
public class Lotto2 {
  public static void main(String[] args) {
    char option;
    int zahl1, zahl2, zahl3, zahl4, zahl5, zahl6;
    do{
      zahl1 = (int) (Math.random() * 49) + 1;
      do{
        zahl2 = (int) (Math.random() * 49) + 1;
      }while(zahl2 == zahl1);
      do{ 
        zahl3 = (int) (Math.random() * 49) + 1;
      }while(zahl3 == zahl1 || zahl3 == zahl2);
      do{ 
        zahl4 = (int) (Math.random() * 49) + 1;
      }while (zahl4 == zahl1 || zahl4 == zahl2 || zahl4 == zahl3);
      do{ 
        zahl5 = (int) (Math.random() * 49) + 1;
      }while (zahl5 == zahl1 || zahl5 == zahl2 || zahl5 == zahl3 || zahl5 == zahl4);
      do{
        zahl6 = (int) (Math.random() * 49) + 1;
      }while(zahl6 == zahl1 || zahl6 == zahl2 || zahl6 == zahl3 || zahl6 == zahl4 || zahl6 == zahl5);
      
      System.out.println(zahl1 + " " + zahl2 + " "  + zahl3 + " " + zahl4 + " " + zahl5 + " " + zahl6);     
      Scanner scanner = new Scanner(System.in);
      option = scanner.next().charAt(0);
      option = Character.toUpperCase();
    }while(option == 'Y');
  } // end of main

} // end of class Lotto2

