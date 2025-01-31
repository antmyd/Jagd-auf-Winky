package game;
import java.util.Random;

public class Würfel {
    
    Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Dein Gegner hat dich zu einem Würfelspiel herausgefordert! Wer zuerst einen Pasch würfelt, gewinnt das Spiel.");
        System.out.println();

        Würfel würfel = new Würfel();
        
        würfel.spielerWürfeln();
        würfel.gegnerWürfeln();
    }

    public int würfeln() {
        return rand.nextInt(6) + 1;
    }

    public void spielerWürfeln() {
        int ergebnis1Spieler, ergebnis2Spieler;
        
        do {
            ergebnis1Spieler = würfeln();
            ergebnis2Spieler = würfeln();
            
            System.out.println("Du hast eine " + ergebnis1Spieler + " gewürfelt.");
            System.out.println("Du hast eine " + ergebnis2Spieler + " gewürfelt.");
            System.out.println();
            
            if (ergebnis1Spieler == ergebnis2Spieler) {
                System.out.println("Du hast einen Pasch gewürfelt und das Spiel gewonnen!");
                return;
            } else {
                System.out.println("Kein Pasch! Du würfelst erneut...");
                System.out.println();
            }
            
        } while (ergebnis1Spieler != ergebnis2Spieler);
    }

    public void gegnerWürfeln() {
        int ergebnis1Enemy, ergebnis2Enemy;
        
        do {
            ergebnis1Enemy = würfeln();
            ergebnis2Enemy = würfeln();
            
            System.out.println("Dein Gegner hat eine " + ergebnis1Enemy + " gewürfelt.");
            System.out.println("Dein Gegner hat eine " + ergebnis2Enemy + " gewürfelt.");
            System.out.println();
            
            if (ergebnis1Enemy == ergebnis2Enemy) {
                System.out.println("Dein Gegner hat einen Pasch gewürfelt und das Spiel gewonnen!");
                return;
            } else {
                System.out.println("Kein Pasch! Der Gegner würfelt erneut...");
                System.out.println();
            }
            
        } while (ergebnis1Enemy != ergebnis2Enemy);
    }
}

//müssen abwechseknd würfeln
