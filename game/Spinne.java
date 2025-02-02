package game;
public class Spinne extends Enemy {

    public Spinne() {
        super("Spinne", 25, 90, 6, new NrGuessing());
    }
    
    @Override
    public void attack(Spieler spieler) {
        // Zugriff auf den geerbten Damage-Wert über den Getter in der Enemy-Klasse
        spieler.sethealth(spieler.gethealth() - this.getdamage());  
    }

    public void takeDamage(Spieler spieler) {
        sethealth(gethealth() - spieler.getdamage());
    }

    public void dropGold(Spieler spieler) {
        spieler.setgold(spieler.getgold() + this.getgold());
    }
}

