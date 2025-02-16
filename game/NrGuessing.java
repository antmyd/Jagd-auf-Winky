package game;
import java.util.Scanner;

public class NrGuessing {
    
    private long zufallszahl;
    private int zahl;
    private boolean won;
    private Scanner sc;

    public NrGuessing(boolean won) {
        this.zufallszahl = Math.round(Math.random() * 10);
        this.won = false;
        this.sc = new Scanner(System.in);
    }
    
    public boolean isWon() {
        return won;
    }
    
    public void start(Spieler spieler) {
        System.out.println("Willkommen zum Kistenrätsel Zahlenraten. Wähle eine Zahl zwischen 1 und 10.");
        System.out.println("Du hast 4 Versuche! Wähle weise...");
        System.out.println();

        for (int i = 0; i < 4; i++) {
            if (rateZahl()) {
                return; // Falls gewonnen, beende das Spiel
            }
        }
        
        lastTry(spieler);
    }

    private boolean rateZahl() {
        System.out.print("Welche Zahl wählst du? ");
        zahl = sc.nextInt();

        if (zahl < zufallszahl) {
            System.out.println("Die gesuchte Zahl ist größer!");
        } else if (zahl > zufallszahl) {
            System.out.println("Die gesuchte Zahl ist kleiner!");
        } else {
            System.out.println("Du hast das Spiel gewonnen!");
            won = true;
            return true;
        }
        return false;
    }

    private void lastTry(Spieler spieler) {
        System.out.print("Letzter Versuch! Welche Zahl wählst du? ");
        zahl = sc.nextInt();

        if (zahl == zufallszahl) {
            System.out.println("Du hast das Spiel gewonnen!");
            won = true;
        } else {
            System.out.println("Die gesuchte Zahl war " + zufallszahl + ". Du hast verloren!");
            spieler.sethealth(spieler.gethealth() - 5);
        }
    }

    public static void main(String[] args) {
        Spieler spieler = new Spieler(null, 50, 0, null, 10, 0);
        NrGuessing spiel = new NrGuessing(false);
        spiel.start(spieler);
    }
}
