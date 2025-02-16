package game;

public class Rüstung {
    public int healthValue;

    public Rüstung (int healthValue) {
        this.healthValue = healthValue;
    }

    public void rüstungAufsetzen(Spieler spieler) {
        spieler.setschild(spieler.getschild() + healthValue);
    }
}
