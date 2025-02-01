package game;
import java.util.Random;

public class Würfel {
    
    Random rand = new Random();

    public static void main(String[] args) {
       
        System.out.println("Dein Gegner hat dich zu einem Würfelspiel herausgefordert! Wer zuerst einen Pasch würfelt, gewinnt das Spiel.");
        System.out.println();

        Würfel würfel = new Würfel();
        würfel.spieleSpiel();
    }

    public int würfeln() {
        return rand.nextInt(6) + 1; // Würfelt eine Zahl zwischen 1 und 6
    }

    public void spieleSpiel() {
        int spielerVersuche = 0;
        int gegnerVersuche = 0;

        // Spieler würfelt, bis er einen Pasch hat
        do {
            int ergebnis1 = würfeln();
            int ergebnis2 = würfeln();
            spielerVersuche++;

            System.out.println("Du hast eine " + ergebnis1 + " und eine " + ergebnis2 + " gewürfelt.");

            if (ergebnis1 == ergebnis2) {
                System.out.println("Du hast einen Pasch gewürfelt!");
                break;
            } else {
                System.out.println("Kein Pasch! Du würfelst erneut...");
                System.out.println();
            }

        } while (true);

        // Gegner würfelt, bis er einen Pasch hat
        do {
            int ergebnis1 = würfeln();
            int ergebnis2 = würfeln();
            gegnerVersuche++;

            System.out.println("Dein Gegner hat eine " + ergebnis1 + " und eine " + ergebnis2 + " gewürfelt.");

            if (ergebnis1 == ergebnis2) {
                System.out.println("Dein Gegner hat einen Pasch gewürfelt!");
                break;
            } else {
                System.out.println("Kein Pasch! Dein Gegner würfelt erneut...");
                System.out.println();
            }

        } while (true);

        // Gewinner bestimmen
        checkWin(spielerVersuche, gegnerVersuche);
    }

    public void checkWin(int spielerVersuche, int gegnerVersuche) {
        System.out.println("\nErgebnisse:");
        System.out.println("Du hast " + spielerVersuche + " Versuche gebraucht.");
        System.out.println("Dein Gegner hat " + gegnerVersuche + " Versuche gebraucht.");

        if (spielerVersuche < gegnerVersuche) {
            System.out.println("Du hast gewonnen!");
        } else if (spielerVersuche > gegnerVersuche) {
            System.out.println("Du hast verloren!");
        } else {
            System.out.println("Unentschieden! Ihr müsst nochmal spielen.");
            spieleSpiel();
        }
    }
}


