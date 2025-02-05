package game;
import java.util.Scanner;

public class NrGuessing implements Game {
    
    NrGuessing game = new NrGuessing();
    
    static long zufallszahl = Math.round(Math.random() * 10) + 1;
    static int zahl;
        
    public static void main(String[] args) {
            
        Spieler spieler = new Spieler(null, zahl, zahl, null, 0);
            
        Enemy enemy = new Enemy(null, zahl, zahl, zahl, null);
           
        checkWinNrGuessing(zahl, zufallszahl, spieler, enemy);
         
     }
        
        public static void checkWinNrGuessing(int zahl, long zufallszahl, Spieler spieler, Enemy enemy) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Willkommen zum Zahlenratenspiel. Wähle  eine zufällige Zahl zwischen 1 und 10, wenn du die richtige Zahl triffst, hast du das Spiel gewonnen.");
            System.out.println();
            System.out.println("Eine Sache wäre da noch... du hast lediglich 3 Versuche! Wähle weise...");
            System.out.println();
            
            for (int i = 0; i<2; i++) {
                
                
                
                System.out.println("Welche Zahl wählst du?");
                
            
                zahl = sc.nextInt();

                if (zahl < zufallszahl) {
                    System.out.println("Die gesuchte Zahl ist größer!");
                    
                
                } else if (zahl > zufallszahl) {
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                    
                
                } else if (zahl == zufallszahl) {
                System.out.println("Du hast das Spiel gewonnen und den Gegner besiegt!");
                enemy.sethealth(0);
                return;
            } 
            
            
            
        }
        
        lastTry(sc, spieler, enemy);
        
        
    }

    public static void lastTry (Scanner sc, Spieler spieler, Enemy enemy) {
            
        System.out.println("welche Zahl wählst du?");

         zahl = sc.nextInt();

             if (zahl < zufallszahl) {
                 System.out.println("Die gesuchte Zahl war " + zufallszahl+"." + " Du  hast verloren!");
                 spieler.sethealth(spieler.gethealth() - 10);
                 System.out.println("Du hast 10 Leben verloren");
                 System.out.println("Du hast jetzt noch "+ spieler.gethealth() + "Leben");
             
             } else if (zahl > zufallszahl) {
                 System.out.println("Die gesuchte Zahl war " + zufallszahl+"." + " Du  hast verloren!");
                 spieler.sethealth(spieler.gethealth() - 10);
                 System.out.println("Du hast 10 Leben verloren");
                 System.out.println("Du hast jetzt noch "+ spieler.gethealth() + "Leben");

             } else if (zahl == zufallszahl) {
             System.out.println("Du hast das Spiel gewonnen!");
             
         } 
     }
}
