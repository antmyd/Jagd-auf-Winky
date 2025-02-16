package game;

public class Waffe {
    public int schadenWaffe;
    

    public Waffe(int schadenSchwert) {
        this.schadenWaffe = schadenSchwert;
    }

    public void ausrüsten(Spieler spieler) {
        spieler.setdamage(schadenWaffe);
    }
}
