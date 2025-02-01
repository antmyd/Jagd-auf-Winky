package game;

import java.util.Scanner;

public class NrGuessing {

    NrGuessing game = new NrGuessing();
    
    static double zufallszahl = Math.round(Math.random() * 10);
    static int zahl;
        public static void main(String[] args) {
         
            checkWinNrGuessing(zahl, zufallszahl);
         
     }
        
        public static void checkWinNrGuessing(int zahl, double zufallszahl) {
        
            System.out.println("Willkommen zum Zahlenratenspiel. Wähle  eine zufällige Zahl zwischen 1 und 10, wenn du die richtige Zahl triffst, hast du das Spiel gewonnen.");
            System.out.println("Eine Sache wäre da noch... du hast lediglich 3 Versuche! Wähle weise...");
            System.out.println();
            
           

            for (int i = 0; i==3; i++) {
                
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Welche Zahl wählst du?");
                
            
                zahl = sc.nextInt();

                if (zahl < zufallszahl) {
                    System.out.println("Die gesuchte Zahl ist größer!");
                    i++;
                
                } else if (zahl > zufallszahl) {
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                    i++;
                
                } else if (zahl == zufallszahl) {
                System.out.println("Du hast das Spiel gewonnen!");
                
                sc.close();
                return;
            
        
            }
            System.out.println("Du hast all deine Versuche verbraucht. Dieses Spiel ist verloren! Hahahahahhahahaha");
        }
    }
}
