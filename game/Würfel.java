package game;
import java.util.Random;

public class Würfel {
    
    Random rand = new Random();

    public static void main(String[] args) {
       
        System.out.println("Dein Gegner hat dich zu einem Würfelspiel herausgefordert! Wer zuerst einen Pasch würfelt, gewinnt das Spiel.");
        System.out.println();

        Würfel würfel = new Würfel();
        
        würfel.spielerWürfeln(würfel);
        würfel.gegnerWürfeln(würfel);
    }

    public int würfeln() {
        return rand.nextInt(6) + 1;
    }

    public void spielerWürfeln(Würfel würfel) {
        
        
        int ergebnis1Spieler, ergebnis2Spieler;
        
        do {
            ergebnis1Spieler = würfeln();
            ergebnis2Spieler = würfeln();
            
            System.out.println("Du hast eine " + ergebnis1Spieler + " gewürfelt.");
            System.out.println("Du hast eine " + ergebnis2Spieler + " gewürfelt.");
            System.out.println();
            checkWinSpieler(würfel, ergebnis1Spieler, ergebnis2Spieler);
            break;
            
        } while (ergebnis1Spieler != ergebnis2Spieler);
    }

    public void gegnerWürfeln(Würfel würfel) {
        int ergebnis1Enemy, ergebnis2Enemy;
        
        do {
            ergebnis1Enemy = würfeln();
            ergebnis2Enemy = würfeln();
            
            System.out.println("Dein Gegner hat eine " + ergebnis1Enemy + " gewürfelt.");
            System.out.println("Dein Gegner hat eine " + ergebnis2Enemy + " gewürfelt.");
            System.out.println();
            checkWinEnemy(würfel, ergebnis1Enemy, ergebnis2Enemy);
            break;
            
        } while (ergebnis1Enemy != ergebnis2Enemy);
    }

    public void checkWinSpieler(Würfel würfel, int ergebnis1Spieler, int ergebnis2Spieler) {
        
        if (ergebnis1Spieler == ergebnis2Spieler) {
            System.out.println("Du hast einen Pasch gewürfelt und das Spiel gewonnen!");
            
        } else if (ergebnis1Spieler != ergebnis2Spieler) {
            System.out.println("Kein Pasch! Du würfelst erneut...");
            System.out.println();
            würfel.spielerWürfeln(würfel);
        }
    }

    public void checkWinEnemy(Würfel würfel, int ergebnis1Enemy, int ergebnis2Enemy) {
        
        if (ergebnis1Enemy == ergebnis2Enemy) {
            System.out.println("Dein Gegner hat einen Pasch gewürfelt und das Spiel gewonnen!");
            
        } else if (ergebnis1Enemy != ergebnis2Enemy) {
            System.out.println("Kein Pasch! Der Gegner würfelt erneut...");
            System.out.println();
            würfel.gegnerWürfeln(würfel);
        }
    }
}

