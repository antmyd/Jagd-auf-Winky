package game;

public class Rüstung {
    public int healthValue;
    public String name;

    public Rüstung (int healthValue, String name) {
        this.healthValue = healthValue;
        this.name = name;
    }

    public void rüstungAufsetzen(Spieler spieler) {
        spieler.setschild(spieler.getschild() + healthValue);
        spieler.setrüstung(name);
    }
}
